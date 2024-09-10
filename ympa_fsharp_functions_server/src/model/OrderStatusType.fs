namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrderStatusType =

  //#region OrderStatusType

  let PLACINGEnum = "PLACING"
  let RESERVEDEnum = "RESERVED"
  let UNPAIDEnum = "UNPAID"
  let PROCESSINGEnum = "PROCESSING"
  let DELIVERYEnum = "DELIVERY"
  let PICKUPEnum = "PICKUP"
  let DELIVEREDEnum = "DELIVERED"
  let CANCELLEDEnum = "CANCELLED"
  let PENDINGEnum = "PENDING"
  let PARTIALLYRETURNEDEnum = "PARTIALLY_RETURNED"
  let RETURNEDEnum = "RETURNED"
  let UNKNOWNEnum = "UNKNOWN"
  type OrderStatusType = string

  //#endregion
