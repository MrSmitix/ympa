namespace ympa_fsharp_giraffe_server

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open PromosApiHandlerParams
open PromosApiServiceInterface
open PromosApiServiceImplementation
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.DeletePromoOffersRequest
open ympa_fsharp_giraffe_server.Model.DeletePromoOffersResponse
open ympa_fsharp_giraffe_server.Model.GetPromoOffersRequest
open ympa_fsharp_giraffe_server.Model.GetPromoOffersResponse
open ympa_fsharp_giraffe_server.Model.GetPromosRequest
open ympa_fsharp_giraffe_server.Model.GetPromosResponse
open ympa_fsharp_giraffe_server.Model.UpdatePromoOffersRequest
open ympa_fsharp_giraffe_server.Model.UpdatePromoOffersResponse

module PromosApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region DeletePromoOffers
    /// <summary>
    /// Удаление товаров из акции
    /// </summary>

    let DeletePromoOffers (pathParams:DeletePromoOffersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<DeletePromoOffersBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : DeletePromoOffersArgs
          let result = PromosApiService.DeletePromoOffers ctx serviceArgs
          return! (match result with
                      | DeletePromoOffersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | DeletePromoOffersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | DeletePromoOffersStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | DeletePromoOffersStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | DeletePromoOffersStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | DeletePromoOffersStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | DeletePromoOffersStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetPromoOffers
    /// <summary>
    /// Получение списка товаров, которые участвуют или могут участвовать в акции
    /// </summary>

    let GetPromoOffers (pathParams:GetPromoOffersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetPromoOffersQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GetPromoOffersBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : GetPromoOffersArgs
          let result = PromosApiService.GetPromoOffers ctx serviceArgs
          return! (match result with
                      | GetPromoOffersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetPromoOffersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetPromoOffersStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetPromoOffersStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetPromoOffersStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetPromoOffersStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetPromoOffersStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetPromos
    /// <summary>
    /// Получение списка акций
    /// </summary>

    let GetPromos (pathParams:GetPromosPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<GetPromosBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : GetPromosArgs
          let result = PromosApiService.GetPromos ctx serviceArgs
          return! (match result with
                      | GetPromosStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetPromosStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetPromosStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetPromosStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetPromosStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetPromosStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetPromosStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdatePromoOffers
    /// <summary>
    /// Добавление товаров в акцию или изменение их цен
    /// </summary>

    let UpdatePromoOffers (pathParams:UpdatePromoOffersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<UpdatePromoOffersBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : UpdatePromoOffersArgs
          let result = PromosApiService.UpdatePromoOffers ctx serviceArgs
          return! (match result with
                      | UpdatePromoOffersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UpdatePromoOffersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | UpdatePromoOffersStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | UpdatePromoOffersStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | UpdatePromoOffersStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | UpdatePromoOffersStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | UpdatePromoOffersStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

