namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.Set

module GetQualityRatingRequest =

  //#region GetQualityRatingRequest


  type GetQualityRatingRequest = {
    DateFrom : DateTime;
    DateTo : DateTime;
    CampaignIds : int64[];
  }
  //#endregion
