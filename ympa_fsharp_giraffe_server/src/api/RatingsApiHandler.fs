namespace ympa_fsharp_giraffe_server

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open RatingsApiHandlerParams
open RatingsApiServiceInterface
open RatingsApiServiceImplementation
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.GetQualityRatingDetailsResponse
open ympa_fsharp_giraffe_server.Model.GetQualityRatingRequest
open ympa_fsharp_giraffe_server.Model.GetQualityRatingResponse

module RatingsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region GetQualityRatingDetails
    /// <summary>
    /// Заказы, которые повлияли на индекс качества
    /// </summary>

    let GetQualityRatingDetails (pathParams:GetQualityRatingDetailsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetQualityRatingDetailsArgs
          let result = RatingsApiService.GetQualityRatingDetails ctx serviceArgs
          return! (match result with
                      | GetQualityRatingDetailsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetQualityRatingDetailsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetQualityRatingDetailsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetQualityRatingDetailsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetQualityRatingDetailsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetQualityRatingDetailsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetQualityRatingDetailsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetQualityRatings
    /// <summary>
    /// Индекс качества магазинов
    /// </summary>

    let GetQualityRatings (pathParams:GetQualityRatingsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<GetQualityRatingsBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : GetQualityRatingsArgs
          let result = RatingsApiService.GetQualityRatings ctx serviceArgs
          return! (match result with
                      | GetQualityRatingsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetQualityRatingsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetQualityRatingsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetQualityRatingsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetQualityRatingsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetQualityRatingsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetQualityRatingsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

