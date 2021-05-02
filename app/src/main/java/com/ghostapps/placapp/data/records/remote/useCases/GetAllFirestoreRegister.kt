package com.ghostapps.placapp.data.records.remote.useCases

import com.ghostapps.placapp.domain.models.RecordModel
import com.ghostapps.placapp.domain.useCases.GetAllRegister
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import okhttp3.internal.wait

class GetAllFirestoreRegister() : GetAllRegister {

    override fun execute(): Array<RecordModel> {
        var myList = arrayListOf<RecordModel>()
        var threadDone = false;

        Firebase.firestore
            .collection("scores")
            .get()
            .addOnSuccessListener { result ->
                var i = 0;
                for (document in result) {
                    myList.add(document.toObject(RecordModel::class.java))
                    i++
                }
                threadDone = true
            }
            .addOnFailureListener {
                println("Erro na consulta")
                threadDone = true
                // TODO add log
            }

        while (!threadDone)
            Thread.sleep(1000)

        return myList.toArray(arrayOfNulls<RecordModel>(0))
    }

}