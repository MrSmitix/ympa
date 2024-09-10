namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.LanguageType

module GetCategoriesRequest =

  //#region GetCategoriesRequest


  type GetCategoriesRequest = {
    Language : LanguageType;
  }
  //#endregion
