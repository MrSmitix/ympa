namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.FeedContentErrorDTO
open ympa_fsharp_giraffe_server.Model.FeedStatusType

module FeedContentDTO =

  //#region FeedContentDTO


  type FeedContentDTO = {
    RejectedOffersCount : int64;
    Status : FeedStatusType;
    TotalOffersCount : int64;
    Error : FeedContentErrorDTO;
  }
  //#endregion
