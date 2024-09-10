namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ShipmentStatusType

module ShipmentStatusChangeDTO =

  //#region ShipmentStatusChangeDTO


  type ShipmentStatusChangeDTO = {
    Status : ShipmentStatusType;
    Description : string;
    UpdateTime : Nullable<DateTime>;
  }
  //#endregion
