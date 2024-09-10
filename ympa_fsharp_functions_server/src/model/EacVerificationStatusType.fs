namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module EacVerificationStatusType =

  //#region EacVerificationStatusType

  let ACCEPTEDEnum = "ACCEPTED"
  let REJECTEDEnum = "REJECTED"
  let NEEDUPDATEEnum = "NEED_UPDATE"
  type EacVerificationStatusType = string

  //#endregion
