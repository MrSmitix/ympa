namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.OutletResponseDTO

module CreateOutletResponse =

  //#region CreateOutletResponse


  type CreateOutletResponse = {
    Status : ApiResponseStatusType;
    Result : OutletResponseDTO;
  }
  //#endregion
