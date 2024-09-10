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
import model.GetCampaignLoginsResponse
import model.GetCampaignRegionResponse
import model.GetCampaignResponse
import model.GetCampaignSettingsResponse
import model.GetCampaignsResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Singleton
class CampaignsApiController @Inject()(cc: ControllerComponents, api: CampaignsApi) extends AbstractController(cc) {
  /**
    * GET /campaigns/:campaignId
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getCampaign(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetCampaignResponse = {
      api.getCampaign(campaignId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/logins
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getCampaignLogins(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetCampaignLoginsResponse = {
      api.getCampaignLogins(campaignId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/region
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getCampaignRegion(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetCampaignRegionResponse = {
      api.getCampaignRegion(campaignId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/settings
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getCampaignSettings(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetCampaignSettingsResponse = {
      api.getCampaignSettings(campaignId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns?page=[value]&pageSize=[value]
    */
  def getCampaigns(): Action[AnyContent] = Action { request =>
    def executeApi(): GetCampaignsResponse = {
      val page = request.getQueryString("page")
        .map(value => value.toInt)
        
      val pageSize = request.getQueryString("pageSize")
        .map(value => value.toInt)
        
      api.getCampaigns(page, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/by_login/:login?page=[value]&pageSize=[value]
    * @param login Логин пользователя.
    */
  def getCampaignsByLogin(login: String): Action[AnyContent] = Action { request =>
    def executeApi(): GetCampaignsResponse = {
      val page = request.getQueryString("page")
        .map(value => value.toInt)
        
      val pageSize = request.getQueryString("pageSize")
        .map(value => value.toInt)
        
      api.getCampaignsByLogin(login, page, pageSize)
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
