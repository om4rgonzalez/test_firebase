package com.example.firebasesecuritytest

import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.firebasesecuritytest.firebase.Device
import com.google.firebase.database.*
import java.math.BigInteger
import java.util.*


class NumberGenerationViewModel: ViewModel() {

    val number = ObservableField<String>()
    private var documentNumber: DatabaseReference = FirebaseDatabase.getInstance().reference
        .child("countries")
        .child("BRT")
        .child("branches")
        .child("6")
        .child("devices")
        .child("359939082008943")
        .child("documentNumber")

    init {
        documentNumber.addValueEventListener(object : ValueEventListener {
            override fun onCancelled(error: DatabaseError) {}

            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot.exists()) {
                    snapshot.value?.also {
                        number.set(it.toString())
                    }
                }
            }
        })
    }




    fun generate(){
        documentNumber.setValue(BigInteger(number.get()).inc().toString())
    }
}