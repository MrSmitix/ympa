namespace ympa_fsharp_giraffe_server
open OffersApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module OffersApiServiceInterface =

    //#region Service interface
    type IOffersApiService =
      abstract member DeleteCampaignOffers:HttpContext -> DeleteCampaignOffersArgs->DeleteCampaignOffersResult
      abstract member GetAllOffers:HttpContext -> GetAllOffersArgs->GetAllOffersResult
      abstract member GetCampaignOffers:HttpContext -> GetCampaignOffersArgs->GetCampaignOffersResult
      abstract member GetOfferRecommendations:HttpContext -> GetOfferRecommendationsArgs->GetOfferRecommendationsResult
      abstract member GetOffers:HttpContext -> GetOffersArgs->GetOffersResult
      abstract member UpdateCampaignOffers:HttpContext -> UpdateCampaignOffersArgs->UpdateCampaignOffersResult
    //#endregion