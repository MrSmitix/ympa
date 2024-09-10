namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ApiErrorDTO =

  //#region ApiErrorDTO

  [<CLIMutable>]
  type ApiErrorDTO = {
    [<JsonProperty(PropertyName = "code")>]
    Code : string;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
  }

  //#endregion
