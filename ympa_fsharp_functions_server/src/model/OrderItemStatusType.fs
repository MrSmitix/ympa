namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrderItemStatusType =

  //#region OrderItemStatusType

  let REJECTEDEnum = "REJECTED"
  let RETURNEDEnum = "RETURNED"
  type OrderItemStatusType = string

  //#endregion
