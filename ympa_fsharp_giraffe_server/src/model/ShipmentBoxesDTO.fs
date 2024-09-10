namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ParcelBoxDTO

module ShipmentBoxesDTO =

  //#region ShipmentBoxesDTO


  type ShipmentBoxesDTO = {
    Boxes : ParcelBoxDTO[];
  }
  //#endregion
