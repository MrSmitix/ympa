namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.CategoryErrorType

module CategoryErrorDTO =

  //#region CategoryErrorDTO


  type CategoryErrorDTO = {
    CategoryId : int64;
    Type : CategoryErrorType;
  }
  //#endregion
