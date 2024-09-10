namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module PriceRecommendationItemDTO =

  //#region PriceRecommendationItemDTO


  type PriceRecommendationItemDTO = {
    CampaignId : int64;
    Price : decimal;
  }
  //#endregion
