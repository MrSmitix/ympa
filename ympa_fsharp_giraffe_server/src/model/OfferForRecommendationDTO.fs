namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.BasePriceDTO
open ympa_fsharp_giraffe_server.Model.GetPriceDTO
open ympa_fsharp_giraffe_server.Model.PriceCompetitivenessType

module OfferForRecommendationDTO =

  //#region OfferForRecommendationDTO


  type OfferForRecommendationDTO = {
    OfferId : string;
    Price : BasePriceDTO;
    CofinancePrice : GetPriceDTO;
    Competitiveness : PriceCompetitivenessType;
    Shows : int64;
  }
  //#endregion
