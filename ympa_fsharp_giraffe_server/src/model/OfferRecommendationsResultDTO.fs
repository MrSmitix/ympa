namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OfferRecommendationDTO
open ympa_fsharp_giraffe_server.Model.ScrollingPagerDTO

module OfferRecommendationsResultDTO =

  //#region OfferRecommendationsResultDTO


  type OfferRecommendationsResultDTO = {
    Paging : ScrollingPagerDTO;
    OfferRecommendations : OfferRecommendationDTO[];
  }
  //#endregion
