namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ScrollingPagerDTO
open ympa_fsharp_giraffe_server.Model.WarehouseOffersDTO

module GetWarehouseStocksDTO =

  //#region GetWarehouseStocksDTO


  type GetWarehouseStocksDTO = {
    Paging : ScrollingPagerDTO;
    Warehouses : WarehouseOffersDTO[];
  }
  //#endregion
