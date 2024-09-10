namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OrderDTO

module UpdateOrderStatusResponse =

  //#region UpdateOrderStatusResponse


  type UpdateOrderStatusResponse = {
    Order : OrderDTO;
  }
  //#endregion
