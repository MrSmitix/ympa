namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ForwardScrollingPagerDTO
open ympa_fsharp_functions_server.Model.OrdersStatsOrderDTO

module OrdersStatsDTO =

  //#region OrdersStatsDTO

  [<CLIMutable>]
  type OrdersStatsDTO = {
    [<JsonProperty(PropertyName = "orders")>]
    Orders : OrdersStatsOrderDTO[];
    [<JsonProperty(PropertyName = "paging")>]
    Paging : ForwardScrollingPagerDTO;
  }

  //#endregion
