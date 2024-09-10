#' Create a new BusinessSettingsDTO
#'
#' @description
#' Настройки кабинета.
#'
#' @docType class
#' @title BusinessSettingsDTO
#' @description BusinessSettingsDTO Class
#' @format An \code{R6Class} generator object
#' @field onlyDefaultPrice Можно ли установить только [базовую цену](*rule): * `false` — можно задать и базовую цену, и цены в конкретных магазинах. * `true` — можно задать только базовую цену. character [optional]
#' @field currency  \link{CurrencyType} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BusinessSettingsDTO <- R6::R6Class(
  "BusinessSettingsDTO",
  public = list(
    `onlyDefaultPrice` = NULL,
    `currency` = NULL,
    #' Initialize a new BusinessSettingsDTO class.
    #'
    #' @description
    #' Initialize a new BusinessSettingsDTO class.
    #'
    #' @param onlyDefaultPrice Можно ли установить только [базовую цену](*rule): * `false` — можно задать и базовую цену, и цены в конкретных магазинах. * `true` — можно задать только базовую цену.
    #' @param currency currency
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`onlyDefaultPrice` = NULL, `currency` = NULL, ...) {
      if (!is.null(`onlyDefaultPrice`)) {
        if (!(is.logical(`onlyDefaultPrice`) && length(`onlyDefaultPrice`) == 1)) {
          stop(paste("Error! Invalid data for `onlyDefaultPrice`. Must be a boolean:", `onlyDefaultPrice`))
        }
        self$`onlyDefaultPrice` <- `onlyDefaultPrice`
      }
      if (!is.null(`currency`)) {
        if (!(`currency` %in% c())) {
          stop(paste("Error! \"", `currency`, "\" cannot be assigned to `currency`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`currency`))
        self$`currency` <- `currency`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return BusinessSettingsDTO in JSON format
    #' @export
    toJSON = function() {
      BusinessSettingsDTOObject <- list()
      if (!is.null(self$`onlyDefaultPrice`)) {
        BusinessSettingsDTOObject[["onlyDefaultPrice"]] <-
          self$`onlyDefaultPrice`
      }
      if (!is.null(self$`currency`)) {
        BusinessSettingsDTOObject[["currency"]] <-
          self$`currency`$toJSON()
      }
      BusinessSettingsDTOObject
    },
    #' Deserialize JSON string into an instance of BusinessSettingsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of BusinessSettingsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of BusinessSettingsDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`onlyDefaultPrice`)) {
        self$`onlyDefaultPrice` <- this_object$`onlyDefaultPrice`
      }
      if (!is.null(this_object$`currency`)) {
        `currency_object` <- CurrencyType$new()
        `currency_object`$fromJSON(jsonlite::toJSON(this_object$`currency`, auto_unbox = TRUE, digits = NA))
        self$`currency` <- `currency_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return BusinessSettingsDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`onlyDefaultPrice`)) {
          sprintf(
          '"onlyDefaultPrice":
            %s
                    ',
          tolower(self$`onlyDefaultPrice`)
          )
        },
        if (!is.null(self$`currency`)) {
          sprintf(
          '"currency":
          %s
          ',
          jsonlite::toJSON(self$`currency`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of BusinessSettingsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of BusinessSettingsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of BusinessSettingsDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`onlyDefaultPrice` <- this_object$`onlyDefaultPrice`
      self$`currency` <- CurrencyType$new()$fromJSON(jsonlite::toJSON(this_object$`currency`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to BusinessSettingsDTO
    #'
    #' @description
    #' Validate JSON input with respect to BusinessSettingsDTO and throw an exception if invalid
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
    #' @return String representation of BusinessSettingsDTO
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
# BusinessSettingsDTO$unlock()
#
## Below is an example to define the print function
# BusinessSettingsDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BusinessSettingsDTO$lock()

