namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ParcelBoxLabelDTO =

  //#region ParcelBoxLabelDTO

  [<CLIMutable>]
  type ParcelBoxLabelDTO = {
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
    [<JsonProperty(PropertyName = "supplierName")>]
    SupplierName : string;
    [<JsonProperty(PropertyName = "deliveryServiceName")>]
    DeliveryServiceName : string;
    [<JsonProperty(PropertyName = "orderId")>]
    OrderId : int64;
    [<JsonProperty(PropertyName = "orderNum")>]
    OrderNum : string;
    [<JsonProperty(PropertyName = "recipientName")>]
    RecipientName : string;
    [<JsonProperty(PropertyName = "boxId")>]
    BoxId : int64;
    [<JsonProperty(PropertyName = "fulfilmentId")>]
    FulfilmentId : string;
    [<JsonProperty(PropertyName = "place")>]
    Place : string;
    [<JsonProperty(PropertyName = "weight")>]
    Weight : string;
    [<JsonProperty(PropertyName = "deliveryServiceId")>]
    DeliveryServiceId : string;
    [<JsonProperty(PropertyName = "deliveryAddress")>]
    DeliveryAddress : string;
    [<JsonProperty(PropertyName = "shipmentDate")>]
    ShipmentDate : string;
  }

  //#endregion
