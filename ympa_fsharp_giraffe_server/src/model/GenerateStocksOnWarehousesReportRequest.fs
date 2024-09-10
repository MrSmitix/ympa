namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module GenerateStocksOnWarehousesReportRequest =

  //#region GenerateStocksOnWarehousesReportRequest


  type GenerateStocksOnWarehousesReportRequest = {
    CampaignId : int64;
    WarehouseIds : int64[];
    ReportDate : DateTime;
    CategoryIds : int64[];
    HasStocks : bool;
  }
  //#endregion
