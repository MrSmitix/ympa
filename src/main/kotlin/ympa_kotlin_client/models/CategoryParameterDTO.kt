/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package ympa_kotlin_client.models

import ympa_kotlin_client.models.CategoryParameterUnitDTO
import ympa_kotlin_client.models.OfferCardRecommendationType
import ympa_kotlin_client.models.ParameterType
import ympa_kotlin_client.models.ParameterValueConstraintsDTO
import ympa_kotlin_client.models.ParameterValueOptionDTO
import ympa_kotlin_client.models.ValueRestrictionDTO

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Характеристика товара.
 *
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


data class CategoryParameterDTO (

    /* Идентификатор характеристики. */
    @Json(name = "id")
    val id: kotlin.Long,

    @Json(name = "type")
    val type: ParameterType,

    /* Обязательность характеристики. */
    @Json(name = "required")
    val required: kotlin.Boolean,

    /* Используется ли характеристика в фильтре. */
    @Json(name = "filtering")
    val filtering: kotlin.Boolean,

    /* Является ли характеристика особенностью варианта. */
    @Json(name = "distinctive")
    val distinctive: kotlin.Boolean,

    /* Можно ли передать сразу несколько значений. */
    @Json(name = "multivalue")
    val multivalue: kotlin.Boolean,

    /* Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`. */
    @Json(name = "allowCustomValues")
    val allowCustomValues: kotlin.Boolean,

    /* Название характеристики. */
    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "unit")
    val unit: CategoryParameterUnitDTO? = null,

    /* Описание характеристики. */
    @Json(name = "description")
    val description: kotlin.String? = null,

    /* Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика. */
    @Json(name = "recommendationTypes")
    val recommendationTypes: kotlin.collections.List<OfferCardRecommendationType>? = null,

    /* Список допустимых значений параметра. Только для характеристик типа `ENUM`. */
    @Json(name = "values")
    val propertyValues: kotlin.collections.List<ParameterValueOptionDTO>? = null,

    @Json(name = "constraints")
    val constraints: ParameterValueConstraintsDTO? = null,

    /* Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`. */
    @Json(name = "valueRestrictions")
    val valueRestrictions: kotlin.collections.List<ValueRestrictionDTO>? = null

) {


}

