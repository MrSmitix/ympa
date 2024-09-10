namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.GoodsStatsGoodsDTO

module GoodsStatsDTO =

  //#region GoodsStatsDTO


  type GoodsStatsDTO = {
    ShopSkus : GoodsStatsGoodsDTO[];
  }
  //#endregion
