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
import model.EmptyApiResponse
import model.GetPricesByOfferIdsRequest
import model.GetPricesByOfferIdsResponse
import model.GetPricesResponse
import model.SuggestPricesRequest
import model.SuggestPricesResponse
import model.UpdateBusinessPricesRequest
import model.UpdatePricesRequest

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Singleton
class PricesApiController @Inject()(cc: ControllerComponents, api: PricesApi) extends AbstractController(cc) {
  /**
    * GET /campaigns/:campaignId/offer-prices?pageToken=[value]&limit=[value]&archived=[value]
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getPrices(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetPricesResponse = {
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val archived = request.getQueryString("archived")
        .map(value => value.toBoolean)
        
      api.getPrices(campaignId, pageToken, limit, archived)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/offer-prices?pageToken=[value]&limit=[value]
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getPricesByOfferIds(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetPricesByOfferIdsResponse = {
      val getPricesByOfferIdsRequest = request.body.asJson.map(_.as[GetPricesByOfferIdsRequest])
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getPricesByOfferIds(campaignId, pageToken, limit, getPricesByOfferIdsRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/offer-prices/suggestions
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getSuggestedPrices(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): SuggestPricesResponse = {
      val suggestPricesRequest = request.body.asJson.map(_.as[SuggestPricesRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "suggestPricesRequest")
      }
      api.getSuggestedPrices(campaignId, suggestPricesRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/offer-prices/updates
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def updateBusinessPrices(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val updateBusinessPricesRequest = request.body.asJson.map(_.as[UpdateBusinessPricesRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "updateBusinessPricesRequest")
      }
      api.updateBusinessPrices(businessId, updateBusinessPricesRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/offer-prices/updates
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def updatePrices(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val updatePricesRequest = request.body.asJson.map(_.as[UpdatePricesRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "updatePricesRequest")
      }
      api.updatePrices(campaignId, updatePricesRequest)
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
