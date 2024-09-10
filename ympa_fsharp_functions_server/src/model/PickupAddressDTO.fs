namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PickupAddressDTO =

  //#region PickupAddressDTO

  [<CLIMutable>]
  type PickupAddressDTO = {
    [<JsonProperty(PropertyName = "country")>]
    Country : string;
    [<JsonProperty(PropertyName = "city")>]
    City : string;
    [<JsonProperty(PropertyName = "street")>]
    Street : string;
    [<JsonProperty(PropertyName = "house")>]
    House : string;
    [<JsonProperty(PropertyName = "postcode")>]
    Postcode : string;
  }

  //#endregion
