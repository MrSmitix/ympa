package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.CategoryParameterUnitDTO
import ympa_kotlin_spring_server.models.OfferCardRecommendationType
import ympa_kotlin_spring_server.models.ParameterType
import ympa_kotlin_spring_server.models.ParameterValueConstraintsDTO
import ympa_kotlin_spring_server.models.ParameterValueOptionDTO
import ympa_kotlin_spring_server.models.ValueRestrictionDTO
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
 * Характеристика товара.
 * @param id Идентификатор характеристики.
 * @param type 
 * @param required Обязательность характеристики.
 * @param filtering Используется ли характеристика в фильтре.
 * @param distinctive Является ли характеристика особенностью варианта.
 * @param multivalue Можно ли передать сразу несколько значений.
 * @param allowCustomValues Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`.
 * @param name Название характеристики.
 * @param unit 
 * @param description Описание характеристики.
 * @param recommendationTypes Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика.
 * @param propertyValues Список допустимых значений параметра. Только для характеристик типа `ENUM`.
 * @param constraints 
 * @param valueRestrictions Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`.
 */
data class CategoryParameterDTO(

    @Schema(example = "null", required = true, description = "Идентификатор характеристики.")
    @get:JsonProperty("id", required = true) val id: kotlin.Long,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("type", required = true) val type: ParameterType,

    @Schema(example = "null", required = true, description = "Обязательность характеристики.")
    @get:JsonProperty("required", required = true) val required: kotlin.Boolean,

    @Schema(example = "null", required = true, description = "Используется ли характеристика в фильтре.")
    @get:JsonProperty("filtering", required = true) val filtering: kotlin.Boolean,

    @Schema(example = "null", required = true, description = "Является ли характеристика особенностью варианта.")
    @get:JsonProperty("distinctive", required = true) val distinctive: kotlin.Boolean,

    @Schema(example = "null", required = true, description = "Можно ли передать сразу несколько значений.")
    @get:JsonProperty("multivalue", required = true) val multivalue: kotlin.Boolean,

    @Schema(example = "null", required = true, description = "Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`.")
    @get:JsonProperty("allowCustomValues", required = true) val allowCustomValues: kotlin.Boolean,

    @Schema(example = "null", description = "Название характеристики.")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("unit") val unit: CategoryParameterUnitDTO? = null,

    @Schema(example = "null", description = "Описание характеристики.")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика.")
    @get:JsonProperty("recommendationTypes") val recommendationTypes: kotlin.collections.List<OfferCardRecommendationType>? = null,

    @field:Valid
    @Schema(example = "null", description = "Список допустимых значений параметра. Только для характеристик типа `ENUM`.")
    @get:JsonProperty("values") val propertyValues: kotlin.collections.List<ParameterValueOptionDTO>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("constraints") val constraints: ParameterValueConstraintsDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`.")
    @get:JsonProperty("valueRestrictions") val valueRestrictions: kotlin.collections.List<ValueRestrictionDTO>? = null
    ) {

}

