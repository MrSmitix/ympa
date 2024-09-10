namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ReturnDecisionSubreasonType =

  //#region ReturnDecisionSubreasonType

  let USERDIDNOTLIKEEnum = "USER_DID_NOT_LIKE"
  let USERCHANGEDMINDEnum = "USER_CHANGED_MIND"
  let DELIVEREDTOOLONGEnum = "DELIVERED_TOO_LONG"
  let BADPACKAGEEnum = "BAD_PACKAGE"
  let DAMAGEDEnum = "DAMAGED"
  let NOTWORKINGEnum = "NOT_WORKING"
  let INCOMPLETENESSEnum = "INCOMPLETENESS"
  let WRONGITEMEnum = "WRONG_ITEM"
  let WRONGCOLOREnum = "WRONG_COLOR"
  let DIDNOTMATCHDESCRIPTIONEnum = "DID_NOT_MATCH_DESCRIPTION"
  let UNKNOWNEnum = "UNKNOWN"
  type ReturnDecisionSubreasonType = string

  //#endregion
