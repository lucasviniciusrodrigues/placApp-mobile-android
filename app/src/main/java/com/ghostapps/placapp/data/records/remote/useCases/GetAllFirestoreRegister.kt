package com.ghostapps.placapp.data.records.remote.useCases

import com.ghostapps.placapp.domain.models.RecordModel
import com.ghostapps.placapp.domain.useCases.GetAllRegister
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class GetAllFirestoreRegister() : GetAllRegister {

    override fun execute(): Array<RecordModel> {
        var myList = arrayListOf<RecordModel>()

        Firebase.firestore
            .collection("scores")
            .get()
            .addOnSuccessListener { result ->
                var i = 0;
                for (document in result) {
                    myList.add(document.toObject(RecordModel::class.java))
                    i++
                }
            }
            .addOnFailureListener {
                println("Erro na consulta")
                    // TODO add log
            }

        return myList.toArray(arrayOfNulls<RecordModel>(0))
    }

}