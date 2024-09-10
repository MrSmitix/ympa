namespace ympa_fsharp_giraffe_server
open HiddenOffersApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module HiddenOffersApiServiceInterface =

    //#region Service interface
    type IHiddenOffersApiService =
      abstract member AddHiddenOffers:HttpContext -> AddHiddenOffersArgs->AddHiddenOffersResult
      abstract member DeleteHiddenOffers:HttpContext -> DeleteHiddenOffersArgs->DeleteHiddenOffersResult
      abstract member GetHiddenOffers:HttpContext -> GetHiddenOffersArgs->GetHiddenOffersResult
    //#endregion