namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PriceQuarantineVerdictParamNameType =

  //#region PriceQuarantineVerdictParamNameType

  let CURRENTPRICEEnum = "CURRENT_PRICE"
  let LASTVALIDPRICEEnum = "LAST_VALID_PRICE"
  let MINPRICEEnum = "MIN_PRICE"
  let CURRENCYEnum = "CURRENCY"
  type PriceQuarantineVerdictParamNameType = string

  //#endregion
