package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.FeedIndexLogsErrorDTO
import ympa_kotlin_spring_server.models.FeedIndexLogsIndexType
import ympa_kotlin_spring_server.models.FeedIndexLogsOffersDTO
import ympa_kotlin_spring_server.models.FeedIndexLogsStatusType
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
 * Список отчетов по индексации прайс-листа.
 * @param downloadTime Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
 * @param fileTime Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
 * @param generationId Идентификатор индексации.
 * @param indexType 
 * @param publishedTime Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
 * @param status 
 * @param error 
 * @param offers 
 */
data class FeedIndexLogsRecordDTO(

    @Schema(example = "null", description = "Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. ")
    @get:JsonProperty("downloadTime") val downloadTime: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. ")
    @get:JsonProperty("fileTime") val fileTime: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "Идентификатор индексации.")
    @get:JsonProperty("generationId") val generationId: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("indexType") val indexType: FeedIndexLogsIndexType? = null,

    @Schema(example = "null", description = "Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. ")
    @get:JsonProperty("publishedTime") val publishedTime: java.time.OffsetDateTime? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: FeedIndexLogsStatusType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("error") val error: FeedIndexLogsErrorDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("offers") val offers: FeedIndexLogsOffersDTO? = null
    ) {

}

