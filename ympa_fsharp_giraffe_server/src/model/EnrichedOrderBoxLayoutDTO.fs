namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OrderBoxLayoutItemDTO

module EnrichedOrderBoxLayoutDTO =

  //#region EnrichedOrderBoxLayoutDTO


  type EnrichedOrderBoxLayoutDTO = {
    Items : OrderBoxLayoutItemDTO[];
    BoxId : int64;
  }
  //#endregion
