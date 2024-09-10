namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.GoodsFeedbackCommentListDTO

module GetGoodsFeedbackCommentsResponse =

  //#region GetGoodsFeedbackCommentsResponse


  type GetGoodsFeedbackCommentsResponse = {
    Status : ApiResponseStatusType;
    Result : GoodsFeedbackCommentListDTO;
  }
  //#endregion
