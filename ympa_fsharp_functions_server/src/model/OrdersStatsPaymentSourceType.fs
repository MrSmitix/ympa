namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrdersStatsPaymentSourceType =

  //#region OrdersStatsPaymentSourceType

  let BUYEREnum = "BUYER"
  let CASHBACKEnum = "CASHBACK"
  let MARKETPLACEEnum = "MARKETPLACE"
  let SPLITEnum = "SPLIT"
  type OrdersStatsPaymentSourceType = string

  //#endregion
