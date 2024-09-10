namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.Set
open ympa_fsharp_giraffe_server.Model.ShipmentActionType
open ympa_fsharp_giraffe_server.Model.ShipmentStatusChangeDTO

module ExtensionShipmentDTO =

  //#region ExtensionShipmentDTO


  type ExtensionShipmentDTO = {
    CurrentStatus : ShipmentStatusChangeDTO;
    AvailableActions : ShipmentActionType[];
  }
  //#endregion
