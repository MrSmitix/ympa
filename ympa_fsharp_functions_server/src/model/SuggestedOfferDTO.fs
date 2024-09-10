namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.BasePriceDTO

module SuggestedOfferDTO =

  //#region SuggestedOfferDTO

  [<CLIMutable>]
  type SuggestedOfferDTO = {
    [<JsonProperty(PropertyName = "offerId")>]
    OfferId : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "category")>]
    Category : string;
    [<JsonProperty(PropertyName = "vendor")>]
    Vendor : string;
    [<JsonProperty(PropertyName = "barcodes")>]
    Barcodes : string[];
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "vendorCode")>]
    VendorCode : string;
    [<JsonProperty(PropertyName = "basicPrice")>]
    BasicPrice : BasePriceDTO;
  }

  //#endregion
