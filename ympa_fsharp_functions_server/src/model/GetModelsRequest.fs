namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module GetModelsRequest =

  //#region GetModelsRequest

  [<CLIMutable>]
  type GetModelsRequest = {
    [<JsonProperty(PropertyName = "models")>]
    Models : int64[];
  }

  //#endregion
