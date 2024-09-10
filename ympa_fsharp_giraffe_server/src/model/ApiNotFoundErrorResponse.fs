namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiErrorDTO
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType

module ApiNotFoundErrorResponse =

  //#region ApiNotFoundErrorResponse


  type ApiNotFoundErrorResponse = {
    Status : ApiResponseStatusType;
    Errors : ApiErrorDTO[];
  }
  //#endregion
