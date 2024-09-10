namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module GenerateGoodsRealizationReportRequest =

  //#region GenerateGoodsRealizationReportRequest


  type GenerateGoodsRealizationReportRequest = {
    CampaignId : int64;
    Year : int;
    Month : int;
  }
  //#endregion
