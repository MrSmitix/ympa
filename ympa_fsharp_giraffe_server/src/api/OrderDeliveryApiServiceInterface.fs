namespace ympa_fsharp_giraffe_server
open OrderDeliveryApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module OrderDeliveryApiServiceInterface =

    //#region Service interface
    type IOrderDeliveryApiService =
      abstract member GetOrderBuyerInfo:HttpContext -> GetOrderBuyerInfoArgs->GetOrderBuyerInfoResult
      abstract member SetOrderDeliveryDate:HttpContext -> SetOrderDeliveryDateArgs->SetOrderDeliveryDateResult
      abstract member SetOrderDeliveryTrackCode:HttpContext -> SetOrderDeliveryTrackCodeArgs->SetOrderDeliveryTrackCodeResult
      abstract member UpdateOrderStorageLimit:HttpContext -> UpdateOrderStorageLimitArgs->UpdateOrderStorageLimitResult
      abstract member VerifyOrderEac:HttpContext -> VerifyOrderEacArgs->VerifyOrderEacResult
    //#endregion