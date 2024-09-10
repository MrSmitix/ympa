namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PriceRecommendationItemDTO =

  //#region PriceRecommendationItemDTO

  [<CLIMutable>]
  type PriceRecommendationItemDTO = {
    [<JsonProperty(PropertyName = "campaignId")>]
    CampaignId : int64;
    [<JsonProperty(PropertyName = "price")>]
    Price : decimal;
  }

  //#endregion
