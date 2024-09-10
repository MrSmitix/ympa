#' Create a new PriceSuggestDTO
#'
#' @description
#' Тип цены.
#'
#' @docType class
#' @title PriceSuggestDTO
#' @description PriceSuggestDTO Class
#' @format An \code{R6Class} generator object
#' @field type  \link{PriceSuggestType} [optional]
#' @field price Цена в рублях. numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PriceSuggestDTO <- R6::R6Class(
  "PriceSuggestDTO",
  public = list(
    `type` = NULL,
    `price` = NULL,
    #' Initialize a new PriceSuggestDTO class.
    #'
    #' @description
    #' Initialize a new PriceSuggestDTO class.
    #'
    #' @param type type
    #' @param price Цена в рублях.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`type` = NULL, `price` = NULL, ...) {
      if (!is.null(`type`)) {
        if (!(`type` %in% c())) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
      if (!is.null(`price`)) {
        self$`price` <- `price`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PriceSuggestDTO in JSON format
    #' @export
    toJSON = function() {
      PriceSuggestDTOObject <- list()
      if (!is.null(self$`type`)) {
        PriceSuggestDTOObject[["type"]] <-
          self$`type`$toJSON()
      }
      if (!is.null(self$`price`)) {
        PriceSuggestDTOObject[["price"]] <-
          self$`price`
      }
      PriceSuggestDTOObject
    },
    #' Deserialize JSON string into an instance of PriceSuggestDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of PriceSuggestDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of PriceSuggestDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        `type_object` <- PriceSuggestType$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
      if (!is.null(this_object$`price`)) {
        self$`price` <- this_object$`price`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PriceSuggestDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
          %s
          ',
          jsonlite::toJSON(self$`type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`price`)) {
          sprintf(
          '"price":
            %d
                    ',
          self$`price`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of PriceSuggestDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of PriceSuggestDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of PriceSuggestDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`type` <- PriceSuggestType$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self$`price` <- this_object$`price`
      self
    },
    #' Validate JSON input with respect to PriceSuggestDTO
    #'
    #' @description
    #' Validate JSON input with respect to PriceSuggestDTO and throw an exception if invalid
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
    #' @return String representation of PriceSuggestDTO
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
# PriceSuggestDTO$unlock()
#
## Below is an example to define the print function
# PriceSuggestDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PriceSuggestDTO$lock()

