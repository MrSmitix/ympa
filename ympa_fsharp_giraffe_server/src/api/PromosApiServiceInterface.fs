namespace ympa_fsharp_giraffe_server
open PromosApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module PromosApiServiceInterface =

    //#region Service interface
    type IPromosApiService =
      abstract member DeletePromoOffers:HttpContext -> DeletePromoOffersArgs->DeletePromoOffersResult
      abstract member GetPromoOffers:HttpContext -> GetPromoOffersArgs->GetPromoOffersResult
      abstract member GetPromos:HttpContext -> GetPromosArgs->GetPromosResult
      abstract member UpdatePromoOffers:HttpContext -> UpdatePromoOffersArgs->UpdatePromoOffersResult
    //#endregion