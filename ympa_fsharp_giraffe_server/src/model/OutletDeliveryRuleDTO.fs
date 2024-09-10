namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module OutletDeliveryRuleDTO =

  //#region OutletDeliveryRuleDTO


  type OutletDeliveryRuleDTO = {
    MinDeliveryDays : int;
    MaxDeliveryDays : int;
    DeliveryServiceId : int64;
    OrderBefore : int;
    PriceFreePickup : decimal;
    UnspecifiedDeliveryInterval : bool;
  }
  //#endregion
