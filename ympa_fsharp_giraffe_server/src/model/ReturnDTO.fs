namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.LogisticPickupPointDTO
open ympa_fsharp_giraffe_server.Model.RecipientType
open ympa_fsharp_giraffe_server.Model.RefundStatusType
open ympa_fsharp_giraffe_server.Model.ReturnItemDTO
open ympa_fsharp_giraffe_server.Model.ReturnShipmentStatusType
open ympa_fsharp_giraffe_server.Model.ReturnType

module ReturnDTO =

  //#region ReturnDTO


  type ReturnDTO = {
    Id : int64;
    OrderId : int64;
    CreationDate : Nullable<DateTime>;
    UpdateDate : Nullable<DateTime>;
    RefundStatus : RefundStatusType;
    LogisticPickupPoint : LogisticPickupPointDTO;
    ShipmentRecipientType : RecipientType;
    ShipmentStatus : ReturnShipmentStatusType;
    RefundAmount : int64;
    Items : ReturnItemDTO[];
    ReturnType : ReturnType;
    FastReturn : bool;
  }
  //#endregion
