namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ShowsSalesGroupingType

module GenerateShowsSalesReportRequest =

  //#region GenerateShowsSalesReportRequest

  [<CLIMutable>]
  type GenerateShowsSalesReportRequest = {
    [<JsonProperty(PropertyName = "businessId")>]
    BusinessId : int64;
    [<JsonProperty(PropertyName = "campaignId")>]
    CampaignId : int64;
    [<JsonProperty(PropertyName = "dateFrom")>]
    DateFrom : DateTime;
    [<JsonProperty(PropertyName = "dateTo")>]
    DateTo : DateTime;
    [<JsonProperty(PropertyName = "grouping")>]
    Grouping : ShowsSalesGroupingType;
  }

  //#endregion
