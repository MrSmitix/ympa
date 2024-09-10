namespace ympa_fsharp_giraffe_server

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open CampaignsApiHandlerParams
open CampaignsApiServiceInterface
open CampaignsApiServiceImplementation
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.GetCampaignLoginsResponse
open ympa_fsharp_giraffe_server.Model.GetCampaignRegionResponse
open ympa_fsharp_giraffe_server.Model.GetCampaignResponse
open ympa_fsharp_giraffe_server.Model.GetCampaignSettingsResponse
open ympa_fsharp_giraffe_server.Model.GetCampaignsResponse

module CampaignsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region GetCampaign
    /// <summary>
    /// Информация о магазине
    /// </summary>

    let GetCampaign (pathParams:GetCampaignPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetCampaignArgs
          let result = CampaignsApiService.GetCampaign ctx serviceArgs
          return! (match result with
                      | GetCampaignStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetCampaignStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetCampaignStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetCampaignStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetCampaignStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetCampaignStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetCampaignStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetCampaignLogins
    /// <summary>
    /// Логины, связанные с магазином
    /// </summary>

    let GetCampaignLogins (pathParams:GetCampaignLoginsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetCampaignLoginsArgs
          let result = CampaignsApiService.GetCampaignLogins ctx serviceArgs
          return! (match result with
                      | GetCampaignLoginsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetCampaignLoginsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetCampaignLoginsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetCampaignLoginsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetCampaignLoginsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetCampaignLoginsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetCampaignLoginsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetCampaignRegion
    /// <summary>
    /// Регион магазина
    /// </summary>

    let GetCampaignRegion (pathParams:GetCampaignRegionPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetCampaignRegionArgs
          let result = CampaignsApiService.GetCampaignRegion ctx serviceArgs
          return! (match result with
                      | GetCampaignRegionStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetCampaignRegionStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetCampaignRegionStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetCampaignRegionStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetCampaignRegionStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetCampaignRegionStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetCampaignRegionStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetCampaignSettings
    /// <summary>
    /// Настройки магазина
    /// </summary>

    let GetCampaignSettings (pathParams:GetCampaignSettingsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetCampaignSettingsArgs
          let result = CampaignsApiService.GetCampaignSettings ctx serviceArgs
          return! (match result with
                      | GetCampaignSettingsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetCampaignSettingsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetCampaignSettingsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetCampaignSettingsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetCampaignSettingsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetCampaignSettingsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetCampaignSettingsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetCampaigns
    /// <summary>
    /// Список магазинов пользователя
    /// </summary>

    let GetCampaigns  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetCampaignsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : GetCampaignsArgs
          let result = CampaignsApiService.GetCampaigns ctx serviceArgs
          return! (match result with
                      | GetCampaignsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetCampaignsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetCampaignsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetCampaignsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetCampaignsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetCampaignsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetCampaignsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetCampaignsByLogin
    /// <summary>
    /// Магазины, доступные логину
    /// </summary>

    let GetCampaignsByLogin (pathParams:GetCampaignsByLoginPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetCampaignsByLoginQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : GetCampaignsByLoginArgs
          let result = CampaignsApiService.GetCampaignsByLogin ctx serviceArgs
          return! (match result with
                      | GetCampaignsByLoginStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetCampaignsByLoginStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetCampaignsByLoginStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetCampaignsByLoginStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetCampaignsByLoginStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetCampaignsByLoginStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetCampaignsByLoginStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

