namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ReturnDecisionDTO
open ympa_fsharp_giraffe_server.Model.ReturnInstanceDTO
open ympa_fsharp_giraffe_server.Model.TrackDTO

module ReturnItemDTO =

  //#region ReturnItemDTO


  type ReturnItemDTO = {
    MarketSku : int64;
    ShopSku : string;
    Count : int64;
    Decisions : ReturnDecisionDTO[];
    Instances : ReturnInstanceDTO[];
    Tracks : TrackDTO[];
  }
  //#endregion
