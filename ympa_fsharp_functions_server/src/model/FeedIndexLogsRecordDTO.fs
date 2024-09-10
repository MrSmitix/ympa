namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.FeedIndexLogsErrorDTO
open ympa_fsharp_functions_server.Model.FeedIndexLogsIndexType
open ympa_fsharp_functions_server.Model.FeedIndexLogsOffersDTO
open ympa_fsharp_functions_server.Model.FeedIndexLogsStatusType

module FeedIndexLogsRecordDTO =

  //#region FeedIndexLogsRecordDTO

  [<CLIMutable>]
  type FeedIndexLogsRecordDTO = {
    [<JsonProperty(PropertyName = "downloadTime")>]
    DownloadTime : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "fileTime")>]
    FileTime : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "generationId")>]
    GenerationId : int64;
    [<JsonProperty(PropertyName = "indexType")>]
    IndexType : FeedIndexLogsIndexType;
    [<JsonProperty(PropertyName = "publishedTime")>]
    PublishedTime : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "status")>]
    Status : FeedIndexLogsStatusType;
    [<JsonProperty(PropertyName = "error")>]
    Error : FeedIndexLogsErrorDTO;
    [<JsonProperty(PropertyName = "offers")>]
    Offers : FeedIndexLogsOffersDTO;
  }

  //#endregion
