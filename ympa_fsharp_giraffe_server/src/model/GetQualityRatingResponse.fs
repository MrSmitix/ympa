namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.CampaignsQualityRatingDTO

module GetQualityRatingResponse =

  //#region GetQualityRatingResponse


  type GetQualityRatingResponse = {
    Status : ApiResponseStatusType;
    Result : CampaignsQualityRatingDTO;
  }
  //#endregion
