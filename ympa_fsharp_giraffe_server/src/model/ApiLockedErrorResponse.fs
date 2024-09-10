namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiErrorDTO
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType

module ApiLockedErrorResponse =

  //#region ApiLockedErrorResponse


  type ApiLockedErrorResponse = {
    Status : ApiResponseStatusType;
    Errors : ApiErrorDTO[];
  }
  //#endregion
