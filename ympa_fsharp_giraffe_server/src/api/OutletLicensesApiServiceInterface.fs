namespace ympa_fsharp_giraffe_server
open OutletLicensesApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module OutletLicensesApiServiceInterface =

    //#region Service interface
    type IOutletLicensesApiService =
      abstract member DeleteOutletLicenses:HttpContext -> DeleteOutletLicensesArgs->DeleteOutletLicensesResult
      abstract member GetOutletLicenses:HttpContext -> GetOutletLicensesArgs->GetOutletLicensesResult
      abstract member UpdateOutletLicenses:HttpContext -> UpdateOutletLicensesArgs->UpdateOutletLicensesResult
    //#endregion