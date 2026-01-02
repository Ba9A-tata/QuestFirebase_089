package com.example.firebase_yoga089.repositori

import android.app.Application
import kotlin.getValue

interface ContainerApp {
    val repositorySiswa: RepositorySiswa
}

class DefaultContainerApp : ContainerApp {
    override val repositorySiswa: RepositorySiswa by lazy {

        FirebaseRepositorySiswa()
    }
}

