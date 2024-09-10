namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OfferForRecommendationDTO
open ympa_fsharp_giraffe_server.Model.OfferRecommendationInfoDTO

module OfferRecommendationDTO =

  //#region OfferRecommendationDTO


  type OfferRecommendationDTO = {
    Offer : OfferForRecommendationDTO;
    Recommendation : OfferRecommendationInfoDTO;
  }
  //#endregion
