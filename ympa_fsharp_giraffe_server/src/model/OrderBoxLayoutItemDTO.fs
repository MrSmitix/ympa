namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.BriefOrderItemInstanceDTO
open ympa_fsharp_giraffe_server.Model.OrderBoxLayoutPartialCountDTO

module OrderBoxLayoutItemDTO =

  //#region OrderBoxLayoutItemDTO


  type OrderBoxLayoutItemDTO = {
    Id : int64;
    FullCount : int;
    PartialCount : OrderBoxLayoutPartialCountDTO;
    Instances : BriefOrderItemInstanceDTO[];
  }
  //#endregion
