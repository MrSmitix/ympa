namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrderDeliveryDateReasonType =

  //#region OrderDeliveryDateReasonType

  let USERMOVEDDELIVERYDATESEnum = "USER_MOVED_DELIVERY_DATES"
  let PARTNERMOVEDDELIVERYDATESEnum = "PARTNER_MOVED_DELIVERY_DATES"
  type OrderDeliveryDateReasonType = string

  //#endregion
