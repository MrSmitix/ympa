namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module GetPromoPromocodeInfoDTO =

  //#region GetPromoPromocodeInfoDTO

  [<CLIMutable>]
  type GetPromoPromocodeInfoDTO = {
    [<JsonProperty(PropertyName = "promocode")>]
    Promocode : string;
    [<JsonProperty(PropertyName = "discount")>]
    Discount : int;
  }

  //#endregion
