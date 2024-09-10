namespace ympa_fsharp_giraffe_server

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open DeliveryServicesApiHandlerParams
open DeliveryServicesApiServiceInterface
open DeliveryServicesApiServiceImplementation
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.GetDeliveryServicesResponse

module DeliveryServicesApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region GetDeliveryServices
    /// <summary>
    /// Справочник служб доставки
    /// </summary>

    let GetDeliveryServices  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let result = DeliveryServicesApiService.GetDeliveryServices ctx 
          return! (match result with
                      | GetDeliveryServicesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetDeliveryServicesStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetDeliveryServicesStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetDeliveryServicesStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetDeliveryServicesStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetDeliveryServicesStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetDeliveryServicesStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

