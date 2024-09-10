namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module GenerateGoodsRealizationReportRequest =

  //#region GenerateGoodsRealizationReportRequest

  [<CLIMutable>]
  type GenerateGoodsRealizationReportRequest = {
    [<JsonProperty(PropertyName = "campaignId")>]
    CampaignId : int64;
    [<JsonProperty(PropertyName = "year")>]
    Year : int;
    [<JsonProperty(PropertyName = "month")>]
    Month : int;
  }

  //#endregion
