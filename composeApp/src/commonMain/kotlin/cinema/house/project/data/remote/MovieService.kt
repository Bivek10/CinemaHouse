import cinema.house.project.data.remote.MovieRemote
import cinema.house.project.data.remote.MoviesResponse
import cinema.house.project.pages.KtorApi
import io.ktor.client.call.*
import io.ktor.client.request.*

internal class MovieService: KtorApi() {

    suspend fun getMovies(page: Int = 1): MoviesResponse = client.get {
        pathUrl("movie/popular")
        parameter("page", page)
    }.body()

    suspend fun getMovie(movieId: Int): MovieRemote = client.get {
        pathUrl("movie/${movieId}")
    }.body()
}