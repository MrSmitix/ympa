namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PaymentFrequencyType =

  //#region PaymentFrequencyType

  let DAILYEnum = "DAILY"
  let WEEKLYEnum = "WEEKLY"
  let BIWEEKLYEnum = "BIWEEKLY"
  let MONTHLYEnum = "MONTHLY"
  type PaymentFrequencyType = string

  //#endregion
