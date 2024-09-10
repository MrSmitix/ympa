namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module GenerateReportDTO =

  //#region GenerateReportDTO

  [<CLIMutable>]
  type GenerateReportDTO = {
    [<JsonProperty(PropertyName = "reportId")>]
    ReportId : string;
    [<JsonProperty(PropertyName = "estimatedGenerationTime")>]
    EstimatedGenerationTime : int64;
  }

  //#endregion
