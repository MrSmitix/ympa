namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.CategoryParameterDTO

module CategoryContentParametersDTO =

  //#region CategoryContentParametersDTO


  type CategoryContentParametersDTO = {
    CategoryId : int;
    Parameters : CategoryParameterDTO[];
  }
  //#endregion
