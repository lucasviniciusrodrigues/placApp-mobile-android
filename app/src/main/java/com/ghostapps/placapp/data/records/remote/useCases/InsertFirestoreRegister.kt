package com.ghostapps.placapp.data.records.remote.useCases

import com.ghostapps.placapp.domain.models.RecordModel
import com.ghostapps.placapp.domain.useCases.InsertRegister
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class InsertFirestoreRegister(): InsertRegister {
    override fun execute(recordModel: RecordModel) {
        Firebase.firestore
            .collection("scores")
            .document(recordModel.date.toString())
            .set(recordModel)
            .addOnFailureListener {
                println("Erro na inserção")
                // TODO add log
            }
    }
}