namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.Set

module GetQualityRatingRequest =

  //#region GetQualityRatingRequest

  [<CLIMutable>]
  type GetQualityRatingRequest = {
    [<JsonProperty(PropertyName = "dateFrom")>]
    DateFrom : DateTime;
    [<JsonProperty(PropertyName = "dateTo")>]
    DateTo : DateTime;
    [<JsonProperty(PropertyName = "campaignIds")>]
    CampaignIds : int64[];
  }

  //#endregion
