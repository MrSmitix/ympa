namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.Set

module GetGoodsStatsRequest =

  //#region GetGoodsStatsRequest

  [<CLIMutable>]
  type GetGoodsStatsRequest = {
    [<JsonProperty(PropertyName = "shopSkus")>]
    ShopSkus : string[];
  }

  //#endregion
