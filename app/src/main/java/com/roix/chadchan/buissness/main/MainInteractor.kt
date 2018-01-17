package com.roix.chadchan.buissness.main

import com.roix.chadchan.data.repositories.server.IServerRepository
import com.roix.chadchan.data.repositories.server.ServerRepository

import javax.inject.Inject

/**
 * Created by roix template
 * https://github.com/roixa/RoixArchitectureTemplates
 */
class MainInteractor : IMainInteractor {

    @Inject constructor()

    @Inject lateinit var serverRepository: ServerRepository

}
