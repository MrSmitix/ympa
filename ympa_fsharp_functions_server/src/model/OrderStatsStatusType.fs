namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrderStatsStatusType =

  //#region OrderStatsStatusType

  let CANCELLEDBEFOREPROCESSINGEnum = "CANCELLED_BEFORE_PROCESSING"
  let CANCELLEDINDELIVERYEnum = "CANCELLED_IN_DELIVERY"
  let CANCELLEDINPROCESSINGEnum = "CANCELLED_IN_PROCESSING"
  let DELIVERYEnum = "DELIVERY"
  let DELIVEREDEnum = "DELIVERED"
  let PARTIALLYDELIVEREDEnum = "PARTIALLY_DELIVERED"
  let PARTIALLYRETURNEDEnum = "PARTIALLY_RETURNED"
  let PENDINGEnum = "PENDING"
  let PICKUPEnum = "PICKUP"
  let PROCESSINGEnum = "PROCESSING"
  let RESERVEDEnum = "RESERVED"
  let RETURNEDEnum = "RETURNED"
  let UNKNOWNEnum = "UNKNOWN"
  let UNPAIDEnum = "UNPAID"
  let LOSTEnum = "LOST"
  type OrderStatsStatusType = string

  //#endregion
