namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.GenerateReportDTO

module GenerateReportResponse =

  //#region GenerateReportResponse


  type GenerateReportResponse = {
    Status : ApiResponseStatusType;
    Result : GenerateReportDTO;
  }
  //#endregion
