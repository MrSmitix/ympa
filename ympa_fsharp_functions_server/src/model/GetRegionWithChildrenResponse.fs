namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.FlippingPagerDTO
open ympa_fsharp_functions_server.Model.RegionDTO

module GetRegionWithChildrenResponse =

  //#region GetRegionWithChildrenResponse

  [<CLIMutable>]
  type GetRegionWithChildrenResponse = {
    [<JsonProperty(PropertyName = "pager")>]
    Pager : FlippingPagerDTO;
    [<JsonProperty(PropertyName = "regions")>]
    Regions : RegionDTO;
  }

  //#endregion
