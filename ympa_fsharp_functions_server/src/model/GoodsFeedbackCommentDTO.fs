namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.GoodsFeedbackCommentAuthorDTO
open ympa_fsharp_functions_server.Model.GoodsFeedbackCommentStatusType

module GoodsFeedbackCommentDTO =

  //#region GoodsFeedbackCommentDTO

  [<CLIMutable>]
  type GoodsFeedbackCommentDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "text")>]
    Text : string;
    [<JsonProperty(PropertyName = "canModify")>]
    CanModify : bool;
    [<JsonProperty(PropertyName = "parentId")>]
    ParentId : int64;
    [<JsonProperty(PropertyName = "author")>]
    Author : GoodsFeedbackCommentAuthorDTO;
    [<JsonProperty(PropertyName = "status")>]
    Status : GoodsFeedbackCommentStatusType;
  }

  //#endregion
