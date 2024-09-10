namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.FeedContentErrorType

module FeedContentErrorDTO =

  //#region FeedContentErrorDTO

  [<CLIMutable>]
  type FeedContentErrorDTO = {
    [<JsonProperty(PropertyName = "type")>]
    Type : FeedContentErrorType;
  }

  //#endregion
