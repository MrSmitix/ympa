namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ForwardScrollingPagerDTO
open ympa_fsharp_functions_server.Model.RegionDTO

module GetRegionsResponse =

  //#region GetRegionsResponse

  [<CLIMutable>]
  type GetRegionsResponse = {
    [<JsonProperty(PropertyName = "regions")>]
    Regions : RegionDTO[];
    [<JsonProperty(PropertyName = "paging")>]
    Paging : ForwardScrollingPagerDTO;
  }

  //#endregion
