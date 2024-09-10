namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.CampaignQualityRatingDTO

module CampaignsQualityRatingDTO =

  //#region CampaignsQualityRatingDTO

  [<CLIMutable>]
  type CampaignsQualityRatingDTO = {
    [<JsonProperty(PropertyName = "campaignRatings")>]
    CampaignRatings : CampaignQualityRatingDTO[];
  }

  //#endregion
