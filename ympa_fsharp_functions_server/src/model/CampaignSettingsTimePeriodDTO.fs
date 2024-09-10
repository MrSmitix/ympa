namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CampaignSettingsTimePeriodDTO =

  //#region CampaignSettingsTimePeriodDTO

  [<CLIMutable>]
  type CampaignSettingsTimePeriodDTO = {
    [<JsonProperty(PropertyName = "fromDate")>]
    FromDate : string;
    [<JsonProperty(PropertyName = "toDate")>]
    ToDate : string;
  }

  //#endregion
