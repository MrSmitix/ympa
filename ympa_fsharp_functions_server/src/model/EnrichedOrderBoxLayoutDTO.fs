namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OrderBoxLayoutItemDTO

module EnrichedOrderBoxLayoutDTO =

  //#region EnrichedOrderBoxLayoutDTO

  [<CLIMutable>]
  type EnrichedOrderBoxLayoutDTO = {
    [<JsonProperty(PropertyName = "items")>]
    Items : OrderBoxLayoutItemDTO[];
    [<JsonProperty(PropertyName = "boxId")>]
    BoxId : int64;
  }

  //#endregion
