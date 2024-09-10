namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OrderBuyerType

module OrderBuyerBasicInfoDTO =

  //#region OrderBuyerBasicInfoDTO

  [<CLIMutable>]
  type OrderBuyerBasicInfoDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "lastName")>]
    LastName : string;
    [<JsonProperty(PropertyName = "firstName")>]
    FirstName : string;
    [<JsonProperty(PropertyName = "middleName")>]
    MiddleName : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : OrderBuyerType;
  }

  //#endregion
