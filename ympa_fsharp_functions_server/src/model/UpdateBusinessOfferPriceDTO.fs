namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.UpdatePriceWithDiscountDTO

module UpdateBusinessOfferPriceDTO =

  //#region UpdateBusinessOfferPriceDTO

  [<CLIMutable>]
  type UpdateBusinessOfferPriceDTO = {
    [<JsonProperty(PropertyName = "offerId")>]
    OfferId : string;
    [<JsonProperty(PropertyName = "price")>]
    Price : UpdatePriceWithDiscountDTO;
  }

  //#endregion
