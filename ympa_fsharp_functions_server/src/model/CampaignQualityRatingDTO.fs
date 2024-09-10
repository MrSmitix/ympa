namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.QualityRatingDTO

module CampaignQualityRatingDTO =

  //#region CampaignQualityRatingDTO

  [<CLIMutable>]
  type CampaignQualityRatingDTO = {
    [<JsonProperty(PropertyName = "campaignId")>]
    CampaignId : int64;
    [<JsonProperty(PropertyName = "ratings")>]
    Ratings : QualityRatingDTO[];
  }

  //#endregion
