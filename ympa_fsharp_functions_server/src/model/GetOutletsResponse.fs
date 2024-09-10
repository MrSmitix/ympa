namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.FlippingPagerDTO
open ympa_fsharp_functions_server.Model.FullOutletDTO
open ympa_fsharp_functions_server.Model.ScrollingPagerDTO

module GetOutletsResponse =

  //#region GetOutletsResponse

  [<CLIMutable>]
  type GetOutletsResponse = {
    [<JsonProperty(PropertyName = "outlets")>]
    Outlets : FullOutletDTO[];
    [<JsonProperty(PropertyName = "paging")>]
    Paging : ScrollingPagerDTO;
    [<JsonProperty(PropertyName = "pager")>]
    Pager : FlippingPagerDTO;
  }

  //#endregion
