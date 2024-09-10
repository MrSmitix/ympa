package org.openapitools.server

import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Route
import org.openapitools.server.api.BidsApi
import org.openapitools.server.api.BusinessOfferMappingsApi
import org.openapitools.server.api.BusinessesApi
import org.openapitools.server.api.CampaignsApi
import org.openapitools.server.api.CategoriesApi
import org.openapitools.server.api.ChatsApi
import org.openapitools.server.api.ContentApi
import org.openapitools.server.api.DbsApi
import org.openapitools.server.api.DeliveryServicesApi
import org.openapitools.server.api.ExpressApi
import org.openapitools.server.api.FbsApi
import org.openapitools.server.api.FbyApi
import org.openapitools.server.api.FeedbacksApi
import org.openapitools.server.api.FeedsApi
import org.openapitools.server.api.GoodsFeedbackApi
import org.openapitools.server.api.GoodsStatsApi
import org.openapitools.server.api.HiddenOffersApi
import org.openapitools.server.api.ModelsApi
import org.openapitools.server.api.OfferMappingsApi
import org.openapitools.server.api.OffersApi
import org.openapitools.server.api.OrderBusinessInformationApi
import org.openapitools.server.api.OrderDeliveryApi
import org.openapitools.server.api.OrderLabelsApi
import org.openapitools.server.api.OrdersApi
import org.openapitools.server.api.OrdersStatsApi
import org.openapitools.server.api.OutletLicensesApi
import org.openapitools.server.api.OutletsApi
import org.openapitools.server.api.PriceQuarantineApi
import org.openapitools.server.api.PricesApi
import org.openapitools.server.api.PromosApi
import org.openapitools.server.api.RatingsApi
import org.openapitools.server.api.RegionsApi
import org.openapitools.server.api.ReportsApi
import org.openapitools.server.api.ReturnsApi
import org.openapitools.server.api.ShipmentsApi
import org.openapitools.server.api.StocksApi
import org.openapitools.server.api.TariffsApi
import org.openapitools.server.api.WarehousesApi

import akka.http.scaladsl.server.Directives._
import akka.actor.ActorSystem
import akka.stream.ActorMaterializer

class Controller(bids: BidsApi, businessOfferMappings: BusinessOfferMappingsApi, businesses: BusinessesApi, campaigns: CampaignsApi, categories: CategoriesApi, chats: ChatsApi, content: ContentApi, dbs: DbsApi, deliveryServices: DeliveryServicesApi, express: ExpressApi, fbs: FbsApi, fby: FbyApi, feedbacks: FeedbacksApi, feeds: FeedsApi, goodsFeedback: GoodsFeedbackApi, goodsStats: GoodsStatsApi, hiddenOffers: HiddenOffersApi, models: ModelsApi, offerMappings: OfferMappingsApi, offers: OffersApi, orderBusinessInformation: OrderBusinessInformationApi, orderDelivery: OrderDeliveryApi, orderLabels: OrderLabelsApi, orders: OrdersApi, ordersStats: OrdersStatsApi, outletLicenses: OutletLicensesApi, outlets: OutletsApi, priceQuarantine: PriceQuarantineApi, prices: PricesApi, promos: PromosApi, ratings: RatingsApi, regions: RegionsApi, reports: ReportsApi, returns: ReturnsApi, shipments: ShipmentsApi, stocks: StocksApi, tariffs: TariffsApi, warehouses: WarehousesApi)(implicit system: ActorSystem, materializer: ActorMaterializer) {

    lazy val routes: Route = bids.route ~ businessOfferMappings.route ~ businesses.route ~ campaigns.route ~ categories.route ~ chats.route ~ content.route ~ dbs.route ~ deliveryServices.route ~ express.route ~ fbs.route ~ fby.route ~ feedbacks.route ~ feeds.route ~ goodsFeedback.route ~ goodsStats.route ~ hiddenOffers.route ~ models.route ~ offerMappings.route ~ offers.route ~ orderBusinessInformation.route ~ orderDelivery.route ~ orderLabels.route ~ orders.route ~ ordersStats.route ~ outletLicenses.route ~ outlets.route ~ priceQuarantine.route ~ prices.route ~ promos.route ~ ratings.route ~ regions.route ~ reports.route ~ returns.route ~ shipments.route ~ stocks.route ~ tariffs.route ~ warehouses.route 

    Http().bindAndHandle(routes, "0.0.0.0", 9000)
}