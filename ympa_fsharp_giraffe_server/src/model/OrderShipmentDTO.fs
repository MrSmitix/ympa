namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OrderParcelBoxDTO
open ympa_fsharp_giraffe_server.Model.OrderTrackDTO

module OrderShipmentDTO =

  //#region OrderShipmentDTO


  type OrderShipmentDTO = {
    Id : int64;
    ShipmentDate : string;
    ShipmentTime : string;
    Tracks : OrderTrackDTO[];
    Boxes : OrderParcelBoxDTO[];
  }
  //#endregion
