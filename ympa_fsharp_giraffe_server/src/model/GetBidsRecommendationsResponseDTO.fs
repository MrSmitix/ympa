namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.SkuBidRecommendationItemDTO

module GetBidsRecommendationsResponseDTO =

  //#region GetBidsRecommendationsResponseDTO


  type GetBidsRecommendationsResponseDTO = {
    Recommendations : SkuBidRecommendationItemDTO[];
  }
  //#endregion
