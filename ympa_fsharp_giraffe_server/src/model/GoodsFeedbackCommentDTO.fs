namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.GoodsFeedbackCommentAuthorDTO
open ympa_fsharp_giraffe_server.Model.GoodsFeedbackCommentStatusType

module GoodsFeedbackCommentDTO =

  //#region GoodsFeedbackCommentDTO


  type GoodsFeedbackCommentDTO = {
    Id : int64;
    Text : string;
    CanModify : bool;
    ParentId : int64;
    Author : GoodsFeedbackCommentAuthorDTO;
    Status : GoodsFeedbackCommentStatusType;
  }
  //#endregion
