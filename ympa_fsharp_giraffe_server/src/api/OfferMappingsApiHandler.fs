namespace ympa_fsharp_giraffe_server

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open OfferMappingsApiHandlerParams
open OfferMappingsApiServiceInterface
open OfferMappingsApiServiceImplementation
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLockedErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.EmptyApiResponse
open ympa_fsharp_giraffe_server.Model.GetOfferMappingEntriesResponse
open ympa_fsharp_giraffe_server.Model.GetSuggestedOfferMappingEntriesRequest
open ympa_fsharp_giraffe_server.Model.GetSuggestedOfferMappingEntriesResponse
open ympa_fsharp_giraffe_server.Model.OfferAvailabilityStatusType
open ympa_fsharp_giraffe_server.Model.OfferMappingKindType
open ympa_fsharp_giraffe_server.Model.OfferProcessingStatusType
open ympa_fsharp_giraffe_server.Model.UpdateOfferMappingEntryRequest

module OfferMappingsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region GetOfferMappingEntries
    /// <summary>
    /// Список товаров в каталоге
    /// </summary>

    let GetOfferMappingEntries (pathParams:GetOfferMappingEntriesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetOfferMappingEntriesQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : GetOfferMappingEntriesArgs
          let result = OfferMappingsApiService.GetOfferMappingEntries ctx serviceArgs
          return! (match result with
                      | GetOfferMappingEntriesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetOfferMappingEntriesStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetOfferMappingEntriesStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetOfferMappingEntriesStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetOfferMappingEntriesStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetOfferMappingEntriesStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetOfferMappingEntriesStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetSuggestedOfferMappingEntries
    /// <summary>
    /// Рекомендованные карточки для товаров
    /// </summary>

    let GetSuggestedOfferMappingEntries (pathParams:GetSuggestedOfferMappingEntriesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<GetSuggestedOfferMappingEntriesBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : GetSuggestedOfferMappingEntriesArgs
          let result = OfferMappingsApiService.GetSuggestedOfferMappingEntries ctx serviceArgs
          return! (match result with
                      | GetSuggestedOfferMappingEntriesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetSuggestedOfferMappingEntriesStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetSuggestedOfferMappingEntriesStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetSuggestedOfferMappingEntriesStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetSuggestedOfferMappingEntriesStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetSuggestedOfferMappingEntriesStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetSuggestedOfferMappingEntriesStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateOfferMappingEntries
    /// <summary>
    /// Добавление и редактирование товаров в каталоге
    /// </summary>

    let UpdateOfferMappingEntries (pathParams:UpdateOfferMappingEntriesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<UpdateOfferMappingEntriesBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : UpdateOfferMappingEntriesArgs
          let result = OfferMappingsApiService.UpdateOfferMappingEntries ctx serviceArgs
          return! (match result with
                      | UpdateOfferMappingEntriesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UpdateOfferMappingEntriesStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | UpdateOfferMappingEntriesStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | UpdateOfferMappingEntriesStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | UpdateOfferMappingEntriesStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | UpdateOfferMappingEntriesStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | UpdateOfferMappingEntriesStatusCode423 resolved ->
                            setStatusCode 423 >=> json resolved.content
                      | UpdateOfferMappingEntriesStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

