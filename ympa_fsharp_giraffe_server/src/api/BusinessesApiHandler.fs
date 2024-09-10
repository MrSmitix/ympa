namespace ympa_fsharp_giraffe_server

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open BusinessesApiHandlerParams
open BusinessesApiServiceInterface
open BusinessesApiServiceImplementation
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.GetBusinessSettingsResponse

module BusinessesApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region GetBusinessSettings
    /// <summary>
    /// Настройки кабинета
    /// </summary>

    let GetBusinessSettings (pathParams:GetBusinessSettingsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetBusinessSettingsArgs
          let result = BusinessesApiService.GetBusinessSettings ctx serviceArgs
          return! (match result with
                      | GetBusinessSettingsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetBusinessSettingsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetBusinessSettingsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetBusinessSettingsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetBusinessSettingsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetBusinessSettingsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetBusinessSettingsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

