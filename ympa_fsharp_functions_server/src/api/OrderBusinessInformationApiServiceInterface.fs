namespace ympa_fsharp_functions_server
open OrderBusinessInformationApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module OrderBusinessInformationApiServiceInterface =

    //#region Service interface
    type IOrderBusinessInformationApiService =
      abstract member GetOrderBusinessBuyerInfo : unit -> GetOrderBusinessBuyerInfoResult
      abstract member GetOrderBusinessDocumentsInfo : unit -> GetOrderBusinessDocumentsInfoResult
    //#endregion