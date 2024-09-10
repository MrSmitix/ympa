namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OrdersStatsDetailsDTO
open ympa_fsharp_giraffe_server.Model.OrdersStatsPriceDTO
open ympa_fsharp_giraffe_server.Model.OrdersStatsWarehouseDTO

module OrdersStatsItemDTO =

  //#region OrdersStatsItemDTO


  type OrdersStatsItemDTO = {
    OfferName : string;
    MarketSku : int64;
    ShopSku : string;
    Count : int;
    Prices : OrdersStatsPriceDTO[];
    Warehouse : OrdersStatsWarehouseDTO;
    Details : OrdersStatsDetailsDTO[];
    CisList : string[];
    InitialCount : int;
    BidFee : int;
    CofinanceThreshold : decimal;
    CofinanceValue : decimal;
  }
  //#endregion
