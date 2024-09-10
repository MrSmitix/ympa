namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OrderStateDTO

module UpdateOrderStatusesRequest =

  //#region UpdateOrderStatusesRequest


  type UpdateOrderStatusesRequest = {
    Orders : OrderStateDTO[];
  }
  //#endregion
