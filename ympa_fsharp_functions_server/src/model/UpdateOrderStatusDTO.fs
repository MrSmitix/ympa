namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OrderStatusType
open ympa_fsharp_functions_server.Model.OrderSubstatusType
open ympa_fsharp_functions_server.Model.OrderUpdateStatusType

module UpdateOrderStatusDTO =

  //#region UpdateOrderStatusDTO

  [<CLIMutable>]
  type UpdateOrderStatusDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "status")>]
    Status : OrderStatusType;
    [<JsonProperty(PropertyName = "substatus")>]
    Substatus : OrderSubstatusType;
    [<JsonProperty(PropertyName = "updateStatus")>]
    UpdateStatus : OrderUpdateStatusType;
    [<JsonProperty(PropertyName = "errorDetails")>]
    ErrorDetails : string;
  }

  //#endregion
