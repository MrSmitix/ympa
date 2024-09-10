namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module LicenseCheckStatusType =

  //#region LicenseCheckStatusType

  let NEWEnum = "NEW"
  let SUCCESSEnum = "SUCCESS"
  let FAILEnum = "FAIL"
  let REVOKEEnum = "REVOKE"
  let DONTWANTEnum = "DONT_WANT"
  let FAILMANUALEnum = "FAIL_MANUAL"
  type LicenseCheckStatusType = string

  //#endregion
