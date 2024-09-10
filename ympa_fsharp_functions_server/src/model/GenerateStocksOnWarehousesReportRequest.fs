namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module GenerateStocksOnWarehousesReportRequest =

  //#region GenerateStocksOnWarehousesReportRequest

  [<CLIMutable>]
  type GenerateStocksOnWarehousesReportRequest = {
    [<JsonProperty(PropertyName = "campaignId")>]
    CampaignId : int64;
    [<JsonProperty(PropertyName = "warehouseIds")>]
    WarehouseIds : int64[];
    [<JsonProperty(PropertyName = "reportDate")>]
    ReportDate : DateTime;
    [<JsonProperty(PropertyName = "categoryIds")>]
    CategoryIds : int64[];
    [<JsonProperty(PropertyName = "hasStocks")>]
    HasStocks : bool;
  }

  //#endregion
