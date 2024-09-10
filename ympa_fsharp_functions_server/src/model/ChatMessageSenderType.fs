namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ChatMessageSenderType =

  //#region ChatMessageSenderType

  let PARTNEREnum = "PARTNER"
  let CUSTOMEREnum = "CUSTOMER"
  let MARKETEnum = "MARKET"
  let SUPPORTEnum = "SUPPORT"
  type ChatMessageSenderType = string

  //#endregion
