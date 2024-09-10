namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.RegionDTO

module GetCampaignRegionResponse =

  //#region GetCampaignRegionResponse

  [<CLIMutable>]
  type GetCampaignRegionResponse = {
    [<JsonProperty(PropertyName = "region")>]
    Region : RegionDTO;
  }

  //#endregion
