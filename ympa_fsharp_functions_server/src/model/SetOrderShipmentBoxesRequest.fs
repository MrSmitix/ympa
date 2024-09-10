namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ParcelBoxDTO

module SetOrderShipmentBoxesRequest =

  //#region SetOrderShipmentBoxesRequest

  [<CLIMutable>]
  type SetOrderShipmentBoxesRequest = {
    [<JsonProperty(PropertyName = "boxes")>]
    Boxes : ParcelBoxDTO[];
  }

  //#endregion
