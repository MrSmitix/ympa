namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.GetPromoPromocodeInfoDTO
open ympa_fsharp_functions_server.Model.MechanicsType

module GetPromoMechanicsInfoDTO =

  //#region GetPromoMechanicsInfoDTO

  [<CLIMutable>]
  type GetPromoMechanicsInfoDTO = {
    [<JsonProperty(PropertyName = "type")>]
    Type : MechanicsType;
    [<JsonProperty(PropertyName = "promocodeInfo")>]
    PromocodeInfo : GetPromoPromocodeInfoDTO;
  }

  //#endregion
