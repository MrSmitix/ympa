namespace ympa_fsharp_giraffe_server

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ModelsApiHandlerParams
open ModelsApiServiceInterface
open ModelsApiServiceImplementation
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.CurrencyType
open ympa_fsharp_giraffe_server.Model.GetModelsOffersResponse
open ympa_fsharp_giraffe_server.Model.GetModelsRequest
open ympa_fsharp_giraffe_server.Model.GetModelsResponse
open ympa_fsharp_giraffe_server.Model.SearchModelsResponse
open ympa_fsharp_giraffe_server.Model.SortOrderType

module ModelsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region GetModel
    /// <summary>
    /// Информация об одной модели
    /// </summary>

    let GetModel (pathParams:GetModelPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetModelQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : GetModelArgs
          let result = ModelsApiService.GetModel ctx serviceArgs
          return! (match result with
                      | GetModelStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetModelStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetModelStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetModelStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetModelStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetModelStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetModelStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetModelOffers
    /// <summary>
    /// Список предложений для одной модели
    /// </summary>

    let GetModelOffers (pathParams:GetModelOffersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetModelOffersQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : GetModelOffersArgs
          let result = ModelsApiService.GetModelOffers ctx serviceArgs
          return! (match result with
                      | GetModelOffersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetModelOffersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetModelOffersStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetModelOffersStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetModelOffersStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetModelOffersStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetModelOffersStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetModels
    /// <summary>
    /// Информация о нескольких моделях
    /// </summary>

    let GetModels  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetModelsQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GetModelsBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : GetModelsArgs
          let result = ModelsApiService.GetModels ctx serviceArgs
          return! (match result with
                      | GetModelsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetModelsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetModelsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetModelsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetModelsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetModelsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetModelsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetModelsOffers
    /// <summary>
    /// Список предложений для нескольких моделей
    /// </summary>

    let GetModelsOffers  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetModelsOffersQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GetModelsOffersBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : GetModelsOffersArgs
          let result = ModelsApiService.GetModelsOffers ctx serviceArgs
          return! (match result with
                      | GetModelsOffersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetModelsOffersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetModelsOffersStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetModelsOffersStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetModelsOffersStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetModelsOffersStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetModelsOffersStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SearchModels
    /// <summary>
    /// Поиск модели товара
    /// </summary>

    let SearchModels  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<SearchModelsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : SearchModelsArgs
          let result = ModelsApiService.SearchModels ctx serviceArgs
          return! (match result with
                      | SearchModelsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SearchModelsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | SearchModelsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | SearchModelsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | SearchModelsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | SearchModelsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | SearchModelsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

