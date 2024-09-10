namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.DeliveryServicesDTO

module GetDeliveryServicesResponse =

  //#region GetDeliveryServicesResponse


  type GetDeliveryServicesResponse = {
    Result : DeliveryServicesDTO;
  }
  //#endregion
