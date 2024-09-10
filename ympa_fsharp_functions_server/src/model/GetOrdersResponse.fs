namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.FlippingPagerDTO
open ympa_fsharp_functions_server.Model.ForwardScrollingPagerDTO
open ympa_fsharp_functions_server.Model.OrderDTO

module GetOrdersResponse =

  //#region GetOrdersResponse

  [<CLIMutable>]
  type GetOrdersResponse = {
    [<JsonProperty(PropertyName = "pager")>]
    Pager : FlippingPagerDTO;
    [<JsonProperty(PropertyName = "orders")>]
    Orders : OrderDTO[];
    [<JsonProperty(PropertyName = "paging")>]
    Paging : ForwardScrollingPagerDTO;
  }

  //#endregion
