namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.EnrichedModelDTO

module EnrichedModelsDTO =

  //#region EnrichedModelsDTO


  type EnrichedModelsDTO = {
    Models : EnrichedModelDTO[];
  }
  //#endregion
