namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OrderBoxLayoutDTO

module SetOrderBoxLayoutRequest =

  //#region SetOrderBoxLayoutRequest

  [<CLIMutable>]
  type SetOrderBoxLayoutRequest = {
    [<JsonProperty(PropertyName = "boxes")>]
    Boxes : OrderBoxLayoutDTO[];
    [<JsonProperty(PropertyName = "allowRemove")>]
    AllowRemove : bool;
  }

  //#endregion
