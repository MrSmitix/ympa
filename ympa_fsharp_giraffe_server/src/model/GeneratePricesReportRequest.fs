namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module GeneratePricesReportRequest =

  //#region GeneratePricesReportRequest


  type GeneratePricesReportRequest = {
    BusinessId : int64;
    CampaignId : int64;
    CategoryIds : int64[];
    CreationDateFrom : DateTime;
    CreationDateTo : DateTime;
  }
  //#endregion
