package cinema.house.project.domain.repository

import cinema.house.project.domain.model.Movie


internal interface MovieRepository {
    suspend fun getMovies(page: Int): List<Movie>

    suspend fun getMovie(movieId: Int): Movie
}