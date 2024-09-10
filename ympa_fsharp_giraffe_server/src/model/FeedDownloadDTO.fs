namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.FeedDownloadErrorDTO
open ympa_fsharp_giraffe_server.Model.FeedStatusType

module FeedDownloadDTO =

  //#region FeedDownloadDTO


  type FeedDownloadDTO = {
    Status : FeedStatusType;
    Error : FeedDownloadErrorDTO;
  }
  //#endregion
