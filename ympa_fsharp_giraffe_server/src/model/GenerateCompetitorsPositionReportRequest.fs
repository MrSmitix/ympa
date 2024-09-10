namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module GenerateCompetitorsPositionReportRequest =

  //#region GenerateCompetitorsPositionReportRequest


  type GenerateCompetitorsPositionReportRequest = {
    BusinessId : int64;
    CategoryId : int64;
    DateFrom : DateTime;
    DateTo : DateTime;
  }
  //#endregion
