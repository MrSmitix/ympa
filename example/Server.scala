//> using scala "3.4.1"
//> using lib "org.openapitools::caskgen:0.0.1"
//> using repositories https://maven.pkg.github.com/yandex-market/yandex-market-partner-api


/**
* This single file can contain the business logic for a REST service.
* ====================================
* == zero-install build with docker ==
* ====================================
*
*
* ```
* docker build . -t caskgen:latest
* ```
* ======================
* == Building Locally ==
* ======================
* This project can be built using [[scala-clit][https://scala-cli.virtuslab.org]]
*
* To simply run the project
* ```
* scala-cli Server.scala
* ```
*
* To create a runnable jar, run:
* ```
* scala-cli --power package Server.scala -o app-assembly --assembly
* ```
*
* To produce a docker image (no need for the Dockerfile), run:
* ```
* scala-cli --power package --docker Server.scala --docker-image-repository app-docker
* ```
*
* To generate an IDE project:
* ```
* scala-cli setup-ide . --scala 3.3
* ```
*/
package app

import ympa_scala_cask_server.BaseApp
import ympa_scala_cask_server.api.*
import ympa_scala_cask_server.model.*

import java.io.File

// TODO - write your business logic for your services here (the defaults all return 'not implemented'):
val myBidsService : BidsService = BidsService() // <-- replace this with your implementation
val myBusinessOfferMappingsService : BusinessOfferMappingsService = BusinessOfferMappingsService() // <-- replace this with your implementation
val myBusinessesService : BusinessesService = BusinessesService() // <-- replace this with your implementation
val myCampaignsService : CampaignsService = CampaignsService() // <-- replace this with your implementation
val myCategoriesService : CategoriesService = CategoriesService() // <-- replace this with your implementation
val myChatsService : ChatsService = ChatsService() // <-- replace this with your implementation
val myContentService : ContentService = ContentService() // <-- replace this with your implementation
val myDbsService : DbsService = DbsService() // <-- replace this with your implementation
val myDeliveryServicesService : DeliveryServicesService = DeliveryServicesService() // <-- replace this with your implementation
val myExpressService : ExpressService = ExpressService() // <-- replace this with your implementation
val myFbsService : FbsService = FbsService() // <-- replace this with your implementation
val myFbyService : FbyService = FbyService() // <-- replace this with your implementation
val myFeedbacksService : FeedbacksService = FeedbacksService() // <-- replace this with your implementation
val myFeedsService : FeedsService = FeedsService() // <-- replace this with your implementation
val myGoodsFeedbackService : GoodsFeedbackService = GoodsFeedbackService() // <-- replace this with your implementation
val myGoodsStatsService : GoodsStatsService = GoodsStatsService() // <-- replace this with your implementation
val myHiddenOffersService : HiddenOffersService = HiddenOffersService() // <-- replace this with your implementation
val myModelsService : ModelsService = ModelsService() // <-- replace this with your implementation
val myOfferMappingsService : OfferMappingsService = OfferMappingsService() // <-- replace this with your implementation
val myOffersService : OffersService = OffersService() // <-- replace this with your implementation
val myOrderBusinessInformationService : OrderBusinessInformationService = OrderBusinessInformationService() // <-- replace this with your implementation
val myOrderDeliveryService : OrderDeliveryService = OrderDeliveryService() // <-- replace this with your implementation
val myOrderLabelsService : OrderLabelsService = OrderLabelsService() // <-- replace this with your implementation
val myOrdersService : OrdersService = OrdersService() // <-- replace this with your implementation
val myOrdersStatsService : OrdersStatsService = OrdersStatsService() // <-- replace this with your implementation
val myOutletLicensesService : OutletLicensesService = OutletLicensesService() // <-- replace this with your implementation
val myOutletsService : OutletsService = OutletsService() // <-- replace this with your implementation
val myPriceQuarantineService : PriceQuarantineService = PriceQuarantineService() // <-- replace this with your implementation
val myPricesService : PricesService = PricesService() // <-- replace this with your implementation
val myPromosService : PromosService = PromosService() // <-- replace this with your implementation
val myRatingsService : RatingsService = RatingsService() // <-- replace this with your implementation
val myRegionsService : RegionsService = RegionsService() // <-- replace this with your implementation
val myReportsService : ReportsService = ReportsService() // <-- replace this with your implementation
val myReturnsService : ReturnsService = ReturnsService() // <-- replace this with your implementation
val myShipmentsService : ShipmentsService = ShipmentsService() // <-- replace this with your implementation
val myStocksService : StocksService = StocksService() // <-- replace this with your implementation
val myTariffsService : TariffsService = TariffsService() // <-- replace this with your implementation
val myWarehousesService : WarehousesService = WarehousesService() // <-- replace this with your implementation

/** This is your main entry point for your REST service
 *  It extends BaseApp which defines the business logic for your services
 */
object Server extends BaseApp(appBidsService = myBidsService,
appBusinessOfferMappingsService = myBusinessOfferMappingsService,
appBusinessesService = myBusinessesService,
appCampaignsService = myCampaignsService,
appCategoriesService = myCategoriesService,
appChatsService = myChatsService,
appContentService = myContentService,
appDbsService = myDbsService,
appDeliveryServicesService = myDeliveryServicesService,
appExpressService = myExpressService,
appFbsService = myFbsService,
appFbyService = myFbyService,
appFeedbacksService = myFeedbacksService,
appFeedsService = myFeedsService,
appGoodsFeedbackService = myGoodsFeedbackService,
appGoodsStatsService = myGoodsStatsService,
appHiddenOffersService = myHiddenOffersService,
appModelsService = myModelsService,
appOfferMappingsService = myOfferMappingsService,
appOffersService = myOffersService,
appOrderBusinessInformationService = myOrderBusinessInformationService,
appOrderDeliveryService = myOrderDeliveryService,
appOrderLabelsService = myOrderLabelsService,
appOrdersService = myOrdersService,
appOrdersStatsService = myOrdersStatsService,
appOutletLicensesService = myOutletLicensesService,
appOutletsService = myOutletsService,
appPriceQuarantineService = myPriceQuarantineService,
appPricesService = myPricesService,
appPromosService = myPromosService,
appRatingsService = myRatingsService,
appRegionsService = myRegionsService,
appReportsService = myReportsService,
appReturnsService = myReturnsService,
appShipmentsService = myShipmentsService,
appStocksService = myStocksService,
appTariffsService = myTariffsService,
appWarehousesService = myWarehousesService):
  start()

