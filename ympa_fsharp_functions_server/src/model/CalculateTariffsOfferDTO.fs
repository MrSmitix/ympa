namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CalculateTariffsOfferDTO =

  //#region CalculateTariffsOfferDTO

  [<CLIMutable>]
  type CalculateTariffsOfferDTO = {
    [<JsonProperty(PropertyName = "categoryId")>]
    CategoryId : int64;
    [<JsonProperty(PropertyName = "price")>]
    Price : decimal;
    [<JsonProperty(PropertyName = "length")>]
    Length : decimal;
    [<JsonProperty(PropertyName = "width")>]
    Width : decimal;
    [<JsonProperty(PropertyName = "height")>]
    Height : decimal;
    [<JsonProperty(PropertyName = "weight")>]
    Weight : decimal;
    [<JsonProperty(PropertyName = "quantity")>]
    Quantity : int;
  }

  //#endregion
