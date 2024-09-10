namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.FeedStatusType

module FeedPlacementDTO =

  //#region FeedPlacementDTO


  type FeedPlacementDTO = {
    Status : FeedStatusType;
    TotalOffersCount : int;
  }
  //#endregion
