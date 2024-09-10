#' Create a new GetPriceDTO
#'
#' @description
#' Цена с указанием времени последнего обновления.
#'
#' @docType class
#' @title GetPriceDTO
#' @description GetPriceDTO Class
#' @format An \code{R6Class} generator object
#' @field value Значение. numeric
#' @field currencyId  \link{CurrencyType}
#' @field updatedAt Время последнего обновления. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetPriceDTO <- R6::R6Class(
  "GetPriceDTO",
  public = list(
    `value` = NULL,
    `currencyId` = NULL,
    `updatedAt` = NULL,
    #' Initialize a new GetPriceDTO class.
    #'
    #' @description
    #' Initialize a new GetPriceDTO class.
    #'
    #' @param value Значение.
    #' @param currencyId currencyId
    #' @param updatedAt Время последнего обновления.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`value`, `currencyId`, `updatedAt`, ...) {
      if (!missing(`value`)) {
        self$`value` <- `value`
      }
      if (!missing(`currencyId`)) {
        if (!(`currencyId` %in% c())) {
          stop(paste("Error! \"", `currencyId`, "\" cannot be assigned to `currencyId`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`currencyId`))
        self$`currencyId` <- `currencyId`
      }
      if (!missing(`updatedAt`)) {
        if (!(is.character(`updatedAt`) && length(`updatedAt`) == 1)) {
          stop(paste("Error! Invalid data for `updatedAt`. Must be a string:", `updatedAt`))
        }
        self$`updatedAt` <- `updatedAt`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetPriceDTO in JSON format
    #' @export
    toJSON = function() {
      GetPriceDTOObject <- list()
      if (!is.null(self$`value`)) {
        GetPriceDTOObject[["value"]] <-
          self$`value`
      }
      if (!is.null(self$`currencyId`)) {
        GetPriceDTOObject[["currencyId"]] <-
          self$`currencyId`$toJSON()
      }
      if (!is.null(self$`updatedAt`)) {
        GetPriceDTOObject[["updatedAt"]] <-
          self$`updatedAt`
      }
      GetPriceDTOObject
    },
    #' Deserialize JSON string into an instance of GetPriceDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetPriceDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetPriceDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`value`)) {
        self$`value` <- this_object$`value`
      }
      if (!is.null(this_object$`currencyId`)) {
        `currencyid_object` <- CurrencyType$new()
        `currencyid_object`$fromJSON(jsonlite::toJSON(this_object$`currencyId`, auto_unbox = TRUE, digits = NA))
        self$`currencyId` <- `currencyid_object`
      }
      if (!is.null(this_object$`updatedAt`)) {
        self$`updatedAt` <- this_object$`updatedAt`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetPriceDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`value`)) {
          sprintf(
          '"value":
            %d
                    ',
          self$`value`
          )
        },
        if (!is.null(self$`currencyId`)) {
          sprintf(
          '"currencyId":
          %s
          ',
          jsonlite::toJSON(self$`currencyId`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`updatedAt`)) {
          sprintf(
          '"updatedAt":
            "%s"
                    ',
          self$`updatedAt`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetPriceDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetPriceDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetPriceDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`value` <- this_object$`value`
      self$`currencyId` <- CurrencyType$new()$fromJSON(jsonlite::toJSON(this_object$`currencyId`, auto_unbox = TRUE, digits = NA))
      self$`updatedAt` <- this_object$`updatedAt`
      self
    },
    #' Validate JSON input with respect to GetPriceDTO
    #'
    #' @description
    #' Validate JSON input with respect to GetPriceDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `value`
      if (!is.null(input_json$`value`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetPriceDTO: the required field `value` is missing."))
      }
      # check the required field `currencyId`
      if (!is.null(input_json$`currencyId`)) {
        stopifnot(R6::is.R6(input_json$`currencyId`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetPriceDTO: the required field `currencyId` is missing."))
      }
      # check the required field `updatedAt`
      if (!is.null(input_json$`updatedAt`)) {
        if (!(is.character(input_json$`updatedAt`) && length(input_json$`updatedAt`) == 1)) {
          stop(paste("Error! Invalid data for `updatedAt`. Must be a string:", input_json$`updatedAt`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetPriceDTO: the required field `updatedAt` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetPriceDTO
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
      # check if the required `value` is null
      if (is.null(self$`value`)) {
        return(FALSE)
      }

      if (self$`value` <= 0) {
        return(FALSE)
      }

      # check if the required `currencyId` is null
      if (is.null(self$`currencyId`)) {
        return(FALSE)
      }

      # check if the required `updatedAt` is null
      if (is.null(self$`updatedAt`)) {
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
      # check if the required `value` is null
      if (is.null(self$`value`)) {
        invalid_fields["value"] <- "Non-nullable required field `value` cannot be null."
      }

      if (self$`value` <= 0) {
        invalid_fields["value"] <- "Invalid value for `value`, must be bigger than 0."
      }

      # check if the required `currencyId` is null
      if (is.null(self$`currencyId`)) {
        invalid_fields["currencyId"] <- "Non-nullable required field `currencyId` cannot be null."
      }

      # check if the required `updatedAt` is null
      if (is.null(self$`updatedAt`)) {
        invalid_fields["updatedAt"] <- "Non-nullable required field `updatedAt` cannot be null."
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
# GetPriceDTO$unlock()
#
## Below is an example to define the print function
# GetPriceDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetPriceDTO$lock()

