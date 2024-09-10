namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ShowsSalesGroupingType

module GenerateShowsSalesReportRequest =

  //#region GenerateShowsSalesReportRequest


  type GenerateShowsSalesReportRequest = {
    BusinessId : int64;
    CampaignId : int64;
    DateFrom : DateTime;
    DateTo : DateTime;
    Grouping : ShowsSalesGroupingType;
  }
  //#endregion
