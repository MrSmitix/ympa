namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.PagedReturnsDTO

module GetReturnsResponse =

  //#region GetReturnsResponse


  type GetReturnsResponse = {
    Status : ApiResponseStatusType;
    Result : PagedReturnsDTO;
  }
  //#endregion
