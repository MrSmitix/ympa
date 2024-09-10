namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.GoodsStatsWarehouseDTO
open ympa_fsharp_giraffe_server.Model.GoodsStatsWeightDimensionsDTO
open ympa_fsharp_giraffe_server.Model.TariffDTO

module GoodsStatsGoodsDTO =

  //#region GoodsStatsGoodsDTO


  type GoodsStatsGoodsDTO = {
    ShopSku : string;
    MarketSku : int64;
    Name : string;
    Price : decimal;
    CategoryId : int64;
    CategoryName : string;
    WeightDimensions : GoodsStatsWeightDimensionsDTO;
    Warehouses : GoodsStatsWarehouseDTO[];
    Tariffs : TariffDTO[];
    Pictures : string[];
  }
  //#endregion
