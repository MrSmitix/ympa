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
import model.GetBidsInfoRequest
import model.GetBidsInfoResponse
import model.GetBidsRecommendationsRequest
import model.GetBidsRecommendationsResponse
import model.PutSkuBidsRequest

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Singleton
class BidsApiController @Inject()(cc: ControllerComponents, api: BidsApi) extends AbstractController(cc) {
  /**
    * POST /businesses/:businessId/bids/info?pageToken=[value]&limit=[value]
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getBidsInfoForBusiness(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetBidsInfoResponse = {
      val getBidsInfoRequest = request.body.asJson.map(_.as[GetBidsInfoRequest])
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getBidsInfoForBusiness(businessId, pageToken, limit, getBidsInfoRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/bids/recommendations
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getBidsRecommendations(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetBidsRecommendationsResponse = {
      val getBidsRecommendationsRequest = request.body.asJson.map(_.as[GetBidsRecommendationsRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "getBidsRecommendationsRequest")
      }
      api.getBidsRecommendations(businessId, getBidsRecommendationsRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PUT /businesses/:businessId/bids
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def putBidsForBusiness(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val putSkuBidsRequest = request.body.asJson.map(_.as[PutSkuBidsRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "putSkuBidsRequest")
      }
      api.putBidsForBusiness(businessId, putSkuBidsRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PUT /campaigns/:campaignId/bids
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def putBidsForCampaign(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val putSkuBidsRequest = request.body.asJson.map(_.as[PutSkuBidsRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "putSkuBidsRequest")
      }
      api.putBidsForCampaign(campaignId, putSkuBidsRequest)
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
