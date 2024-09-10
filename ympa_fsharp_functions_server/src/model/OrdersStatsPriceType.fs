namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrdersStatsPriceType =

  //#region OrdersStatsPriceType

  let BUYEREnum = "BUYER"
  let CASHBACKEnum = "CASHBACK"
  let MARKETPLACEEnum = "MARKETPLACE"
  type OrdersStatsPriceType = string

  //#endregion
