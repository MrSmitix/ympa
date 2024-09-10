namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.BasePriceDTO
open ympa_fsharp_giraffe_server.Model.PriceCompetitivenessThresholdsDTO

module OfferRecommendationInfoDTO =

  //#region OfferRecommendationInfoDTO


  type OfferRecommendationInfoDTO = {
    OfferId : string;
    RecommendedCofinancePrice : BasePriceDTO;
    CompetitivenessThresholds : PriceCompetitivenessThresholdsDTO;
  }
  //#endregion
