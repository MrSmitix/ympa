@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CategoryParameterDTO(
    @field:JsonProperty("id")
    val id: kotlin.Long,

    @field:JsonProperty("type")
    val type: ParameterType,

    @field:JsonProperty("required")
    val required: kotlin.Boolean,

    @field:JsonProperty("filtering")
    val filtering: kotlin.Boolean,

    @field:JsonProperty("distinctive")
    val distinctive: kotlin.Boolean,

    @field:JsonProperty("multivalue")
    val multivalue: kotlin.Boolean,

    @field:JsonProperty("allowCustomValues")
    val allowCustomValues: kotlin.Boolean,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("unit")
    val unit: CategoryParameterUnitDTO? = null,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("recommendationTypes")
    val recommendationTypes: kotlin.collections.List<OfferCardRecommendationType>? = null,

    @field:JsonProperty("values")
    val propertyValues: kotlin.collections.List<ParameterValueOptionDTO>? = null,

    @field:JsonProperty("constraints")
    val constraints: ParameterValueConstraintsDTO? = null,

    @field:JsonProperty("valueRestrictions")
    val valueRestrictions: kotlin.collections.List<ValueRestrictionDTO>? = null,

)
