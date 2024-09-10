package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.OutletAddressDTO
import ympa_kotlin_spring_server.models.OutletDeliveryRuleDTO
import ympa_kotlin_spring_server.models.OutletType
import ympa_kotlin_spring_server.models.OutletVisibilityType
import ympa_kotlin_spring_server.models.OutletWorkingScheduleDTO
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
 * Информация о точке продаж.
 * @param name Название точки продаж. 
 * @param type 
 * @param address 
 * @param phones Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`. 
 * @param workingSchedule 
 * @param coords Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`. 
 * @param isMain Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж. 
 * @param shopOutletCode Идентификатор точки продаж, присвоенный магазином.
 * @param visibility 
 * @param deliveryRules Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`. 
 * @param storagePeriod Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.
 */
data class OutletDTO(

    @Schema(example = "null", required = true, description = "Название точки продаж. ")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("type", required = true) val type: OutletType,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("address", required = true) val address: OutletAddressDTO,

    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`. ")
    @get:JsonProperty("phones", required = true) val phones: kotlin.collections.List<kotlin.String>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("workingSchedule", required = true) val workingSchedule: OutletWorkingScheduleDTO,

    @Schema(example = "null", description = "Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`. ")
    @get:JsonProperty("coords") val coords: kotlin.String? = null,

    @Schema(example = "null", description = "Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж. ")
    @get:JsonProperty("isMain") val isMain: kotlin.Boolean? = null,

    @Schema(example = "null", description = "Идентификатор точки продаж, присвоенный магазином.")
    @get:JsonProperty("shopOutletCode") val shopOutletCode: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("visibility") val visibility: OutletVisibilityType? = null,

    @field:Valid
    @Schema(example = "null", description = "Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`. ")
    @get:JsonProperty("deliveryRules") val deliveryRules: kotlin.collections.List<OutletDeliveryRuleDTO>? = null,

    @Schema(example = "null", description = "Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.")
    @get:JsonProperty("storagePeriod") val storagePeriod: kotlin.Long? = null
    ) {

}

