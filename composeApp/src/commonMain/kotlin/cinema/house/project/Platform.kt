package cinema.house.project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform