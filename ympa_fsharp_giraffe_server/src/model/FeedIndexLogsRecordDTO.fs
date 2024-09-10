namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.FeedIndexLogsErrorDTO
open ympa_fsharp_giraffe_server.Model.FeedIndexLogsIndexType
open ympa_fsharp_giraffe_server.Model.FeedIndexLogsOffersDTO
open ympa_fsharp_giraffe_server.Model.FeedIndexLogsStatusType

module FeedIndexLogsRecordDTO =

  //#region FeedIndexLogsRecordDTO


  type FeedIndexLogsRecordDTO = {
    DownloadTime : Nullable<DateTime>;
    FileTime : Nullable<DateTime>;
    GenerationId : int64;
    IndexType : FeedIndexLogsIndexType;
    PublishedTime : Nullable<DateTime>;
    Status : FeedIndexLogsStatusType;
    Error : FeedIndexLogsErrorDTO;
    Offers : FeedIndexLogsOffersDTO;
  }
  //#endregion
