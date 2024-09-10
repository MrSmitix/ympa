namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.FeedbackCommentAuthorType

module FeedbackCommentAuthorDTO =

  //#region FeedbackCommentAuthorDTO


  type FeedbackCommentAuthorDTO = {
    Type : FeedbackCommentAuthorType;
    Name : string;
  }
  //#endregion
