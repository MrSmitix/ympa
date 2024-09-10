namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OrderStatusChangeDTO

module UpdateOrderStatusRequest =

  //#region UpdateOrderStatusRequest

  [<CLIMutable>]
  type UpdateOrderStatusRequest = {
    [<JsonProperty(PropertyName = "order")>]
    Order : OrderStatusChangeDTO;
  }

  //#endregion
