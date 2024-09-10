namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.FeedDownloadErrorType

module FeedDownloadErrorDTO =

  //#region FeedDownloadErrorDTO


  type FeedDownloadErrorDTO = {
    HttpStatusCode : int;
    Type : FeedDownloadErrorType;
    Description : string;
  }
  //#endregion
