namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ForwardScrollingPagerDTO
open ympa_fsharp_functions_server.Model.ReturnDTO

module PagedReturnsDTO =

  //#region PagedReturnsDTO

  [<CLIMutable>]
  type PagedReturnsDTO = {
    [<JsonProperty(PropertyName = "paging")>]
    Paging : ForwardScrollingPagerDTO;
    [<JsonProperty(PropertyName = "returns")>]
    Returns : ReturnDTO[];
  }

  //#endregion
