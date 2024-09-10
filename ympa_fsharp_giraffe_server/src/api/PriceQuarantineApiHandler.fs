namespace ympa_fsharp_giraffe_server

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open PriceQuarantineApiHandlerParams
open PriceQuarantineApiServiceInterface
open PriceQuarantineApiServiceImplementation
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLockedErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.ConfirmPricesRequest
open ympa_fsharp_giraffe_server.Model.EmptyApiResponse
open ympa_fsharp_giraffe_server.Model.GetQuarantineOffersRequest
open ympa_fsharp_giraffe_server.Model.GetQuarantineOffersResponse

module PriceQuarantineApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region ConfirmBusinessPrices
    /// <summary>
    /// Удаление товара из карантина по цене в кабинете
    /// </summary>

    let ConfirmBusinessPrices (pathParams:ConfirmBusinessPricesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<ConfirmBusinessPricesBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : ConfirmBusinessPricesArgs
          let result = PriceQuarantineApiService.ConfirmBusinessPrices ctx serviceArgs
          return! (match result with
                      | ConfirmBusinessPricesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ConfirmBusinessPricesStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | ConfirmBusinessPricesStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | ConfirmBusinessPricesStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | ConfirmBusinessPricesStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | ConfirmBusinessPricesStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | ConfirmBusinessPricesStatusCode423 resolved ->
                            setStatusCode 423 >=> json resolved.content
                      | ConfirmBusinessPricesStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ConfirmCampaignPrices
    /// <summary>
    /// Удаление товара из карантина по цене в магазине
    /// </summary>

    let ConfirmCampaignPrices (pathParams:ConfirmCampaignPricesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<ConfirmCampaignPricesBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : ConfirmCampaignPricesArgs
          let result = PriceQuarantineApiService.ConfirmCampaignPrices ctx serviceArgs
          return! (match result with
                      | ConfirmCampaignPricesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ConfirmCampaignPricesStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | ConfirmCampaignPricesStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | ConfirmCampaignPricesStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | ConfirmCampaignPricesStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | ConfirmCampaignPricesStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | ConfirmCampaignPricesStatusCode423 resolved ->
                            setStatusCode 423 >=> json resolved.content
                      | ConfirmCampaignPricesStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetBusinessQuarantineOffers
    /// <summary>
    /// Список товаров, находящихся в карантине по цене в кабинете
    /// </summary>

    let GetBusinessQuarantineOffers (pathParams:GetBusinessQuarantineOffersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetBusinessQuarantineOffersQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GetBusinessQuarantineOffersBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : GetBusinessQuarantineOffersArgs
          let result = PriceQuarantineApiService.GetBusinessQuarantineOffers ctx serviceArgs
          return! (match result with
                      | GetBusinessQuarantineOffersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetBusinessQuarantineOffersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetBusinessQuarantineOffersStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetBusinessQuarantineOffersStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetBusinessQuarantineOffersStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetBusinessQuarantineOffersStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetBusinessQuarantineOffersStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetCampaignQuarantineOffers
    /// <summary>
    /// Список товаров, находящихся в карантине по цене в магазине
    /// </summary>

    let GetCampaignQuarantineOffers (pathParams:GetCampaignQuarantineOffersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetCampaignQuarantineOffersQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GetCampaignQuarantineOffersBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : GetCampaignQuarantineOffersArgs
          let result = PriceQuarantineApiService.GetCampaignQuarantineOffers ctx serviceArgs
          return! (match result with
                      | GetCampaignQuarantineOffersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetCampaignQuarantineOffersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetCampaignQuarantineOffersStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetCampaignQuarantineOffersStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetCampaignQuarantineOffersStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetCampaignQuarantineOffersStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetCampaignQuarantineOffersStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

