namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.OrderBoxesLayoutDTO

module SetOrderBoxLayoutResponse =

  //#region SetOrderBoxLayoutResponse


  type SetOrderBoxLayoutResponse = {
    Status : ApiResponseStatusType;
    Result : OrderBoxesLayoutDTO;
  }
  //#endregion
