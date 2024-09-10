namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.FeedParameterDTO

module SetFeedParamsRequest =

  //#region SetFeedParamsRequest

  [<CLIMutable>]
  type SetFeedParamsRequest = {
    [<JsonProperty(PropertyName = "parameters")>]
    Parameters : FeedParameterDTO[];
  }

  //#endregion
