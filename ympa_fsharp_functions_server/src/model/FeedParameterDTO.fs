namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module FeedParameterDTO =

  //#region FeedParameterDTO

  [<CLIMutable>]
  type FeedParameterDTO = {
    [<JsonProperty(PropertyName = "deleted")>]
    Deleted : bool;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "values")>]
    Values : int[];
  }

  //#endregion
