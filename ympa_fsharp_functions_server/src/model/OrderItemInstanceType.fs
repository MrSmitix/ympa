namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrderItemInstanceType =

  //#region OrderItemInstanceType

  let CISEnum = "CIS"
  let UINEnum = "UIN"
  let RNPTEnum = "RNPT"
  let GTDEnum = "GTD"
  type OrderItemInstanceType = string

  //#endregion
