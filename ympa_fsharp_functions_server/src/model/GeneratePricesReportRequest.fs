namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module GeneratePricesReportRequest =

  //#region GeneratePricesReportRequest

  [<CLIMutable>]
  type GeneratePricesReportRequest = {
    [<JsonProperty(PropertyName = "businessId")>]
    BusinessId : int64;
    [<JsonProperty(PropertyName = "campaignId")>]
    CampaignId : int64;
    [<JsonProperty(PropertyName = "categoryIds")>]
    CategoryIds : int64[];
    [<JsonProperty(PropertyName = "creationDateFrom")>]
    CreationDateFrom : DateTime;
    [<JsonProperty(PropertyName = "creationDateTo")>]
    CreationDateTo : DateTime;
  }

  //#endregion
