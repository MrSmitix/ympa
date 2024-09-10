namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.DeleteOffersFromArchiveDTO

module DeleteOffersFromArchiveResponse =

  //#region DeleteOffersFromArchiveResponse


  type DeleteOffersFromArchiveResponse = {
    Status : ApiResponseStatusType;
    Result : DeleteOffersFromArchiveDTO;
  }
  //#endregion
