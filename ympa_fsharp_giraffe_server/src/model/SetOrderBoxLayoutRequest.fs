namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OrderBoxLayoutDTO

module SetOrderBoxLayoutRequest =

  //#region SetOrderBoxLayoutRequest


  type SetOrderBoxLayoutRequest = {
    Boxes : OrderBoxLayoutDTO[];
    AllowRemove : bool;
  }
  //#endregion
