package com.ghostapps.placapp.main.di

import com.ghostapps.placapp.data.records.remote.useCases.DeleteFirestoreRegister
import com.ghostapps.placapp.data.records.remote.useCases.GetAllFirestoreRegister
import com.ghostapps.placapp.data.records.remote.useCases.InsertFirestoreRegister
import com.ghostapps.placapp.data.records.remote.useCases.LoginFirebase
import com.ghostapps.placapp.viewModel.gameRecords.GameRecordsViewModel
import com.ghostapps.placapp.viewModel.gameScore.GameScoreContract
import com.ghostapps.placapp.viewModel.gameScore.GameScoreViewModel
import com.ghostapps.placapp.viewModel.home.HomeContract
import com.ghostapps.placapp.viewModel.home.HomeViewModel
import com.ghostapps.placapp.viewModel.login.LoginContract
import com.ghostapps.placapp.viewModel.login.LoginViewModel
import com.ghostapps.placapp.viewModel.preGame.PreGameContract
import com.ghostapps.placapp.viewModel.preGame.PreGameViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object ViewModelModules {

    val modules = module {
        viewModel { (contract: LoginContract) ->
            LoginViewModel(contract, get<LoginFirebase>())
        }
        viewModel { (contract: HomeContract) ->
            HomeViewModel(contract)
        }
        viewModel {(contract: PreGameContract) ->
            PreGameViewModel(contract)
        }
        viewModel {(contract: GameScoreContract) ->
            GameScoreViewModel(contract, get<InsertFirestoreRegister>())
        }
        viewModel {
            GameRecordsViewModel(get<GetAllFirestoreRegister>(), get<DeleteFirestoreRegister>())
        }
    }

}