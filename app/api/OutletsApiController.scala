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
import model.ChangeOutletRequest
import model.CreateOutletResponse
import model.EmptyApiResponse
import model.GetOutletResponse
import model.GetOutletsResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Singleton
class OutletsApiController @Inject()(cc: ControllerComponents, api: OutletsApi) extends AbstractController(cc) {
  /**
    * POST /campaigns/:campaignId/outlets
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def createOutlet(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): CreateOutletResponse = {
      val changeOutletRequest = request.body.asJson.map(_.as[ChangeOutletRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "changeOutletRequest")
      }
      api.createOutlet(campaignId, changeOutletRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /campaigns/:campaignId/outlets/:outletId
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param outletId Идентификатор точки продаж.
    */
  def deleteOutlet(campaignId: Long, outletId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      api.deleteOutlet(campaignId, outletId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/outlets/:outletId
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param outletId Идентификатор точки продаж.
    */
  def getOutlet(campaignId: Long, outletId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetOutletResponse = {
      api.getOutlet(campaignId, outletId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/outlets?pageToken=[value]&regionId=[value]&shopOutletCode=[value]&regionId2=[value]
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getOutlets(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetOutletsResponse = {
      val pageToken = request.getQueryString("page_token")
        
      val regionId = request.getQueryString("region_id")
        .map(value => value.toLong)
        
      val shopOutletCode = request.getQueryString("shop_outlet_code")
        
      val regionId2 = request.getQueryString("regionId")
        .map(value => value.toLong)
        
      api.getOutlets(campaignId, pageToken, regionId, shopOutletCode, regionId2)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PUT /campaigns/:campaignId/outlets/:outletId
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param outletId Идентификатор точки продаж.
    */
  def updateOutlet(campaignId: Long, outletId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val changeOutletRequest = request.body.asJson.map(_.as[ChangeOutletRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "changeOutletRequest")
      }
      api.updateOutlet(campaignId, outletId, changeOutletRequest)
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
