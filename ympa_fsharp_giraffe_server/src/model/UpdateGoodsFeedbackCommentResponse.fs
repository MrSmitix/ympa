namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.GoodsFeedbackCommentDTO

module UpdateGoodsFeedbackCommentResponse =

  //#region UpdateGoodsFeedbackCommentResponse


  type UpdateGoodsFeedbackCommentResponse = {
    Status : ApiResponseStatusType;
    Result : GoodsFeedbackCommentDTO;
  }
  //#endregion
