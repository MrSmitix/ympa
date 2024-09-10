namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OrderParcelBoxDTO
open ympa_fsharp_functions_server.Model.OrderTrackDTO

module OrderShipmentDTO =

  //#region OrderShipmentDTO

  [<CLIMutable>]
  type OrderShipmentDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "shipmentDate")>]
    ShipmentDate : string;
    [<JsonProperty(PropertyName = "shipmentTime")>]
    ShipmentTime : string;
    [<JsonProperty(PropertyName = "tracks")>]
    Tracks : OrderTrackDTO[];
    [<JsonProperty(PropertyName = "boxes")>]
    Boxes : OrderParcelBoxDTO[];
  }

  //#endregion
