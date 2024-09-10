namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrderDeliveryDispatchType =

  //#region OrderDeliveryDispatchType

  let UNKNOWNEnum = "UNKNOWN"
  let BUYEREnum = "BUYER"
  let MARKETPARTNEROUTLETEnum = "MARKET_PARTNER_OUTLET"
  let MARKETBRANDEDOUTLETEnum = "MARKET_BRANDED_OUTLET"
  let SHOPOUTLETEnum = "SHOP_OUTLET"
  let DROPOFFEnum = "DROPOFF"
  type OrderDeliveryDispatchType = string

  //#endregion
