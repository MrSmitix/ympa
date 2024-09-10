namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module GenerateGoodsTurnoverRequest =

  //#region GenerateGoodsTurnoverRequest

  [<CLIMutable>]
  type GenerateGoodsTurnoverRequest = {
    [<JsonProperty(PropertyName = "campaignId")>]
    CampaignId : int64;
    [<JsonProperty(PropertyName = "date")>]
    Date : DateTime;
  }

  //#endregion
