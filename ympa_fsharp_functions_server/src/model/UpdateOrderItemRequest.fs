namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OrderItemModificationDTO
open ympa_fsharp_functions_server.Model.OrderItemsModificationRequestReasonType

module UpdateOrderItemRequest =

  //#region UpdateOrderItemRequest

  [<CLIMutable>]
  type UpdateOrderItemRequest = {
    [<JsonProperty(PropertyName = "items")>]
    Items : OrderItemModificationDTO[];
    [<JsonProperty(PropertyName = "reason")>]
    Reason : OrderItemsModificationRequestReasonType;
  }

  //#endregion
