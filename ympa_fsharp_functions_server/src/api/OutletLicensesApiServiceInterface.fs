namespace ympa_fsharp_functions_server
open OutletLicensesApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module OutletLicensesApiServiceInterface =

    //#region Service interface
    type IOutletLicensesApiService =
      abstract member DeleteOutletLicenses : unit -> DeleteOutletLicensesResult
      abstract member GetOutletLicenses : unit -> GetOutletLicensesResult
      abstract member UpdateOutletLicenses : UpdateOutletLicensesBodyParams -> UpdateOutletLicensesResult
    //#endregion