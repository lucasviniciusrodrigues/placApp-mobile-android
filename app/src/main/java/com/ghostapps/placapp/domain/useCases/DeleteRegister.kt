package com.ghostapps.placapp.domain.useCases

import com.ghostapps.placapp.domain.models.RecordModel

interface DeleteRegister {
    fun execute(successCallback: (recordModel: RecordModel) -> Unit, recordModel: RecordModel)
}