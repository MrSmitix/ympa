namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OrderStateDTO

module UpdateOrderStatusesRequest =

  //#region UpdateOrderStatusesRequest

  [<CLIMutable>]
  type UpdateOrderStatusesRequest = {
    [<JsonProperty(PropertyName = "orders")>]
    Orders : OrderStateDTO[];
  }

  //#endregion
