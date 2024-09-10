namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OrderItemModificationDTO
open ympa_fsharp_giraffe_server.Model.OrderItemsModificationRequestReasonType

module UpdateOrderItemRequest =

  //#region UpdateOrderItemRequest


  type UpdateOrderItemRequest = {
    Items : OrderItemModificationDTO[];
    Reason : OrderItemsModificationRequestReasonType;
  }
  //#endregion
