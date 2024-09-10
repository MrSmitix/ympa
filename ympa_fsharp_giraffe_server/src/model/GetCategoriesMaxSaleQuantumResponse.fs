namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.CategoryErrorDTO
open ympa_fsharp_giraffe_server.Model.MaxSaleQuantumDTO

module GetCategoriesMaxSaleQuantumResponse =

  //#region GetCategoriesMaxSaleQuantumResponse


  type GetCategoriesMaxSaleQuantumResponse = {
    Status : ApiResponseStatusType;
    Results : MaxSaleQuantumDTO[];
    Errors : CategoryErrorDTO[];
  }
  //#endregion
