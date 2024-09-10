namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType

module ApiResponse =

  //#region ApiResponse


  type ApiResponse = {
    Status : ApiResponseStatusType;
  }
  //#endregion
