namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module GoodsFeedbackDescriptionDTO =

  //#region GoodsFeedbackDescriptionDTO

  [<CLIMutable>]
  type GoodsFeedbackDescriptionDTO = {
    [<JsonProperty(PropertyName = "advantages")>]
    Advantages : string;
    [<JsonProperty(PropertyName = "disadvantages")>]
    Disadvantages : string;
    [<JsonProperty(PropertyName = "comment")>]
    Comment : string;
  }

  //#endregion
