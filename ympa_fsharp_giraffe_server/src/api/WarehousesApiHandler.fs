namespace ympa_fsharp_giraffe_server

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open WarehousesApiHandlerParams
open WarehousesApiServiceInterface
open WarehousesApiServiceImplementation
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.GetFulfillmentWarehousesResponse
open ympa_fsharp_giraffe_server.Model.GetWarehousesResponse

module WarehousesApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region GetFulfillmentWarehouses
    /// <summary>
    /// Идентификаторы складов Маркета (FBY)
    /// </summary>

    let GetFulfillmentWarehouses  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let result = WarehousesApiService.GetFulfillmentWarehouses ctx 
          return! (match result with
                      | GetFulfillmentWarehousesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetFulfillmentWarehousesStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetFulfillmentWarehousesStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetFulfillmentWarehousesStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetFulfillmentWarehousesStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetFulfillmentWarehousesStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetFulfillmentWarehousesStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetWarehouses
    /// <summary>
    /// Список складов и групп складов
    /// </summary>

    let GetWarehouses (pathParams:GetWarehousesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetWarehousesArgs
          let result = WarehousesApiService.GetWarehouses ctx serviceArgs
          return! (match result with
                      | GetWarehousesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetWarehousesStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetWarehousesStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetWarehousesStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetWarehousesStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetWarehousesStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetWarehousesStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

