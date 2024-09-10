namespace ympa_fsharp_functions_server
open PriceQuarantineApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module PriceQuarantineApiServiceInterface =

    //#region Service interface
    type IPriceQuarantineApiService =
      abstract member ConfirmBusinessPrices : ConfirmBusinessPricesBodyParams -> ConfirmBusinessPricesResult
      abstract member ConfirmCampaignPrices : ConfirmCampaignPricesBodyParams -> ConfirmCampaignPricesResult
      abstract member GetBusinessQuarantineOffers : GetBusinessQuarantineOffersBodyParams -> GetBusinessQuarantineOffersResult
      abstract member GetCampaignQuarantineOffers : GetCampaignQuarantineOffersBodyParams -> GetCampaignQuarantineOffersResult
    //#endregion