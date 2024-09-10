namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ParcelBoxDTO

module ShipmentBoxesDTO =

  //#region ShipmentBoxesDTO

  [<CLIMutable>]
  type ShipmentBoxesDTO = {
    [<JsonProperty(PropertyName = "boxes")>]
    Boxes : ParcelBoxDTO[];
  }

  //#endregion
