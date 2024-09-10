namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.CategoryErrorDTO
open ympa_fsharp_giraffe_server.Model.MaxSaleQuantumDTO

module GetCategoriesMaxSaleQuantumDTO =

  //#region GetCategoriesMaxSaleQuantumDTO


  type GetCategoriesMaxSaleQuantumDTO = {
    Results : MaxSaleQuantumDTO[];
    Errors : CategoryErrorDTO[];
  }
  //#endregion
