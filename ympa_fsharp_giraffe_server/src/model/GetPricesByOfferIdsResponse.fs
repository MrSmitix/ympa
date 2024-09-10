namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.OfferPriceByOfferIdsListResponseDTO

module GetPricesByOfferIdsResponse =

  //#region GetPricesByOfferIdsResponse


  type GetPricesByOfferIdsResponse = {
    Status : ApiResponseStatusType;
    Result : OfferPriceByOfferIdsListResponseDTO;
  }
  //#endregion
