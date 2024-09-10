namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.BidRecommendationItemDTO
open ympa_fsharp_giraffe_server.Model.PriceRecommendationItemDTO

module SkuBidRecommendationItemDTO =

  //#region SkuBidRecommendationItemDTO


  type SkuBidRecommendationItemDTO = {
    Sku : string;
    Bid : int;
    BidRecommendations : BidRecommendationItemDTO[];
    PriceRecommendations : PriceRecommendationItemDTO[];
  }
  //#endregion
