namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ReportStatusType
open ympa_fsharp_functions_server.Model.ReportSubStatusType

module ReportInfoDTO =

  //#region ReportInfoDTO

  [<CLIMutable>]
  type ReportInfoDTO = {
    [<JsonProperty(PropertyName = "status")>]
    Status : ReportStatusType;
    [<JsonProperty(PropertyName = "subStatus")>]
    SubStatus : ReportSubStatusType;
    [<JsonProperty(PropertyName = "generationRequestedAt")>]
    GenerationRequestedAt : DateTime;
    [<JsonProperty(PropertyName = "generationFinishedAt")>]
    GenerationFinishedAt : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "file")>]
    File : string;
    [<JsonProperty(PropertyName = "estimatedGenerationTime")>]
    EstimatedGenerationTime : int64;
  }

  //#endregion
