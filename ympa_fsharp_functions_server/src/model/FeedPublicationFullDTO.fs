namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module FeedPublicationFullDTO =

  //#region FeedPublicationFullDTO

  [<CLIMutable>]
  type FeedPublicationFullDTO = {
    [<JsonProperty(PropertyName = "fileTime")>]
    FileTime : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "publishedTime")>]
    PublishedTime : Nullable<DateTime>;
  }

  //#endregion
