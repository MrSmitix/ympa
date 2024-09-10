namespace ympa_fsharp_functions_server
open OrderDeliveryApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module OrderDeliveryApiServiceInterface =

    //#region Service interface
    type IOrderDeliveryApiService =
      abstract member GetOrderBuyerInfo : unit -> GetOrderBuyerInfoResult
      abstract member SetOrderDeliveryDate : SetOrderDeliveryDateBodyParams -> SetOrderDeliveryDateResult
      abstract member SetOrderDeliveryTrackCode : SetOrderDeliveryTrackCodeBodyParams -> SetOrderDeliveryTrackCodeResult
      abstract member UpdateOrderStorageLimit : UpdateOrderStorageLimitBodyParams -> UpdateOrderStorageLimitResult
      abstract member VerifyOrderEac : VerifyOrderEacBodyParams -> VerifyOrderEacResult
    //#endregion