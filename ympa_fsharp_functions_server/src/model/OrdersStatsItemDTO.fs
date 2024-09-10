namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OrdersStatsDetailsDTO
open ympa_fsharp_functions_server.Model.OrdersStatsPriceDTO
open ympa_fsharp_functions_server.Model.OrdersStatsWarehouseDTO

module OrdersStatsItemDTO =

  //#region OrdersStatsItemDTO

  [<CLIMutable>]
  type OrdersStatsItemDTO = {
    [<JsonProperty(PropertyName = "offerName")>]
    OfferName : string;
    [<JsonProperty(PropertyName = "marketSku")>]
    MarketSku : int64;
    [<JsonProperty(PropertyName = "shopSku")>]
    ShopSku : string;
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "prices")>]
    Prices : OrdersStatsPriceDTO[];
    [<JsonProperty(PropertyName = "warehouse")>]
    Warehouse : OrdersStatsWarehouseDTO;
    [<JsonProperty(PropertyName = "details")>]
    Details : OrdersStatsDetailsDTO[];
    [<JsonProperty(PropertyName = "cisList")>]
    CisList : string[];
    [<JsonProperty(PropertyName = "initialCount")>]
    InitialCount : int;
    [<JsonProperty(PropertyName = "bidFee")>]
    BidFee : int;
    [<JsonProperty(PropertyName = "cofinanceThreshold")>]
    CofinanceThreshold : decimal;
    [<JsonProperty(PropertyName = "cofinanceValue")>]
    CofinanceValue : decimal;
  }

  //#endregion
