namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.GoodsFeedbackCommentAuthorType

module GoodsFeedbackCommentAuthorDTO =

  //#region GoodsFeedbackCommentAuthorDTO


  type GoodsFeedbackCommentAuthorDTO = {
    Type : GoodsFeedbackCommentAuthorType;
    Name : string;
  }
  //#endregion
