namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.DeleteOffersDTO

module DeleteOffersResponse =

  //#region DeleteOffersResponse


  type DeleteOffersResponse = {
    Status : ApiResponseStatusType;
    Result : DeleteOffersDTO;
  }
  //#endregion
