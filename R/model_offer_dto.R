#' Create a new ModelOfferDTO
#'
#' @description
#' Информация о предложении.
#'
#' @docType class
#' @title ModelOfferDTO
#' @description ModelOfferDTO Class
#' @format An \code{R6Class} generator object
#' @field discount Скидка на предложение в процентах. integer [optional]
#' @field name Наименование предложения. character [optional]
#' @field pos Позиция предложения в выдаче Маркета на карточке модели. integer [optional]
#' @field preDiscountPrice Цена предложения без скидки магазина. numeric [optional]
#' @field price Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay. numeric [optional]
#' @field regionId Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре `regionId`. Предложения, доставляемые из других регионов, показываются после них. integer [optional]
#' @field shippingCost Стоимость доставки товара в регион:  * `0` — доставка осуществляется бесплатно. * `-1` — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится. numeric [optional]
#' @field shopName Название магазина (в том виде, в котором отображается на Маркете). character [optional]
#' @field shopRating Рейтинг магазина.  Возможные значения: * `-1` — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение `-1`. * `1`. * `2`. * `3`. * `4`. * `5`. integer [optional]
#' @field inStock {\% note warning \"\" \%}  Этот параметр устарел. Не используйте его.  {\% endnote \%} integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ModelOfferDTO <- R6::R6Class(
  "ModelOfferDTO",
  public = list(
    `discount` = NULL,
    `name` = NULL,
    `pos` = NULL,
    `preDiscountPrice` = NULL,
    `price` = NULL,
    `regionId` = NULL,
    `shippingCost` = NULL,
    `shopName` = NULL,
    `shopRating` = NULL,
    `inStock` = NULL,
    #' Initialize a new ModelOfferDTO class.
    #'
    #' @description
    #' Initialize a new ModelOfferDTO class.
    #'
    #' @param discount Скидка на предложение в процентах.
    #' @param name Наименование предложения.
    #' @param pos Позиция предложения в выдаче Маркета на карточке модели.
    #' @param preDiscountPrice Цена предложения без скидки магазина.
    #' @param price Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay.
    #' @param regionId Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре `regionId`. Предложения, доставляемые из других регионов, показываются после них.
    #' @param shippingCost Стоимость доставки товара в регион:  * `0` — доставка осуществляется бесплатно. * `-1` — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится.
    #' @param shopName Название магазина (в том виде, в котором отображается на Маркете).
    #' @param shopRating Рейтинг магазина.  Возможные значения: * `-1` — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение `-1`. * `1`. * `2`. * `3`. * `4`. * `5`.
    #' @param inStock {\% note warning \"\" \%}  Этот параметр устарел. Не используйте его.  {\% endnote \%}
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`discount` = NULL, `name` = NULL, `pos` = NULL, `preDiscountPrice` = NULL, `price` = NULL, `regionId` = NULL, `shippingCost` = NULL, `shopName` = NULL, `shopRating` = NULL, `inStock` = NULL, ...) {
      if (!is.null(`discount`)) {
        if (!(is.numeric(`discount`) && length(`discount`) == 1)) {
          stop(paste("Error! Invalid data for `discount`. Must be an integer:", `discount`))
        }
        self$`discount` <- `discount`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`pos`)) {
        if (!(is.numeric(`pos`) && length(`pos`) == 1)) {
          stop(paste("Error! Invalid data for `pos`. Must be an integer:", `pos`))
        }
        self$`pos` <- `pos`
      }
      if (!is.null(`preDiscountPrice`)) {
        self$`preDiscountPrice` <- `preDiscountPrice`
      }
      if (!is.null(`price`)) {
        self$`price` <- `price`
      }
      if (!is.null(`regionId`)) {
        if (!(is.numeric(`regionId`) && length(`regionId`) == 1)) {
          stop(paste("Error! Invalid data for `regionId`. Must be an integer:", `regionId`))
        }
        self$`regionId` <- `regionId`
      }
      if (!is.null(`shippingCost`)) {
        self$`shippingCost` <- `shippingCost`
      }
      if (!is.null(`shopName`)) {
        if (!(is.character(`shopName`) && length(`shopName`) == 1)) {
          stop(paste("Error! Invalid data for `shopName`. Must be a string:", `shopName`))
        }
        self$`shopName` <- `shopName`
      }
      if (!is.null(`shopRating`)) {
        if (!(is.numeric(`shopRating`) && length(`shopRating`) == 1)) {
          stop(paste("Error! Invalid data for `shopRating`. Must be an integer:", `shopRating`))
        }
        self$`shopRating` <- `shopRating`
      }
      if (!is.null(`inStock`)) {
        if (!(is.numeric(`inStock`) && length(`inStock`) == 1)) {
          stop(paste("Error! Invalid data for `inStock`. Must be an integer:", `inStock`))
        }
        self$`inStock` <- `inStock`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ModelOfferDTO in JSON format
    #' @export
    toJSON = function() {
      ModelOfferDTOObject <- list()
      if (!is.null(self$`discount`)) {
        ModelOfferDTOObject[["discount"]] <-
          self$`discount`
      }
      if (!is.null(self$`name`)) {
        ModelOfferDTOObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`pos`)) {
        ModelOfferDTOObject[["pos"]] <-
          self$`pos`
      }
      if (!is.null(self$`preDiscountPrice`)) {
        ModelOfferDTOObject[["preDiscountPrice"]] <-
          self$`preDiscountPrice`
      }
      if (!is.null(self$`price`)) {
        ModelOfferDTOObject[["price"]] <-
          self$`price`
      }
      if (!is.null(self$`regionId`)) {
        ModelOfferDTOObject[["regionId"]] <-
          self$`regionId`
      }
      if (!is.null(self$`shippingCost`)) {
        ModelOfferDTOObject[["shippingCost"]] <-
          self$`shippingCost`
      }
      if (!is.null(self$`shopName`)) {
        ModelOfferDTOObject[["shopName"]] <-
          self$`shopName`
      }
      if (!is.null(self$`shopRating`)) {
        ModelOfferDTOObject[["shopRating"]] <-
          self$`shopRating`
      }
      if (!is.null(self$`inStock`)) {
        ModelOfferDTOObject[["inStock"]] <-
          self$`inStock`
      }
      ModelOfferDTOObject
    },
    #' Deserialize JSON string into an instance of ModelOfferDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ModelOfferDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ModelOfferDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`discount`)) {
        self$`discount` <- this_object$`discount`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`pos`)) {
        self$`pos` <- this_object$`pos`
      }
      if (!is.null(this_object$`preDiscountPrice`)) {
        self$`preDiscountPrice` <- this_object$`preDiscountPrice`
      }
      if (!is.null(this_object$`price`)) {
        self$`price` <- this_object$`price`
      }
      if (!is.null(this_object$`regionId`)) {
        self$`regionId` <- this_object$`regionId`
      }
      if (!is.null(this_object$`shippingCost`)) {
        self$`shippingCost` <- this_object$`shippingCost`
      }
      if (!is.null(this_object$`shopName`)) {
        self$`shopName` <- this_object$`shopName`
      }
      if (!is.null(this_object$`shopRating`)) {
        self$`shopRating` <- this_object$`shopRating`
      }
      if (!is.null(this_object$`inStock`)) {
        self$`inStock` <- this_object$`inStock`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ModelOfferDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`discount`)) {
          sprintf(
          '"discount":
            %d
                    ',
          self$`discount`
          )
        },
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        },
        if (!is.null(self$`pos`)) {
          sprintf(
          '"pos":
            %d
                    ',
          self$`pos`
          )
        },
        if (!is.null(self$`preDiscountPrice`)) {
          sprintf(
          '"preDiscountPrice":
            %d
                    ',
          self$`preDiscountPrice`
          )
        },
        if (!is.null(self$`price`)) {
          sprintf(
          '"price":
            %d
                    ',
          self$`price`
          )
        },
        if (!is.null(self$`regionId`)) {
          sprintf(
          '"regionId":
            %d
                    ',
          self$`regionId`
          )
        },
        if (!is.null(self$`shippingCost`)) {
          sprintf(
          '"shippingCost":
            %d
                    ',
          self$`shippingCost`
          )
        },
        if (!is.null(self$`shopName`)) {
          sprintf(
          '"shopName":
            "%s"
                    ',
          self$`shopName`
          )
        },
        if (!is.null(self$`shopRating`)) {
          sprintf(
          '"shopRating":
            %d
                    ',
          self$`shopRating`
          )
        },
        if (!is.null(self$`inStock`)) {
          sprintf(
          '"inStock":
            %d
                    ',
          self$`inStock`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ModelOfferDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ModelOfferDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ModelOfferDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`discount` <- this_object$`discount`
      self$`name` <- this_object$`name`
      self$`pos` <- this_object$`pos`
      self$`preDiscountPrice` <- this_object$`preDiscountPrice`
      self$`price` <- this_object$`price`
      self$`regionId` <- this_object$`regionId`
      self$`shippingCost` <- this_object$`shippingCost`
      self$`shopName` <- this_object$`shopName`
      self$`shopRating` <- this_object$`shopRating`
      self$`inStock` <- this_object$`inStock`
      self
    },
    #' Validate JSON input with respect to ModelOfferDTO
    #'
    #' @description
    #' Validate JSON input with respect to ModelOfferDTO and throw an exception if invalid
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
    #' @return String representation of ModelOfferDTO
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
# ModelOfferDTO$unlock()
#
## Below is an example to define the print function
# ModelOfferDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ModelOfferDTO$lock()

