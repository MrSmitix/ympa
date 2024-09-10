namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.ShipmentDTO

module GetShipmentResponse =

  //#region GetShipmentResponse


  type GetShipmentResponse = {
    Status : ApiResponseStatusType;
    Result : ShipmentDTO;
  }
  //#endregion
