package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.EmptyApiResponse
import model.GetOrderBuyerInfoResponse
import model.SetOrderDeliveryDateRequest
import model.SetOrderDeliveryTrackCodeRequest
import model.UpdateOrderStorageLimitRequest
import model.VerifyOrderEacRequest
import model.VerifyOrderEacResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Singleton
class OrderDeliveryApiController @Inject()(cc: ControllerComponents, api: OrderDeliveryApi) extends AbstractController(cc) {
  /**
    * GET /campaigns/:campaignId/orders/:orderId/buyer
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param orderId Идентификатор заказа.
    */
  def getOrderBuyerInfo(campaignId: Long, orderId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetOrderBuyerInfoResponse = {
      api.getOrderBuyerInfo(campaignId, orderId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PUT /campaigns/:campaignId/orders/:orderId/delivery/date
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param orderId Идентификатор заказа.
    */
  def setOrderDeliveryDate(campaignId: Long, orderId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val setOrderDeliveryDateRequest = request.body.asJson.map(_.as[SetOrderDeliveryDateRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "setOrderDeliveryDateRequest")
      }
      api.setOrderDeliveryDate(campaignId, orderId, setOrderDeliveryDateRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/orders/:orderId/delivery/track
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param orderId Идентификатор заказа.
    */
  def setOrderDeliveryTrackCode(campaignId: Long, orderId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val setOrderDeliveryTrackCodeRequest = request.body.asJson.map(_.as[SetOrderDeliveryTrackCodeRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "setOrderDeliveryTrackCodeRequest")
      }
      api.setOrderDeliveryTrackCode(campaignId, orderId, setOrderDeliveryTrackCodeRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PUT /campaigns/:campaignId/orders/:orderId/delivery/storage-limit
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param orderId Идентификатор заказа.
    */
  def updateOrderStorageLimit(campaignId: Long, orderId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val updateOrderStorageLimitRequest = request.body.asJson.map(_.as[UpdateOrderStorageLimitRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "updateOrderStorageLimitRequest")
      }
      api.updateOrderStorageLimit(campaignId, orderId, updateOrderStorageLimitRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PUT /campaigns/:campaignId/orders/:orderId/verifyEac
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param orderId Идентификатор заказа.
    */
  def verifyOrderEac(campaignId: Long, orderId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): VerifyOrderEacResponse = {
      val verifyOrderEacRequest = request.body.asJson.map(_.as[VerifyOrderEacRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "verifyOrderEacRequest")
      }
      api.verifyOrderEac(campaignId, orderId, verifyOrderEacRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}
