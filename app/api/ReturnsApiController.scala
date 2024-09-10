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
import model.GetReturnResponse
import model.GetReturnsResponse
import java.time.LocalDate
import model.RefundStatusType
import model.ReturnType
import model.SetReturnDecisionRequest
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Singleton
class ReturnsApiController @Inject()(cc: ControllerComponents, api: ReturnsApi) extends AbstractController(cc) {
  /**
    * GET /campaigns/:campaignId/orders/:orderId/returns/:returnId
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param orderId Идентификатор заказа.
    * @param returnId Идентификатор возврата.
    */
  def getReturn(campaignId: Long, orderId: Long, returnId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetReturnResponse = {
      api.getReturn(campaignId, orderId, returnId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/orders/:orderId/returns/:returnId/application
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param orderId Идентификатор заказа.
    * @param returnId Идентификатор возврата.
    */
  def getReturnApplication(campaignId: Long, orderId: Long, returnId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): TemporaryFile = {
      api.getReturnApplication(campaignId, orderId, returnId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/orders/:orderId/returns/:returnId/decision/:itemId/image/:imageHash
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param orderId Идентификатор заказа.
    * @param returnId Идентификатор возврата.
    * @param itemId Идентификатор товара в возврате.
    * @param imageHash Хеш ссылки изображения для загрузки.
    */
  def getReturnPhoto(campaignId: Long, orderId: Long, returnId: Long, itemId: Long, imageHash: String): Action[AnyContent] = Action { request =>
    def executeApi(): TemporaryFile = {
      api.getReturnPhoto(campaignId, orderId, returnId, itemId, imageHash)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/returns?pageToken=[value]&limit=[value]&orderIds=[value]&statuses=[value]&`type`=[value]&fromDate=[value]&toDate=[value]&fromDate2=[value]&toDate2=[value]
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getReturns(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetReturnsResponse = {
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val orderIds = request.getQueryString("orderIds")
        .map(values => splitCollectionParam(values, "csv"))
        .map(_.map(value => value.toLong)
        
      val statuses = request.getQueryString("statuses")
        .map(values => splitCollectionParam(values, "csv"))
        .map(_.map(value => )
        
      val `type` = request.getQueryString("type")
        .map(value => )
        
      val fromDate = request.getQueryString("fromDate")
        .map(value => LocalDate.parse(value))
        
      val toDate = request.getQueryString("toDate")
        .map(value => LocalDate.parse(value))
        
      val fromDate2 = request.getQueryString("from_date")
        .map(value => LocalDate.parse(value))
        
      val toDate2 = request.getQueryString("to_date")
        .map(value => LocalDate.parse(value))
        
      api.getReturns(campaignId, pageToken, limit, orderIds, statuses, `type`, fromDate, toDate, fromDate2, toDate2)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/orders/:orderId/returns/:returnId/decision
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param orderId Идентификатор заказа.
    * @param returnId Идентификатор возврата.
    */
  def setReturnDecision(campaignId: Long, orderId: Long, returnId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val setReturnDecisionRequest = request.body.asJson.map(_.as[SetReturnDecisionRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "setReturnDecisionRequest")
      }
      api.setReturnDecision(campaignId, orderId, returnId, setReturnDecisionRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/orders/:orderId/returns/:returnId/decision/submit
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param orderId Идентификатор заказа.
    * @param returnId Идентификатор возврата.
    */
  def submitReturnDecision(campaignId: Long, orderId: Long, returnId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      api.submitReturnDecision(campaignId, orderId, returnId)
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
