package monster.donjabonoso.tmdbandroid.domain.models

data class ModelMoviesResponse(
    val dates: ModelDates,
    val page: Int,
    val results: List<ModelMovie>,
    val totalPages: Int,
    val totalResults: Int
)