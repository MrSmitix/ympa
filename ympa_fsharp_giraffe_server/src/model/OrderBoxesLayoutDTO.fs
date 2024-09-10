namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.EnrichedOrderBoxLayoutDTO

module OrderBoxesLayoutDTO =

  //#region OrderBoxesLayoutDTO


  type OrderBoxesLayoutDTO = {
    Boxes : EnrichedOrderBoxLayoutDTO[];
  }
  //#endregion
