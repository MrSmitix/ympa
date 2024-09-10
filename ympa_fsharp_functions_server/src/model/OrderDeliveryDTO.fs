namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OrderCourierDTO
open ympa_fsharp_functions_server.Model.OrderDeliveryAddressDTO
open ympa_fsharp_functions_server.Model.OrderDeliveryDatesDTO
open ympa_fsharp_functions_server.Model.OrderDeliveryDispatchType
open ympa_fsharp_functions_server.Model.OrderDeliveryEacType
open ympa_fsharp_functions_server.Model.OrderDeliveryPartnerType
open ympa_fsharp_functions_server.Model.OrderDeliveryType
open ympa_fsharp_functions_server.Model.OrderLiftType
open ympa_fsharp_functions_server.Model.OrderShipmentDTO
open ympa_fsharp_functions_server.Model.OrderTrackDTO
open ympa_fsharp_functions_server.Model.OrderVatType
open ympa_fsharp_functions_server.Model.RegionDTO

module OrderDeliveryDTO =

  //#region OrderDeliveryDTO

  [<CLIMutable>]
  type OrderDeliveryDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : OrderDeliveryType;
    [<JsonProperty(PropertyName = "serviceName")>]
    ServiceName : string;
    [<JsonProperty(PropertyName = "price")>]
    Price : decimal;
    [<JsonProperty(PropertyName = "deliveryPartnerType")>]
    DeliveryPartnerType : OrderDeliveryPartnerType;
    [<JsonProperty(PropertyName = "courier")>]
    Courier : OrderCourierDTO;
    [<JsonProperty(PropertyName = "dates")>]
    Dates : OrderDeliveryDatesDTO;
    [<JsonProperty(PropertyName = "region")>]
    Region : RegionDTO;
    [<JsonProperty(PropertyName = "address")>]
    Address : OrderDeliveryAddressDTO;
    [<JsonProperty(PropertyName = "vat")>]
    Vat : OrderVatType;
    [<JsonProperty(PropertyName = "deliveryServiceId")>]
    DeliveryServiceId : int64;
    [<JsonProperty(PropertyName = "liftType")>]
    LiftType : OrderLiftType;
    [<JsonProperty(PropertyName = "liftPrice")>]
    LiftPrice : decimal;
    [<JsonProperty(PropertyName = "outletCode")>]
    OutletCode : string;
    [<JsonProperty(PropertyName = "outletStorageLimitDate")>]
    OutletStorageLimitDate : string;
    [<JsonProperty(PropertyName = "dispatchType")>]
    DispatchType : OrderDeliveryDispatchType;
    [<JsonProperty(PropertyName = "tracks")>]
    Tracks : OrderTrackDTO[];
    [<JsonProperty(PropertyName = "shipments")>]
    Shipments : OrderShipmentDTO[];
    [<JsonProperty(PropertyName = "estimated")>]
    Estimated : bool;
    [<JsonProperty(PropertyName = "eacType")>]
    EacType : OrderDeliveryEacType;
    [<JsonProperty(PropertyName = "eacCode")>]
    EacCode : string;
  }

  //#endregion
