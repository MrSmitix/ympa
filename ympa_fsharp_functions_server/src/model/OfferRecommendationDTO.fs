namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OfferForRecommendationDTO
open ympa_fsharp_functions_server.Model.OfferRecommendationInfoDTO

module OfferRecommendationDTO =

  //#region OfferRecommendationDTO

  [<CLIMutable>]
  type OfferRecommendationDTO = {
    [<JsonProperty(PropertyName = "offer")>]
    Offer : OfferForRecommendationDTO;
    [<JsonProperty(PropertyName = "recommendation")>]
    Recommendation : OfferRecommendationInfoDTO;
  }

  //#endregion
