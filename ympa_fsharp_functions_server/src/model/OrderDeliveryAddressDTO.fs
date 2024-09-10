namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.GpsDTO

module OrderDeliveryAddressDTO =

  //#region OrderDeliveryAddressDTO

  [<CLIMutable>]
  type OrderDeliveryAddressDTO = {
    [<JsonProperty(PropertyName = "country")>]
    Country : string;
    [<JsonProperty(PropertyName = "postcode")>]
    Postcode : string;
    [<JsonProperty(PropertyName = "city")>]
    City : string;
    [<JsonProperty(PropertyName = "district")>]
    District : string;
    [<JsonProperty(PropertyName = "subway")>]
    Subway : string;
    [<JsonProperty(PropertyName = "street")>]
    Street : string;
    [<JsonProperty(PropertyName = "house")>]
    House : string;
    [<JsonProperty(PropertyName = "block")>]
    Block : string;
    [<JsonProperty(PropertyName = "entrance")>]
    Entrance : string;
    [<JsonProperty(PropertyName = "entryphone")>]
    Entryphone : string;
    [<JsonProperty(PropertyName = "floor")>]
    Floor : string;
    [<JsonProperty(PropertyName = "apartment")>]
    Apartment : string;
    [<JsonProperty(PropertyName = "phone")>]
    Phone : string;
    [<JsonProperty(PropertyName = "recipient")>]
    Recipient : string;
    [<JsonProperty(PropertyName = "gps")>]
    Gps : GpsDTO;
  }

  //#endregion
