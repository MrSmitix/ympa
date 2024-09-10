namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module GenerateGoodsMovementReportRequest =

  //#region GenerateGoodsMovementReportRequest

  [<CLIMutable>]
  type GenerateGoodsMovementReportRequest = {
    [<JsonProperty(PropertyName = "campaignId")>]
    CampaignId : int64;
    [<JsonProperty(PropertyName = "dateFrom")>]
    DateFrom : DateTime;
    [<JsonProperty(PropertyName = "dateTo")>]
    DateTo : DateTime;
    [<JsonProperty(PropertyName = "shopSku")>]
    ShopSku : string;
  }

  //#endregion
