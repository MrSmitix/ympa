namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrderPaymentType =

  //#region OrderPaymentType

  let PREPAIDEnum = "PREPAID"
  let POSTPAIDEnum = "POSTPAID"
  let UNKNOWNEnum = "UNKNOWN"
  type OrderPaymentType = string

  //#endregion
