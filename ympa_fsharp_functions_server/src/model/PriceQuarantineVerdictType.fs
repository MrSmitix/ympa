namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PriceQuarantineVerdictType =

  //#region PriceQuarantineVerdictType

  let PRICECHANGEEnum = "PRICE_CHANGE"
  let LOWPRICEEnum = "LOW_PRICE"
  let LOWPRICEPROMOEnum = "LOW_PRICE_PROMO"
  type PriceQuarantineVerdictType = string

  //#endregion
