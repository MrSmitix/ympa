package ympa_scala_finch_server

import com.twitter.finagle.Service
import com.twitter.finagle.http.{Request, Response}
import com.twitter.finagle.http.exp.Multipart.FileUpload
import com.twitter.util.Future
import io.finch._, items._
import io.circe.{Encoder, Json}
import io.finch.circe._
import io.circe.generic.semiauto._

import org.openapitools.apis._

/**
 * Provides the paths and endpoints for all the API's public service methods.
 */
object endpoint {

  def errorToJson(e: Exception): Json = e match {
      case Error.NotPresent(_) =>
          Json.obj("error" -> Json.fromString("something_not_present"))
      case Error.NotParsed(_, _, _) =>
          Json.obj("error" -> Json.fromString("something_not_parsed"))
      case Error.NotValid(_, _) =>
          Json.obj("error" -> Json.fromString("something_not_valid"))
      case error: CommonError =>
          Json.obj("error" -> Json.fromString(error.message))
  }

  implicit val ee: Encoder[Exception] = Encoder.instance {
      case e: Error => errorToJson(e)
      case Errors(nel) => Json.arr(nel.toList.map(errorToJson): _*)
  }

  /**
  * Compiles together all the endpoints relating to public service methods.
  *
  * @return A service that contains all provided endpoints of the API.
  */
  def makeService(da: DataAccessor): Service[Request, Response] = (
          BidsApi.endpoints(da)  :+:
          BusinessOfferMappingsApi.endpoints(da)  :+:
          BusinessesApi.endpoints(da)  :+:
          CampaignsApi.endpoints(da)  :+:
          CategoriesApi.endpoints(da)  :+:
          ChatsApi.endpoints(da)  :+:
          ContentApi.endpoints(da)  :+:
          DbsApi.endpoints(da)  :+:
          DeliveryServicesApi.endpoints(da)  :+:
          ExpressApi.endpoints(da)  :+:
          FbsApi.endpoints(da)  :+:
          FbyApi.endpoints(da)  :+:
          FeedbacksApi.endpoints(da)  :+:
          FeedsApi.endpoints(da)  :+:
          GoodsFeedbackApi.endpoints(da)  :+:
          GoodsStatsApi.endpoints(da)  :+:
          HiddenOffersApi.endpoints(da)  :+:
          ModelsApi.endpoints(da)  :+:
          OfferMappingsApi.endpoints(da)  :+:
          OffersApi.endpoints(da)  :+:
          OrderBusinessInformationApi.endpoints(da)  :+:
          OrderDeliveryApi.endpoints(da)  :+:
          OrderLabelsApi.endpoints(da)  :+:
          OrdersApi.endpoints(da)  :+:
          OrdersStatsApi.endpoints(da)  :+:
          OutletLicensesApi.endpoints(da)  :+:
          OutletsApi.endpoints(da)  :+:
          PriceQuarantineApi.endpoints(da)  :+:
          PricesApi.endpoints(da)  :+:
          PromosApi.endpoints(da)  :+:
          RatingsApi.endpoints(da)  :+:
          RegionsApi.endpoints(da)  :+:
          ReportsApi.endpoints(da)  :+:
          ReturnsApi.endpoints(da)  :+:
          ShipmentsApi.endpoints(da)  :+:
          StocksApi.endpoints(da)  :+:
          TariffsApi.endpoints(da)  :+:
          WarehousesApi.endpoints(da) 
  ).handle({
      case e: CommonError => NotFound(e)
  }).toService

}