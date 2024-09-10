namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module TimeUnitType =

  //#region TimeUnitType

  let HOUREnum = "HOUR"
  let DAYEnum = "DAY"
  let WEEKEnum = "WEEK"
  let MONTHEnum = "MONTH"
  let YEAREnum = "YEAR"
  type TimeUnitType = string

  //#endregion
