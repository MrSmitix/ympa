namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrderBusinessBuyerDTO =

  //#region OrderBusinessBuyerDTO

  [<CLIMutable>]
  type OrderBusinessBuyerDTO = {
    [<JsonProperty(PropertyName = "inn")>]
    Inn : string;
    [<JsonProperty(PropertyName = "kpp")>]
    Kpp : string;
    [<JsonProperty(PropertyName = "organizationName")>]
    OrganizationName : string;
    [<JsonProperty(PropertyName = "organizationJurAddress")>]
    OrganizationJurAddress : string;
  }

  //#endregion
