namespace ympa_fsharp_giraffe_server
open OrdersApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module OrdersApiServiceInterface =

    //#region Service interface
    type IOrdersApiService =
      abstract member AcceptOrderCancellation:HttpContext -> AcceptOrderCancellationArgs->AcceptOrderCancellationResult
      abstract member GetOrder:HttpContext -> GetOrderArgs->GetOrderResult
      abstract member GetOrders:HttpContext -> GetOrdersArgs->GetOrdersResult
      abstract member ProvideOrderDigitalCodes:HttpContext -> ProvideOrderDigitalCodesArgs->ProvideOrderDigitalCodesResult
      abstract member ProvideOrderItemIdentifiers:HttpContext -> ProvideOrderItemIdentifiersArgs->ProvideOrderItemIdentifiersResult
      abstract member SetOrderBoxLayout:HttpContext -> SetOrderBoxLayoutArgs->SetOrderBoxLayoutResult
      abstract member SetOrderShipmentBoxes:HttpContext -> SetOrderShipmentBoxesArgs->SetOrderShipmentBoxesResult
      abstract member UpdateOrderItems:HttpContext -> UpdateOrderItemsArgs->UpdateOrderItemsResult
      abstract member UpdateOrderStatus:HttpContext -> UpdateOrderStatusArgs->UpdateOrderStatusResult
      abstract member UpdateOrderStatuses:HttpContext -> UpdateOrderStatusesArgs->UpdateOrderStatusesResult
    //#endregion