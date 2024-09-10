namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.GoodsFeedbackCommentAuthorType

module GoodsFeedbackCommentAuthorDTO =

  //#region GoodsFeedbackCommentAuthorDTO

  [<CLIMutable>]
  type GoodsFeedbackCommentAuthorDTO = {
    [<JsonProperty(PropertyName = "type")>]
    Type : GoodsFeedbackCommentAuthorType;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
