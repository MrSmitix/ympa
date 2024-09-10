namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.FeedbackCommentAuthorDTO

module FeedbackCommentDTO =

  //#region FeedbackCommentDTO


  type FeedbackCommentDTO = {
    Id : int64;
    ParentId : int64;
    Body : string;
    CreatedAt : Nullable<DateTime>;
    UpdatedAt : Nullable<DateTime>;
    Author : FeedbackCommentAuthorDTO;
    Children : FeedbackCommentDTO[];
  }
  //#endregion
