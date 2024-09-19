package com.demo.movies.di

import com.demo.movies.data.remote.MovieService
import com.demo.movies.data.remote.RemoteDataSource
import com.demo.movies.data.repository.MovieRepositoryImpl
import com.demo.movies.domain.repository.MovieRepository
import com.demo.movies.domain.usecase.GetMovieUseCase
import com.demo.movies.domain.usecase.GetMoviesUseCase
import com.demo.movies.util.provideDispatcher
import org.koin.dsl.module

private val dataModule = module {
    factory { RemoteDataSource(get(), get()) }
    factory { MovieService() }
}

private val utilityModule = module {
    factory { provideDispatcher() }
}

private val domainModule = module {
    single<MovieRepository> { MovieRepositoryImpl(get()) }
    factory { GetMoviesUseCase() }
    factory { GetMovieUseCase() }
}

private val sharedModules = listOf(domainModule, dataModule, utilityModule)

fun getSharedModules() = sharedModules












