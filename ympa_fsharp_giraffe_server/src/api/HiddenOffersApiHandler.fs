namespace ympa_fsharp_giraffe_server

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open HiddenOffersApiHandlerParams
open HiddenOffersApiServiceInterface
open HiddenOffersApiServiceImplementation
open ympa_fsharp_giraffe_server.Model.AddHiddenOffersRequest
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLockedErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.DeleteHiddenOffersRequest
open ympa_fsharp_giraffe_server.Model.EmptyApiResponse
open ympa_fsharp_giraffe_server.Model.GetHiddenOffersResponse

module HiddenOffersApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region AddHiddenOffers
    /// <summary>
    /// Скрытие товаров и настройки скрытия
    /// </summary>

    let AddHiddenOffers (pathParams:AddHiddenOffersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<AddHiddenOffersBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : AddHiddenOffersArgs
          let result = HiddenOffersApiService.AddHiddenOffers ctx serviceArgs
          return! (match result with
                      | AddHiddenOffersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AddHiddenOffersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AddHiddenOffersStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AddHiddenOffersStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AddHiddenOffersStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | AddHiddenOffersStatusCode423 resolved ->
                            setStatusCode 423 >=> json resolved.content
                      | AddHiddenOffersStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region DeleteHiddenOffers
    /// <summary>
    /// Возобновление показа товаров
    /// </summary>

    let DeleteHiddenOffers (pathParams:DeleteHiddenOffersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<DeleteHiddenOffersBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : DeleteHiddenOffersArgs
          let result = HiddenOffersApiService.DeleteHiddenOffers ctx serviceArgs
          return! (match result with
                      | DeleteHiddenOffersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | DeleteHiddenOffersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | DeleteHiddenOffersStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | DeleteHiddenOffersStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | DeleteHiddenOffersStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | DeleteHiddenOffersStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | DeleteHiddenOffersStatusCode423 resolved ->
                            setStatusCode 423 >=> json resolved.content
                      | DeleteHiddenOffersStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetHiddenOffers
    /// <summary>
    /// Информация о скрытых вами товарах
    /// </summary>

    let GetHiddenOffers (pathParams:GetHiddenOffersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetHiddenOffersQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : GetHiddenOffersArgs
          let result = HiddenOffersApiService.GetHiddenOffers ctx serviceArgs
          return! (match result with
                      | GetHiddenOffersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetHiddenOffersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetHiddenOffersStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetHiddenOffersStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetHiddenOffersStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetHiddenOffersStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

