namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.CampaignDTO
open ympa_fsharp_functions_server.Model.FlippingPagerDTO

module GetCampaignsResponse =

  //#region GetCampaignsResponse

  [<CLIMutable>]
  type GetCampaignsResponse = {
    [<JsonProperty(PropertyName = "campaigns")>]
    Campaigns : CampaignDTO[];
    [<JsonProperty(PropertyName = "pager")>]
    Pager : FlippingPagerDTO;
  }

  //#endregion
