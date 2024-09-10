namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.FeedDownloadErrorDTO
open ympa_fsharp_functions_server.Model.FeedStatusType

module FeedDownloadDTO =

  //#region FeedDownloadDTO

  [<CLIMutable>]
  type FeedDownloadDTO = {
    [<JsonProperty(PropertyName = "status")>]
    Status : FeedStatusType;
    [<JsonProperty(PropertyName = "error")>]
    Error : FeedDownloadErrorDTO;
  }

  //#endregion
