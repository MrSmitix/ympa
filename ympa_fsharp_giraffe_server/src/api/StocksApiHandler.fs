namespace ympa_fsharp_giraffe_server

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open StocksApiHandlerParams
open StocksApiServiceInterface
open StocksApiServiceImplementation
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.EmptyApiResponse
open ympa_fsharp_giraffe_server.Model.GetWarehouseStocksRequest
open ympa_fsharp_giraffe_server.Model.GetWarehouseStocksResponse
open ympa_fsharp_giraffe_server.Model.UpdateStocksRequest

module StocksApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region GetStocks
    /// <summary>
    /// Информация об остатках и оборачиваемости
    /// </summary>

    let GetStocks (pathParams:GetStocksPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetStocksQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GetStocksBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : GetStocksArgs
          let result = StocksApiService.GetStocks ctx serviceArgs
          return! (match result with
                      | GetStocksStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetStocksStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetStocksStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetStocksStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetStocksStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetStocksStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateStocks
    /// <summary>
    /// Передача информации об остатках
    /// </summary>

    let UpdateStocks (pathParams:UpdateStocksPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<UpdateStocksBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : UpdateStocksArgs
          let result = StocksApiService.UpdateStocks ctx serviceArgs
          return! (match result with
                      | UpdateStocksStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UpdateStocksStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | UpdateStocksStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | UpdateStocksStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | UpdateStocksStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | UpdateStocksStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | UpdateStocksStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

