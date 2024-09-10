namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.OfferPriceListResponseDTO

module GetPricesResponse =

  //#region GetPricesResponse


  type GetPricesResponse = {
    Status : ApiResponseStatusType;
    Result : OfferPriceListResponseDTO;
  }
  //#endregion
