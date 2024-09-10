package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AddOffersToArchiveRequest
import model.AddOffersToArchiveResponse
import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiLockedErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.DeleteOffersFromArchiveRequest
import model.DeleteOffersFromArchiveResponse
import model.DeleteOffersRequest
import model.DeleteOffersResponse
import model.GetOfferMappingsRequest
import model.GetOfferMappingsResponse
import model.GetSuggestedOfferMappingsRequest
import model.GetSuggestedOfferMappingsResponse
import model.UpdateOfferMappingsRequest
import model.UpdateOfferMappingsResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Singleton
class BusinessOfferMappingsApiController @Inject()(cc: ControllerComponents, api: BusinessOfferMappingsApi) extends AbstractController(cc) {
  /**
    * POST /businesses/:businessId/offer-mappings/archive
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def addOffersToArchive(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): AddOffersToArchiveResponse = {
      val addOffersToArchiveRequest = request.body.asJson.map(_.as[AddOffersToArchiveRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "addOffersToArchiveRequest")
      }
      api.addOffersToArchive(businessId, addOffersToArchiveRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/offer-mappings/delete
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def deleteOffers(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): DeleteOffersResponse = {
      val deleteOffersRequest = request.body.asJson.map(_.as[DeleteOffersRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "deleteOffersRequest")
      }
      api.deleteOffers(businessId, deleteOffersRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/offer-mappings/unarchive
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def deleteOffersFromArchive(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): DeleteOffersFromArchiveResponse = {
      val deleteOffersFromArchiveRequest = request.body.asJson.map(_.as[DeleteOffersFromArchiveRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "deleteOffersFromArchiveRequest")
      }
      api.deleteOffersFromArchive(businessId, deleteOffersFromArchiveRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/offer-mappings?pageToken=[value]&limit=[value]
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getOfferMappings(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetOfferMappingsResponse = {
      val getOfferMappingsRequest = request.body.asJson.map(_.as[GetOfferMappingsRequest])
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getOfferMappings(businessId, pageToken, limit, getOfferMappingsRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/offer-mappings/suggestions
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getSuggestedOfferMappings(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetSuggestedOfferMappingsResponse = {
      val getSuggestedOfferMappingsRequest = request.body.asJson.map(_.as[GetSuggestedOfferMappingsRequest])
      api.getSuggestedOfferMappings(businessId, getSuggestedOfferMappingsRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/offer-mappings/update
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def updateOfferMappings(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): UpdateOfferMappingsResponse = {
      val updateOfferMappingsRequest = request.body.asJson.map(_.as[UpdateOfferMappingsRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "updateOfferMappingsRequest")
      }
      api.updateOfferMappings(businessId, updateOfferMappingsRequest)
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
