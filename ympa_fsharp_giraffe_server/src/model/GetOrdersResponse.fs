namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.FlippingPagerDTO
open ympa_fsharp_giraffe_server.Model.ForwardScrollingPagerDTO
open ympa_fsharp_giraffe_server.Model.OrderDTO

module GetOrdersResponse =

  //#region GetOrdersResponse


  type GetOrdersResponse = {
    Pager : FlippingPagerDTO;
    Orders : OrderDTO[];
    Paging : ForwardScrollingPagerDTO;
  }
  //#endregion
