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
 * Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
 * @param reportId Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
 * @param estimatedGenerationTime Ожидаемая продолжительность генерации в миллисекундах.
 */
data class GenerateReportDTO(

    @Schema(example = "null", required = true, description = "Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.")
    @get:JsonProperty("reportId", required = true) val reportId: kotlin.String,

    @Schema(example = "null", required = true, description = "Ожидаемая продолжительность генерации в миллисекундах.")
    @get:JsonProperty("estimatedGenerationTime", required = true) val estimatedGenerationTime: kotlin.Long
    ) {

}

