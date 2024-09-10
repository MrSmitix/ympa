namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module GoodsFeedbackMediaDTO =

  //#region GoodsFeedbackMediaDTO

  [<CLIMutable>]
  type GoodsFeedbackMediaDTO = {
    [<JsonProperty(PropertyName = "photos")>]
    Photos : string[];
    [<JsonProperty(PropertyName = "videos")>]
    Videos : string[];
  }

  //#endregion
