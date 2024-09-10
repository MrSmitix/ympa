namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OrderStatusChangeDTO

module UpdateOrderStatusRequest =

  //#region UpdateOrderStatusRequest


  type UpdateOrderStatusRequest = {
    Order : OrderStatusChangeDTO;
  }
  //#endregion
