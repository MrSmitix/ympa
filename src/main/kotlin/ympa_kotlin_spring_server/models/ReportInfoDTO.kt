package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.ReportStatusType
import ympa_kotlin_spring_server.models.ReportSubStatusType
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
 * Статус генерации и ссылка на готовый отчет.
 * @param status 
 * @param generationRequestedAt Дата и время запроса на генерацию.
 * @param subStatus 
 * @param generationFinishedAt Дата и время завершения генерации.
 * @param file Ссылка на готовый отчет.
 * @param estimatedGenerationTime Ожидаемая продолжительность генерации в миллисекундах.
 */
data class ReportInfoDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("status", required = true) val status: ReportStatusType,

    @Schema(example = "null", required = true, description = "Дата и время запроса на генерацию.")
    @get:JsonProperty("generationRequestedAt", required = true) val generationRequestedAt: java.time.OffsetDateTime,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("subStatus") val subStatus: ReportSubStatusType? = null,

    @Schema(example = "null", description = "Дата и время завершения генерации.")
    @get:JsonProperty("generationFinishedAt") val generationFinishedAt: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "Ссылка на готовый отчет.")
    @get:JsonProperty("file") val file: kotlin.String? = null,

    @Schema(example = "null", description = "Ожидаемая продолжительность генерации в миллисекундах.")
    @get:JsonProperty("estimatedGenerationTime") val estimatedGenerationTime: kotlin.Long? = null
    ) {

}

