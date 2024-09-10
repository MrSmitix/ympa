namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.CampaignQualityRatingDTO

module CampaignsQualityRatingDTO =

  //#region CampaignsQualityRatingDTO


  type CampaignsQualityRatingDTO = {
    CampaignRatings : CampaignQualityRatingDTO[];
  }
  //#endregion
