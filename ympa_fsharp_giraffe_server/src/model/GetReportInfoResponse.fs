namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.ReportInfoDTO

module GetReportInfoResponse =

  //#region GetReportInfoResponse


  type GetReportInfoResponse = {
    Status : ApiResponseStatusType;
    Result : ReportInfoDTO;
  }
  //#endregion
