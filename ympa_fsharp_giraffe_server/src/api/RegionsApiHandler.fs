namespace ympa_fsharp_giraffe_server

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open RegionsApiHandlerParams
open RegionsApiServiceInterface
open RegionsApiServiceImplementation
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.GetRegionWithChildrenResponse
open ympa_fsharp_giraffe_server.Model.GetRegionsResponse

module RegionsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region SearchRegionChildren
    /// <summary>
    /// Информация о дочерних регионах
    /// </summary>

    let SearchRegionChildren (pathParams:SearchRegionChildrenPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<SearchRegionChildrenQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : SearchRegionChildrenArgs
          let result = RegionsApiService.SearchRegionChildren ctx serviceArgs
          return! (match result with
                      | SearchRegionChildrenStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SearchRegionChildrenStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | SearchRegionChildrenStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | SearchRegionChildrenStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | SearchRegionChildrenStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | SearchRegionChildrenStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | SearchRegionChildrenStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SearchRegionsById
    /// <summary>
    /// Информация о регионе
    /// </summary>

    let SearchRegionsById (pathParams:SearchRegionsByIdPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : SearchRegionsByIdArgs
          let result = RegionsApiService.SearchRegionsById ctx serviceArgs
          return! (match result with
                      | SearchRegionsByIdStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SearchRegionsByIdStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | SearchRegionsByIdStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | SearchRegionsByIdStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | SearchRegionsByIdStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | SearchRegionsByIdStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SearchRegionsByName
    /// <summary>
    /// Поиск регионов по их имени
    /// </summary>

    let SearchRegionsByName  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<SearchRegionsByNameQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : SearchRegionsByNameArgs
          let result = RegionsApiService.SearchRegionsByName ctx serviceArgs
          return! (match result with
                      | SearchRegionsByNameStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SearchRegionsByNameStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | SearchRegionsByNameStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | SearchRegionsByNameStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | SearchRegionsByNameStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

