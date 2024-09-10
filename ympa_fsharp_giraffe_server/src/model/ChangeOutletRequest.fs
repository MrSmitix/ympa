namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OutletAddressDTO
open ympa_fsharp_giraffe_server.Model.OutletDeliveryRuleDTO
open ympa_fsharp_giraffe_server.Model.OutletType
open ympa_fsharp_giraffe_server.Model.OutletVisibilityType
open ympa_fsharp_giraffe_server.Model.OutletWorkingScheduleDTO

module ChangeOutletRequest =

  //#region ChangeOutletRequest


  type ChangeOutletRequest = {
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
  }
  //#endregion
