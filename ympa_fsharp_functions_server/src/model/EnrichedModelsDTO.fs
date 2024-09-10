namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.EnrichedModelDTO

module EnrichedModelsDTO =

  //#region EnrichedModelsDTO

  [<CLIMutable>]
  type EnrichedModelsDTO = {
    [<JsonProperty(PropertyName = "models")>]
    Models : EnrichedModelDTO[];
  }

  //#endregion
