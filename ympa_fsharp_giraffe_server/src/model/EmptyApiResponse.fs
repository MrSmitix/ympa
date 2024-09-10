namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType

module EmptyApiResponse =

  //#region EmptyApiResponse


  type EmptyApiResponse = {
    Status : ApiResponseStatusType;
  }
  //#endregion
