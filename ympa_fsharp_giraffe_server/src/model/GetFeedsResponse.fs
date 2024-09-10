namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.FeedDTO

module GetFeedsResponse =

  //#region GetFeedsResponse


  type GetFeedsResponse = {
    Feeds : FeedDTO[];
  }
  //#endregion
