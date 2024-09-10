namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OfferRecommendationDTO
open ympa_fsharp_functions_server.Model.ScrollingPagerDTO

module OfferRecommendationsResultDTO =

  //#region OfferRecommendationsResultDTO

  [<CLIMutable>]
  type OfferRecommendationsResultDTO = {
    [<JsonProperty(PropertyName = "paging")>]
    Paging : ScrollingPagerDTO;
    [<JsonProperty(PropertyName = "offerRecommendations")>]
    OfferRecommendations : OfferRecommendationDTO[];
  }

  //#endregion
