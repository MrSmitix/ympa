namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module FeedIndexLogsFeedDTO =

  //#region FeedIndexLogsFeedDTO

  [<CLIMutable>]
  type FeedIndexLogsFeedDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
  }

  //#endregion
