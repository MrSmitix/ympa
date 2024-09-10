namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.CategoryDTO

module GetCategoriesResponse =

  //#region GetCategoriesResponse


  type GetCategoriesResponse = {
    Status : ApiResponseStatusType;
    Result : CategoryDTO;
  }
  //#endregion
