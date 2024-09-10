namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ApiResponseStatusType
open ympa_fsharp_functions_server.Model.OfferPriceByOfferIdsListResponseDTO

module GetPricesByOfferIdsResponse =

  //#region GetPricesByOfferIdsResponse

  [<CLIMutable>]
  type GetPricesByOfferIdsResponse = {
    [<JsonProperty(PropertyName = "status")>]
    Status : ApiResponseStatusType;
    [<JsonProperty(PropertyName = "result")>]
    Result : OfferPriceByOfferIdsListResponseDTO;
  }

  //#endregion
