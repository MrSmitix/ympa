namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.FeedbackCommentAuthorDTO

module FeedbackCommentDTO =

  //#region FeedbackCommentDTO

  [<CLIMutable>]
  type FeedbackCommentDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "parentId")>]
    ParentId : int64;
    [<JsonProperty(PropertyName = "body")>]
    Body : string;
    [<JsonProperty(PropertyName = "createdAt")>]
    CreatedAt : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "updatedAt")>]
    UpdatedAt : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "author")>]
    Author : FeedbackCommentAuthorDTO;
    [<JsonProperty(PropertyName = "children")>]
    Children : FeedbackCommentDTO[];
  }

  //#endregion
