#' Create a new OrderDeliveryAddressDTO
#'
#' @description
#' Адрес доставки.  Указывается, если `type=DELIVERY`, `type=POST` или `type=PICKUP` (адрес пункта выдачи). 
#'
#' @docType class
#' @title OrderDeliveryAddressDTO
#' @description OrderDeliveryAddressDTO Class
#' @format An \code{R6Class} generator object
#' @field country Страна.  Обязательный параметр. character [optional]
#' @field postcode Почтовый индекс.  Указывается, если выбрана доставка почтой (`delivery type=POST`). character [optional]
#' @field city Город или населенный пункт.  Обязательный параметр. character [optional]
#' @field district Район. character [optional]
#' @field subway Станция метро. character [optional]
#' @field street Улица.  Обязательный параметр. character [optional]
#' @field house Дом или владение.  Обязательный параметр. character [optional]
#' @field block Корпус или строение. character [optional]
#' @field entrance Подъезд. character [optional]
#' @field entryphone Код домофона. character [optional]
#' @field floor Этаж. character [optional]
#' @field apartment Квартира или офис. character [optional]
#' @field phone Телефон получателя заказа.  Обязательный параметр. character [optional]
#' @field recipient Фамилия, имя и отчество получателя заказа.  Обязательный параметр. character [optional]
#' @field gps  \link{GpsDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderDeliveryAddressDTO <- R6::R6Class(
  "OrderDeliveryAddressDTO",
  public = list(
    `country` = NULL,
    `postcode` = NULL,
    `city` = NULL,
    `district` = NULL,
    `subway` = NULL,
    `street` = NULL,
    `house` = NULL,
    `block` = NULL,
    `entrance` = NULL,
    `entryphone` = NULL,
    `floor` = NULL,
    `apartment` = NULL,
    `phone` = NULL,
    `recipient` = NULL,
    `gps` = NULL,
    #' Initialize a new OrderDeliveryAddressDTO class.
    #'
    #' @description
    #' Initialize a new OrderDeliveryAddressDTO class.
    #'
    #' @param country Страна.  Обязательный параметр.
    #' @param postcode Почтовый индекс.  Указывается, если выбрана доставка почтой (`delivery type=POST`).
    #' @param city Город или населенный пункт.  Обязательный параметр.
    #' @param district Район.
    #' @param subway Станция метро.
    #' @param street Улица.  Обязательный параметр.
    #' @param house Дом или владение.  Обязательный параметр.
    #' @param block Корпус или строение.
    #' @param entrance Подъезд.
    #' @param entryphone Код домофона.
    #' @param floor Этаж.
    #' @param apartment Квартира или офис.
    #' @param phone Телефон получателя заказа.  Обязательный параметр.
    #' @param recipient Фамилия, имя и отчество получателя заказа.  Обязательный параметр.
    #' @param gps gps
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`country` = NULL, `postcode` = NULL, `city` = NULL, `district` = NULL, `subway` = NULL, `street` = NULL, `house` = NULL, `block` = NULL, `entrance` = NULL, `entryphone` = NULL, `floor` = NULL, `apartment` = NULL, `phone` = NULL, `recipient` = NULL, `gps` = NULL, ...) {
      if (!is.null(`country`)) {
        if (!(is.character(`country`) && length(`country`) == 1)) {
          stop(paste("Error! Invalid data for `country`. Must be a string:", `country`))
        }
        self$`country` <- `country`
      }
      if (!is.null(`postcode`)) {
        if (!(is.character(`postcode`) && length(`postcode`) == 1)) {
          stop(paste("Error! Invalid data for `postcode`. Must be a string:", `postcode`))
        }
        self$`postcode` <- `postcode`
      }
      if (!is.null(`city`)) {
        if (!(is.character(`city`) && length(`city`) == 1)) {
          stop(paste("Error! Invalid data for `city`. Must be a string:", `city`))
        }
        self$`city` <- `city`
      }
      if (!is.null(`district`)) {
        if (!(is.character(`district`) && length(`district`) == 1)) {
          stop(paste("Error! Invalid data for `district`. Must be a string:", `district`))
        }
        self$`district` <- `district`
      }
      if (!is.null(`subway`)) {
        if (!(is.character(`subway`) && length(`subway`) == 1)) {
          stop(paste("Error! Invalid data for `subway`. Must be a string:", `subway`))
        }
        self$`subway` <- `subway`
      }
      if (!is.null(`street`)) {
        if (!(is.character(`street`) && length(`street`) == 1)) {
          stop(paste("Error! Invalid data for `street`. Must be a string:", `street`))
        }
        self$`street` <- `street`
      }
      if (!is.null(`house`)) {
        if (!(is.character(`house`) && length(`house`) == 1)) {
          stop(paste("Error! Invalid data for `house`. Must be a string:", `house`))
        }
        self$`house` <- `house`
      }
      if (!is.null(`block`)) {
        if (!(is.character(`block`) && length(`block`) == 1)) {
          stop(paste("Error! Invalid data for `block`. Must be a string:", `block`))
        }
        self$`block` <- `block`
      }
      if (!is.null(`entrance`)) {
        if (!(is.character(`entrance`) && length(`entrance`) == 1)) {
          stop(paste("Error! Invalid data for `entrance`. Must be a string:", `entrance`))
        }
        self$`entrance` <- `entrance`
      }
      if (!is.null(`entryphone`)) {
        if (!(is.character(`entryphone`) && length(`entryphone`) == 1)) {
          stop(paste("Error! Invalid data for `entryphone`. Must be a string:", `entryphone`))
        }
        self$`entryphone` <- `entryphone`
      }
      if (!is.null(`floor`)) {
        if (!(is.character(`floor`) && length(`floor`) == 1)) {
          stop(paste("Error! Invalid data for `floor`. Must be a string:", `floor`))
        }
        self$`floor` <- `floor`
      }
      if (!is.null(`apartment`)) {
        if (!(is.character(`apartment`) && length(`apartment`) == 1)) {
          stop(paste("Error! Invalid data for `apartment`. Must be a string:", `apartment`))
        }
        self$`apartment` <- `apartment`
      }
      if (!is.null(`phone`)) {
        if (!(is.character(`phone`) && length(`phone`) == 1)) {
          stop(paste("Error! Invalid data for `phone`. Must be a string:", `phone`))
        }
        self$`phone` <- `phone`
      }
      if (!is.null(`recipient`)) {
        if (!(is.character(`recipient`) && length(`recipient`) == 1)) {
          stop(paste("Error! Invalid data for `recipient`. Must be a string:", `recipient`))
        }
        self$`recipient` <- `recipient`
      }
      if (!is.null(`gps`)) {
        stopifnot(R6::is.R6(`gps`))
        self$`gps` <- `gps`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderDeliveryAddressDTO in JSON format
    #' @export
    toJSON = function() {
      OrderDeliveryAddressDTOObject <- list()
      if (!is.null(self$`country`)) {
        OrderDeliveryAddressDTOObject[["country"]] <-
          self$`country`
      }
      if (!is.null(self$`postcode`)) {
        OrderDeliveryAddressDTOObject[["postcode"]] <-
          self$`postcode`
      }
      if (!is.null(self$`city`)) {
        OrderDeliveryAddressDTOObject[["city"]] <-
          self$`city`
      }
      if (!is.null(self$`district`)) {
        OrderDeliveryAddressDTOObject[["district"]] <-
          self$`district`
      }
      if (!is.null(self$`subway`)) {
        OrderDeliveryAddressDTOObject[["subway"]] <-
          self$`subway`
      }
      if (!is.null(self$`street`)) {
        OrderDeliveryAddressDTOObject[["street"]] <-
          self$`street`
      }
      if (!is.null(self$`house`)) {
        OrderDeliveryAddressDTOObject[["house"]] <-
          self$`house`
      }
      if (!is.null(self$`block`)) {
        OrderDeliveryAddressDTOObject[["block"]] <-
          self$`block`
      }
      if (!is.null(self$`entrance`)) {
        OrderDeliveryAddressDTOObject[["entrance"]] <-
          self$`entrance`
      }
      if (!is.null(self$`entryphone`)) {
        OrderDeliveryAddressDTOObject[["entryphone"]] <-
          self$`entryphone`
      }
      if (!is.null(self$`floor`)) {
        OrderDeliveryAddressDTOObject[["floor"]] <-
          self$`floor`
      }
      if (!is.null(self$`apartment`)) {
        OrderDeliveryAddressDTOObject[["apartment"]] <-
          self$`apartment`
      }
      if (!is.null(self$`phone`)) {
        OrderDeliveryAddressDTOObject[["phone"]] <-
          self$`phone`
      }
      if (!is.null(self$`recipient`)) {
        OrderDeliveryAddressDTOObject[["recipient"]] <-
          self$`recipient`
      }
      if (!is.null(self$`gps`)) {
        OrderDeliveryAddressDTOObject[["gps"]] <-
          self$`gps`$toJSON()
      }
      OrderDeliveryAddressDTOObject
    },
    #' Deserialize JSON string into an instance of OrderDeliveryAddressDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderDeliveryAddressDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderDeliveryAddressDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`country`)) {
        self$`country` <- this_object$`country`
      }
      if (!is.null(this_object$`postcode`)) {
        self$`postcode` <- this_object$`postcode`
      }
      if (!is.null(this_object$`city`)) {
        self$`city` <- this_object$`city`
      }
      if (!is.null(this_object$`district`)) {
        self$`district` <- this_object$`district`
      }
      if (!is.null(this_object$`subway`)) {
        self$`subway` <- this_object$`subway`
      }
      if (!is.null(this_object$`street`)) {
        self$`street` <- this_object$`street`
      }
      if (!is.null(this_object$`house`)) {
        self$`house` <- this_object$`house`
      }
      if (!is.null(this_object$`block`)) {
        self$`block` <- this_object$`block`
      }
      if (!is.null(this_object$`entrance`)) {
        self$`entrance` <- this_object$`entrance`
      }
      if (!is.null(this_object$`entryphone`)) {
        self$`entryphone` <- this_object$`entryphone`
      }
      if (!is.null(this_object$`floor`)) {
        self$`floor` <- this_object$`floor`
      }
      if (!is.null(this_object$`apartment`)) {
        self$`apartment` <- this_object$`apartment`
      }
      if (!is.null(this_object$`phone`)) {
        self$`phone` <- this_object$`phone`
      }
      if (!is.null(this_object$`recipient`)) {
        self$`recipient` <- this_object$`recipient`
      }
      if (!is.null(this_object$`gps`)) {
        `gps_object` <- GpsDTO$new()
        `gps_object`$fromJSON(jsonlite::toJSON(this_object$`gps`, auto_unbox = TRUE, digits = NA))
        self$`gps` <- `gps_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderDeliveryAddressDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`country`)) {
          sprintf(
          '"country":
            "%s"
                    ',
          self$`country`
          )
        },
        if (!is.null(self$`postcode`)) {
          sprintf(
          '"postcode":
            "%s"
                    ',
          self$`postcode`
          )
        },
        if (!is.null(self$`city`)) {
          sprintf(
          '"city":
            "%s"
                    ',
          self$`city`
          )
        },
        if (!is.null(self$`district`)) {
          sprintf(
          '"district":
            "%s"
                    ',
          self$`district`
          )
        },
        if (!is.null(self$`subway`)) {
          sprintf(
          '"subway":
            "%s"
                    ',
          self$`subway`
          )
        },
        if (!is.null(self$`street`)) {
          sprintf(
          '"street":
            "%s"
                    ',
          self$`street`
          )
        },
        if (!is.null(self$`house`)) {
          sprintf(
          '"house":
            "%s"
                    ',
          self$`house`
          )
        },
        if (!is.null(self$`block`)) {
          sprintf(
          '"block":
            "%s"
                    ',
          self$`block`
          )
        },
        if (!is.null(self$`entrance`)) {
          sprintf(
          '"entrance":
            "%s"
                    ',
          self$`entrance`
          )
        },
        if (!is.null(self$`entryphone`)) {
          sprintf(
          '"entryphone":
            "%s"
                    ',
          self$`entryphone`
          )
        },
        if (!is.null(self$`floor`)) {
          sprintf(
          '"floor":
            "%s"
                    ',
          self$`floor`
          )
        },
        if (!is.null(self$`apartment`)) {
          sprintf(
          '"apartment":
            "%s"
                    ',
          self$`apartment`
          )
        },
        if (!is.null(self$`phone`)) {
          sprintf(
          '"phone":
            "%s"
                    ',
          self$`phone`
          )
        },
        if (!is.null(self$`recipient`)) {
          sprintf(
          '"recipient":
            "%s"
                    ',
          self$`recipient`
          )
        },
        if (!is.null(self$`gps`)) {
          sprintf(
          '"gps":
          %s
          ',
          jsonlite::toJSON(self$`gps`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OrderDeliveryAddressDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderDeliveryAddressDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderDeliveryAddressDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`country` <- this_object$`country`
      self$`postcode` <- this_object$`postcode`
      self$`city` <- this_object$`city`
      self$`district` <- this_object$`district`
      self$`subway` <- this_object$`subway`
      self$`street` <- this_object$`street`
      self$`house` <- this_object$`house`
      self$`block` <- this_object$`block`
      self$`entrance` <- this_object$`entrance`
      self$`entryphone` <- this_object$`entryphone`
      self$`floor` <- this_object$`floor`
      self$`apartment` <- this_object$`apartment`
      self$`phone` <- this_object$`phone`
      self$`recipient` <- this_object$`recipient`
      self$`gps` <- GpsDTO$new()$fromJSON(jsonlite::toJSON(this_object$`gps`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to OrderDeliveryAddressDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrderDeliveryAddressDTO and throw an exception if invalid
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
    #' @return String representation of OrderDeliveryAddressDTO
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
# OrderDeliveryAddressDTO$unlock()
#
## Below is an example to define the print function
# OrderDeliveryAddressDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderDeliveryAddressDTO$lock()

