namespace ympa_fsharp_giraffe_server
open OrderBusinessInformationApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module OrderBusinessInformationApiServiceInterface =

    //#region Service interface
    type IOrderBusinessInformationApiService =
      abstract member GetOrderBusinessBuyerInfo:HttpContext -> GetOrderBusinessBuyerInfoArgs->GetOrderBusinessBuyerInfoResult
      abstract member GetOrderBusinessDocumentsInfo:HttpContext -> GetOrderBusinessDocumentsInfoArgs->GetOrderBusinessDocumentsInfoResult
    //#endregion