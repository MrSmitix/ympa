namespace ympa_fsharp_functions_server
open OrdersApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module OrdersApiServiceInterface =

    //#region Service interface
    type IOrdersApiService =
      abstract member AcceptOrderCancellation : AcceptOrderCancellationBodyParams -> AcceptOrderCancellationResult
      abstract member GetOrder : unit -> GetOrderResult
      abstract member GetOrders : unit -> GetOrdersResult
      abstract member ProvideOrderDigitalCodes : ProvideOrderDigitalCodesBodyParams -> ProvideOrderDigitalCodesResult
      abstract member ProvideOrderItemIdentifiers : ProvideOrderItemIdentifiersBodyParams -> ProvideOrderItemIdentifiersResult
      abstract member SetOrderBoxLayout : SetOrderBoxLayoutBodyParams -> SetOrderBoxLayoutResult
      abstract member SetOrderShipmentBoxes : SetOrderShipmentBoxesBodyParams -> SetOrderShipmentBoxesResult
      abstract member UpdateOrderItems : UpdateOrderItemsBodyParams -> UpdateOrderItemsResult
      abstract member UpdateOrderStatus : UpdateOrderStatusBodyParams -> UpdateOrderStatusResult
      abstract member UpdateOrderStatuses : UpdateOrderStatusesBodyParams -> UpdateOrderStatusesResult
    //#endregion