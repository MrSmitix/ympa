namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module UpdateGoodsFeedbackCommentDTO =

  //#region UpdateGoodsFeedbackCommentDTO

  [<CLIMutable>]
  type UpdateGoodsFeedbackCommentDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "parentId")>]
    ParentId : int64;
    [<JsonProperty(PropertyName = "text")>]
    Text : string;
  }

  //#endregion
