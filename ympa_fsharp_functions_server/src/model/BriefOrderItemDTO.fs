namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OrderItemInstanceDTO
open ympa_fsharp_functions_server.Model.OrderVatType

module BriefOrderItemDTO =

  //#region BriefOrderItemDTO

  [<CLIMutable>]
  type BriefOrderItemDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "vat")>]
    Vat : OrderVatType;
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "price")>]
    Price : decimal;
    [<JsonProperty(PropertyName = "offerName")>]
    OfferName : string;
    [<JsonProperty(PropertyName = "offerId")>]
    OfferId : string;
    [<JsonProperty(PropertyName = "instances")>]
    Instances : OrderItemInstanceDTO[];
  }

  //#endregion
