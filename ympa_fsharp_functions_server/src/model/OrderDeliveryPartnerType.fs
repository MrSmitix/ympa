namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrderDeliveryPartnerType =

  //#region OrderDeliveryPartnerType

  let SHOPEnum = "SHOP"
  let YANDEXMARKETEnum = "YANDEX_MARKET"
  let UNKNOWNEnum = "UNKNOWN"
  type OrderDeliveryPartnerType = string

  //#endregion
