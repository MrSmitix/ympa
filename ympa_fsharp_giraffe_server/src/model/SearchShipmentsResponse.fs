namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.SearchShipmentsResponseDTO

module SearchShipmentsResponse =

  //#region SearchShipmentsResponse


  type SearchShipmentsResponse = {
    Status : ApiResponseStatusType;
    Result : SearchShipmentsResponseDTO;
  }
  //#endregion
