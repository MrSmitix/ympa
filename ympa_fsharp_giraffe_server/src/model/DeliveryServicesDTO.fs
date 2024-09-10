namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.DeliveryServiceInfoDTO

module DeliveryServicesDTO =

  //#region DeliveryServicesDTO


  type DeliveryServicesDTO = {
    DeliveryService : DeliveryServiceInfoDTO[];
  }
  //#endregion
