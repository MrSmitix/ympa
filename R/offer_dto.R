#' Create a new OfferDTO
#'
#' @description
#' Предложение.
#'
#' @docType class
#' @title OfferDTO
#' @description OfferDTO Class
#' @format An \code{R6Class} generator object
#' @field price Цена предложения.  До версии 2.0 партнерского API у параметра был тип String. numeric [optional]
#' @field feedId Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API. integer [optional]
#' @field id Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр `id` указывается только для первого из них, для остальных параметры `id` и `feedId` не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API. character [optional]
#' @field shopCategoryId Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API. character [optional]
#' @field marketCategoryId Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API. integer [optional]
#' @field preDiscountPrice Цена предложения без скидки. numeric [optional]
#' @field discount Скидка на предложение в процентах. integer [optional]
#' @field cutPrice Является ли предложение уцененным:  * `true` — да. * `false` — нет.  Параметр доступен начиная с версии 2.58 партнерского API. character [optional]
#' @field url URL-адрес предложения на сайте магазина. character [optional]
#' @field modelId Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр `modelid` содержит значение `0`.  {\% note info \%}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра `product`. Например: `https://market.yandex.ru/product/13584121`.  {\% endnote \%} integer
#' @field name Наименование предложения. character [optional]
#' @field currency  \link{CurrencyType} [optional]
#' @field bid {\% note warning \"\" \%}  Этот параметр устарел. Не используйте его.  {\% endnote \%}  Ставка на клик. numeric [optional]
#' @field cbid {\% note warning \"\" \%}  Этот параметр устарел. Не используйте его.  {\% endnote \%}  Ставка на клик. numeric [optional]
#' @field fee {\% note warning \"\" \%}  Этот параметр устарел. Не используйте его.  {\% endnote \%}  Процент комиссии на товар при продаже по CPA. numeric [optional]
#' @field blocked Признак блокировки предложения. Возможные значения: * `false` — предложение активно, параметр не выводится. * `true` — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OfferDTO <- R6::R6Class(
  "OfferDTO",
  public = list(
    `price` = NULL,
    `feedId` = NULL,
    `id` = NULL,
    `shopCategoryId` = NULL,
    `marketCategoryId` = NULL,
    `preDiscountPrice` = NULL,
    `discount` = NULL,
    `cutPrice` = NULL,
    `url` = NULL,
    `modelId` = NULL,
    `name` = NULL,
    `currency` = NULL,
    `bid` = NULL,
    `cbid` = NULL,
    `fee` = NULL,
    `blocked` = NULL,
    #' Initialize a new OfferDTO class.
    #'
    #' @description
    #' Initialize a new OfferDTO class.
    #'
    #' @param modelId Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр `modelid` содержит значение `0`.  {\% note info \%}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра `product`. Например: `https://market.yandex.ru/product/13584121`.  {\% endnote \%}
    #' @param price Цена предложения.  До версии 2.0 партнерского API у параметра был тип String.
    #' @param feedId Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API.
    #' @param id Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр `id` указывается только для первого из них, для остальных параметры `id` и `feedId` не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API.
    #' @param shopCategoryId Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API.
    #' @param marketCategoryId Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API.
    #' @param preDiscountPrice Цена предложения без скидки.
    #' @param discount Скидка на предложение в процентах.
    #' @param cutPrice Является ли предложение уцененным:  * `true` — да. * `false` — нет.  Параметр доступен начиная с версии 2.58 партнерского API.
    #' @param url URL-адрес предложения на сайте магазина.
    #' @param name Наименование предложения.
    #' @param currency currency
    #' @param bid {\% note warning \"\" \%}  Этот параметр устарел. Не используйте его.  {\% endnote \%}  Ставка на клик.
    #' @param cbid {\% note warning \"\" \%}  Этот параметр устарел. Не используйте его.  {\% endnote \%}  Ставка на клик.
    #' @param fee {\% note warning \"\" \%}  Этот параметр устарел. Не используйте его.  {\% endnote \%}  Процент комиссии на товар при продаже по CPA.
    #' @param blocked Признак блокировки предложения. Возможные значения: * `false` — предложение активно, параметр не выводится. * `true` — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`modelId`, `price` = NULL, `feedId` = NULL, `id` = NULL, `shopCategoryId` = NULL, `marketCategoryId` = NULL, `preDiscountPrice` = NULL, `discount` = NULL, `cutPrice` = NULL, `url` = NULL, `name` = NULL, `currency` = NULL, `bid` = NULL, `cbid` = NULL, `fee` = NULL, `blocked` = NULL, ...) {
      if (!missing(`modelId`)) {
        if (!(is.numeric(`modelId`) && length(`modelId`) == 1)) {
          stop(paste("Error! Invalid data for `modelId`. Must be an integer:", `modelId`))
        }
        self$`modelId` <- `modelId`
      }
      if (!is.null(`price`)) {
        self$`price` <- `price`
      }
      if (!is.null(`feedId`)) {
        if (!(is.numeric(`feedId`) && length(`feedId`) == 1)) {
          stop(paste("Error! Invalid data for `feedId`. Must be an integer:", `feedId`))
        }
        self$`feedId` <- `feedId`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`shopCategoryId`)) {
        if (!(is.character(`shopCategoryId`) && length(`shopCategoryId`) == 1)) {
          stop(paste("Error! Invalid data for `shopCategoryId`. Must be a string:", `shopCategoryId`))
        }
        self$`shopCategoryId` <- `shopCategoryId`
      }
      if (!is.null(`marketCategoryId`)) {
        if (!(is.numeric(`marketCategoryId`) && length(`marketCategoryId`) == 1)) {
          stop(paste("Error! Invalid data for `marketCategoryId`. Must be an integer:", `marketCategoryId`))
        }
        self$`marketCategoryId` <- `marketCategoryId`
      }
      if (!is.null(`preDiscountPrice`)) {
        self$`preDiscountPrice` <- `preDiscountPrice`
      }
      if (!is.null(`discount`)) {
        if (!(is.numeric(`discount`) && length(`discount`) == 1)) {
          stop(paste("Error! Invalid data for `discount`. Must be an integer:", `discount`))
        }
        self$`discount` <- `discount`
      }
      if (!is.null(`cutPrice`)) {
        if (!(is.logical(`cutPrice`) && length(`cutPrice`) == 1)) {
          stop(paste("Error! Invalid data for `cutPrice`. Must be a boolean:", `cutPrice`))
        }
        self$`cutPrice` <- `cutPrice`
      }
      if (!is.null(`url`)) {
        if (!(is.character(`url`) && length(`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", `url`))
        }
        self$`url` <- `url`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`currency`)) {
        if (!(`currency` %in% c())) {
          stop(paste("Error! \"", `currency`, "\" cannot be assigned to `currency`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`currency`))
        self$`currency` <- `currency`
      }
      if (!is.null(`bid`)) {
        self$`bid` <- `bid`
      }
      if (!is.null(`cbid`)) {
        self$`cbid` <- `cbid`
      }
      if (!is.null(`fee`)) {
        self$`fee` <- `fee`
      }
      if (!is.null(`blocked`)) {
        if (!(is.logical(`blocked`) && length(`blocked`) == 1)) {
          stop(paste("Error! Invalid data for `blocked`. Must be a boolean:", `blocked`))
        }
        self$`blocked` <- `blocked`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferDTO in JSON format
    #' @export
    toJSON = function() {
      OfferDTOObject <- list()
      if (!is.null(self$`price`)) {
        OfferDTOObject[["price"]] <-
          self$`price`
      }
      if (!is.null(self$`feedId`)) {
        OfferDTOObject[["feedId"]] <-
          self$`feedId`
      }
      if (!is.null(self$`id`)) {
        OfferDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`shopCategoryId`)) {
        OfferDTOObject[["shopCategoryId"]] <-
          self$`shopCategoryId`
      }
      if (!is.null(self$`marketCategoryId`)) {
        OfferDTOObject[["marketCategoryId"]] <-
          self$`marketCategoryId`
      }
      if (!is.null(self$`preDiscountPrice`)) {
        OfferDTOObject[["preDiscountPrice"]] <-
          self$`preDiscountPrice`
      }
      if (!is.null(self$`discount`)) {
        OfferDTOObject[["discount"]] <-
          self$`discount`
      }
      if (!is.null(self$`cutPrice`)) {
        OfferDTOObject[["cutPrice"]] <-
          self$`cutPrice`
      }
      if (!is.null(self$`url`)) {
        OfferDTOObject[["url"]] <-
          self$`url`
      }
      if (!is.null(self$`modelId`)) {
        OfferDTOObject[["modelId"]] <-
          self$`modelId`
      }
      if (!is.null(self$`name`)) {
        OfferDTOObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`currency`)) {
        OfferDTOObject[["currency"]] <-
          self$`currency`$toJSON()
      }
      if (!is.null(self$`bid`)) {
        OfferDTOObject[["bid"]] <-
          self$`bid`
      }
      if (!is.null(self$`cbid`)) {
        OfferDTOObject[["cbid"]] <-
          self$`cbid`
      }
      if (!is.null(self$`fee`)) {
        OfferDTOObject[["fee"]] <-
          self$`fee`
      }
      if (!is.null(self$`blocked`)) {
        OfferDTOObject[["blocked"]] <-
          self$`blocked`
      }
      OfferDTOObject
    },
    #' Deserialize JSON string into an instance of OfferDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`price`)) {
        self$`price` <- this_object$`price`
      }
      if (!is.null(this_object$`feedId`)) {
        self$`feedId` <- this_object$`feedId`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`shopCategoryId`)) {
        self$`shopCategoryId` <- this_object$`shopCategoryId`
      }
      if (!is.null(this_object$`marketCategoryId`)) {
        self$`marketCategoryId` <- this_object$`marketCategoryId`
      }
      if (!is.null(this_object$`preDiscountPrice`)) {
        self$`preDiscountPrice` <- this_object$`preDiscountPrice`
      }
      if (!is.null(this_object$`discount`)) {
        self$`discount` <- this_object$`discount`
      }
      if (!is.null(this_object$`cutPrice`)) {
        self$`cutPrice` <- this_object$`cutPrice`
      }
      if (!is.null(this_object$`url`)) {
        self$`url` <- this_object$`url`
      }
      if (!is.null(this_object$`modelId`)) {
        self$`modelId` <- this_object$`modelId`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`currency`)) {
        `currency_object` <- CurrencyType$new()
        `currency_object`$fromJSON(jsonlite::toJSON(this_object$`currency`, auto_unbox = TRUE, digits = NA))
        self$`currency` <- `currency_object`
      }
      if (!is.null(this_object$`bid`)) {
        self$`bid` <- this_object$`bid`
      }
      if (!is.null(this_object$`cbid`)) {
        self$`cbid` <- this_object$`cbid`
      }
      if (!is.null(this_object$`fee`)) {
        self$`fee` <- this_object$`fee`
      }
      if (!is.null(this_object$`blocked`)) {
        self$`blocked` <- this_object$`blocked`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`price`)) {
          sprintf(
          '"price":
            %d
                    ',
          self$`price`
          )
        },
        if (!is.null(self$`feedId`)) {
          sprintf(
          '"feedId":
            %d
                    ',
          self$`feedId`
          )
        },
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`shopCategoryId`)) {
          sprintf(
          '"shopCategoryId":
            "%s"
                    ',
          self$`shopCategoryId`
          )
        },
        if (!is.null(self$`marketCategoryId`)) {
          sprintf(
          '"marketCategoryId":
            %d
                    ',
          self$`marketCategoryId`
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
        if (!is.null(self$`discount`)) {
          sprintf(
          '"discount":
            %d
                    ',
          self$`discount`
          )
        },
        if (!is.null(self$`cutPrice`)) {
          sprintf(
          '"cutPrice":
            %s
                    ',
          tolower(self$`cutPrice`)
          )
        },
        if (!is.null(self$`url`)) {
          sprintf(
          '"url":
            "%s"
                    ',
          self$`url`
          )
        },
        if (!is.null(self$`modelId`)) {
          sprintf(
          '"modelId":
            %d
                    ',
          self$`modelId`
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
        if (!is.null(self$`currency`)) {
          sprintf(
          '"currency":
          %s
          ',
          jsonlite::toJSON(self$`currency`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`bid`)) {
          sprintf(
          '"bid":
            %d
                    ',
          self$`bid`
          )
        },
        if (!is.null(self$`cbid`)) {
          sprintf(
          '"cbid":
            %d
                    ',
          self$`cbid`
          )
        },
        if (!is.null(self$`fee`)) {
          sprintf(
          '"fee":
            %d
                    ',
          self$`fee`
          )
        },
        if (!is.null(self$`blocked`)) {
          sprintf(
          '"blocked":
            %s
                    ',
          tolower(self$`blocked`)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OfferDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`price` <- this_object$`price`
      self$`feedId` <- this_object$`feedId`
      self$`id` <- this_object$`id`
      self$`shopCategoryId` <- this_object$`shopCategoryId`
      self$`marketCategoryId` <- this_object$`marketCategoryId`
      self$`preDiscountPrice` <- this_object$`preDiscountPrice`
      self$`discount` <- this_object$`discount`
      self$`cutPrice` <- this_object$`cutPrice`
      self$`url` <- this_object$`url`
      self$`modelId` <- this_object$`modelId`
      self$`name` <- this_object$`name`
      self$`currency` <- CurrencyType$new()$fromJSON(jsonlite::toJSON(this_object$`currency`, auto_unbox = TRUE, digits = NA))
      self$`bid` <- this_object$`bid`
      self$`cbid` <- this_object$`cbid`
      self$`fee` <- this_object$`fee`
      self$`blocked` <- this_object$`blocked`
      self
    },
    #' Validate JSON input with respect to OfferDTO
    #'
    #' @description
    #' Validate JSON input with respect to OfferDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `modelId`
      if (!is.null(input_json$`modelId`)) {
        if (!(is.numeric(input_json$`modelId`) && length(input_json$`modelId`) == 1)) {
          stop(paste("Error! Invalid data for `modelId`. Must be an integer:", input_json$`modelId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OfferDTO: the required field `modelId` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OfferDTO
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
      # check if the required `modelId` is null
      if (is.null(self$`modelId`)) {
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
      # check if the required `modelId` is null
      if (is.null(self$`modelId`)) {
        invalid_fields["modelId"] <- "Non-nullable required field `modelId` cannot be null."
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
# OfferDTO$unlock()
#
## Below is an example to define the print function
# OfferDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OfferDTO$lock()

