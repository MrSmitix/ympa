namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ModelDTO

module ModelsDTO =

  //#region ModelsDTO

  [<CLIMutable>]
  type ModelsDTO = {
    [<JsonProperty(PropertyName = "models")>]
    Models : ModelDTO[];
  }

  //#endregion
