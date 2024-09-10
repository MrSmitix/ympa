namespace ympa_fsharp_giraffe_server

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open FeedsApiHandlerParams
open FeedsApiServiceInterface
open FeedsApiServiceImplementation
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLockedErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.EmptyApiResponse
open ympa_fsharp_giraffe_server.Model.FeedIndexLogsStatusType
open ympa_fsharp_giraffe_server.Model.GetFeedIndexLogsResponse
open ympa_fsharp_giraffe_server.Model.GetFeedResponse
open ympa_fsharp_giraffe_server.Model.GetFeedsResponse
open ympa_fsharp_giraffe_server.Model.SetFeedParamsRequest

module FeedsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region GetFeed
    /// <summary>
    /// Информация о прайс-листе
    /// </summary>

    let GetFeed (pathParams:GetFeedPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetFeedArgs
          let result = FeedsApiService.GetFeed ctx serviceArgs
          return! (match result with
                      | GetFeedStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetFeedStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetFeedStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetFeedStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetFeedStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetFeedStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetFeedStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetFeedIndexLogs
    /// <summary>
    /// Отчет по индексации прайс-листа
    /// </summary>

    let GetFeedIndexLogs (pathParams:GetFeedIndexLogsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetFeedIndexLogsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : GetFeedIndexLogsArgs
          let result = FeedsApiService.GetFeedIndexLogs ctx serviceArgs
          return! (match result with
                      | GetFeedIndexLogsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetFeedIndexLogsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetFeedIndexLogsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetFeedIndexLogsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetFeedIndexLogsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetFeedIndexLogsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetFeedIndexLogsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetFeeds
    /// <summary>
    /// Список прайс-листов магазина
    /// </summary>

    let GetFeeds (pathParams:GetFeedsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetFeedsArgs
          let result = FeedsApiService.GetFeeds ctx serviceArgs
          return! (match result with
                      | GetFeedsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetFeedsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetFeedsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetFeedsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetFeedsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetFeedsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetFeedsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region RefreshFeed
    /// <summary>
    /// Сообщить, что прайс-лист обновился
    /// </summary>

    let RefreshFeed (pathParams:RefreshFeedPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : RefreshFeedArgs
          let result = FeedsApiService.RefreshFeed ctx serviceArgs
          return! (match result with
                      | RefreshFeedStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | RefreshFeedStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | RefreshFeedStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | RefreshFeedStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | RefreshFeedStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | RefreshFeedStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | RefreshFeedStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SetFeedParams
    /// <summary>
    /// Изменение параметров прайс-листа
    /// </summary>

    let SetFeedParams (pathParams:SetFeedParamsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<SetFeedParamsBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : SetFeedParamsArgs
          let result = FeedsApiService.SetFeedParams ctx serviceArgs
          return! (match result with
                      | SetFeedParamsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SetFeedParamsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | SetFeedParamsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | SetFeedParamsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | SetFeedParamsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | SetFeedParamsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | SetFeedParamsStatusCode423 resolved ->
                            setStatusCode 423 >=> json resolved.content
                      | SetFeedParamsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

