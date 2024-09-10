namespace ympa_fsharp_giraffe_server

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open GoodsStatsApiHandlerParams
open GoodsStatsApiServiceInterface
open GoodsStatsApiServiceImplementation
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.GetGoodsStatsRequest
open ympa_fsharp_giraffe_server.Model.GetGoodsStatsResponse

module GoodsStatsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region GetGoodsStats
    /// <summary>
    /// Отчет по товарам
    /// </summary>

    let GetGoodsStats (pathParams:GetGoodsStatsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<GetGoodsStatsBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : GetGoodsStatsArgs
          let result = GoodsStatsApiService.GetGoodsStats ctx serviceArgs
          return! (match result with
                      | GetGoodsStatsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetGoodsStatsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetGoodsStatsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetGoodsStatsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetGoodsStatsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetGoodsStatsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetGoodsStatsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

