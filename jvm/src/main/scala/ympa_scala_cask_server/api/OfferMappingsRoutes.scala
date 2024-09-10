//> using scala "3.3.1"
//> using lib "com.lihaoyi::cask:0.8.3"
//> using lib "com.lihaoyi::scalatags:0.12.0"
/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI spec version: LATEST
 *
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 *
 * https://openapi-generator.tech
 */


// this is generated from apiRoutes.mustache
package ympa_scala_cask_server.api

import ympa_scala_cask_server.model.*

import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

import ympa_scala_cask_server.model.ApiClientDataErrorResponse
import ympa_scala_cask_server.model.ApiForbiddenErrorResponse
import ympa_scala_cask_server.model.ApiLimitErrorResponse
import ympa_scala_cask_server.model.ApiLockedErrorResponse
import ympa_scala_cask_server.model.ApiNotFoundErrorResponse
import ympa_scala_cask_server.model.ApiServerErrorResponse
import ympa_scala_cask_server.model.ApiUnauthorizedErrorResponse
import ympa_scala_cask_server.model.EmptyApiResponse
import ympa_scala_cask_server.model.GetOfferMappingEntriesResponse
import ympa_scala_cask_server.model.GetSuggestedOfferMappingEntriesRequest
import ympa_scala_cask_server.model.GetSuggestedOfferMappingEntriesResponse
import ympa_scala_cask_server.model.OfferAvailabilityStatusType
import ympa_scala_cask_server.model.OfferMappingKindType
import ympa_scala_cask_server.model.OfferProcessingStatusType
import ympa_scala_cask_server.model.UpdateOfferMappingEntryRequest

class OfferMappingsRoutes(service : OfferMappingsService) extends cask.Routes {

    // route group for routeWorkAroundForPOSTCampaigns
    @cask.post("/campaigns", true)
    def routeWorkAroundForPOSTCampaigns(request: cask.Request) = {
        request.remainingPathSegments match {
            case Seq(campaignId,"offer-mapping-entries","suggestions") => getSuggestedOfferMappingEntries(campaignId.toLong,request)
            case Seq(campaignId,"offer-mapping-entries","updates") => updateOfferMappingEntries(campaignId.toLong,request)
            case _          => cask.Response("Not Found", statusCode = 404)
        }
    }

        /** Список товаров в каталоге
         * 
         */
        @cask.get("/campaigns/:campaignId/offer-mapping-entries")
        def getOfferMappingEntries(campaignId : Long, request: cask.Request, offerId : Seq[String], shopSku : Seq[String], mappingKind : Option[OfferMappingKindType], status : Seq[OfferProcessingStatusType], availability : Seq[OfferAvailabilityStatusType], categoryId : Seq[Int], vendor : Seq[String], pageToken : Option[String], limit : Option[Int]) = {
            // auth method OAuth : oauth2, keyParamName: 

        def failFast = request.queryParams.keySet.contains("failFast")

        val result =         for {
            campaignId <- Parsed(campaignId)
            result <- Parsed.eval(service.getOfferMappingEntries(campaignId, offerId, shopSku, mappingKind, status, availability, categoryId, vendor, pageToken, limit))
        } yield result

        result match {
          case Left(error) => cask.Response(error, 500)
          case Right(value : GetOfferMappingEntriesResponse) => cask.Response(data = write(value), 200, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiClientDataErrorResponse) => cask.Response(data = write(value), 400, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiUnauthorizedErrorResponse) => cask.Response(data = write(value), 401, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiForbiddenErrorResponse) => cask.Response(data = write(value), 403, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiNotFoundErrorResponse) => cask.Response(data = write(value), 404, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiLimitErrorResponse) => cask.Response(data = write(value), 420, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiServerErrorResponse) => cask.Response(data = write(value), 500, headers = Seq("Content-Type" -> "application/json"))
          case Right(other) => cask.Response(s"$other", 200)
        }
      }
        /** Рекомендованные карточки для товаров
         * 
         */
        // conflicts with [/campaigns/{campaignId}/offer-mapping-entries/suggestions, /campaigns/{campaignId}/offer-mapping-entries/updates] after/campaigns, ignoring @cask.post("/campaigns/:campaignId/offer-mapping-entries/suggestions")
        def getSuggestedOfferMappingEntries(campaignId : Long, request: cask.Request) = {
            // auth method OAuth : oauth2, keyParamName: 

        def failFast = request.queryParams.keySet.contains("failFast")

        val result =         for {
            campaignId <- Parsed(campaignId)
              getSuggestedOfferMappingEntriesRequestData <- Parsed.eval(GetSuggestedOfferMappingEntriesRequestData.fromJsonString(request.bodyAsString)).mapError(e => s"Error parsing json as GetSuggestedOfferMappingEntriesRequest from >${request.bodyAsString}< : ${e}") /* not array or map */
              getSuggestedOfferMappingEntriesRequest <- Parsed.fromTry(getSuggestedOfferMappingEntriesRequestData.validated(failFast))
            result <- Parsed.eval(service.getSuggestedOfferMappingEntries(campaignId, getSuggestedOfferMappingEntriesRequest))
        } yield result

        result match {
          case Left(error) => cask.Response(error, 500)
          case Right(value : GetSuggestedOfferMappingEntriesResponse) => cask.Response(data = write(value), 200, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiClientDataErrorResponse) => cask.Response(data = write(value), 400, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiUnauthorizedErrorResponse) => cask.Response(data = write(value), 401, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiForbiddenErrorResponse) => cask.Response(data = write(value), 403, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiNotFoundErrorResponse) => cask.Response(data = write(value), 404, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiLimitErrorResponse) => cask.Response(data = write(value), 420, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiServerErrorResponse) => cask.Response(data = write(value), 500, headers = Seq("Content-Type" -> "application/json"))
          case Right(other) => cask.Response(s"$other", 200)
        }
      }
        /** Добавление и редактирование товаров в каталоге
         * 
         */
        // conflicts with [/campaigns/{campaignId}/offer-mapping-entries/suggestions, /campaigns/{campaignId}/offer-mapping-entries/updates] after/campaigns, ignoring @cask.post("/campaigns/:campaignId/offer-mapping-entries/updates")
        def updateOfferMappingEntries(campaignId : Long, request: cask.Request) = {
            // auth method OAuth : oauth2, keyParamName: 

        def failFast = request.queryParams.keySet.contains("failFast")

        val result =         for {
            campaignId <- Parsed(campaignId)
              updateOfferMappingEntryRequestData <- Parsed.eval(UpdateOfferMappingEntryRequestData.fromJsonString(request.bodyAsString)).mapError(e => s"Error parsing json as UpdateOfferMappingEntryRequest from >${request.bodyAsString}< : ${e}") /* not array or map */
              updateOfferMappingEntryRequest <- Parsed.fromTry(updateOfferMappingEntryRequestData.validated(failFast))
            result <- Parsed.eval(service.updateOfferMappingEntries(campaignId, updateOfferMappingEntryRequest))
        } yield result

        result match {
          case Left(error) => cask.Response(error, 500)
          case Right(value : EmptyApiResponse) => cask.Response(data = write(value), 200, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiClientDataErrorResponse) => cask.Response(data = write(value), 400, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiUnauthorizedErrorResponse) => cask.Response(data = write(value), 401, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiForbiddenErrorResponse) => cask.Response(data = write(value), 403, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiNotFoundErrorResponse) => cask.Response(data = write(value), 404, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiLimitErrorResponse) => cask.Response(data = write(value), 420, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiLockedErrorResponse) => cask.Response(data = write(value), 423, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiServerErrorResponse) => cask.Response(data = write(value), 500, headers = Seq("Content-Type" -> "application/json"))
          case Right(other) => cask.Response(s"$other", 200)
        }
      }

    initialize()
}
