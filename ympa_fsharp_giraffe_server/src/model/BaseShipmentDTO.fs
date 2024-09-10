namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.DeliveryServiceDTO
open ympa_fsharp_giraffe_server.Model.PalletsCountDTO
open ympa_fsharp_giraffe_server.Model.PartnerShipmentWarehouseDTO
open ympa_fsharp_giraffe_server.Model.Set
open ympa_fsharp_giraffe_server.Model.ShipmentType

module BaseShipmentDTO =

  //#region BaseShipmentDTO


  type BaseShipmentDTO = {
    Id : int64;
    PlanIntervalFrom : Nullable<DateTime>;
    PlanIntervalTo : Nullable<DateTime>;
    ShipmentType : ShipmentType;
    Warehouse : PartnerShipmentWarehouseDTO;
    WarehouseTo : PartnerShipmentWarehouseDTO;
    ExternalId : string;
    DeliveryService : DeliveryServiceDTO;
    PalletsCount : PalletsCountDTO;
    OrderIds : int64[];
    DraftCount : int;
    PlannedCount : int;
    FactCount : int;
  }
  //#endregion
