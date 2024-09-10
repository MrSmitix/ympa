namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.FeedDownloadErrorType

module FeedDownloadErrorDTO =

  //#region FeedDownloadErrorDTO

  [<CLIMutable>]
  type FeedDownloadErrorDTO = {
    [<JsonProperty(PropertyName = "httpStatusCode")>]
    HttpStatusCode : int;
    [<JsonProperty(PropertyName = "type")>]
    Type : FeedDownloadErrorType;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
  }

  //#endregion
