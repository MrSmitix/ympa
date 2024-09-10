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
import model.GetOrderLabelsDataResponse
import model.PageFormatType
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Singleton
class OrderLabelsApiController @Inject()(cc: ControllerComponents, api: OrderLabelsApi) extends AbstractController(cc) {
  /**
    * GET /campaigns/:campaignId/orders/:orderId/delivery/shipments/:shipmentId/boxes/:boxId/label?format=[value]
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param orderId Идентификатор заказа.
    * @param shipmentId Идентификатор грузоместа.
    * @param boxId Идентификатор коробки.
    */
  def generateOrderLabel(campaignId: Long, orderId: Long, shipmentId: Long, boxId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): TemporaryFile = {
      val format = request.getQueryString("format")
        .map(value => )
        
      api.generateOrderLabel(campaignId, orderId, shipmentId, boxId, format)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/orders/:orderId/delivery/labels?format=[value]
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param orderId Идентификатор заказа.
    */
  def generateOrderLabels(campaignId: Long, orderId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): TemporaryFile = {
      val format = request.getQueryString("format")
        .map(value => )
        
      api.generateOrderLabels(campaignId, orderId, format)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/orders/:orderId/delivery/labels/data
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param orderId Идентификатор заказа.
    */
  def getOrderLabelsData(campaignId: Long, orderId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetOrderLabelsDataResponse = {
      api.getOrderLabelsData(campaignId, orderId)
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
