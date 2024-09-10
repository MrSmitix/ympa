namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module GenerateReportDTO =

  //#region GenerateReportDTO


  type GenerateReportDTO = {
    ReportId : string;
    EstimatedGenerationTime : int64;
  }
  //#endregion
