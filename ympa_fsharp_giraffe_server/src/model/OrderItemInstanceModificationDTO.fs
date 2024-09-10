namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.BriefOrderItemInstanceDTO

module OrderItemInstanceModificationDTO =

  //#region OrderItemInstanceModificationDTO


  type OrderItemInstanceModificationDTO = {
    Id : int64;
    Instances : BriefOrderItemInstanceDTO[];
  }
  //#endregion
