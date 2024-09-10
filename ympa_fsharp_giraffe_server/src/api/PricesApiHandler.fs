namespace ympa_fsharp_giraffe_server

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open PricesApiHandlerParams
open PricesApiServiceInterface
open PricesApiServiceImplementation
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLockedErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.EmptyApiResponse
open ympa_fsharp_giraffe_server.Model.GetPricesByOfferIdsRequest
open ympa_fsharp_giraffe_server.Model.GetPricesByOfferIdsResponse
open ympa_fsharp_giraffe_server.Model.GetPricesResponse
open ympa_fsharp_giraffe_server.Model.SuggestPricesRequest
open ympa_fsharp_giraffe_server.Model.SuggestPricesResponse
open ympa_fsharp_giraffe_server.Model.UpdateBusinessPricesRequest
open ympa_fsharp_giraffe_server.Model.UpdatePricesRequest

module PricesApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region GetPrices
    /// <summary>
    /// Список цен
    /// </summary>

    let GetPrices (pathParams:GetPricesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetPricesQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : GetPricesArgs
          let result = PricesApiService.GetPrices ctx serviceArgs
          return! (match result with
                      | GetPricesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetPricesStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetPricesStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetPricesStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetPricesStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetPricesStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetPricesStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetPricesByOfferIds
    /// <summary>
    /// Просмотр цен на указанные товары в магазине
    /// </summary>

    let GetPricesByOfferIds (pathParams:GetPricesByOfferIdsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetPricesByOfferIdsQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GetPricesByOfferIdsBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : GetPricesByOfferIdsArgs
          let result = PricesApiService.GetPricesByOfferIds ctx serviceArgs
          return! (match result with
                      | GetPricesByOfferIdsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetPricesByOfferIdsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetPricesByOfferIdsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetPricesByOfferIdsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetPricesByOfferIdsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetPricesByOfferIdsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetPricesByOfferIdsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetSuggestedPrices
    /// <summary>
    /// Цены для продвижения товаров
    /// </summary>

    let GetSuggestedPrices (pathParams:GetSuggestedPricesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<GetSuggestedPricesBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : GetSuggestedPricesArgs
          let result = PricesApiService.GetSuggestedPrices ctx serviceArgs
          return! (match result with
                      | GetSuggestedPricesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetSuggestedPricesStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetSuggestedPricesStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetSuggestedPricesStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetSuggestedPricesStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetSuggestedPricesStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetSuggestedPricesStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateBusinessPrices
    /// <summary>
    /// Установка цен на товары во всех магазинах
    /// </summary>

    let UpdateBusinessPrices (pathParams:UpdateBusinessPricesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<UpdateBusinessPricesBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : UpdateBusinessPricesArgs
          let result = PricesApiService.UpdateBusinessPrices ctx serviceArgs
          return! (match result with
                      | UpdateBusinessPricesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UpdateBusinessPricesStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | UpdateBusinessPricesStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | UpdateBusinessPricesStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | UpdateBusinessPricesStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | UpdateBusinessPricesStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | UpdateBusinessPricesStatusCode423 resolved ->
                            setStatusCode 423 >=> json resolved.content
                      | UpdateBusinessPricesStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdatePrices
    /// <summary>
    /// Установка цен на товары в конкретном магазине
    /// </summary>

    let UpdatePrices (pathParams:UpdatePricesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<UpdatePricesBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : UpdatePricesArgs
          let result = PricesApiService.UpdatePrices ctx serviceArgs
          return! (match result with
                      | UpdatePricesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UpdatePricesStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | UpdatePricesStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | UpdatePricesStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | UpdatePricesStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | UpdatePricesStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | UpdatePricesStatusCode423 resolved ->
                            setStatusCode 423 >=> json resolved.content
                      | UpdatePricesStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

