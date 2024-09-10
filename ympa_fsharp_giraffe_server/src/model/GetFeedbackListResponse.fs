namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.FeedbackListDTO

module GetFeedbackListResponse =

  //#region GetFeedbackListResponse


  type GetFeedbackListResponse = {
    Status : ApiResponseStatusType;
    Result : FeedbackListDTO;
  }
  //#endregion
