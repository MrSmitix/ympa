namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ForwardScrollingPagerDTO
open ympa_fsharp_giraffe_server.Model.GoodsFeedbackCommentDTO

module GoodsFeedbackCommentListDTO =

  //#region GoodsFeedbackCommentListDTO


  type GoodsFeedbackCommentListDTO = {
    Comments : GoodsFeedbackCommentDTO[];
    Paging : ForwardScrollingPagerDTO;
  }
  //#endregion
