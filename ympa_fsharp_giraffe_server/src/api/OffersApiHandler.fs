namespace ympa_fsharp_giraffe_server

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open OffersApiHandlerParams
open OffersApiServiceInterface
open OffersApiServiceImplementation
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLockedErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.CurrencyType
open ympa_fsharp_giraffe_server.Model.DeleteCampaignOffersRequest
open ympa_fsharp_giraffe_server.Model.DeleteCampaignOffersResponse
open ympa_fsharp_giraffe_server.Model.EmptyApiResponse
open ympa_fsharp_giraffe_server.Model.GetAllOffersResponse
open ympa_fsharp_giraffe_server.Model.GetCampaignOffersRequest
open ympa_fsharp_giraffe_server.Model.GetCampaignOffersResponse
open ympa_fsharp_giraffe_server.Model.GetOfferRecommendationsRequest
open ympa_fsharp_giraffe_server.Model.GetOfferRecommendationsResponse
open ympa_fsharp_giraffe_server.Model.GetOffersResponse
open ympa_fsharp_giraffe_server.Model.UpdateCampaignOffersRequest

module OffersApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region DeleteCampaignOffers
    /// <summary>
    /// Удаление товаров из ассортимента магазина
    /// </summary>

    let DeleteCampaignOffers (pathParams:DeleteCampaignOffersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<DeleteCampaignOffersBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : DeleteCampaignOffersArgs
          let result = OffersApiService.DeleteCampaignOffers ctx serviceArgs
          return! (match result with
                      | DeleteCampaignOffersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | DeleteCampaignOffersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | DeleteCampaignOffersStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | DeleteCampaignOffersStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | DeleteCampaignOffersStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | DeleteCampaignOffersStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | DeleteCampaignOffersStatusCode423 resolved ->
                            setStatusCode 423 >=> json resolved.content
                      | DeleteCampaignOffersStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetAllOffers
    /// <summary>
    /// Все предложения магазина
    /// </summary>

    let GetAllOffers (pathParams:GetAllOffersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetAllOffersQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : GetAllOffersArgs
          let result = OffersApiService.GetAllOffers ctx serviceArgs
          return! (match result with
                      | GetAllOffersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetAllOffersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetAllOffersStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetAllOffersStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetAllOffersStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetAllOffersStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetAllOffersStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetCampaignOffers
    /// <summary>
    /// Информация о товарах, которые размещены в заданном магазине
    /// </summary>

    let GetCampaignOffers (pathParams:GetCampaignOffersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetCampaignOffersQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GetCampaignOffersBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : GetCampaignOffersArgs
          let result = OffersApiService.GetCampaignOffers ctx serviceArgs
          return! (match result with
                      | GetCampaignOffersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetCampaignOffersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetCampaignOffersStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetCampaignOffersStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetCampaignOffersStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetCampaignOffersStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetCampaignOffersStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetOfferRecommendations
    /// <summary>
    /// Рекомендации Маркета, касающиеся цен
    /// </summary>

    let GetOfferRecommendations (pathParams:GetOfferRecommendationsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetOfferRecommendationsQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GetOfferRecommendationsBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : GetOfferRecommendationsArgs
          let result = OffersApiService.GetOfferRecommendations ctx serviceArgs
          return! (match result with
                      | GetOfferRecommendationsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetOfferRecommendationsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetOfferRecommendationsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetOfferRecommendationsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetOfferRecommendationsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetOfferRecommendationsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetOfferRecommendationsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetOffers
    /// <summary>
    /// Предложения магазина
    /// </summary>

    let GetOffers (pathParams:GetOffersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetOffersQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : GetOffersArgs
          let result = OffersApiService.GetOffers ctx serviceArgs
          return! (match result with
                      | GetOffersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetOffersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetOffersStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetOffersStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetOffersStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetOffersStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetOffersStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateCampaignOffers
    /// <summary>
    /// Изменение условий продажи товаров в магазине
    /// </summary>

    let UpdateCampaignOffers (pathParams:UpdateCampaignOffersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<UpdateCampaignOffersBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : UpdateCampaignOffersArgs
          let result = OffersApiService.UpdateCampaignOffers ctx serviceArgs
          return! (match result with
                      | UpdateCampaignOffersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UpdateCampaignOffersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | UpdateCampaignOffersStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | UpdateCampaignOffersStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | UpdateCampaignOffersStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | UpdateCampaignOffersStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | UpdateCampaignOffersStatusCode423 resolved ->
                            setStatusCode 423 >=> json resolved.content
                      | UpdateCampaignOffersStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

