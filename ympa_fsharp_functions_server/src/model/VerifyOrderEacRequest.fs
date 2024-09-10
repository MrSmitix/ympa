namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module VerifyOrderEacRequest =

  //#region VerifyOrderEacRequest

  [<CLIMutable>]
  type VerifyOrderEacRequest = {
    [<JsonProperty(PropertyName = "code")>]
    Code : string;
  }

  //#endregion
