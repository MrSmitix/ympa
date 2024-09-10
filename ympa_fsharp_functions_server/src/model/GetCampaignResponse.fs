namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.CampaignDTO

module GetCampaignResponse =

  //#region GetCampaignResponse

  [<CLIMutable>]
  type GetCampaignResponse = {
    [<JsonProperty(PropertyName = "campaign")>]
    Campaign : CampaignDTO;
  }

  //#endregion
