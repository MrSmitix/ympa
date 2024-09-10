namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RefundStatusType =

  //#region RefundStatusType

  let STARTEDBYUSEREnum = "STARTED_BY_USER"
  let REFUNDINPROGRESSEnum = "REFUND_IN_PROGRESS"
  let REFUNDEDEnum = "REFUNDED"
  let FAILEDEnum = "FAILED"
  let WAITINGFORDECISIONEnum = "WAITING_FOR_DECISION"
  let DECISIONMADEEnum = "DECISION_MADE"
  let REFUNDEDWITHBONUSESEnum = "REFUNDED_WITH_BONUSES"
  let REFUNDEDBYSHOPEnum = "REFUNDED_BY_SHOP"
  let CANCELLEDEnum = "CANCELLED"
  let COMPLETEWITHOUTREFUNDEnum = "COMPLETE_WITHOUT_REFUND"
  let UNKNOWNEnum = "UNKNOWN"
  type RefundStatusType = string

  //#endregion
