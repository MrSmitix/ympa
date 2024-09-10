namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OutletDeliveryRuleDTO =

  //#region OutletDeliveryRuleDTO

  [<CLIMutable>]
  type OutletDeliveryRuleDTO = {
    [<JsonProperty(PropertyName = "minDeliveryDays")>]
    MinDeliveryDays : int;
    [<JsonProperty(PropertyName = "maxDeliveryDays")>]
    MaxDeliveryDays : int;
    [<JsonProperty(PropertyName = "deliveryServiceId")>]
    DeliveryServiceId : int64;
    [<JsonProperty(PropertyName = "orderBefore")>]
    OrderBefore : int;
    [<JsonProperty(PropertyName = "priceFreePickup")>]
    PriceFreePickup : decimal;
    [<JsonProperty(PropertyName = "unspecifiedDeliveryInterval")>]
    UnspecifiedDeliveryInterval : bool;
  }

  //#endregion
