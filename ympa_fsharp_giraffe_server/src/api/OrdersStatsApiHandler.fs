namespace ympa_fsharp_giraffe_server

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open OrdersStatsApiHandlerParams
open OrdersStatsApiServiceInterface
open OrdersStatsApiServiceImplementation
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.GetOrdersStatsRequest
open ympa_fsharp_giraffe_server.Model.GetOrdersStatsResponse

module OrdersStatsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region GetOrdersStats
    /// <summary>
    /// Детальная информация по заказам
    /// </summary>

    let GetOrdersStats (pathParams:GetOrdersStatsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetOrdersStatsQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GetOrdersStatsBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : GetOrdersStatsArgs
          let result = OrdersStatsApiService.GetOrdersStats ctx serviceArgs
          return! (match result with
                      | GetOrdersStatsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetOrdersStatsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetOrdersStatsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetOrdersStatsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetOrdersStatsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetOrdersStatsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetOrdersStatsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

