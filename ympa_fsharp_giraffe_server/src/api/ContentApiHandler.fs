namespace ympa_fsharp_giraffe_server

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ContentApiHandlerParams
open ContentApiServiceInterface
open ContentApiServiceImplementation
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLockedErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.GetCategoryContentParametersResponse
open ympa_fsharp_giraffe_server.Model.GetOfferCardsContentStatusRequest
open ympa_fsharp_giraffe_server.Model.GetOfferCardsContentStatusResponse
open ympa_fsharp_giraffe_server.Model.UpdateOfferContentRequest
open ympa_fsharp_giraffe_server.Model.UpdateOfferContentResponse

module ContentApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region GetCategoryContentParameters
    /// <summary>
    /// Списки характеристик товаров по категориям
    /// </summary>

    let GetCategoryContentParameters (pathParams:GetCategoryContentParametersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetCategoryContentParametersArgs
          let result = ContentApiService.GetCategoryContentParameters ctx serviceArgs
          return! (match result with
                      | GetCategoryContentParametersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetCategoryContentParametersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetCategoryContentParametersStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetCategoryContentParametersStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetCategoryContentParametersStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetCategoryContentParametersStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetCategoryContentParametersStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetOfferCardsContentStatus
    /// <summary>
    /// Получение информации о заполненности карточек магазина
    /// </summary>

    let GetOfferCardsContentStatus (pathParams:GetOfferCardsContentStatusPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetOfferCardsContentStatusQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GetOfferCardsContentStatusBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : GetOfferCardsContentStatusArgs
          let result = ContentApiService.GetOfferCardsContentStatus ctx serviceArgs
          return! (match result with
                      | GetOfferCardsContentStatusStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetOfferCardsContentStatusStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetOfferCardsContentStatusStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetOfferCardsContentStatusStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetOfferCardsContentStatusStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetOfferCardsContentStatusStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetOfferCardsContentStatusStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateOfferContent
    /// <summary>
    /// Редактирование категорийных характеристик товара
    /// </summary>

    let UpdateOfferContent (pathParams:UpdateOfferContentPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<UpdateOfferContentBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : UpdateOfferContentArgs
          let result = ContentApiService.UpdateOfferContent ctx serviceArgs
          return! (match result with
                      | UpdateOfferContentStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UpdateOfferContentStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | UpdateOfferContentStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | UpdateOfferContentStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | UpdateOfferContentStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | UpdateOfferContentStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | UpdateOfferContentStatusCode423 resolved ->
                            setStatusCode 423 >=> json resolved.content
                      | UpdateOfferContentStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

