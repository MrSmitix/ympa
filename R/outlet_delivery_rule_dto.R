#' Create a new OutletDeliveryRuleDTO
#'
#' @description
#' Информация об условиях доставки для данной точки продаж.
#'
#' @docType class
#' @title OutletDeliveryRuleDTO
#' @description OutletDeliveryRuleDTO Class
#' @format An \code{R6Class} generator object
#' @field minDeliveryDays Минимальный срок доставки товаров в точку продаж. Указан в рабочих днях.  Минимальное значение: `0` — доставка в день заказа.  Максимальное значение: `60`.  Допустимые сроки доставки (разница между `minDeliveryDays` и `maxDeliveryDays`) зависят от региона.  Для доставки по своему региону разница не должна превышать двух дней. Например, если `minDeliveryDays` равно 1, то для `maxDeliveryDays` допускаются значения от 1 до 3.  Для доставки в другие регионы:  * Если `minDeliveryDays` до 18 дней, разница не должна превышать четырех дней. Например, если `minDeliveryDays` равно 10, то для `maxDeliveryDays` допускаются значения от 10 до 14. * Если `minDeliveryDays` больше 18 дней, разница должна быть не больше чем в два раза. Например, если `minDeliveryDays` равно 21, то для `maxDeliveryDays` допускаются значения от 21 до 42.  Обязательный параметр, если `type=\"DEPOT\"` или `type=\"MIXED\"`.  Взаимоисключающий с параметром `unspecifiedDeliveryInterval`. integer [optional]
#' @field maxDeliveryDays Максимальный срок доставки товаров в точку продаж. Указан в рабочих днях.  Минимальное значение: `0` — доставка в день заказа.  Максимальное значение: `60`.  Допустимые сроки доставки (разница между `minDeliveryDays` и `maxDeliveryDays`) зависят от региона.  Для доставки по своему региону разница не должна превышать двух дней. Например, если `minDeliveryDays` равно 1, то для `maxDeliveryDays` допускаются значения от 1 до 3.  Для доставки в другие регионы:  * Если `minDeliveryDays` до 18 дней, разница не должна превышать четырех дней. Например, если `minDeliveryDays` равно 10, то для `maxDeliveryDays` допускаются значения от 10 до 14. * Если `minDeliveryDays` больше 18 дней, разница должна быть не больше чем в два раза. Например, если `minDeliveryDays` равно 21, то для `maxDeliveryDays` допускаются значения от 21 до 42.  Обязательный параметр, если `type=\"DEPOT\"` или `type=\"MIXED\"`.  Взаимоисключающий с параметром `unspecifiedDeliveryInterval`. integer [optional]
#' @field deliveryServiceId Идентификатор службы доставки товаров в точку продаж.  Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). integer [optional]
#' @field orderBefore Час, до которого покупателю нужно сделать заказ, чтобы он был доставлен в точку продаж в сроки от `minDeliveryDays` до `maxDeliveryDays`.  Если покупатель оформит заказ после указанного часа, он будет доставлен в сроки от `minDeliveryDays` + 1 рабочий день до `maxDeliveryDays` + 1 рабочий день.  Значение по умолчанию: `24`. integer [optional]
#' @field priceFreePickup Цена на товар, начиная с которой действует бесплатный самовывоз товара из точки продаж. numeric [optional]
#' @field unspecifiedDeliveryInterval Признак доставки товаров в точку продаж на заказ.  Признак выставлен, если:  * точный срок доставки в точку продаж заранее неизвестен (например, если магазин собирает несколько заказов для отправки в точку или населенный пункт); * все товары изготавливаются или поставляются на заказ.  Возможные значения: * `true` — товары доставляются в точку продаж на заказ.  Параметр указывается только со значением `true`.  Взаимоисключающий с параметрами `minDeliveryDays` и `maxDeliveryDays`. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OutletDeliveryRuleDTO <- R6::R6Class(
  "OutletDeliveryRuleDTO",
  public = list(
    `minDeliveryDays` = NULL,
    `maxDeliveryDays` = NULL,
    `deliveryServiceId` = NULL,
    `orderBefore` = NULL,
    `priceFreePickup` = NULL,
    `unspecifiedDeliveryInterval` = NULL,
    #' Initialize a new OutletDeliveryRuleDTO class.
    #'
    #' @description
    #' Initialize a new OutletDeliveryRuleDTO class.
    #'
    #' @param minDeliveryDays Минимальный срок доставки товаров в точку продаж. Указан в рабочих днях.  Минимальное значение: `0` — доставка в день заказа.  Максимальное значение: `60`.  Допустимые сроки доставки (разница между `minDeliveryDays` и `maxDeliveryDays`) зависят от региона.  Для доставки по своему региону разница не должна превышать двух дней. Например, если `minDeliveryDays` равно 1, то для `maxDeliveryDays` допускаются значения от 1 до 3.  Для доставки в другие регионы:  * Если `minDeliveryDays` до 18 дней, разница не должна превышать четырех дней. Например, если `minDeliveryDays` равно 10, то для `maxDeliveryDays` допускаются значения от 10 до 14. * Если `minDeliveryDays` больше 18 дней, разница должна быть не больше чем в два раза. Например, если `minDeliveryDays` равно 21, то для `maxDeliveryDays` допускаются значения от 21 до 42.  Обязательный параметр, если `type=\"DEPOT\"` или `type=\"MIXED\"`.  Взаимоисключающий с параметром `unspecifiedDeliveryInterval`.
    #' @param maxDeliveryDays Максимальный срок доставки товаров в точку продаж. Указан в рабочих днях.  Минимальное значение: `0` — доставка в день заказа.  Максимальное значение: `60`.  Допустимые сроки доставки (разница между `minDeliveryDays` и `maxDeliveryDays`) зависят от региона.  Для доставки по своему региону разница не должна превышать двух дней. Например, если `minDeliveryDays` равно 1, то для `maxDeliveryDays` допускаются значения от 1 до 3.  Для доставки в другие регионы:  * Если `minDeliveryDays` до 18 дней, разница не должна превышать четырех дней. Например, если `minDeliveryDays` равно 10, то для `maxDeliveryDays` допускаются значения от 10 до 14. * Если `minDeliveryDays` больше 18 дней, разница должна быть не больше чем в два раза. Например, если `minDeliveryDays` равно 21, то для `maxDeliveryDays` допускаются значения от 21 до 42.  Обязательный параметр, если `type=\"DEPOT\"` или `type=\"MIXED\"`.  Взаимоисключающий с параметром `unspecifiedDeliveryInterval`.
    #' @param deliveryServiceId Идентификатор службы доставки товаров в точку продаж.  Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
    #' @param orderBefore Час, до которого покупателю нужно сделать заказ, чтобы он был доставлен в точку продаж в сроки от `minDeliveryDays` до `maxDeliveryDays`.  Если покупатель оформит заказ после указанного часа, он будет доставлен в сроки от `minDeliveryDays` + 1 рабочий день до `maxDeliveryDays` + 1 рабочий день.  Значение по умолчанию: `24`.
    #' @param priceFreePickup Цена на товар, начиная с которой действует бесплатный самовывоз товара из точки продаж.
    #' @param unspecifiedDeliveryInterval Признак доставки товаров в точку продаж на заказ.  Признак выставлен, если:  * точный срок доставки в точку продаж заранее неизвестен (например, если магазин собирает несколько заказов для отправки в точку или населенный пункт); * все товары изготавливаются или поставляются на заказ.  Возможные значения: * `true` — товары доставляются в точку продаж на заказ.  Параметр указывается только со значением `true`.  Взаимоисключающий с параметрами `minDeliveryDays` и `maxDeliveryDays`.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`minDeliveryDays` = NULL, `maxDeliveryDays` = NULL, `deliveryServiceId` = NULL, `orderBefore` = NULL, `priceFreePickup` = NULL, `unspecifiedDeliveryInterval` = NULL, ...) {
      if (!is.null(`minDeliveryDays`)) {
        if (!(is.numeric(`minDeliveryDays`) && length(`minDeliveryDays`) == 1)) {
          stop(paste("Error! Invalid data for `minDeliveryDays`. Must be an integer:", `minDeliveryDays`))
        }
        self$`minDeliveryDays` <- `minDeliveryDays`
      }
      if (!is.null(`maxDeliveryDays`)) {
        if (!(is.numeric(`maxDeliveryDays`) && length(`maxDeliveryDays`) == 1)) {
          stop(paste("Error! Invalid data for `maxDeliveryDays`. Must be an integer:", `maxDeliveryDays`))
        }
        self$`maxDeliveryDays` <- `maxDeliveryDays`
      }
      if (!is.null(`deliveryServiceId`)) {
        if (!(is.numeric(`deliveryServiceId`) && length(`deliveryServiceId`) == 1)) {
          stop(paste("Error! Invalid data for `deliveryServiceId`. Must be an integer:", `deliveryServiceId`))
        }
        self$`deliveryServiceId` <- `deliveryServiceId`
      }
      if (!is.null(`orderBefore`)) {
        if (!(is.numeric(`orderBefore`) && length(`orderBefore`) == 1)) {
          stop(paste("Error! Invalid data for `orderBefore`. Must be an integer:", `orderBefore`))
        }
        self$`orderBefore` <- `orderBefore`
      }
      if (!is.null(`priceFreePickup`)) {
        self$`priceFreePickup` <- `priceFreePickup`
      }
      if (!is.null(`unspecifiedDeliveryInterval`)) {
        if (!(is.logical(`unspecifiedDeliveryInterval`) && length(`unspecifiedDeliveryInterval`) == 1)) {
          stop(paste("Error! Invalid data for `unspecifiedDeliveryInterval`. Must be a boolean:", `unspecifiedDeliveryInterval`))
        }
        self$`unspecifiedDeliveryInterval` <- `unspecifiedDeliveryInterval`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OutletDeliveryRuleDTO in JSON format
    #' @export
    toJSON = function() {
      OutletDeliveryRuleDTOObject <- list()
      if (!is.null(self$`minDeliveryDays`)) {
        OutletDeliveryRuleDTOObject[["minDeliveryDays"]] <-
          self$`minDeliveryDays`
      }
      if (!is.null(self$`maxDeliveryDays`)) {
        OutletDeliveryRuleDTOObject[["maxDeliveryDays"]] <-
          self$`maxDeliveryDays`
      }
      if (!is.null(self$`deliveryServiceId`)) {
        OutletDeliveryRuleDTOObject[["deliveryServiceId"]] <-
          self$`deliveryServiceId`
      }
      if (!is.null(self$`orderBefore`)) {
        OutletDeliveryRuleDTOObject[["orderBefore"]] <-
          self$`orderBefore`
      }
      if (!is.null(self$`priceFreePickup`)) {
        OutletDeliveryRuleDTOObject[["priceFreePickup"]] <-
          self$`priceFreePickup`
      }
      if (!is.null(self$`unspecifiedDeliveryInterval`)) {
        OutletDeliveryRuleDTOObject[["unspecifiedDeliveryInterval"]] <-
          self$`unspecifiedDeliveryInterval`
      }
      OutletDeliveryRuleDTOObject
    },
    #' Deserialize JSON string into an instance of OutletDeliveryRuleDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OutletDeliveryRuleDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OutletDeliveryRuleDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`minDeliveryDays`)) {
        self$`minDeliveryDays` <- this_object$`minDeliveryDays`
      }
      if (!is.null(this_object$`maxDeliveryDays`)) {
        self$`maxDeliveryDays` <- this_object$`maxDeliveryDays`
      }
      if (!is.null(this_object$`deliveryServiceId`)) {
        self$`deliveryServiceId` <- this_object$`deliveryServiceId`
      }
      if (!is.null(this_object$`orderBefore`)) {
        self$`orderBefore` <- this_object$`orderBefore`
      }
      if (!is.null(this_object$`priceFreePickup`)) {
        self$`priceFreePickup` <- this_object$`priceFreePickup`
      }
      if (!is.null(this_object$`unspecifiedDeliveryInterval`)) {
        self$`unspecifiedDeliveryInterval` <- this_object$`unspecifiedDeliveryInterval`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OutletDeliveryRuleDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`minDeliveryDays`)) {
          sprintf(
          '"minDeliveryDays":
            %d
                    ',
          self$`minDeliveryDays`
          )
        },
        if (!is.null(self$`maxDeliveryDays`)) {
          sprintf(
          '"maxDeliveryDays":
            %d
                    ',
          self$`maxDeliveryDays`
          )
        },
        if (!is.null(self$`deliveryServiceId`)) {
          sprintf(
          '"deliveryServiceId":
            %d
                    ',
          self$`deliveryServiceId`
          )
        },
        if (!is.null(self$`orderBefore`)) {
          sprintf(
          '"orderBefore":
            %d
                    ',
          self$`orderBefore`
          )
        },
        if (!is.null(self$`priceFreePickup`)) {
          sprintf(
          '"priceFreePickup":
            %d
                    ',
          self$`priceFreePickup`
          )
        },
        if (!is.null(self$`unspecifiedDeliveryInterval`)) {
          sprintf(
          '"unspecifiedDeliveryInterval":
            %s
                    ',
          tolower(self$`unspecifiedDeliveryInterval`)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OutletDeliveryRuleDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OutletDeliveryRuleDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OutletDeliveryRuleDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`minDeliveryDays` <- this_object$`minDeliveryDays`
      self$`maxDeliveryDays` <- this_object$`maxDeliveryDays`
      self$`deliveryServiceId` <- this_object$`deliveryServiceId`
      self$`orderBefore` <- this_object$`orderBefore`
      self$`priceFreePickup` <- this_object$`priceFreePickup`
      self$`unspecifiedDeliveryInterval` <- this_object$`unspecifiedDeliveryInterval`
      self
    },
    #' Validate JSON input with respect to OutletDeliveryRuleDTO
    #'
    #' @description
    #' Validate JSON input with respect to OutletDeliveryRuleDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OutletDeliveryRuleDTO
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      if (self$`orderBefore` > 24) {
        return(FALSE)
      }
      if (self$`orderBefore` < 0) {
        return(FALSE)
      }

      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      if (self$`orderBefore` > 24) {
        invalid_fields["orderBefore"] <- "Invalid value for `orderBefore`, must be smaller than or equal to 24."
      }
      if (self$`orderBefore` < 0) {
        invalid_fields["orderBefore"] <- "Invalid value for `orderBefore`, must be bigger than or equal to 0."
      }

      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# OutletDeliveryRuleDTO$unlock()
#
## Below is an example to define the print function
# OutletDeliveryRuleDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OutletDeliveryRuleDTO$lock()

