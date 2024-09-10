namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module GetCampaignLoginsResponse =

  //#region GetCampaignLoginsResponse

  [<CLIMutable>]
  type GetCampaignLoginsResponse = {
    [<JsonProperty(PropertyName = "logins")>]
    Logins : string[];
  }

  //#endregion
