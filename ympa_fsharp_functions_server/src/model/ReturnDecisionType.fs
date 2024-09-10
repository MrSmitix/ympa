namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ReturnDecisionType =

  //#region ReturnDecisionType

  let REFUNDMONEYEnum = "REFUND_MONEY"
  let REFUNDMONEYINCLUDINGSHIPMENTEnum = "REFUND_MONEY_INCLUDING_SHIPMENT"
  let REPAIREnum = "REPAIR"
  let REPLACEEnum = "REPLACE"
  let SENDTOEXAMINATIONEnum = "SEND_TO_EXAMINATION"
  let DECLINEREFUNDEnum = "DECLINE_REFUND"
  let OTHERDECISIONEnum = "OTHER_DECISION"
  let UNKNOWNEnum = "UNKNOWN"
  type ReturnDecisionType = string

  //#endregion
