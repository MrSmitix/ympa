namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.GetPriceWithDiscountDTO
open ympa_fsharp_functions_server.Model.GetPriceWithVatDTO
open ympa_fsharp_functions_server.Model.OfferCampaignStatusType
open ympa_fsharp_functions_server.Model.OfferErrorDTO
open ympa_fsharp_functions_server.Model.QuantumDTO

module GetCampaignOfferDTO =

  //#region GetCampaignOfferDTO

  [<CLIMutable>]
  type GetCampaignOfferDTO = {
    [<JsonProperty(PropertyName = "offerId")>]
    OfferId : string;
    [<JsonProperty(PropertyName = "quantum")>]
    Quantum : QuantumDTO;
    [<JsonProperty(PropertyName = "available")>]
    Available : bool;
    [<JsonProperty(PropertyName = "basicPrice")>]
    BasicPrice : GetPriceWithDiscountDTO;
    [<JsonProperty(PropertyName = "campaignPrice")>]
    CampaignPrice : GetPriceWithVatDTO;
    [<JsonProperty(PropertyName = "status")>]
    Status : OfferCampaignStatusType;
    [<JsonProperty(PropertyName = "errors")>]
    Errors : OfferErrorDTO[];
    [<JsonProperty(PropertyName = "warnings")>]
    Warnings : OfferErrorDTO[];
  }

  //#endregion
