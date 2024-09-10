namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.FeedIndexLogsErrorType

module FeedIndexLogsErrorDTO =

  //#region FeedIndexLogsErrorDTO


  type FeedIndexLogsErrorDTO = {
    HttpStatusCode : int;
    Type : FeedIndexLogsErrorType;
    Description : string;
  }
  //#endregion
