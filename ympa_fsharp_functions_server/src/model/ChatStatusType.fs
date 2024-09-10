namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ChatStatusType =

  //#region ChatStatusType

  let NEWEnum = "NEW"
  let WAITINGFORCUSTOMEREnum = "WAITING_FOR_CUSTOMER"
  let WAITINGFORPARTNEREnum = "WAITING_FOR_PARTNER"
  let WAITINGFORARBITEREnum = "WAITING_FOR_ARBITER"
  let WAITINGFORMARKETEnum = "WAITING_FOR_MARKET"
  let FINISHEDEnum = "FINISHED"
  type ChatStatusType = string

  //#endregion
