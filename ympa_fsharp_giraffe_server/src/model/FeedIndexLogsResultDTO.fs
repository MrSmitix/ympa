namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.FeedIndexLogsFeedDTO
open ympa_fsharp_giraffe_server.Model.FeedIndexLogsRecordDTO

module FeedIndexLogsResultDTO =

  //#region FeedIndexLogsResultDTO


  type FeedIndexLogsResultDTO = {
    Feed : FeedIndexLogsFeedDTO;
    IndexLogRecords : FeedIndexLogsRecordDTO[];
    Total : int64;
  }
  //#endregion
