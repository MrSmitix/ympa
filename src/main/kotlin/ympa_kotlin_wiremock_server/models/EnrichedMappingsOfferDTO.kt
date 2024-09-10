@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class EnrichedMappingsOfferDTO(
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("shopSku")
    val shopSku: kotlin.String? = null,

    @field:JsonProperty("category")
    val category: kotlin.String? = null,

    @field:JsonProperty("vendor")
    val vendor: kotlin.String? = null,

    @field:JsonProperty("vendorCode")
    val vendorCode: kotlin.String? = null,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("feedId")
    val feedId: kotlin.Long? = null,

    @field:JsonProperty("barcodes")
    val barcodes: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("urls")
    val urls: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("pictures")
    val pictures: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("manufacturer")
    val manufacturer: kotlin.String? = null,

    @field:JsonProperty("manufacturerCountries")
    val manufacturerCountries: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("minShipment")
    val minShipment: kotlin.Int? = null,

    @field:JsonProperty("transportUnitSize")
    val transportUnitSize: kotlin.Int? = null,

    @field:JsonProperty("quantumOfSupply")
    val quantumOfSupply: kotlin.Int? = null,

    @field:JsonProperty("deliveryDurationDays")
    val deliveryDurationDays: kotlin.Int? = null,

    @field:JsonProperty("boxCount")
    val boxCount: kotlin.Int? = null,

    @field:JsonProperty("customsCommodityCodes")
    val customsCommodityCodes: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("weightDimensions")
    val weightDimensions: OfferWeightDimensionsDTO? = null,

    @field:JsonProperty("supplyScheduleDays")
    val supplyScheduleDays: kotlin.collections.List<DayOfWeekType>? = null,

    @field:JsonProperty("shelfLifeDays")
    val shelfLifeDays: kotlin.Int? = null,

    @field:JsonProperty("lifeTimeDays")
    val lifeTimeDays: kotlin.Int? = null,

    @field:JsonProperty("guaranteePeriodDays")
    val guaranteePeriodDays: kotlin.Int? = null,

    @field:JsonProperty("processingState")
    val processingState: OfferProcessingStateDTO? = null,

    @field:JsonProperty("availability")
    val availability: OfferAvailabilityStatusType? = null,

    @field:JsonProperty("shelfLife")
    val shelfLife: TimePeriodDTO? = null,

    @field:JsonProperty("lifeTime")
    val lifeTime: TimePeriodDTO? = null,

    @field:JsonProperty("guaranteePeriod")
    val guaranteePeriod: TimePeriodDTO? = null,

    @field:JsonProperty("certificate")
    val certificate: kotlin.String? = null,

    @field:JsonProperty("price")
    val price: java.math.BigDecimal? = null,

    @field:JsonProperty("marketCategoryId")
    val marketCategoryId: kotlin.Long? = null,

    @field:JsonProperty("marketCategoryName")
    val marketCategoryName: kotlin.String? = null,

    @field:JsonProperty("marketModelId")
    val marketModelId: kotlin.Long? = null,

    @field:JsonProperty("marketModelName")
    val marketModelName: kotlin.String? = null,

    @field:JsonProperty("marketSku")
    val marketSku: kotlin.Long? = null,

    @field:JsonProperty("marketSkuName")
    val marketSkuName: kotlin.String? = null,

)
