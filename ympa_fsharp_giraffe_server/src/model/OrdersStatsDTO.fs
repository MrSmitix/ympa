namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ForwardScrollingPagerDTO
open ympa_fsharp_giraffe_server.Model.OrdersStatsOrderDTO

module OrdersStatsDTO =

  //#region OrdersStatsDTO


  type OrdersStatsDTO = {
    Orders : OrdersStatsOrderDTO[];
    Paging : ForwardScrollingPagerDTO;
  }
  //#endregion
