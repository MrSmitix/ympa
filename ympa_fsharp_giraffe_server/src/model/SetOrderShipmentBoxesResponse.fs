namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.ShipmentBoxesDTO

module SetOrderShipmentBoxesResponse =

  //#region SetOrderShipmentBoxesResponse


  type SetOrderShipmentBoxesResponse = {
    Status : ApiResponseStatusType;
    Result : ShipmentBoxesDTO;
  }
  //#endregion
