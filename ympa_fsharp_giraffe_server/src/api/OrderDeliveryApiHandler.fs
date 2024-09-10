namespace ympa_fsharp_giraffe_server

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open OrderDeliveryApiHandlerParams
open OrderDeliveryApiServiceInterface
open OrderDeliveryApiServiceImplementation
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.EmptyApiResponse
open ympa_fsharp_giraffe_server.Model.GetOrderBuyerInfoResponse
open ympa_fsharp_giraffe_server.Model.SetOrderDeliveryDateRequest
open ympa_fsharp_giraffe_server.Model.SetOrderDeliveryTrackCodeRequest
open ympa_fsharp_giraffe_server.Model.UpdateOrderStorageLimitRequest
open ympa_fsharp_giraffe_server.Model.VerifyOrderEacRequest
open ympa_fsharp_giraffe_server.Model.VerifyOrderEacResponse

module OrderDeliveryApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region GetOrderBuyerInfo
    /// <summary>
    /// Информация о покупателе — физическом лице
    /// </summary>

    let GetOrderBuyerInfo (pathParams:GetOrderBuyerInfoPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetOrderBuyerInfoArgs
          let result = OrderDeliveryApiService.GetOrderBuyerInfo ctx serviceArgs
          return! (match result with
                      | GetOrderBuyerInfoStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetOrderBuyerInfoStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetOrderBuyerInfoStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetOrderBuyerInfoStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetOrderBuyerInfoStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetOrderBuyerInfoStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetOrderBuyerInfoStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SetOrderDeliveryDate
    /// <summary>
    /// Изменение даты доставки заказа
    /// </summary>

    let SetOrderDeliveryDate (pathParams:SetOrderDeliveryDatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<SetOrderDeliveryDateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : SetOrderDeliveryDateArgs
          let result = OrderDeliveryApiService.SetOrderDeliveryDate ctx serviceArgs
          return! (match result with
                      | SetOrderDeliveryDateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SetOrderDeliveryDateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | SetOrderDeliveryDateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | SetOrderDeliveryDateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | SetOrderDeliveryDateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | SetOrderDeliveryDateStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | SetOrderDeliveryDateStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SetOrderDeliveryTrackCode
    /// <summary>
    /// Передача трек‑номера посылки
    /// </summary>

    let SetOrderDeliveryTrackCode (pathParams:SetOrderDeliveryTrackCodePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<SetOrderDeliveryTrackCodeBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : SetOrderDeliveryTrackCodeArgs
          let result = OrderDeliveryApiService.SetOrderDeliveryTrackCode ctx serviceArgs
          return! (match result with
                      | SetOrderDeliveryTrackCodeStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SetOrderDeliveryTrackCodeStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | SetOrderDeliveryTrackCodeStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | SetOrderDeliveryTrackCodeStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | SetOrderDeliveryTrackCodeStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | SetOrderDeliveryTrackCodeStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | SetOrderDeliveryTrackCodeStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateOrderStorageLimit
    /// <summary>
    /// Продление срока хранения заказа
    /// </summary>

    let UpdateOrderStorageLimit (pathParams:UpdateOrderStorageLimitPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<UpdateOrderStorageLimitBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : UpdateOrderStorageLimitArgs
          let result = OrderDeliveryApiService.UpdateOrderStorageLimit ctx serviceArgs
          return! (match result with
                      | UpdateOrderStorageLimitStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UpdateOrderStorageLimitStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | UpdateOrderStorageLimitStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | UpdateOrderStorageLimitStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | UpdateOrderStorageLimitStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | UpdateOrderStorageLimitStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | UpdateOrderStorageLimitStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region VerifyOrderEac
    /// <summary>
    /// Передача кода подтверждения
    /// </summary>

    let VerifyOrderEac (pathParams:VerifyOrderEacPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<VerifyOrderEacBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : VerifyOrderEacArgs
          let result = OrderDeliveryApiService.VerifyOrderEac ctx serviceArgs
          return! (match result with
                      | VerifyOrderEacStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | VerifyOrderEacStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | VerifyOrderEacStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | VerifyOrderEacStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | VerifyOrderEacStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | VerifyOrderEacStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | VerifyOrderEacStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

