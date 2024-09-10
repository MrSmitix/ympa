namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ScrollingPagerDTO
open ympa_fsharp_functions_server.Model.WarehouseOffersDTO

module GetWarehouseStocksDTO =

  //#region GetWarehouseStocksDTO

  [<CLIMutable>]
  type GetWarehouseStocksDTO = {
    [<JsonProperty(PropertyName = "paging")>]
    Paging : ScrollingPagerDTO;
    [<JsonProperty(PropertyName = "warehouses")>]
    Warehouses : WarehouseOffersDTO[];
  }

  //#endregion
