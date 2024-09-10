namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.QualityRatingDTO

module CampaignQualityRatingDTO =

  //#region CampaignQualityRatingDTO


  type CampaignQualityRatingDTO = {
    CampaignId : int64;
    Ratings : QualityRatingDTO[];
  }
  //#endregion
