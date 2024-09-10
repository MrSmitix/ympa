namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.BriefOrderItemDTO

module OrderItemsModificationResultDTO =

  //#region OrderItemsModificationResultDTO


  type OrderItemsModificationResultDTO = {
    Items : BriefOrderItemDTO[];
  }
  //#endregion
