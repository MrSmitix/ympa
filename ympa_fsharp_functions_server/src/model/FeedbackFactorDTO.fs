namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module FeedbackFactorDTO =

  //#region FeedbackFactorDTO

  [<CLIMutable>]
  type FeedbackFactorDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "value")>]
    Value : int;
  }

  //#endregion
