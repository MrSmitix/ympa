package org.openapitools

import api._
import play.api.inject.{Binding, Module => PlayModule}
import play.api.{Configuration, Environment}

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
class Module extends PlayModule {
  override def bindings(environment: Environment, configuration: Configuration): Seq[Binding[_]] = Seq(
    bind[BidsApi].to[BidsApiImpl],
    bind[BusinessOfferMappingsApi].to[BusinessOfferMappingsApiImpl],
    bind[BusinessesApi].to[BusinessesApiImpl],
    bind[CampaignsApi].to[CampaignsApiImpl],
    bind[CategoriesApi].to[CategoriesApiImpl],
    bind[ChatsApi].to[ChatsApiImpl],
    bind[ContentApi].to[ContentApiImpl],
    bind[DbsApi].to[DbsApiImpl],
    bind[DeliveryServicesApi].to[DeliveryServicesApiImpl],
    bind[ExpressApi].to[ExpressApiImpl],
    bind[FbsApi].to[FbsApiImpl],
    bind[FbyApi].to[FbyApiImpl],
    bind[FeedbacksApi].to[FeedbacksApiImpl],
    bind[FeedsApi].to[FeedsApiImpl],
    bind[GoodsFeedbackApi].to[GoodsFeedbackApiImpl],
    bind[GoodsStatsApi].to[GoodsStatsApiImpl],
    bind[HiddenOffersApi].to[HiddenOffersApiImpl],
    bind[ModelsApi].to[ModelsApiImpl],
    bind[OfferMappingsApi].to[OfferMappingsApiImpl],
    bind[OffersApi].to[OffersApiImpl],
    bind[OrderBusinessInformationApi].to[OrderBusinessInformationApiImpl],
    bind[OrderDeliveryApi].to[OrderDeliveryApiImpl],
    bind[OrderLabelsApi].to[OrderLabelsApiImpl],
    bind[OrdersApi].to[OrdersApiImpl],
    bind[OrdersStatsApi].to[OrdersStatsApiImpl],
    bind[OutletLicensesApi].to[OutletLicensesApiImpl],
    bind[OutletsApi].to[OutletsApiImpl],
    bind[PriceQuarantineApi].to[PriceQuarantineApiImpl],
    bind[PricesApi].to[PricesApiImpl],
    bind[PromosApi].to[PromosApiImpl],
    bind[RatingsApi].to[RatingsApiImpl],
    bind[RegionsApi].to[RegionsApiImpl],
    bind[ReportsApi].to[ReportsApiImpl],
    bind[ReturnsApi].to[ReturnsApiImpl],
    bind[ShipmentsApi].to[ShipmentsApiImpl],
    bind[StocksApi].to[StocksApiImpl],
    bind[TariffsApi].to[TariffsApiImpl],
    bind[WarehousesApi].to[WarehousesApiImpl]
  )
}
