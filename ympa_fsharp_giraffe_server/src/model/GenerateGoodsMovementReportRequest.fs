namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module GenerateGoodsMovementReportRequest =

  //#region GenerateGoodsMovementReportRequest


  type GenerateGoodsMovementReportRequest = {
    CampaignId : int64;
    DateFrom : DateTime;
    DateTo : DateTime;
    ShopSku : string;
  }
  //#endregion
