namespace ympa_fsharp_giraffe_server

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open BusinessOfferMappingsApiHandlerParams
open BusinessOfferMappingsApiServiceInterface
open BusinessOfferMappingsApiServiceImplementation
open ympa_fsharp_giraffe_server.Model.AddOffersToArchiveRequest
open ympa_fsharp_giraffe_server.Model.AddOffersToArchiveResponse
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLockedErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.DeleteOffersFromArchiveRequest
open ympa_fsharp_giraffe_server.Model.DeleteOffersFromArchiveResponse
open ympa_fsharp_giraffe_server.Model.DeleteOffersRequest
open ympa_fsharp_giraffe_server.Model.DeleteOffersResponse
open ympa_fsharp_giraffe_server.Model.GetOfferMappingsRequest
open ympa_fsharp_giraffe_server.Model.GetOfferMappingsResponse
open ympa_fsharp_giraffe_server.Model.GetSuggestedOfferMappingsRequest
open ympa_fsharp_giraffe_server.Model.GetSuggestedOfferMappingsResponse
open ympa_fsharp_giraffe_server.Model.UpdateOfferMappingsRequest
open ympa_fsharp_giraffe_server.Model.UpdateOfferMappingsResponse

module BusinessOfferMappingsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region AddOffersToArchive
    /// <summary>
    /// Добавление товаров в архив
    /// </summary>

    let AddOffersToArchive (pathParams:AddOffersToArchivePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<AddOffersToArchiveBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : AddOffersToArchiveArgs
          let result = BusinessOfferMappingsApiService.AddOffersToArchive ctx serviceArgs
          return! (match result with
                      | AddOffersToArchiveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AddOffersToArchiveStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AddOffersToArchiveStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AddOffersToArchiveStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AddOffersToArchiveStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AddOffersToArchiveStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | AddOffersToArchiveStatusCode423 resolved ->
                            setStatusCode 423 >=> json resolved.content
                      | AddOffersToArchiveStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region DeleteOffers
    /// <summary>
    /// Удаление товаров из каталога
    /// </summary>

    let DeleteOffers (pathParams:DeleteOffersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<DeleteOffersBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : DeleteOffersArgs
          let result = BusinessOfferMappingsApiService.DeleteOffers ctx serviceArgs
          return! (match result with
                      | DeleteOffersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | DeleteOffersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | DeleteOffersStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | DeleteOffersStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | DeleteOffersStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | DeleteOffersStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | DeleteOffersStatusCode423 resolved ->
                            setStatusCode 423 >=> json resolved.content
                      | DeleteOffersStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region DeleteOffersFromArchive
    /// <summary>
    /// Удаление товаров из архива
    /// </summary>

    let DeleteOffersFromArchive (pathParams:DeleteOffersFromArchivePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<DeleteOffersFromArchiveBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : DeleteOffersFromArchiveArgs
          let result = BusinessOfferMappingsApiService.DeleteOffersFromArchive ctx serviceArgs
          return! (match result with
                      | DeleteOffersFromArchiveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | DeleteOffersFromArchiveStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | DeleteOffersFromArchiveStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | DeleteOffersFromArchiveStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | DeleteOffersFromArchiveStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | DeleteOffersFromArchiveStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | DeleteOffersFromArchiveStatusCode423 resolved ->
                            setStatusCode 423 >=> json resolved.content
                      | DeleteOffersFromArchiveStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetOfferMappings
    /// <summary>
    /// Информация о товарах в каталоге
    /// </summary>

    let GetOfferMappings (pathParams:GetOfferMappingsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetOfferMappingsQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GetOfferMappingsBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : GetOfferMappingsArgs
          let result = BusinessOfferMappingsApiService.GetOfferMappings ctx serviceArgs
          return! (match result with
                      | GetOfferMappingsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetOfferMappingsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetOfferMappingsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetOfferMappingsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetOfferMappingsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetOfferMappingsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetOfferMappingsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetSuggestedOfferMappings
    /// <summary>
    /// Просмотр карточек на Маркете, которые подходят вашим товарам
    /// </summary>

    let GetSuggestedOfferMappings (pathParams:GetSuggestedOfferMappingsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<GetSuggestedOfferMappingsBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : GetSuggestedOfferMappingsArgs
          let result = BusinessOfferMappingsApiService.GetSuggestedOfferMappings ctx serviceArgs
          return! (match result with
                      | GetSuggestedOfferMappingsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetSuggestedOfferMappingsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetSuggestedOfferMappingsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetSuggestedOfferMappingsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetSuggestedOfferMappingsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetSuggestedOfferMappingsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetSuggestedOfferMappingsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateOfferMappings
    /// <summary>
    /// Добавление товаров в каталог и изменение информации о них
    /// </summary>

    let UpdateOfferMappings (pathParams:UpdateOfferMappingsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<UpdateOfferMappingsBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : UpdateOfferMappingsArgs
          let result = BusinessOfferMappingsApiService.UpdateOfferMappings ctx serviceArgs
          return! (match result with
                      | UpdateOfferMappingsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UpdateOfferMappingsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | UpdateOfferMappingsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | UpdateOfferMappingsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | UpdateOfferMappingsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | UpdateOfferMappingsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | UpdateOfferMappingsStatusCode423 resolved ->
                            setStatusCode 423 >=> json resolved.content
                      | UpdateOfferMappingsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

