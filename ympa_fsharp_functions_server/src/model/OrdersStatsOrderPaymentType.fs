namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrdersStatsOrderPaymentType =

  //#region OrdersStatsOrderPaymentType

  let CREDITEnum = "CREDIT"
  let POSTPAIDEnum = "POSTPAID"
  let PREPAIDEnum = "PREPAID"
  let TINKOFFCREDITEnum = "TINKOFF_CREDIT"
  type OrdersStatsOrderPaymentType = string

  //#endregion
