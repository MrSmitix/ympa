namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.BriefOrderItemInstanceDTO

module OrderItemModificationDTO =

  //#region OrderItemModificationDTO


  type OrderItemModificationDTO = {
    Id : int64;
    Count : int;
    Instances : BriefOrderItemInstanceDTO[];
  }
  //#endregion
