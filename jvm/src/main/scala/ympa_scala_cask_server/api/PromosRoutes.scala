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
import ympa_scala_cask_server.model.ApiNotFoundErrorResponse
import ympa_scala_cask_server.model.ApiServerErrorResponse
import ympa_scala_cask_server.model.ApiUnauthorizedErrorResponse
import ympa_scala_cask_server.model.DeletePromoOffersRequest
import ympa_scala_cask_server.model.DeletePromoOffersResponse
import ympa_scala_cask_server.model.GetPromoOffersRequest
import ympa_scala_cask_server.model.GetPromoOffersResponse
import ympa_scala_cask_server.model.GetPromosRequest
import ympa_scala_cask_server.model.GetPromosResponse
import ympa_scala_cask_server.model.UpdatePromoOffersRequest
import ympa_scala_cask_server.model.UpdatePromoOffersResponse

class PromosRoutes(service : PromosService) extends cask.Routes {

    // route group for routeWorkAroundForPOSTBusinesses
    @cask.post("/businesses", true)
    def routeWorkAroundForPOSTBusinesses(request: cask.Request,pageToken : Option[String] = None,limit : Option[Int] = None) = {
        request.remainingPathSegments match {
            case Seq(businessId,"promos","offers","delete") => deletePromoOffers(businessId.toLong,request)
            case Seq(businessId,"promos","offers") => getPromoOffers(businessId.toLong,request,pageToken, limit)
            case Seq(businessId,"promos") => getPromos(businessId.toLong,request)
            case Seq(businessId,"promos","offers","update") => updatePromoOffers(businessId.toLong,request)
            case _          => cask.Response("Not Found", statusCode = 404)
        }
    }

        /** Удаление товаров из акции
         * 
         */
        // conflicts with [/businesses/{businessId}/promos/offers/delete, /businesses/{businessId}/promos/offers, /businesses/{businessId}/promos, /businesses/{businessId}/promos/offers/update] after/businesses, ignoring @cask.post("/businesses/:businessId/promos/offers/delete")
        def deletePromoOffers(businessId : Long, request: cask.Request) = {
            // auth method OAuth : oauth2, keyParamName: 

        def failFast = request.queryParams.keySet.contains("failFast")

        val result =         for {
            businessId <- Parsed(businessId)
              deletePromoOffersRequestData <- Parsed.eval(DeletePromoOffersRequestData.fromJsonString(request.bodyAsString)).mapError(e => s"Error parsing json as DeletePromoOffersRequest from >${request.bodyAsString}< : ${e}") /* not array or map */
              deletePromoOffersRequest <- Parsed.fromTry(deletePromoOffersRequestData.validated(failFast))
            result <- Parsed.eval(service.deletePromoOffers(businessId, deletePromoOffersRequest))
        } yield result

        result match {
          case Left(error) => cask.Response(error, 500)
          case Right(value : DeletePromoOffersResponse) => cask.Response(data = write(value), 200, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiClientDataErrorResponse) => cask.Response(data = write(value), 400, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiUnauthorizedErrorResponse) => cask.Response(data = write(value), 401, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiForbiddenErrorResponse) => cask.Response(data = write(value), 403, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiNotFoundErrorResponse) => cask.Response(data = write(value), 404, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiLimitErrorResponse) => cask.Response(data = write(value), 420, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiServerErrorResponse) => cask.Response(data = write(value), 500, headers = Seq("Content-Type" -> "application/json"))
          case Right(other) => cask.Response(s"$other", 200)
        }
      }
        /** Получение списка товаров, которые участвуют или могут участвовать в акции
         * 
         */
        // conflicts with [/businesses/{businessId}/promos/offers/delete, /businesses/{businessId}/promos/offers, /businesses/{businessId}/promos, /businesses/{businessId}/promos/offers/update] after/businesses, ignoring @cask.post("/businesses/:businessId/promos/offers")
        def getPromoOffers(businessId : Long, request: cask.Request, pageToken : Option[String], limit : Option[Int]) = {
            // auth method OAuth : oauth2, keyParamName: 

        def failFast = request.queryParams.keySet.contains("failFast")

        val result =         for {
            businessId <- Parsed(businessId)
              getPromoOffersRequestData <- Parsed.eval(GetPromoOffersRequestData.fromJsonString(request.bodyAsString)).mapError(e => s"Error parsing json as GetPromoOffersRequest from >${request.bodyAsString}< : ${e}") /* not array or map */
              getPromoOffersRequest <- Parsed.fromTry(getPromoOffersRequestData.validated(failFast))
            result <- Parsed.eval(service.getPromoOffers(businessId, getPromoOffersRequest, pageToken, limit))
        } yield result

        result match {
          case Left(error) => cask.Response(error, 500)
          case Right(value : GetPromoOffersResponse) => cask.Response(data = write(value), 200, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiClientDataErrorResponse) => cask.Response(data = write(value), 400, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiUnauthorizedErrorResponse) => cask.Response(data = write(value), 401, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiForbiddenErrorResponse) => cask.Response(data = write(value), 403, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiNotFoundErrorResponse) => cask.Response(data = write(value), 404, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiLimitErrorResponse) => cask.Response(data = write(value), 420, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiServerErrorResponse) => cask.Response(data = write(value), 500, headers = Seq("Content-Type" -> "application/json"))
          case Right(other) => cask.Response(s"$other", 200)
        }
      }
        /** Получение списка акций
         * 
         */
        // conflicts with [/businesses/{businessId}/promos/offers/delete, /businesses/{businessId}/promos/offers, /businesses/{businessId}/promos, /businesses/{businessId}/promos/offers/update] after/businesses, ignoring @cask.post("/businesses/:businessId/promos")
        def getPromos(businessId : Long, request: cask.Request) = {
            // auth method OAuth : oauth2, keyParamName: 

        def failFast = request.queryParams.keySet.contains("failFast")

        val result =         for {
            businessId <- Parsed(businessId)
              getPromosRequestData <- Parsed.eval(GetPromosRequestData.fromJsonString(request.bodyAsString)).mapError(e => s"Error parsing json as GetPromosRequest from >${request.bodyAsString}< : ${e}") /* not array or map */
              getPromosRequest <- Parsed.fromTry(getPromosRequestData.validated(failFast))
            result <- Parsed.eval(service.getPromos(businessId, getPromosRequest))
        } yield result

        result match {
          case Left(error) => cask.Response(error, 500)
          case Right(value : GetPromosResponse) => cask.Response(data = write(value), 200, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiClientDataErrorResponse) => cask.Response(data = write(value), 400, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiUnauthorizedErrorResponse) => cask.Response(data = write(value), 401, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiForbiddenErrorResponse) => cask.Response(data = write(value), 403, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiNotFoundErrorResponse) => cask.Response(data = write(value), 404, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiLimitErrorResponse) => cask.Response(data = write(value), 420, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiServerErrorResponse) => cask.Response(data = write(value), 500, headers = Seq("Content-Type" -> "application/json"))
          case Right(other) => cask.Response(s"$other", 200)
        }
      }
        /** Добавление товаров в акцию или изменение их цен
         * 
         */
        // conflicts with [/businesses/{businessId}/promos/offers/delete, /businesses/{businessId}/promos/offers, /businesses/{businessId}/promos, /businesses/{businessId}/promos/offers/update] after/businesses, ignoring @cask.post("/businesses/:businessId/promos/offers/update")
        def updatePromoOffers(businessId : Long, request: cask.Request) = {
            // auth method OAuth : oauth2, keyParamName: 

        def failFast = request.queryParams.keySet.contains("failFast")

        val result =         for {
            businessId <- Parsed(businessId)
              updatePromoOffersRequestData <- Parsed.eval(UpdatePromoOffersRequestData.fromJsonString(request.bodyAsString)).mapError(e => s"Error parsing json as UpdatePromoOffersRequest from >${request.bodyAsString}< : ${e}") /* not array or map */
              updatePromoOffersRequest <- Parsed.fromTry(updatePromoOffersRequestData.validated(failFast))
            result <- Parsed.eval(service.updatePromoOffers(businessId, updatePromoOffersRequest))
        } yield result

        result match {
          case Left(error) => cask.Response(error, 500)
          case Right(value : UpdatePromoOffersResponse) => cask.Response(data = write(value), 200, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiClientDataErrorResponse) => cask.Response(data = write(value), 400, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiUnauthorizedErrorResponse) => cask.Response(data = write(value), 401, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiForbiddenErrorResponse) => cask.Response(data = write(value), 403, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiNotFoundErrorResponse) => cask.Response(data = write(value), 404, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiLimitErrorResponse) => cask.Response(data = write(value), 420, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiServerErrorResponse) => cask.Response(data = write(value), 500, headers = Seq("Content-Type" -> "application/json"))
          case Right(other) => cask.Response(s"$other", 200)
        }
      }

    initialize()
}
