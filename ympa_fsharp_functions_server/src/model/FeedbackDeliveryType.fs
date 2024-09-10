namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module FeedbackDeliveryType =

  //#region FeedbackDeliveryType

  let DELIVERYEnum = "DELIVERY"
  let PICKUPEnum = "PICKUP"
  let INSTOREEnum = "INSTORE"
  type FeedbackDeliveryType = string

  //#endregion
