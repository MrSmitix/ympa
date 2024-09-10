namespace ympa_fsharp_functions_server
open HiddenOffersApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module HiddenOffersApiServiceInterface =

    //#region Service interface
    type IHiddenOffersApiService =
      abstract member AddHiddenOffers : AddHiddenOffersBodyParams -> AddHiddenOffersResult
      abstract member DeleteHiddenOffers : DeleteHiddenOffersBodyParams -> DeleteHiddenOffersResult
      abstract member GetHiddenOffers : unit -> GetHiddenOffersResult
    //#endregion