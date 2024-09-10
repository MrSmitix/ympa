namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ReturnDecisionReasonType =

  //#region ReturnDecisionReasonType

  let BADQUALITYEnum = "BAD_QUALITY"
  let DOESNOTFITEnum = "DOES_NOT_FIT"
  let WRONGITEMEnum = "WRONG_ITEM"
  let DAMAGEDELIVERYEnum = "DAMAGE_DELIVERY"
  let LOYALTYFAILEnum = "LOYALTY_FAIL"
  let CONTENTFAILEnum = "CONTENT_FAIL"
  let UNKNOWNEnum = "UNKNOWN"
  type ReturnDecisionReasonType = string

  //#endregion
