namespace ympa_fsharp_functions_server
open DeliveryServicesApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module DeliveryServicesApiServiceInterface =

    //#region Service interface
    type IDeliveryServicesApiService =
      abstract member GetDeliveryServices : unit -> GetDeliveryServicesResult
    //#endregion