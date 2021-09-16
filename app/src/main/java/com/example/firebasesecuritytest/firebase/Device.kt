package com.example.firebasesecuritytest.firebase

import android.content.Context
import com.google.firebase.database.*
import java.math.BigInteger
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.single

class Device {
        private val DOCUMENT_NUMBER_CHILD = "documentNumber"
        val DOCUMENT_NUMBER_DEFAULT: BigInteger = BigInteger("-1")
        private val DOCUMENT_NUMBER_PREFERENCES = "DocumentNumber"


//    fun documentNumberInc() {
//        documentNumber.addValueEventListener(object : ValueEventListener {
//            override fun onCancelled(error: DatabaseError) {}
//
//            override fun onDataChange(snapshot: DataSnapshot) {
//                if (snapshot.exists()) {
//                    val authors = mutableListOf<Author>()
//                    for (authorSnapshot in snapshot.children) {
//                        val author = authorSnapshot.getValue(Author::class.java)
//                        author?.id = authorSnapshot.key
//                        author?.let { authors.add(it) }
//                    }
//                    _authors.value = authors
//                }
//            }
//        })
//    }

//
//
//
//
//
//        var documentNumberPreferences: BigInteger = BigInteger("-1")
//
//        private val documentNumberReference: DatabaseReference
//            get() = FirebaseDatabase.getInstance().reference
//                .child("countries")
//                .child("BRT")
//                .child("branches")
//                .child("6")
//                .child("devices")
//                .child("359939082008943")
//
//
//        documentNumber.addValueEventListener(object : ValueEventListener {
//            override fun onCancelled(error: DatabaseError) {}
//
//            override fun onDataChange(snapshot: DataSnapshot) {
//                if (snapshot.exists()) {
//                    val authors = mutableListOf<Author>()
//                    for (authorSnapshot in snapshot.children) {
//                        val author = authorSnapshot.getValue(Author::class.java)
//                        author?.id = authorSnapshot.key
//                        author?.let { authors.add(it) }
//                    }
//                    _authors.value = authors
//                }
//            }
//        })
//
//        fun documentNumberGeneration() {
//            documentNumberReference.also { documentNumberReference ->
//                documentNumberReference.addValueEventListener(object : ValueEventListener {
//                    override fun onCancelled(databaseError: DatabaseError) {
//                    }
//
//                    override fun onDataChange(dataSnapshot: DataSnapshot) {
//                        try {
//                            dataSnapshot.value?.also {
//                                it.toString().toBigInteger().takeIf {
//                                    it != DOCUMENT_NUMBER_DEFAULT
//                                }?.also {
//                                    val listener = this
//                                    CoroutineScope(Dispatchers.Main).launch {
//                                        Document.addListenerForSingleValueEvent().single()
//                                            .also { documentIt ->
//                                                val documentNumberPreferences =
//                                                    this@Companion.documentNumberPreferences
//                                                val quantityCharacters = documentIt.prefix
//                                                    .quantityCharacters
//                                                val quantityCharactersPreferences =
//                                                    Prefix.quantityCharactersPreferences
//                                                if (it.toString().length !=
//                                                    documentIt.maxLength ||
//                                                    (quantityCharactersPreferences != Prefix
//                                                        .QUANTITY_CHARACTERS_DEFAULT &&
//                                                            quantityCharacters !=
//                                                            quantityCharactersPreferences)
//                                                ) {
//                                                    documentNumberReference.removeValue()
//                                                    documentNumberReference.setValue(
//                                                        DOCUMENT_NUMBER_DEFAULT
//                                                            .toString()
//                                                    )
//                                                    this@Companion.documentNumberPreferences =
//                                                        DOCUMENT_NUMBER_DEFAULT
//                                                    Prefix.quantityCharactersPreferences =
//                                                        quantityCharacters
//                                                } else if (documentNumberPreferences !=
//                                                    DOCUMENT_NUMBER_DEFAULT
//                                                    && it < documentNumberPreferences
//                                                ) {
//                                                    documentNumberReference.removeEventListener(
//                                                        listener
//                                                    )
//                                                    documentNumberReference.setValue(
//                                                        documentNumberPreferences
//                                                            .toString()
//                                                    )
//                                                } else {
//                                                    documentNumberReference
//                                                        .removeEventListener(listener)
//                                                    this@Companion
//                                                        .documentNumberPreferences = it
//                                                    Prefix.quantityCharactersPreferences =
//                                                        quantityCharacters
//                                                }
//                                            }
//                                    }
//                                }
//                            } ?: run {
//                                documentNumberReference.setValue(DOCUMENT_NUMBER_DEFAULT.toString())
//                            }
//                        } catch (e: Exception) {
//                            documentNumberReference.removeEventListener(this)
//                        }
//                    }
//                })
//            }
//        }
//
//        fun getDocumentNumberInc(): BigInteger {
//            return documentNumberPreferences.takeIf {
//                    it != DOCUMENT_NUMBER_DEFAULT
//                }?.let { documentNumberIt ->
//                    val sequence = documentNumberIt.toString().substring(
//                        Prefix.quantityCharactersPreferences
//                    )
//                    val maxLengthSequence = sequence.length
//
//                    documentNumberIt.takeIf {
//                        sequence == "9".repeat(maxLengthSequence)
//                    }?.let {
//                        Prefix.addListenerForSingleValueEventLastGenerated().single()
//                            .takeIf { it != Prefix.LAST_GENERATED_DEFAULT }?.let {
//                                (it + "0".repeat(maxLengthSequence)).toBigInteger()
//                                    .let { documentNumberGeneratedIt ->
//                                        setDocumentNumberChild(
//                                            documentNumberGeneratedIt
//                                        )
//                                        documentNumberGeneratedIt.inc()
//                                    }
//                            } ?: DOCUMENT_NUMBER_DEFAULT
//                    } ?: documentNumberIt.inc()
//                } ?: documentNumberPreferences
//        }
//
//        fun setDocumentNumberChild(documentNumber: BigInteger) {
//            documentNumberReference.setValue(documentNumber.toString())
//            this.documentNumberPreferences = documentNumber
//        }

}