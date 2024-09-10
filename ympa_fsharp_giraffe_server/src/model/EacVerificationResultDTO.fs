namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.EacVerificationStatusType

module EacVerificationResultDTO =

  //#region EacVerificationResultDTO


  type EacVerificationResultDTO = {
    VerificationResult : EacVerificationStatusType;
    AttemptsLeft : int;
  }
  //#endregion
