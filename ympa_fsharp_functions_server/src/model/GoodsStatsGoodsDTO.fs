namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.GoodsStatsWarehouseDTO
open ympa_fsharp_functions_server.Model.GoodsStatsWeightDimensionsDTO
open ympa_fsharp_functions_server.Model.TariffDTO

module GoodsStatsGoodsDTO =

  //#region GoodsStatsGoodsDTO

  [<CLIMutable>]
  type GoodsStatsGoodsDTO = {
    [<JsonProperty(PropertyName = "shopSku")>]
    ShopSku : string;
    [<JsonProperty(PropertyName = "marketSku")>]
    MarketSku : int64;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "price")>]
    Price : decimal;
    [<JsonProperty(PropertyName = "categoryId")>]
    CategoryId : int64;
    [<JsonProperty(PropertyName = "categoryName")>]
    CategoryName : string;
    [<JsonProperty(PropertyName = "weightDimensions")>]
    WeightDimensions : GoodsStatsWeightDimensionsDTO;
    [<JsonProperty(PropertyName = "warehouses")>]
    Warehouses : GoodsStatsWarehouseDTO[];
    [<JsonProperty(PropertyName = "tariffs")>]
    Tariffs : TariffDTO[];
    [<JsonProperty(PropertyName = "pictures")>]
    Pictures : string[];
  }

  //#endregion
