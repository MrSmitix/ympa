namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.FeedDTO

module GetFeedsResponse =

  //#region GetFeedsResponse

  [<CLIMutable>]
  type GetFeedsResponse = {
    [<JsonProperty(PropertyName = "feeds")>]
    Feeds : FeedDTO[];
  }

  //#endregion
