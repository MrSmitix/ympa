namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OfferProcessingStatusType =

  //#region OfferProcessingStatusType

  let UNKNOWNEnum = "UNKNOWN"
  let READYEnum = "READY"
  let INWORKEnum = "IN_WORK"
  let NEEDINFOEnum = "NEED_INFO"
  let NEEDMAPPINGEnum = "NEED_MAPPING"
  let NEEDCONTENTEnum = "NEED_CONTENT"
  let CONTENTPROCESSINGEnum = "CONTENT_PROCESSING"
  let SUSPENDEDEnum = "SUSPENDED"
  let REJECTEDEnum = "REJECTED"
  let REVIEWEnum = "REVIEW"
  let CREATEERROREnum = "CREATE_ERROR"
  let UPDATEERROREnum = "UPDATE_ERROR"
  type OfferProcessingStatusType = string

  //#endregion
