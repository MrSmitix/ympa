namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.GetMappingDTO
open ympa_fsharp_functions_server.Model.OfferCardRecommendationDTO
open ympa_fsharp_functions_server.Model.OfferCardStatusType
open ympa_fsharp_functions_server.Model.OfferErrorDTO
open ympa_fsharp_functions_server.Model.ParameterValueDTO

module OfferCardDTO =

  //#region OfferCardDTO

  [<CLIMutable>]
  type OfferCardDTO = {
    [<JsonProperty(PropertyName = "offerId")>]
    OfferId : string;
    [<JsonProperty(PropertyName = "mapping")>]
    Mapping : GetMappingDTO;
    [<JsonProperty(PropertyName = "parameterValues")>]
    ParameterValues : ParameterValueDTO[];
    [<JsonProperty(PropertyName = "cardStatus")>]
    CardStatus : OfferCardStatusType;
    [<JsonProperty(PropertyName = "contentRating")>]
    ContentRating : int;
    [<JsonProperty(PropertyName = "recommendations")>]
    Recommendations : OfferCardRecommendationDTO[];
    [<JsonProperty(PropertyName = "errors")>]
    Errors : OfferErrorDTO[];
    [<JsonProperty(PropertyName = "warnings")>]
    Warnings : OfferErrorDTO[];
  }

  //#endregion
