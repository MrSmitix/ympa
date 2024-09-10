namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrderDeliveryEacType =

  //#region OrderDeliveryEacType

  let MERCHANTTOCOURIEREnum = "MERCHANT_TO_COURIER"
  let COURIERTOMERCHANTEnum = "COURIER_TO_MERCHANT"
  let CHECKINGBYMERCHANTEnum = "CHECKING_BY_MERCHANT"
  type OrderDeliveryEacType = string

  //#endregion
