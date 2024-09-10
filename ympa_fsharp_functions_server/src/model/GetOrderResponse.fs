namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OrderDTO

module GetOrderResponse =

  //#region GetOrderResponse

  [<CLIMutable>]
  type GetOrderResponse = {
    [<JsonProperty(PropertyName = "order")>]
    Order : OrderDTO;
  }

  //#endregion
