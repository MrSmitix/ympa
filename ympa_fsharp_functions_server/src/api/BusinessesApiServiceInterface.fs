namespace ympa_fsharp_functions_server
open BusinessesApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module BusinessesApiServiceInterface =

    //#region Service interface
    type IBusinessesApiService =
      abstract member GetBusinessSettings : unit -> GetBusinessSettingsResult
    //#endregion