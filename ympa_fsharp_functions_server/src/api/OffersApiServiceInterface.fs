namespace ympa_fsharp_functions_server
open OffersApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module OffersApiServiceInterface =

    //#region Service interface
    type IOffersApiService =
      abstract member DeleteCampaignOffers : DeleteCampaignOffersBodyParams -> DeleteCampaignOffersResult
      abstract member GetAllOffers : unit -> GetAllOffersResult
      abstract member GetCampaignOffers : GetCampaignOffersBodyParams -> GetCampaignOffersResult
      abstract member GetOfferRecommendations : GetOfferRecommendationsBodyParams -> GetOfferRecommendationsResult
      abstract member GetOffers : unit -> GetOffersResult
      abstract member UpdateCampaignOffers : UpdateCampaignOffersBodyParams -> UpdateCampaignOffersResult
    //#endregion