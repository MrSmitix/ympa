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
 * Значение характеристики.  Вы можете указывать несколько значений одной характеристики при условии, что:  * Тип характеристики — `ENUM`. * В ответе на запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md) у данной характеристики поле `multivalue` имеет значение `true`.  Для этого в `parameterValues` передавайте каждое значение отдельно — несколько объектов с параметрами `parameterId`, `valueId` и `value`. Параметр `parameterId` должен быть одинаковым. 
 * @param parameterId Идентификатор характеристики.
 * @param unitId Идентификатор единицы измерения. Если вы не передали параметр `unitId`, используется единица измерения по умолчанию.
 * @param valueId Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа `ENUM`. 
 * @param &#x60;value&#x60; Значение.
 */
data class ParameterValueDTO(

    @Schema(example = "null", required = true, description = "Идентификатор характеристики.")
    @get:JsonProperty("parameterId", required = true) val parameterId: kotlin.Long,

    @Schema(example = "null", description = "Идентификатор единицы измерения. Если вы не передали параметр `unitId`, используется единица измерения по умолчанию.")
    @get:JsonProperty("unitId") val unitId: kotlin.Long? = null,

    @Schema(example = "null", description = "Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа `ENUM`. ")
    @get:JsonProperty("valueId") val valueId: kotlin.Long? = null,

    @Schema(example = "null", description = "Значение.")
    @get:JsonProperty("value") val `value`: kotlin.String? = null
    ) {

}

