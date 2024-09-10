namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.FeedIndexLogsResultDTO

module GetFeedIndexLogsResponse =

  //#region GetFeedIndexLogsResponse


  type GetFeedIndexLogsResponse = {
    Status : ApiResponseStatusType;
    Result : FeedIndexLogsResultDTO;
  }
  //#endregion
