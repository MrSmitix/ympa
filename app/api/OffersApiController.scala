package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiLockedErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.CurrencyType
import model.DeleteCampaignOffersRequest
import model.DeleteCampaignOffersResponse
import model.EmptyApiResponse
import model.GetAllOffersResponse
import model.GetCampaignOffersRequest
import model.GetCampaignOffersResponse
import model.GetOfferRecommendationsRequest
import model.GetOfferRecommendationsResponse
import model.GetOffersResponse
import model.UpdateCampaignOffersRequest

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Singleton
class OffersApiController @Inject()(cc: ControllerComponents, api: OffersApi) extends AbstractController(cc) {
  /**
    * POST /campaigns/:campaignId/offers/delete
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def deleteCampaignOffers(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): DeleteCampaignOffersResponse = {
      val deleteCampaignOffersRequest = request.body.asJson.map(_.as[DeleteCampaignOffersRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "deleteCampaignOffersRequest")
      }
      api.deleteCampaignOffers(campaignId, deleteCampaignOffersRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/offers/all?feedId=[value]&chunk=[value]
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getAllOffers(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetAllOffersResponse = {
      val feedId = request.getQueryString("feedId")
        .map(value => value.toLong)
        
      val chunk = request.getQueryString("chunk")
        .map(value => value.toInt)
        
      api.getAllOffers(campaignId, feedId, chunk)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/offers?pageToken=[value]&limit=[value]
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getCampaignOffers(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetCampaignOffersResponse = {
      val getCampaignOffersRequest = request.body.asJson.map(_.as[GetCampaignOffersRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "getCampaignOffersRequest")
      }
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getCampaignOffers(campaignId, getCampaignOffersRequest, pageToken, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/offers/recommendations?pageToken=[value]&limit=[value]
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getOfferRecommendations(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetOfferRecommendationsResponse = {
      val getOfferRecommendationsRequest = request.body.asJson.map(_.as[GetOfferRecommendationsRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "getOfferRecommendationsRequest")
      }
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getOfferRecommendations(businessId, getOfferRecommendationsRequest, pageToken, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/offers?query=[value]&feedId=[value]&shopCategoryId=[value]&currency=[value]&matched=[value]&page=[value]&pageSize=[value]
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getOffers(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetOffersResponse = {
      val query = request.getQueryString("query")
        
      val feedId = request.getQueryString("feedId")
        .map(value => value.toLong)
        
      val shopCategoryId = request.getQueryString("shopCategoryId")
        
      val currency = request.getQueryString("currency")
        .map(value => )
        
      val matched = request.getQueryString("matched")
        .map(value => value.toBoolean)
        
      val page = request.getQueryString("page")
        .map(value => value.toInt)
        
      val pageSize = request.getQueryString("pageSize")
        .map(value => value.toInt)
        
      api.getOffers(campaignId, query, feedId, shopCategoryId, currency, matched, page, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/offers/update
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def updateCampaignOffers(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val updateCampaignOffersRequest = request.body.asJson.map(_.as[UpdateCampaignOffersRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "updateCampaignOffersRequest")
      }
      api.updateCampaignOffers(campaignId, updateCampaignOffersRequest)
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
