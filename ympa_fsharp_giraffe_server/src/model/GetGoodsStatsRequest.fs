namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.Set

module GetGoodsStatsRequest =

  //#region GetGoodsStatsRequest


  type GetGoodsStatsRequest = {
    ShopSkus : string[];
  }
  //#endregion
