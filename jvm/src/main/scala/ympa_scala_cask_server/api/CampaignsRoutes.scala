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
import ympa_scala_cask_server.model.GetCampaignLoginsResponse
import ympa_scala_cask_server.model.GetCampaignRegionResponse
import ympa_scala_cask_server.model.GetCampaignResponse
import ympa_scala_cask_server.model.GetCampaignSettingsResponse
import ympa_scala_cask_server.model.GetCampaignsResponse

class CampaignsRoutes(service : CampaignsService) extends cask.Routes {

    // route group for routeWorkAroundForGETCampaigns
    @cask.get("/campaigns", true)
    def routeWorkAroundForGETCampaigns(request: cask.Request,page : Option[Int] = None,pageSize : Option[Int] = None,page : Option[Int] = None,pageSize : Option[Int] = None) = {
        request.remainingPathSegments match {
            case Seq() => getCampaigns(request,page, pageSize)
            case Seq(campaignId) => getCampaign(campaignId.toLong,request)
            case Seq(campaignId,"logins") => getCampaignLogins(campaignId.toLong,request)
            case Seq(campaignId,"region") => getCampaignRegion(campaignId.toLong,request)
            case Seq(campaignId,"settings") => getCampaignSettings(campaignId.toLong,request)
            case Seq("by_login",login) => getCampaignsByLogin(login,request,page, pageSize)
            case _          => cask.Response("Not Found", statusCode = 404)
        }
    }

        /** Информация о магазине
         * 
         */
        // conflicts with [/campaigns/{campaignId}, /campaigns/{campaignId}/logins, /campaigns/{campaignId}/region, /campaigns/{campaignId}/settings, /campaigns, /campaigns/by_login/{login}] after/campaigns, ignoring @cask.get("/campaigns/:campaignId")
        def getCampaign(campaignId : Long, request: cask.Request) = {
            // auth method OAuth : oauth2, keyParamName: 

        def failFast = request.queryParams.keySet.contains("failFast")

        val result =         for {
            campaignId <- Parsed(campaignId)
            result <- Parsed.eval(service.getCampaign(campaignId))
        } yield result

        result match {
          case Left(error) => cask.Response(error, 500)
          case Right(value : GetCampaignResponse) => cask.Response(data = write(value), 200, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiClientDataErrorResponse) => cask.Response(data = write(value), 400, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiUnauthorizedErrorResponse) => cask.Response(data = write(value), 401, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiForbiddenErrorResponse) => cask.Response(data = write(value), 403, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiNotFoundErrorResponse) => cask.Response(data = write(value), 404, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiLimitErrorResponse) => cask.Response(data = write(value), 420, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiServerErrorResponse) => cask.Response(data = write(value), 500, headers = Seq("Content-Type" -> "application/json"))
          case Right(other) => cask.Response(s"$other", 200)
        }
      }
        /** Логины, связанные с магазином
         * 
         */
        // conflicts with [/campaigns/{campaignId}, /campaigns/{campaignId}/logins, /campaigns/{campaignId}/region, /campaigns/{campaignId}/settings, /campaigns, /campaigns/by_login/{login}] after/campaigns, ignoring @cask.get("/campaigns/:campaignId/logins")
        def getCampaignLogins(campaignId : Long, request: cask.Request) = {
            // auth method OAuth : oauth2, keyParamName: 

        def failFast = request.queryParams.keySet.contains("failFast")

        val result =         for {
            campaignId <- Parsed(campaignId)
            result <- Parsed.eval(service.getCampaignLogins(campaignId))
        } yield result

        result match {
          case Left(error) => cask.Response(error, 500)
          case Right(value : GetCampaignLoginsResponse) => cask.Response(data = write(value), 200, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiClientDataErrorResponse) => cask.Response(data = write(value), 400, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiUnauthorizedErrorResponse) => cask.Response(data = write(value), 401, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiForbiddenErrorResponse) => cask.Response(data = write(value), 403, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiNotFoundErrorResponse) => cask.Response(data = write(value), 404, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiLimitErrorResponse) => cask.Response(data = write(value), 420, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiServerErrorResponse) => cask.Response(data = write(value), 500, headers = Seq("Content-Type" -> "application/json"))
          case Right(other) => cask.Response(s"$other", 200)
        }
      }
        /** Регион магазина
         * 
         */
        // conflicts with [/campaigns/{campaignId}, /campaigns/{campaignId}/logins, /campaigns/{campaignId}/region, /campaigns/{campaignId}/settings, /campaigns, /campaigns/by_login/{login}] after/campaigns, ignoring @cask.get("/campaigns/:campaignId/region")
        def getCampaignRegion(campaignId : Long, request: cask.Request) = {
            // auth method OAuth : oauth2, keyParamName: 

        def failFast = request.queryParams.keySet.contains("failFast")

        val result =         for {
            campaignId <- Parsed(campaignId)
            result <- Parsed.eval(service.getCampaignRegion(campaignId))
        } yield result

        result match {
          case Left(error) => cask.Response(error, 500)
          case Right(value : GetCampaignRegionResponse) => cask.Response(data = write(value), 200, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiClientDataErrorResponse) => cask.Response(data = write(value), 400, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiUnauthorizedErrorResponse) => cask.Response(data = write(value), 401, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiForbiddenErrorResponse) => cask.Response(data = write(value), 403, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiNotFoundErrorResponse) => cask.Response(data = write(value), 404, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiLimitErrorResponse) => cask.Response(data = write(value), 420, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiServerErrorResponse) => cask.Response(data = write(value), 500, headers = Seq("Content-Type" -> "application/json"))
          case Right(other) => cask.Response(s"$other", 200)
        }
      }
        /** Настройки магазина
         * 
         */
        // conflicts with [/campaigns/{campaignId}, /campaigns/{campaignId}/logins, /campaigns/{campaignId}/region, /campaigns/{campaignId}/settings, /campaigns, /campaigns/by_login/{login}] after/campaigns, ignoring @cask.get("/campaigns/:campaignId/settings")
        def getCampaignSettings(campaignId : Long, request: cask.Request) = {
            // auth method OAuth : oauth2, keyParamName: 

        def failFast = request.queryParams.keySet.contains("failFast")

        val result =         for {
            campaignId <- Parsed(campaignId)
            result <- Parsed.eval(service.getCampaignSettings(campaignId))
        } yield result

        result match {
          case Left(error) => cask.Response(error, 500)
          case Right(value : GetCampaignSettingsResponse) => cask.Response(data = write(value), 200, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiClientDataErrorResponse) => cask.Response(data = write(value), 400, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiUnauthorizedErrorResponse) => cask.Response(data = write(value), 401, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiForbiddenErrorResponse) => cask.Response(data = write(value), 403, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiNotFoundErrorResponse) => cask.Response(data = write(value), 404, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiLimitErrorResponse) => cask.Response(data = write(value), 420, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiServerErrorResponse) => cask.Response(data = write(value), 500, headers = Seq("Content-Type" -> "application/json"))
          case Right(other) => cask.Response(s"$other", 200)
        }
      }
        /** Список магазинов пользователя
         * 
         */
        // conflicts with [/campaigns/{campaignId}, /campaigns/{campaignId}/logins, /campaigns/{campaignId}/region, /campaigns/{campaignId}/settings, /campaigns, /campaigns/by_login/{login}] after/campaigns, ignoring @cask.get("/campaigns")
        def getCampaigns(request: cask.Request, page : Option[Int], pageSize : Option[Int]) = {
            // auth method OAuth : oauth2, keyParamName: 

        def failFast = request.queryParams.keySet.contains("failFast")

        val result =         for {
            result <- Parsed.eval(service.getCampaigns(page, pageSize))
        } yield result

        result match {
          case Left(error) => cask.Response(error, 500)
          case Right(value : GetCampaignsResponse) => cask.Response(data = write(value), 200, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiClientDataErrorResponse) => cask.Response(data = write(value), 400, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiUnauthorizedErrorResponse) => cask.Response(data = write(value), 401, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiForbiddenErrorResponse) => cask.Response(data = write(value), 403, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiNotFoundErrorResponse) => cask.Response(data = write(value), 404, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiLimitErrorResponse) => cask.Response(data = write(value), 420, headers = Seq("Content-Type" -> "application/json"))
          case Right(value : ApiServerErrorResponse) => cask.Response(data = write(value), 500, headers = Seq("Content-Type" -> "application/json"))
          case Right(other) => cask.Response(s"$other", 200)
        }
      }
        /** Магазины, доступные логину
         * 
         */
        // conflicts with [/campaigns/{campaignId}, /campaigns/{campaignId}/logins, /campaigns/{campaignId}/region, /campaigns/{campaignId}/settings, /campaigns, /campaigns/by_login/{login}] after/campaigns, ignoring @cask.get("/campaigns/by_login/:login")
        def getCampaignsByLogin(login : String, request: cask.Request, page : Option[Int], pageSize : Option[Int]) = {
            // auth method OAuth : oauth2, keyParamName: 

        def failFast = request.queryParams.keySet.contains("failFast")

        val result =         for {
            login <- Parsed(login)
            result <- Parsed.eval(service.getCampaignsByLogin(login, page, pageSize))
        } yield result

        result match {
          case Left(error) => cask.Response(error, 500)
          case Right(value : GetCampaignsResponse) => cask.Response(data = write(value), 200, headers = Seq("Content-Type" -> "application/json"))
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
