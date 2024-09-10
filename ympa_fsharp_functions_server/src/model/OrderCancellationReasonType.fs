namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrderCancellationReasonType =

  //#region OrderCancellationReasonType

  let DELIVEREDEnum = "ORDER_DELIVERED"
  let INDELIVERYEnum = "ORDER_IN_DELIVERY"
  type OrderCancellationReasonType = string

  //#endregion
