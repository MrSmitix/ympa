namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OrderStatusChangeDeliveryDTO
open ympa_fsharp_functions_server.Model.OrderStatusType
open ympa_fsharp_functions_server.Model.OrderSubstatusType

module OrderStatusChangeDTO =

  //#region OrderStatusChangeDTO

  [<CLIMutable>]
  type OrderStatusChangeDTO = {
    [<JsonProperty(PropertyName = "status")>]
    Status : OrderStatusType;
    [<JsonProperty(PropertyName = "substatus")>]
    Substatus : OrderSubstatusType;
    [<JsonProperty(PropertyName = "delivery")>]
    Delivery : OrderStatusChangeDeliveryDTO;
  }

  //#endregion
