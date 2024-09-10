namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.DeliveryServiceDTO
open ympa_fsharp_functions_server.Model.PalletsCountDTO
open ympa_fsharp_functions_server.Model.PartnerShipmentWarehouseDTO
open ympa_fsharp_functions_server.Model.Set
open ympa_fsharp_functions_server.Model.ShipmentStatusType
open ympa_fsharp_functions_server.Model.ShipmentType

module ShipmentInfoDTO =

  //#region ShipmentInfoDTO

  [<CLIMutable>]
  type ShipmentInfoDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "planIntervalFrom")>]
    PlanIntervalFrom : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "planIntervalTo")>]
    PlanIntervalTo : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "shipmentType")>]
    ShipmentType : ShipmentType;
    [<JsonProperty(PropertyName = "warehouse")>]
    Warehouse : PartnerShipmentWarehouseDTO;
    [<JsonProperty(PropertyName = "warehouseTo")>]
    WarehouseTo : PartnerShipmentWarehouseDTO;
    [<JsonProperty(PropertyName = "externalId")>]
    ExternalId : string;
    [<JsonProperty(PropertyName = "deliveryService")>]
    DeliveryService : DeliveryServiceDTO;
    [<JsonProperty(PropertyName = "palletsCount")>]
    PalletsCount : PalletsCountDTO;
    [<JsonProperty(PropertyName = "orderIds")>]
    OrderIds : int64[];
    [<JsonProperty(PropertyName = "draftCount")>]
    DraftCount : int;
    [<JsonProperty(PropertyName = "plannedCount")>]
    PlannedCount : int;
    [<JsonProperty(PropertyName = "factCount")>]
    FactCount : int;
    [<JsonProperty(PropertyName = "status")>]
    Status : ShipmentStatusType;
    [<JsonProperty(PropertyName = "statusDescription")>]
    StatusDescription : string;
    [<JsonProperty(PropertyName = "statusUpdateTime")>]
    StatusUpdateTime : Nullable<DateTime>;
  }

  //#endregion
