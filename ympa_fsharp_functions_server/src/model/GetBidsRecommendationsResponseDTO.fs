namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.SkuBidRecommendationItemDTO

module GetBidsRecommendationsResponseDTO =

  //#region GetBidsRecommendationsResponseDTO

  [<CLIMutable>]
  type GetBidsRecommendationsResponseDTO = {
    [<JsonProperty(PropertyName = "recommendations")>]
    Recommendations : SkuBidRecommendationItemDTO[];
  }

  //#endregion
