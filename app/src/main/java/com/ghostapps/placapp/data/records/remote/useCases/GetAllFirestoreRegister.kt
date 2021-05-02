package com.ghostapps.placapp.data.records.remote.useCases

import com.ghostapps.placapp.domain.models.RecordModel
import com.ghostapps.placapp.domain.useCases.GetAllRegister
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import okhttp3.internal.wait

class GetAllFirestoreRegister() : GetAllRegister {

    override fun execute(successCallback: (recordList: Array<RecordModel>) -> Unit) {
        var myList = arrayListOf<RecordModel>()

        Firebase.firestore
            .collection("scores")
            .get()
            .addOnSuccessListener { result ->
                for (document in result) {
                    myList.add(document.toObject(RecordModel::class.java))
                }
                successCallback(myList.toArray(arrayOfNulls<RecordModel>(0)))
            }
            .addOnFailureListener {
                println("Erro na consulta")
                // TODO add log
            }
    }

}