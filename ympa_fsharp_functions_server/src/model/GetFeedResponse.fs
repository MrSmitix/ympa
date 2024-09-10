namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.FeedDTO

module GetFeedResponse =

  //#region GetFeedResponse

  [<CLIMutable>]
  type GetFeedResponse = {
    [<JsonProperty(PropertyName = "feed")>]
    Feed : FeedDTO;
  }

  //#endregion
