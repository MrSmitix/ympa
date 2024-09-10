namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.CampaignSettingsDTO

module GetCampaignSettingsResponse =

  //#region GetCampaignSettingsResponse

  [<CLIMutable>]
  type GetCampaignSettingsResponse = {
    [<JsonProperty(PropertyName = "settings")>]
    Settings : CampaignSettingsDTO;
  }

  //#endregion
