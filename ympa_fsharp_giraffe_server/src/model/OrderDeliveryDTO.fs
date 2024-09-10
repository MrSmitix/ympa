namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OrderCourierDTO
open ympa_fsharp_giraffe_server.Model.OrderDeliveryAddressDTO
open ympa_fsharp_giraffe_server.Model.OrderDeliveryDatesDTO
open ympa_fsharp_giraffe_server.Model.OrderDeliveryDispatchType
open ympa_fsharp_giraffe_server.Model.OrderDeliveryEacType
open ympa_fsharp_giraffe_server.Model.OrderDeliveryPartnerType
open ympa_fsharp_giraffe_server.Model.OrderDeliveryType
open ympa_fsharp_giraffe_server.Model.OrderLiftType
open ympa_fsharp_giraffe_server.Model.OrderShipmentDTO
open ympa_fsharp_giraffe_server.Model.OrderTrackDTO
open ympa_fsharp_giraffe_server.Model.OrderVatType
open ympa_fsharp_giraffe_server.Model.RegionDTO

module OrderDeliveryDTO =

  //#region OrderDeliveryDTO


  type OrderDeliveryDTO = {
    Id : string;
    Type : OrderDeliveryType;
    ServiceName : string;
    Price : decimal;
    DeliveryPartnerType : OrderDeliveryPartnerType;
    Courier : OrderCourierDTO;
    Dates : OrderDeliveryDatesDTO;
    Region : RegionDTO;
    Address : OrderDeliveryAddressDTO;
    Vat : OrderVatType;
    DeliveryServiceId : int64;
    LiftType : OrderLiftType;
    LiftPrice : decimal;
    OutletCode : string;
    OutletStorageLimitDate : string;
    DispatchType : OrderDeliveryDispatchType;
    Tracks : OrderTrackDTO[];
    Shipments : OrderShipmentDTO[];
    Estimated : bool;
    EacType : OrderDeliveryEacType;
    EacCode : string;
  }
  //#endregion
