namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ApiResponseStatusType
open ympa_fsharp_functions_server.Model.EacVerificationResultDTO

module VerifyOrderEacResponse =

  //#region VerifyOrderEacResponse

  [<CLIMutable>]
  type VerifyOrderEacResponse = {
    [<JsonProperty(PropertyName = "status")>]
    Status : ApiResponseStatusType;
    [<JsonProperty(PropertyName = "result")>]
    Result : EacVerificationResultDTO;
  }

  //#endregion
