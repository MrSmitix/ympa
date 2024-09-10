namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module DeleteGoodsFeedbackCommentRequest =

  //#region DeleteGoodsFeedbackCommentRequest

  [<CLIMutable>]
  type DeleteGoodsFeedbackCommentRequest = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
  }

  //#endregion
