namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrderUpdateStatusType =

  //#region OrderUpdateStatusType

  let OKEnum = "OK"
  let ERROREnum = "ERROR"
  type OrderUpdateStatusType = string

  //#endregion
