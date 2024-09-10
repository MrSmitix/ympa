namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.CategoryContentParametersDTO

module GetCategoryContentParametersResponse =

  //#region GetCategoryContentParametersResponse


  type GetCategoryContentParametersResponse = {
    Status : ApiResponseStatusType;
    Result : CategoryContentParametersDTO;
  }
  //#endregion
