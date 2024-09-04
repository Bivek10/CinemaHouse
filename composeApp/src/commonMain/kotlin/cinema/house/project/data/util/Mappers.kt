package cinema.house.project.data.util

import cinema.house.project.data.remote.MovieRemote


internal fun MovieRemote.toMovie(): Movie{
    return Movie(
        id = id,
        title = title,
        description = overview,
        imageUrl = getImageUrl(posterImage),
        releaseDate = releaseDate
    )
}

private fun getImageUrl(posterImage: String) = "https://image.tmdb.org/t/p/w500/$posterImage"