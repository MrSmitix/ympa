namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.AddOffersToArchiveDTO
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType

module AddOffersToArchiveResponse =

  //#region AddOffersToArchiveResponse


  type AddOffersToArchiveResponse = {
    Status : ApiResponseStatusType;
    Result : AddOffersToArchiveDTO;
  }
  //#endregion
