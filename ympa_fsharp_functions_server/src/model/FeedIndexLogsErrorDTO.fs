namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.FeedIndexLogsErrorType

module FeedIndexLogsErrorDTO =

  //#region FeedIndexLogsErrorDTO

  [<CLIMutable>]
  type FeedIndexLogsErrorDTO = {
    [<JsonProperty(PropertyName = "httpStatusCode")>]
    HttpStatusCode : int;
    [<JsonProperty(PropertyName = "type")>]
    Type : FeedIndexLogsErrorType;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
  }

  //#endregion
