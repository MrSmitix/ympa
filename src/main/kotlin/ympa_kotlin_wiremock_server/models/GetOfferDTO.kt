@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetOfferDTO(
    @field:JsonProperty("offerId")
    val offerId: kotlin.String,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("marketCategoryId")
    val marketCategoryId: kotlin.Long? = null,

    @field:JsonProperty("category")
    val category: kotlin.String? = null,

    @field:JsonProperty("pictures")
    val pictures: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("videos")
    val videos: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("manuals")
    val manuals: kotlin.collections.List<OfferManualDTO>? = null,

    @field:JsonProperty("vendor")
    val vendor: kotlin.String? = null,

    @field:JsonProperty("barcodes")
    val barcodes: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("manufacturerCountries")
    val manufacturerCountries: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("weightDimensions")
    val weightDimensions: OfferWeightDimensionsDTO? = null,

    @field:JsonProperty("vendorCode")
    val vendorCode: kotlin.String? = null,

    @field:JsonProperty("tags")
    val tags: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("shelfLife")
    val shelfLife: TimePeriodDTO? = null,

    @field:JsonProperty("lifeTime")
    val lifeTime: TimePeriodDTO? = null,

    @field:JsonProperty("guaranteePeriod")
    val guaranteePeriod: TimePeriodDTO? = null,

    @field:JsonProperty("customsCommodityCode")
    val customsCommodityCode: kotlin.String? = null,

    @field:JsonProperty("certificates")
    val certificates: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("boxCount")
    val boxCount: kotlin.Int? = null,

    @field:JsonProperty("condition")
    val condition: OfferConditionDTO? = null,

    @field:JsonProperty("type")
    val type: OfferType? = null,

    @field:JsonProperty("downloadable")
    val downloadable: kotlin.Boolean? = null,

    @field:JsonProperty("adult")
    val adult: kotlin.Boolean? = null,

    @field:JsonProperty("age")
    val age: AgeDTO? = null,

    @field:JsonProperty("params")
    val params: kotlin.collections.List<OfferParamDTO>? = null,

    @field:JsonProperty("basicPrice")
    val basicPrice: GetPriceWithDiscountDTO? = null,

    @field:JsonProperty("purchasePrice")
    val purchasePrice: GetPriceDTO? = null,

    @field:JsonProperty("additionalExpenses")
    val additionalExpenses: GetPriceDTO? = null,

    @field:JsonProperty("cofinancePrice")
    val cofinancePrice: GetPriceDTO? = null,

    @field:JsonProperty("cardStatus")
    val cardStatus: OfferCardStatusType? = null,

    @field:JsonProperty("campaigns")
    val campaigns: kotlin.collections.List<OfferCampaignStatusDTO>? = null,

    @field:JsonProperty("sellingPrograms")
    val sellingPrograms: kotlin.collections.List<OfferSellingProgramDTO>? = null,

    @field:JsonProperty("archived")
    val archived: kotlin.Boolean? = null,

)
