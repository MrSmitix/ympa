namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OrderStatusType
open ympa_fsharp_functions_server.Model.OrderSubstatusType

module OrderStateDTO =

  //#region OrderStateDTO

  [<CLIMutable>]
  type OrderStateDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "status")>]
    Status : OrderStatusType;
    [<JsonProperty(PropertyName = "substatus")>]
    Substatus : OrderSubstatusType;
  }

  //#endregion
