namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.EacVerificationResultDTO

module VerifyOrderEacResponse =

  //#region VerifyOrderEacResponse


  type VerifyOrderEacResponse = {
    Status : ApiResponseStatusType;
    Result : EacVerificationResultDTO;
  }
  //#endregion
