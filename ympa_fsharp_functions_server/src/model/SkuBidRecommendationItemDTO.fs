namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.BidRecommendationItemDTO
open ympa_fsharp_functions_server.Model.PriceRecommendationItemDTO

module SkuBidRecommendationItemDTO =

  //#region SkuBidRecommendationItemDTO

  [<CLIMutable>]
  type SkuBidRecommendationItemDTO = {
    [<JsonProperty(PropertyName = "sku")>]
    Sku : string;
    [<JsonProperty(PropertyName = "bid")>]
    Bid : int;
    [<JsonProperty(PropertyName = "bidRecommendations")>]
    BidRecommendations : BidRecommendationItemDTO[];
    [<JsonProperty(PropertyName = "priceRecommendations")>]
    PriceRecommendations : PriceRecommendationItemDTO[];
  }

  //#endregion
