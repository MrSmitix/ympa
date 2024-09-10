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
import model.GetOfferMappingEntriesResponse
import model.GetSuggestedOfferMappingEntriesRequest
import model.GetSuggestedOfferMappingEntriesResponse
import model.OfferAvailabilityStatusType
import model.OfferMappingKindType
import model.OfferProcessingStatusType
import model.UpdateOfferMappingEntryRequest

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Singleton
class OfferMappingsApiController @Inject()(cc: ControllerComponents, api: OfferMappingsApi) extends AbstractController(cc) {
  /**
    * GET /campaigns/:campaignId/offer-mapping-entries?offerId=[value]&shopSku=[value]&mappingKind=[value]&status=[value]&availability=[value]&categoryId=[value]&vendor=[value]&pageToken=[value]&limit=[value]
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getOfferMappingEntries(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetOfferMappingEntriesResponse = {
      val offerId = request.getQueryString("offer_id")
        .map(values => splitCollectionParam(values, "csv"))
        
      val shopSku = request.getQueryString("shop_sku")
        .map(values => splitCollectionParam(values, "csv"))
        
      val mappingKind = request.getQueryString("mapping_kind")
        .map(value => )
        
      val status = request.getQueryString("status")
        .map(values => splitCollectionParam(values, "csv"))
        .map(_.map(value => )
        
      val availability = request.getQueryString("availability")
        .map(values => splitCollectionParam(values, "csv"))
        .map(_.map(value => )
        
      val categoryId = request.getQueryString("category_id")
        .map(values => splitCollectionParam(values, "csv"))
        .map(_.map(value => value.toInt)
        
      val vendor = request.getQueryString("vendor")
        .map(values => splitCollectionParam(values, "csv"))
        
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getOfferMappingEntries(campaignId, offerId, shopSku, mappingKind, status, availability, categoryId, vendor, pageToken, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/offer-mapping-entries/suggestions
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getSuggestedOfferMappingEntries(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetSuggestedOfferMappingEntriesResponse = {
      val getSuggestedOfferMappingEntriesRequest = request.body.asJson.map(_.as[GetSuggestedOfferMappingEntriesRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "getSuggestedOfferMappingEntriesRequest")
      }
      api.getSuggestedOfferMappingEntries(campaignId, getSuggestedOfferMappingEntriesRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/offer-mapping-entries/updates
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def updateOfferMappingEntries(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val updateOfferMappingEntryRequest = request.body.asJson.map(_.as[UpdateOfferMappingEntryRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "updateOfferMappingEntryRequest")
      }
      api.updateOfferMappingEntries(campaignId, updateOfferMappingEntryRequest)
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
