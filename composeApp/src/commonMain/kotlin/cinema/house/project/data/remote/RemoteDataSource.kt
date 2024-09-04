package cinema.house.project.data.remote

import MovieService
import cinema.house.project.data.util.Dispatcher
import kotlinx.coroutines.withContext

internal class RemoteDataSource(
    private val apiService: MovieService,
    private val dispatcher: Dispatcher
) {

    suspend fun getMovies(page: Int) = withContext(dispatcher.io){
        apiService.getMovies(page = page)
    }

    suspend fun getMovie(movieId: Int) = withContext(dispatcher.io){
        apiService.getMovie(movieId = movieId)
    }
}