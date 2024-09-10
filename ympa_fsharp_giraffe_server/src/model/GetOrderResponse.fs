namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OrderDTO

module GetOrderResponse =

  //#region GetOrderResponse


  type GetOrderResponse = {
    Order : OrderDTO;
  }
  //#endregion
