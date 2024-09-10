namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.FeedbackCommentAuthorType

module FeedbackCommentAuthorDTO =

  //#region FeedbackCommentAuthorDTO

  [<CLIMutable>]
  type FeedbackCommentAuthorDTO = {
    [<JsonProperty(PropertyName = "type")>]
    Type : FeedbackCommentAuthorType;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
