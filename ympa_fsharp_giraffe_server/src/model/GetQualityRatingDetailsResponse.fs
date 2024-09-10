namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.QualityRatingDetailsDTO

module GetQualityRatingDetailsResponse =

  //#region GetQualityRatingDetailsResponse


  type GetQualityRatingDetailsResponse = {
    Status : ApiResponseStatusType;
    Result : QualityRatingDetailsDTO;
  }
  //#endregion
