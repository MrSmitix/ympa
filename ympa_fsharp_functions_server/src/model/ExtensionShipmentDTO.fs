namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.Set
open ympa_fsharp_functions_server.Model.ShipmentActionType
open ympa_fsharp_functions_server.Model.ShipmentStatusChangeDTO

module ExtensionShipmentDTO =

  //#region ExtensionShipmentDTO

  [<CLIMutable>]
  type ExtensionShipmentDTO = {
    [<JsonProperty(PropertyName = "currentStatus")>]
    CurrentStatus : ShipmentStatusChangeDTO;
    [<JsonProperty(PropertyName = "availableActions")>]
    AvailableActions : ShipmentActionType[];
  }

  //#endregion
