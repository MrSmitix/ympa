#' Create a new PickupAddressDTO
#'
#' @description
#' Адрес доставки.
#'
#' @docType class
#' @title PickupAddressDTO
#' @description PickupAddressDTO Class
#' @format An \code{R6Class} generator object
#' @field country Страна. character [optional]
#' @field city Город. character [optional]
#' @field street Улица. character [optional]
#' @field house Номер дома. character [optional]
#' @field postcode Почтовый индекс. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PickupAddressDTO <- R6::R6Class(
  "PickupAddressDTO",
  public = list(
    `country` = NULL,
    `city` = NULL,
    `street` = NULL,
    `house` = NULL,
    `postcode` = NULL,
    #' Initialize a new PickupAddressDTO class.
    #'
    #' @description
    #' Initialize a new PickupAddressDTO class.
    #'
    #' @param country Страна.
    #' @param city Город.
    #' @param street Улица.
    #' @param house Номер дома.
    #' @param postcode Почтовый индекс.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`country` = NULL, `city` = NULL, `street` = NULL, `house` = NULL, `postcode` = NULL, ...) {
      if (!is.null(`country`)) {
        if (!(is.character(`country`) && length(`country`) == 1)) {
          stop(paste("Error! Invalid data for `country`. Must be a string:", `country`))
        }
        self$`country` <- `country`
      }
      if (!is.null(`city`)) {
        if (!(is.character(`city`) && length(`city`) == 1)) {
          stop(paste("Error! Invalid data for `city`. Must be a string:", `city`))
        }
        self$`city` <- `city`
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
      if (!is.null(`postcode`)) {
        if (!(is.character(`postcode`) && length(`postcode`) == 1)) {
          stop(paste("Error! Invalid data for `postcode`. Must be a string:", `postcode`))
        }
        self$`postcode` <- `postcode`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PickupAddressDTO in JSON format
    #' @export
    toJSON = function() {
      PickupAddressDTOObject <- list()
      if (!is.null(self$`country`)) {
        PickupAddressDTOObject[["country"]] <-
          self$`country`
      }
      if (!is.null(self$`city`)) {
        PickupAddressDTOObject[["city"]] <-
          self$`city`
      }
      if (!is.null(self$`street`)) {
        PickupAddressDTOObject[["street"]] <-
          self$`street`
      }
      if (!is.null(self$`house`)) {
        PickupAddressDTOObject[["house"]] <-
          self$`house`
      }
      if (!is.null(self$`postcode`)) {
        PickupAddressDTOObject[["postcode"]] <-
          self$`postcode`
      }
      PickupAddressDTOObject
    },
    #' Deserialize JSON string into an instance of PickupAddressDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of PickupAddressDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of PickupAddressDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`country`)) {
        self$`country` <- this_object$`country`
      }
      if (!is.null(this_object$`city`)) {
        self$`city` <- this_object$`city`
      }
      if (!is.null(this_object$`street`)) {
        self$`street` <- this_object$`street`
      }
      if (!is.null(this_object$`house`)) {
        self$`house` <- this_object$`house`
      }
      if (!is.null(this_object$`postcode`)) {
        self$`postcode` <- this_object$`postcode`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PickupAddressDTO in JSON format
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
        if (!is.null(self$`city`)) {
          sprintf(
          '"city":
            "%s"
                    ',
          self$`city`
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
        if (!is.null(self$`postcode`)) {
          sprintf(
          '"postcode":
            "%s"
                    ',
          self$`postcode`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of PickupAddressDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of PickupAddressDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of PickupAddressDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`country` <- this_object$`country`
      self$`city` <- this_object$`city`
      self$`street` <- this_object$`street`
      self$`house` <- this_object$`house`
      self$`postcode` <- this_object$`postcode`
      self
    },
    #' Validate JSON input with respect to PickupAddressDTO
    #'
    #' @description
    #' Validate JSON input with respect to PickupAddressDTO and throw an exception if invalid
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
    #' @return String representation of PickupAddressDTO
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
# PickupAddressDTO$unlock()
#
## Below is an example to define the print function
# PickupAddressDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PickupAddressDTO$lock()

