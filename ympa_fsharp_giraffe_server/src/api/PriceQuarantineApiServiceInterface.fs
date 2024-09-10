namespace ympa_fsharp_giraffe_server
open PriceQuarantineApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module PriceQuarantineApiServiceInterface =

    //#region Service interface
    type IPriceQuarantineApiService =
      abstract member ConfirmBusinessPrices:HttpContext -> ConfirmBusinessPricesArgs->ConfirmBusinessPricesResult
      abstract member ConfirmCampaignPrices:HttpContext -> ConfirmCampaignPricesArgs->ConfirmCampaignPricesResult
      abstract member GetBusinessQuarantineOffers:HttpContext -> GetBusinessQuarantineOffersArgs->GetBusinessQuarantineOffersResult
      abstract member GetCampaignQuarantineOffers:HttpContext -> GetCampaignQuarantineOffersArgs->GetCampaignQuarantineOffersResult
    //#endregion