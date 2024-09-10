namespace ympa_fsharp_giraffe_server

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open BidsApiHandlerParams
open BidsApiServiceInterface
open BidsApiServiceImplementation
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.EmptyApiResponse
open ympa_fsharp_giraffe_server.Model.GetBidsInfoRequest
open ympa_fsharp_giraffe_server.Model.GetBidsInfoResponse
open ympa_fsharp_giraffe_server.Model.GetBidsRecommendationsRequest
open ympa_fsharp_giraffe_server.Model.GetBidsRecommendationsResponse
open ympa_fsharp_giraffe_server.Model.PutSkuBidsRequest

module BidsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region GetBidsInfoForBusiness
    /// <summary>
    /// Информация об установленных ставках
    /// </summary>

    let GetBidsInfoForBusiness (pathParams:GetBidsInfoForBusinessPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetBidsInfoForBusinessQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GetBidsInfoForBusinessBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : GetBidsInfoForBusinessArgs
          let result = BidsApiService.GetBidsInfoForBusiness ctx serviceArgs
          return! (match result with
                      | GetBidsInfoForBusinessStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetBidsInfoForBusinessStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetBidsInfoForBusinessStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetBidsInfoForBusinessStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetBidsInfoForBusinessStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetBidsInfoForBusinessStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetBidsInfoForBusinessStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetBidsRecommendations
    /// <summary>
    /// Рекомендованные ставки для заданных товаров
    /// </summary>

    let GetBidsRecommendations (pathParams:GetBidsRecommendationsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<GetBidsRecommendationsBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : GetBidsRecommendationsArgs
          let result = BidsApiService.GetBidsRecommendations ctx serviceArgs
          return! (match result with
                      | GetBidsRecommendationsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetBidsRecommendationsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetBidsRecommendationsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetBidsRecommendationsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetBidsRecommendationsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetBidsRecommendationsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetBidsRecommendationsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region PutBidsForBusiness
    /// <summary>
    /// Включение буста продаж и установка ставок
    /// </summary>

    let PutBidsForBusiness (pathParams:PutBidsForBusinessPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<PutBidsForBusinessBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : PutBidsForBusinessArgs
          let result = BidsApiService.PutBidsForBusiness ctx serviceArgs
          return! (match result with
                      | PutBidsForBusinessStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | PutBidsForBusinessStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | PutBidsForBusinessStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | PutBidsForBusinessStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | PutBidsForBusinessStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | PutBidsForBusinessStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | PutBidsForBusinessStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region PutBidsForCampaign
    /// <summary>
    /// Включение буста продаж и установка ставок для магазина
    /// </summary>

    let PutBidsForCampaign (pathParams:PutBidsForCampaignPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<PutBidsForCampaignBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : PutBidsForCampaignArgs
          let result = BidsApiService.PutBidsForCampaign ctx serviceArgs
          return! (match result with
                      | PutBidsForCampaignStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | PutBidsForCampaignStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | PutBidsForCampaignStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | PutBidsForCampaignStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | PutBidsForCampaignStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | PutBidsForCampaignStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | PutBidsForCampaignStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

