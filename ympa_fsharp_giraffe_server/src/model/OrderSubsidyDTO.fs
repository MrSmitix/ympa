namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OrderSubsidyType

module OrderSubsidyDTO =

  //#region OrderSubsidyDTO


  type OrderSubsidyDTO = {
    Type : OrderSubsidyType;
    Amount : decimal;
  }
  //#endregion
