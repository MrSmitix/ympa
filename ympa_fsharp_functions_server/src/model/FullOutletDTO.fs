namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OutletAddressDTO
open ympa_fsharp_functions_server.Model.OutletDeliveryRuleDTO
open ympa_fsharp_functions_server.Model.OutletStatusType
open ympa_fsharp_functions_server.Model.OutletType
open ympa_fsharp_functions_server.Model.OutletVisibilityType
open ympa_fsharp_functions_server.Model.OutletWorkingScheduleDTO
open ympa_fsharp_functions_server.Model.RegionDTO

module FullOutletDTO =

  //#region FullOutletDTO

  [<CLIMutable>]
  type FullOutletDTO = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : OutletType;
    [<JsonProperty(PropertyName = "coords")>]
    Coords : string;
    [<JsonProperty(PropertyName = "isMain")>]
    IsMain : bool;
    [<JsonProperty(PropertyName = "shopOutletCode")>]
    ShopOutletCode : string;
    [<JsonProperty(PropertyName = "visibility")>]
    Visibility : OutletVisibilityType;
    [<JsonProperty(PropertyName = "address")>]
    Address : OutletAddressDTO;
    [<JsonProperty(PropertyName = "phones")>]
    Phones : string[];
    [<JsonProperty(PropertyName = "workingSchedule")>]
    WorkingSchedule : OutletWorkingScheduleDTO;
    [<JsonProperty(PropertyName = "deliveryRules")>]
    DeliveryRules : OutletDeliveryRuleDTO[];
    [<JsonProperty(PropertyName = "storagePeriod")>]
    StoragePeriod : int64;
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "status")>]
    Status : OutletStatusType;
    [<JsonProperty(PropertyName = "region")>]
    Region : RegionDTO;
    [<JsonProperty(PropertyName = "shopOutletId")>]
    ShopOutletId : string;
    [<JsonProperty(PropertyName = "workingTime")>]
    WorkingTime : string;
    [<JsonProperty(PropertyName = "moderationReason")>]
    ModerationReason : string;
  }

  //#endregion
