namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module UpdateGoodsFeedbackCommentDTO =

  //#region UpdateGoodsFeedbackCommentDTO


  type UpdateGoodsFeedbackCommentDTO = {
    Id : int64;
    ParentId : int64;
    Text : string;
  }
  //#endregion
