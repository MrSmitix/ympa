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
import model.ConfirmPricesRequest
import model.EmptyApiResponse
import model.GetQuarantineOffersRequest
import model.GetQuarantineOffersResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Singleton
class PriceQuarantineApiController @Inject()(cc: ControllerComponents, api: PriceQuarantineApi) extends AbstractController(cc) {
  /**
    * POST /businesses/:businessId/price-quarantine/confirm
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def confirmBusinessPrices(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val confirmPricesRequest = request.body.asJson.map(_.as[ConfirmPricesRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "confirmPricesRequest")
      }
      api.confirmBusinessPrices(businessId, confirmPricesRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/price-quarantine/confirm
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def confirmCampaignPrices(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val confirmPricesRequest = request.body.asJson.map(_.as[ConfirmPricesRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "confirmPricesRequest")
      }
      api.confirmCampaignPrices(campaignId, confirmPricesRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/price-quarantine?pageToken=[value]&limit=[value]
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getBusinessQuarantineOffers(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetQuarantineOffersResponse = {
      val getQuarantineOffersRequest = request.body.asJson.map(_.as[GetQuarantineOffersRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "getQuarantineOffersRequest")
      }
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getBusinessQuarantineOffers(businessId, getQuarantineOffersRequest, pageToken, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/price-quarantine?pageToken=[value]&limit=[value]
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getCampaignQuarantineOffers(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetQuarantineOffersResponse = {
      val getQuarantineOffersRequest = request.body.asJson.map(_.as[GetQuarantineOffersRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "getQuarantineOffersRequest")
      }
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getCampaignQuarantineOffers(campaignId, getQuarantineOffersRequest, pageToken, limit)
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
