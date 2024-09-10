package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.FeedIndexLogsFeedDTO
import ympa_kotlin_spring_server.models.FeedIndexLogsRecordDTO
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
 * Результат выполнения запроса отчета по индексации прайс-листа.
 * @param indexLogRecords Список отчетов по индексации прайс-листа.
 * @param feed 
 * @param total Количество отчетов на всех страницах выходных данных.
 */
data class FeedIndexLogsResultDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "Список отчетов по индексации прайс-листа.")
    @get:JsonProperty("indexLogRecords", required = true) val indexLogRecords: kotlin.collections.List<FeedIndexLogsRecordDTO>,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("feed") val feed: FeedIndexLogsFeedDTO? = null,

    @Schema(example = "null", description = "Количество отчетов на всех страницах выходных данных.")
    @get:JsonProperty("total") val total: kotlin.Long? = null
    ) {

}

