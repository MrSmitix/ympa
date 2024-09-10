namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OrderItemSubsidyType

module OrderItemSubsidyDTO =

  //#region OrderItemSubsidyDTO


  type OrderItemSubsidyDTO = {
    Type : OrderItemSubsidyType;
    Amount : decimal;
  }
  //#endregion
