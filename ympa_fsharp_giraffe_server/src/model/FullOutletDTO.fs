namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OutletAddressDTO
open ympa_fsharp_giraffe_server.Model.OutletDeliveryRuleDTO
open ympa_fsharp_giraffe_server.Model.OutletStatusType
open ympa_fsharp_giraffe_server.Model.OutletType
open ympa_fsharp_giraffe_server.Model.OutletVisibilityType
open ympa_fsharp_giraffe_server.Model.OutletWorkingScheduleDTO
open ympa_fsharp_giraffe_server.Model.RegionDTO

module FullOutletDTO =

  //#region FullOutletDTO


  type FullOutletDTO = {
    Name : string;
    Type : OutletType;
    Coords : string;
    IsMain : bool;
    ShopOutletCode : string;
    Visibility : OutletVisibilityType;
    Address : OutletAddressDTO;
    Phones : string[];
    WorkingSchedule : OutletWorkingScheduleDTO;
    DeliveryRules : OutletDeliveryRuleDTO[];
    StoragePeriod : int64;
    Id : int64;
    Status : OutletStatusType;
    Region : RegionDTO;
    ShopOutletId : string;
    WorkingTime : string;
    ModerationReason : string;
  }
  //#endregion
