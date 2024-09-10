namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.ReturnDTO

module GetReturnResponse =

  //#region GetReturnResponse


  type GetReturnResponse = {
    Status : ApiResponseStatusType;
    Result : ReturnDTO;
  }
  //#endregion
