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
import model.DeletePromoOffersRequest
import model.DeletePromoOffersResponse
import model.GetPromoOffersRequest
import model.GetPromoOffersResponse
import model.GetPromosRequest
import model.GetPromosResponse
import model.UpdatePromoOffersRequest
import model.UpdatePromoOffersResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Singleton
class PromosApiController @Inject()(cc: ControllerComponents, api: PromosApi) extends AbstractController(cc) {
  /**
    * POST /businesses/:businessId/promos/offers/delete
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def deletePromoOffers(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): DeletePromoOffersResponse = {
      val deletePromoOffersRequest = request.body.asJson.map(_.as[DeletePromoOffersRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "deletePromoOffersRequest")
      }
      api.deletePromoOffers(businessId, deletePromoOffersRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/promos/offers?pageToken=[value]&limit=[value]
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getPromoOffers(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetPromoOffersResponse = {
      val getPromoOffersRequest = request.body.asJson.map(_.as[GetPromoOffersRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "getPromoOffersRequest")
      }
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getPromoOffers(businessId, getPromoOffersRequest, pageToken, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/promos
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getPromos(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetPromosResponse = {
      val getPromosRequest = request.body.asJson.map(_.as[GetPromosRequest])
      api.getPromos(businessId, getPromosRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/promos/offers/update
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def updatePromoOffers(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): UpdatePromoOffersResponse = {
      val updatePromoOffersRequest = request.body.asJson.map(_.as[UpdatePromoOffersRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "updatePromoOffersRequest")
      }
      api.updatePromoOffers(businessId, updatePromoOffersRequest)
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
