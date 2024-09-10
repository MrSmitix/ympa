namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module FeedPublicationFullDTO =

  //#region FeedPublicationFullDTO


  type FeedPublicationFullDTO = {
    FileTime : Nullable<DateTime>;
    PublishedTime : Nullable<DateTime>;
  }
  //#endregion
