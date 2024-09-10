namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.GoodsFeedbackListDTO

module GetGoodsFeedbackResponse =

  //#region GetGoodsFeedbackResponse


  type GetGoodsFeedbackResponse = {
    Status : ApiResponseStatusType;
    Result : GoodsFeedbackListDTO;
  }
  //#endregion
