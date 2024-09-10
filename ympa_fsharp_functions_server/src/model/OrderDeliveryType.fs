namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrderDeliveryType =

  //#region OrderDeliveryType

  let DELIVERYEnum = "DELIVERY"
  let PICKUPEnum = "PICKUP"
  let POSTEnum = "POST"
  let DIGITALEnum = "DIGITAL"
  let UNKNOWNEnum = "UNKNOWN"
  type OrderDeliveryType = string

  //#endregion
