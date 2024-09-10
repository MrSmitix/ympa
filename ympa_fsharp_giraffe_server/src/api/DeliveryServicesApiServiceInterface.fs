namespace ympa_fsharp_giraffe_server
open DeliveryServicesApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module DeliveryServicesApiServiceInterface =

    //#region Service interface
    type IDeliveryServicesApiService =
      abstract member GetDeliveryServices:HttpContext ->GetDeliveryServicesResult
    //#endregion