namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.FeedParameterDTO

module SetFeedParamsRequest =

  //#region SetFeedParamsRequest


  type SetFeedParamsRequest = {
    Parameters : FeedParameterDTO[];
  }
  //#endregion
