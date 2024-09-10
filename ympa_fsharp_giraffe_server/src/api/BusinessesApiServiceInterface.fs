namespace ympa_fsharp_giraffe_server
open BusinessesApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module BusinessesApiServiceInterface =

    //#region Service interface
    type IBusinessesApiService =
      abstract member GetBusinessSettings:HttpContext -> GetBusinessSettingsArgs->GetBusinessSettingsResult
    //#endregion