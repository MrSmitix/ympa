namespace ympa_fsharp_giraffe_server

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open CategoriesApiHandlerParams
open CategoriesApiServiceInterface
open CategoriesApiServiceImplementation
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.GetCategoriesMaxSaleQuantumRequest
open ympa_fsharp_giraffe_server.Model.GetCategoriesMaxSaleQuantumResponse
open ympa_fsharp_giraffe_server.Model.GetCategoriesRequest
open ympa_fsharp_giraffe_server.Model.GetCategoriesResponse

module CategoriesApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region GetCategoriesMaxSaleQuantum
    /// <summary>
    /// Лимит на установку кванта продажи и минимального количества товаров в заказе
    /// </summary>

    let GetCategoriesMaxSaleQuantum  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<GetCategoriesMaxSaleQuantumBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : GetCategoriesMaxSaleQuantumArgs
          let result = CategoriesApiService.GetCategoriesMaxSaleQuantum ctx serviceArgs
          return! (match result with
                      | GetCategoriesMaxSaleQuantumStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetCategoriesMaxSaleQuantumStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetCategoriesMaxSaleQuantumStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetCategoriesMaxSaleQuantumStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetCategoriesMaxSaleQuantumStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetCategoriesMaxSaleQuantumStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetCategoriesMaxSaleQuantumStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetCategoriesTree
    /// <summary>
    /// Дерево категорий
    /// </summary>

    let GetCategoriesTree  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<GetCategoriesTreeBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : GetCategoriesTreeArgs
          let result = CategoriesApiService.GetCategoriesTree ctx serviceArgs
          return! (match result with
                      | GetCategoriesTreeStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetCategoriesTreeStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetCategoriesTreeStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetCategoriesTreeStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetCategoriesTreeStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetCategoriesTreeStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetCategoriesTreeStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

