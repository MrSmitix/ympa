namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.EnrichedOrderBoxLayoutDTO

module OrderBoxesLayoutDTO =

  //#region OrderBoxesLayoutDTO

  [<CLIMutable>]
  type OrderBoxesLayoutDTO = {
    [<JsonProperty(PropertyName = "boxes")>]
    Boxes : EnrichedOrderBoxLayoutDTO[];
  }

  //#endregion
