namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.FeedDTO

module GetFeedResponse =

  //#region GetFeedResponse


  type GetFeedResponse = {
    Feed : FeedDTO;
  }
  //#endregion
