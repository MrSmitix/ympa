namespace ympa_fsharp_giraffe_server

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open OrdersApiHandlerParams
open OrdersApiServiceInterface
open OrdersApiServiceImplementation
open ympa_fsharp_giraffe_server.Model.AcceptOrderCancellationRequest
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.EmptyApiResponse
open ympa_fsharp_giraffe_server.Model.GetOrderResponse
open ympa_fsharp_giraffe_server.Model.GetOrdersResponse
open ympa_fsharp_giraffe_server.Model.OrderBuyerType
open ympa_fsharp_giraffe_server.Model.OrderDeliveryDispatchType
open ympa_fsharp_giraffe_server.Model.OrderStatusType
open ympa_fsharp_giraffe_server.Model.OrderSubstatusType
open ympa_fsharp_giraffe_server.Model.ProvideOrderDigitalCodesRequest
open ympa_fsharp_giraffe_server.Model.ProvideOrderItemIdentifiersRequest
open ympa_fsharp_giraffe_server.Model.ProvideOrderItemIdentifiersResponse
open ympa_fsharp_giraffe_server.Model.Set
open ympa_fsharp_giraffe_server.Model.SetOrderBoxLayoutRequest
open ympa_fsharp_giraffe_server.Model.SetOrderBoxLayoutResponse
open ympa_fsharp_giraffe_server.Model.SetOrderShipmentBoxesRequest
open ympa_fsharp_giraffe_server.Model.SetOrderShipmentBoxesResponse
open ympa_fsharp_giraffe_server.Model.UpdateOrderItemRequest
open ympa_fsharp_giraffe_server.Model.UpdateOrderStatusRequest
open ympa_fsharp_giraffe_server.Model.UpdateOrderStatusResponse
open ympa_fsharp_giraffe_server.Model.UpdateOrderStatusesRequest
open ympa_fsharp_giraffe_server.Model.UpdateOrderStatusesResponse

module OrdersApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region AcceptOrderCancellation
    /// <summary>
    /// Отмена заказа покупателем
    /// </summary>

    let AcceptOrderCancellation (pathParams:AcceptOrderCancellationPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<AcceptOrderCancellationBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : AcceptOrderCancellationArgs
          let result = OrdersApiService.AcceptOrderCancellation ctx serviceArgs
          return! (match result with
                      | AcceptOrderCancellationStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AcceptOrderCancellationStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AcceptOrderCancellationStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AcceptOrderCancellationStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AcceptOrderCancellationStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AcceptOrderCancellationStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | AcceptOrderCancellationStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetOrder
    /// <summary>
    /// Информация об одном заказе
    /// </summary>

    let GetOrder (pathParams:GetOrderPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetOrderArgs
          let result = OrdersApiService.GetOrder ctx serviceArgs
          return! (match result with
                      | GetOrderStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetOrderStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetOrderStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetOrderStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetOrderStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetOrderStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetOrderStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetOrders
    /// <summary>
    /// Информация о нескольких заказах
    /// </summary>

    let GetOrders (pathParams:GetOrdersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetOrdersQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : GetOrdersArgs
          let result = OrdersApiService.GetOrders ctx serviceArgs
          return! (match result with
                      | GetOrdersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetOrdersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetOrdersStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetOrdersStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetOrdersStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetOrdersStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetOrdersStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ProvideOrderDigitalCodes
    /// <summary>
    /// Передача ключей цифровых товаров
    /// </summary>

    let ProvideOrderDigitalCodes (pathParams:ProvideOrderDigitalCodesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<ProvideOrderDigitalCodesBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : ProvideOrderDigitalCodesArgs
          let result = OrdersApiService.ProvideOrderDigitalCodes ctx serviceArgs
          return! (match result with
                      | ProvideOrderDigitalCodesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ProvideOrderDigitalCodesStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | ProvideOrderDigitalCodesStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | ProvideOrderDigitalCodesStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | ProvideOrderDigitalCodesStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | ProvideOrderDigitalCodesStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | ProvideOrderDigitalCodesStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ProvideOrderItemIdentifiers
    /// <summary>
    /// Передача кодов маркировки единиц товара
    /// </summary>

    let ProvideOrderItemIdentifiers (pathParams:ProvideOrderItemIdentifiersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<ProvideOrderItemIdentifiersBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : ProvideOrderItemIdentifiersArgs
          let result = OrdersApiService.ProvideOrderItemIdentifiers ctx serviceArgs
          return! (match result with
                      | ProvideOrderItemIdentifiersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ProvideOrderItemIdentifiersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | ProvideOrderItemIdentifiersStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | ProvideOrderItemIdentifiersStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | ProvideOrderItemIdentifiersStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | ProvideOrderItemIdentifiersStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | ProvideOrderItemIdentifiersStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SetOrderBoxLayout
    /// <summary>
    /// Подготовка заказа
    /// </summary>

    let SetOrderBoxLayout (pathParams:SetOrderBoxLayoutPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<SetOrderBoxLayoutBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : SetOrderBoxLayoutArgs
          let result = OrdersApiService.SetOrderBoxLayout ctx serviceArgs
          return! (match result with
                      | SetOrderBoxLayoutStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SetOrderBoxLayoutStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | SetOrderBoxLayoutStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | SetOrderBoxLayoutStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | SetOrderBoxLayoutStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | SetOrderBoxLayoutStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | SetOrderBoxLayoutStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SetOrderShipmentBoxes
    /// <summary>
    /// Передача количества грузовых мест в заказе
    /// </summary>

    let SetOrderShipmentBoxes (pathParams:SetOrderShipmentBoxesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<SetOrderShipmentBoxesBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : SetOrderShipmentBoxesArgs
          let result = OrdersApiService.SetOrderShipmentBoxes ctx serviceArgs
          return! (match result with
                      | SetOrderShipmentBoxesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SetOrderShipmentBoxesStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | SetOrderShipmentBoxesStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | SetOrderShipmentBoxesStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | SetOrderShipmentBoxesStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | SetOrderShipmentBoxesStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | SetOrderShipmentBoxesStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateOrderItems
    /// <summary>
    /// Удаление товара из заказа или уменьшение числа единиц
    /// </summary>

    let UpdateOrderItems (pathParams:UpdateOrderItemsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<UpdateOrderItemsBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : UpdateOrderItemsArgs
          let result = OrdersApiService.UpdateOrderItems ctx serviceArgs
          return! (match result with
                      | UpdateOrderItemsStatusCode200 resolved ->
                            setStatusCode 200 >=> text resolved.content
                      | UpdateOrderItemsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | UpdateOrderItemsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | UpdateOrderItemsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | UpdateOrderItemsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | UpdateOrderItemsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | UpdateOrderItemsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateOrderStatus
    /// <summary>
    /// Изменение статуса одного заказа
    /// </summary>

    let UpdateOrderStatus (pathParams:UpdateOrderStatusPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<UpdateOrderStatusBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : UpdateOrderStatusArgs
          let result = OrdersApiService.UpdateOrderStatus ctx serviceArgs
          return! (match result with
                      | UpdateOrderStatusStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UpdateOrderStatusStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | UpdateOrderStatusStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | UpdateOrderStatusStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | UpdateOrderStatusStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | UpdateOrderStatusStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | UpdateOrderStatusStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateOrderStatuses
    /// <summary>
    /// Изменение статусов нескольких заказов
    /// </summary>

    let UpdateOrderStatuses (pathParams:UpdateOrderStatusesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<UpdateOrderStatusesBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : UpdateOrderStatusesArgs
          let result = OrdersApiService.UpdateOrderStatuses ctx serviceArgs
          return! (match result with
                      | UpdateOrderStatusesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UpdateOrderStatusesStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | UpdateOrderStatusesStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | UpdateOrderStatusesStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | UpdateOrderStatusesStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | UpdateOrderStatusesStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | UpdateOrderStatusesStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

