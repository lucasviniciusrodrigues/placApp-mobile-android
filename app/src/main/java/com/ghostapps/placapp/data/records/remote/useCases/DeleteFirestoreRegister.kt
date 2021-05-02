package com.ghostapps.placapp.data.records.remote.useCases

import com.ghostapps.placapp.domain.models.RecordModel
import com.ghostapps.placapp.domain.useCases.DeleteRegister
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import okhttp3.internal.wait

class DeleteFirestoreRegister() : DeleteRegister {
    override fun execute(successCallback: (recordModel: RecordModel) -> Unit, recordModel: RecordModel) {

        Firebase.firestore
            .collection("scores")
            .document(recordModel.date.toString())
            .delete()
            .addOnSuccessListener {
                println("Deleção com sucesso")
                successCallback(recordModel)
            }
            .addOnFailureListener {
                println("Erro na deleção do item: " + it.message)
                // TODO add log
            }
            
    }
}