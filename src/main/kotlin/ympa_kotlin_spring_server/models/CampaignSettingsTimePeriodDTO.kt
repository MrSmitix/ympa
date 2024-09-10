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
 * Период, за который рассчитывается итоговый список нерабочих дней службы доставки.
 * @param fromDate Формат даты: `ДД-ММ-ГГГГ`. 
 * @param toDate Формат даты: `ДД-ММ-ГГГГ`. 
 */
data class CampaignSettingsTimePeriodDTO(

    @Schema(example = "23-09-2022", description = "Формат даты: `ДД-ММ-ГГГГ`. ")
    @get:JsonProperty("fromDate") val fromDate: kotlin.String? = null,

    @Schema(example = "23-09-2022", description = "Формат даты: `ДД-ММ-ГГГГ`. ")
    @get:JsonProperty("toDate") val toDate: kotlin.String? = null
    ) {

}

