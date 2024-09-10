namespace ympa_fsharp_giraffe_server

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open OrderBusinessInformationApiHandlerParams
open OrderBusinessInformationApiServiceInterface
open OrderBusinessInformationApiServiceImplementation
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.GetBusinessBuyerInfoResponse
open ympa_fsharp_giraffe_server.Model.GetBusinessDocumentsInfoResponse

module OrderBusinessInformationApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region GetOrderBusinessBuyerInfo
    /// <summary>
    /// Информация о покупателе — юридическом лице
    /// </summary>

    let GetOrderBusinessBuyerInfo (pathParams:GetOrderBusinessBuyerInfoPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetOrderBusinessBuyerInfoArgs
          let result = OrderBusinessInformationApiService.GetOrderBusinessBuyerInfo ctx serviceArgs
          return! (match result with
                      | GetOrderBusinessBuyerInfoStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetOrderBusinessBuyerInfoStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetOrderBusinessBuyerInfoStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetOrderBusinessBuyerInfoStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetOrderBusinessBuyerInfoStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetOrderBusinessBuyerInfoStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetOrderBusinessBuyerInfoStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetOrderBusinessDocumentsInfo
    /// <summary>
    /// Информация о документах
    /// </summary>

    let GetOrderBusinessDocumentsInfo (pathParams:GetOrderBusinessDocumentsInfoPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetOrderBusinessDocumentsInfoArgs
          let result = OrderBusinessInformationApiService.GetOrderBusinessDocumentsInfo ctx serviceArgs
          return! (match result with
                      | GetOrderBusinessDocumentsInfoStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetOrderBusinessDocumentsInfoStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetOrderBusinessDocumentsInfoStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetOrderBusinessDocumentsInfoStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetOrderBusinessDocumentsInfoStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetOrderBusinessDocumentsInfoStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetOrderBusinessDocumentsInfoStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

