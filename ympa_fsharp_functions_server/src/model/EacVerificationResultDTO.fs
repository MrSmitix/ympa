namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.EacVerificationStatusType

module EacVerificationResultDTO =

  //#region EacVerificationResultDTO

  [<CLIMutable>]
  type EacVerificationResultDTO = {
    [<JsonProperty(PropertyName = "verificationResult")>]
    VerificationResult : EacVerificationStatusType;
    [<JsonProperty(PropertyName = "attemptsLeft")>]
    AttemptsLeft : int;
  }

  //#endregion
