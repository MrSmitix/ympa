namespace ympa_fsharp_giraffe_server

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open TariffsApiHandlerParams
open TariffsApiServiceInterface
open TariffsApiServiceImplementation
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.CalculateTariffsRequest
open ympa_fsharp_giraffe_server.Model.CalculateTariffsResponse

module TariffsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region CalculateTariffs
    /// <summary>
    /// Калькулятор стоимости услуг
    /// </summary>

    let CalculateTariffs  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CalculateTariffsBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : CalculateTariffsArgs
          let result = TariffsApiService.CalculateTariffs ctx serviceArgs
          return! (match result with
                      | CalculateTariffsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CalculateTariffsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CalculateTariffsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CalculateTariffsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CalculateTariffsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CalculateTariffsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | CalculateTariffsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

