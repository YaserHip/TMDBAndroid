package monster.donjabonoso.tmdbandroid.data.dto

import com.squareup.moshi.Json

data class DTOMoviesResponse(
    val dates: DTODates,
    val page: Int,
    @field:Json(name = "results") val results: List<DTOMovie>,
    @field:Json(name = "total_pages") val totalPages: Int,
    @field:Json(name = "total_results") val totalResults: Int
)