package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * Информация о страницах результатов.
 * @param nextPageToken Идентификатор следующей страницы результатов.
 * @param prevPageToken Идентификатор предыдущей страницы результатов.
 */
data class ScrollingPagerDTO(

    @Schema(example = "null", description = "Идентификатор следующей страницы результатов.")
    @get:JsonProperty("nextPageToken") val nextPageToken: kotlin.String? = null,

    @Schema(example = "null", description = "Идентификатор предыдущей страницы результатов.")
    @get:JsonProperty("prevPageToken") val prevPageToken: kotlin.String? = null
    ) {

}

