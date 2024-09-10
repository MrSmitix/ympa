namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.FeedContentErrorType

module FeedContentErrorDTO =

  //#region FeedContentErrorDTO


  type FeedContentErrorDTO = {
    Type : FeedContentErrorType;
  }
  //#endregion
