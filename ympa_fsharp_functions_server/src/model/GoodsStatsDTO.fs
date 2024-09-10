namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.GoodsStatsGoodsDTO

module GoodsStatsDTO =

  //#region GoodsStatsDTO

  [<CLIMutable>]
  type GoodsStatsDTO = {
    [<JsonProperty(PropertyName = "shopSkus")>]
    ShopSkus : GoodsStatsGoodsDTO[];
  }

  //#endregion
