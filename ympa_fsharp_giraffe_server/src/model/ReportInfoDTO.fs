namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ReportStatusType
open ympa_fsharp_giraffe_server.Model.ReportSubStatusType

module ReportInfoDTO =

  //#region ReportInfoDTO


  type ReportInfoDTO = {
    Status : ReportStatusType;
    SubStatus : ReportSubStatusType;
    GenerationRequestedAt : DateTime;
    GenerationFinishedAt : Nullable<DateTime>;
    File : string;
    EstimatedGenerationTime : int64;
  }
  //#endregion
