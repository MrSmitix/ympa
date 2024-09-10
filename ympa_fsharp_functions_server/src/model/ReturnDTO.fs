namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.LogisticPickupPointDTO
open ympa_fsharp_functions_server.Model.RecipientType
open ympa_fsharp_functions_server.Model.RefundStatusType
open ympa_fsharp_functions_server.Model.ReturnItemDTO
open ympa_fsharp_functions_server.Model.ReturnShipmentStatusType
open ympa_fsharp_functions_server.Model.ReturnType

module ReturnDTO =

  //#region ReturnDTO

  [<CLIMutable>]
  type ReturnDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "orderId")>]
    OrderId : int64;
    [<JsonProperty(PropertyName = "creationDate")>]
    CreationDate : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "updateDate")>]
    UpdateDate : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "refundStatus")>]
    RefundStatus : RefundStatusType;
    [<JsonProperty(PropertyName = "logisticPickupPoint")>]
    LogisticPickupPoint : LogisticPickupPointDTO;
    [<JsonProperty(PropertyName = "shipmentRecipientType")>]
    ShipmentRecipientType : RecipientType;
    [<JsonProperty(PropertyName = "shipmentStatus")>]
    ShipmentStatus : ReturnShipmentStatusType;
    [<JsonProperty(PropertyName = "refundAmount")>]
    RefundAmount : int64;
    [<JsonProperty(PropertyName = "items")>]
    Items : ReturnItemDTO[];
    [<JsonProperty(PropertyName = "returnType")>]
    ReturnType : ReturnType;
    [<JsonProperty(PropertyName = "fastReturn")>]
    FastReturn : bool;
  }

  //#endregion
