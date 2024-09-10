namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.FeedIndexLogsFeedDTO
open ympa_fsharp_functions_server.Model.FeedIndexLogsRecordDTO

module FeedIndexLogsResultDTO =

  //#region FeedIndexLogsResultDTO

  [<CLIMutable>]
  type FeedIndexLogsResultDTO = {
    [<JsonProperty(PropertyName = "feed")>]
    Feed : FeedIndexLogsFeedDTO;
    [<JsonProperty(PropertyName = "indexLogRecords")>]
    IndexLogRecords : FeedIndexLogsRecordDTO[];
    [<JsonProperty(PropertyName = "total")>]
    Total : int64;
  }

  //#endregion
