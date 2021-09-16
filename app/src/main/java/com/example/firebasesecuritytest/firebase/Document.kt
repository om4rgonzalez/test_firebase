package com.example.firebasesecuritytest.firebase

import com.google.firebase.database.*
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.callbackFlow

class Document(val maxLength: Int? = null,
               val prefix: Prefix = Prefix()) {

    companion object {
        const val CHILD = "document"

        private val maxLengthReference: DatabaseReference
            get() = FirebaseDatabase.getInstance().reference
                .child("countries")
                .child("BRT")
                .child(CHILD)

        fun addListenerForSingleValueEvent() = callbackFlow<Document> {
            maxLengthReference.also { maxLengthReferenceIt ->
                maxLengthReferenceIt.addListenerForSingleValueEvent(object : ValueEventListener {
                    override fun onDataChange(snapshot: DataSnapshot) {
                        snapshot.getValue(Document::class.java)?.also {
                            offer(it)
                            channel.close()
                        }
                    }

                    override fun onCancelled(error: DatabaseError) {
                        offer(Document())
                        channel.close()
                    }
                })

                awaitClose()
            }
        }
    }
}