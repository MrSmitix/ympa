namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.SuggestPricesResultDTO

module SuggestPricesResponse =

  //#region SuggestPricesResponse


  type SuggestPricesResponse = {
    Status : ApiResponseStatusType;
    Result : SuggestPricesResultDTO;
  }
  //#endregion
