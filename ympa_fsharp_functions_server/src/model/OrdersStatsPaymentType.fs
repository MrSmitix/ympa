namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrdersStatsPaymentType =

  //#region OrdersStatsPaymentType

  let PAYMENTEnum = "PAYMENT"
  let REFUNDEnum = "REFUND"
  let UNKNOWNEnum = "UNKNOWN"
  type OrdersStatsPaymentType = string

  //#endregion
