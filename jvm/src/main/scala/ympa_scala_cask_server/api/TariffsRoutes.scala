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
import ympa_scala_cask_server.model.CalculateTariffsRequest
import ympa_scala_cask_server.model.CalculateTariffsResponse

class TariffsRoutes(service : TariffsService) extends cask.Routes {


        /** Калькулятор стоимости услуг
         * 
         */
        @cask.post("/tariffs/calculate")
        def calculateTariffs(request: cask.Request) = {
            // auth method OAuth : oauth2, keyParamName: 

        def failFast = request.queryParams.keySet.contains("failFast")

        val result =         for {
              calculateTariffsRequestData <- Parsed.eval(CalculateTariffsRequestData.fromJsonString(request.bodyAsString)).mapError(e => s"Error parsing json as CalculateTariffsRequest from >${request.bodyAsString}< : ${e}") /* not array or map */
              calculateTariffsRequest <- Parsed.fromTry(calculateTariffsRequestData.validated(failFast))
            result <- Parsed.eval(service.calculateTariffs(calculateTariffsRequest))
        } yield result

        result match {
          case Left(error) => cask.Response(error, 500)
          case Right(value : CalculateTariffsResponse) => cask.Response(data = write(value), 200, headers = Seq("Content-Type" -> "application/json"))
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
