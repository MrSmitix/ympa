namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ParcelBoxDTO

module SetOrderShipmentBoxesRequest =

  //#region SetOrderShipmentBoxesRequest


  type SetOrderShipmentBoxesRequest = {
    Boxes : ParcelBoxDTO[];
  }
  //#endregion
