package com.example.firebasesecuritytest.firebase

import com.google.firebase.database.*
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.callbackFlow

class Prefix(private val lastGenerated: Int = 0,
//             val quantityCharacters: Int = QUANTITY_CHARACTERS_DEFAULT,
             private val start: Int = 0) {

//    companion object {
//        private const val CHILD = "prefix"
//        private const val LAST_GENERATED_CHILD = "lastGenerated"
//        const val LAST_GENERATED_DEFAULT = ""
//        private const val QUANTITY_CHARACTERS_CHILD = "quantityCharacters"
//        const val QUANTITY_CHARACTERS_DEFAULT = 0
//        private const val QUANTITY_CHARACTERS_PREFERENCES = "QuantityCharacters"
//
//        private val lastGeneratedReference: DatabaseReference
//            get() = FirebaseDatabase.getInstance().reference
//                .child("countries")
//                .child("BRT")
//                .child("document")
//                .child("prefix")
//                .child("lastGenerated")
//
//
//        var quantityCharactersPreferences: Int = 0
//
//
//        private val quantityCharactersReference: DatabaseReference
//            get() = FirebaseDatabase.getInstance().reference
//                .child("countries")
//                .child("BRT")
//                .child("document")
//                .child("prefix")
//                .child("quantityCharacters")
//
//        @ExperimentalCoroutinesApi
//        fun addListenerForSingleValueEventLastGenerated() = callbackFlow<String> {
//            lastGeneratedReference.also { lastGeneratedReferenceIt ->
//                lastGeneratedReferenceIt.addListenerForSingleValueEvent(object : ValueEventListener {
//                    override fun onDataChange(snapshot: DataSnapshot) {
//                        snapshot.value.toString().toInt().inc().also { lastGeneratedIncIt ->
//                            lastGeneratedReferenceIt.setValue(lastGeneratedIncIt)
//                            offer(lastGeneratedIncIt.toString())
//                            channel.close()
//                        }
//                    }
//
//                    override fun onCancelled(error: DatabaseError) {
//                        offer(LAST_GENERATED_DEFAULT)
//                        channel.close()
//                    }
//                })
//
//                awaitClose()
//            }
//        }
//
//        fun quantityCharactersGeneration() {
//            quantityCharactersReference.also { quantityCharactersReference ->
//                quantityCharactersReference.addValueEventListener(object : ValueEventListener {
//                    override fun onCancelled(databaseError: DatabaseError) {
//                    }
//
//                    override fun onDataChange(dataSnapshot: DataSnapshot) {
//                        try {
//                            dataSnapshot?.value?.also {
//                                it.toString().toInt().takeIf {
//                                    it != QUANTITY_CHARACTERS_DEFAULT
//                                }?.also {
//                                    quantityCharactersReference.removeEventListener(this)
//                                    Device.documentNumberGeneration()
//                                }
//                            } ?: run {
//                                quantityCharactersReference.parent?.setValue(Prefix)
//                            }
//                        } catch (e: Exception) {
//                            quantityCharactersReference.removeEventListener(this)
//                        }
//                    }
//                })
//            }
//        }
//    }
}