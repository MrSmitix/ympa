namespace ympa_fsharp_giraffe_server

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open OrderLabelsApiHandlerParams
open OrderLabelsApiServiceInterface
open OrderLabelsApiServiceImplementation
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.GetOrderLabelsDataResponse
open ympa_fsharp_giraffe_server.Model.PageFormatType

module OrderLabelsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region GenerateOrderLabel
    /// <summary>
    /// Готовый ярлык‑наклейка для коробки в заказе
    /// </summary>

    let GenerateOrderLabel (pathParams:GenerateOrderLabelPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GenerateOrderLabelQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : GenerateOrderLabelArgs
          let result = OrderLabelsApiService.GenerateOrderLabel ctx serviceArgs
          return! (match result with
                      | GenerateOrderLabelStatusCode200 resolved ->
                            setStatusCode 200 >=> text resolved.content
                      | GenerateOrderLabelStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GenerateOrderLabelStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GenerateOrderLabelStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GenerateOrderLabelStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GenerateOrderLabelStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GenerateOrderLabelStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GenerateOrderLabels
    /// <summary>
    /// Готовые ярлыки‑наклейки на все коробки в одном заказе
    /// </summary>

    let GenerateOrderLabels (pathParams:GenerateOrderLabelsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GenerateOrderLabelsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : GenerateOrderLabelsArgs
          let result = OrderLabelsApiService.GenerateOrderLabels ctx serviceArgs
          return! (match result with
                      | GenerateOrderLabelsStatusCode200 resolved ->
                            setStatusCode 200 >=> text resolved.content
                      | GenerateOrderLabelsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GenerateOrderLabelsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GenerateOrderLabelsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GenerateOrderLabelsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GenerateOrderLabelsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GenerateOrderLabelsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetOrderLabelsData
    /// <summary>
    /// Данные для самостоятельного изготовления ярлыков
    /// </summary>

    let GetOrderLabelsData (pathParams:GetOrderLabelsDataPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetOrderLabelsDataArgs
          let result = OrderLabelsApiService.GetOrderLabelsData ctx serviceArgs
          return! (match result with
                      | GetOrderLabelsDataStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetOrderLabelsDataStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetOrderLabelsDataStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetOrderLabelsDataStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetOrderLabelsDataStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetOrderLabelsDataStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetOrderLabelsDataStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

