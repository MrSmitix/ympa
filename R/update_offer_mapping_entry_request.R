#' Create a new UpdateOfferMappingEntryRequest
#'
#' @description
#' Запрос на обновление товаров.
#'
#' @docType class
#' @title UpdateOfferMappingEntryRequest
#' @description UpdateOfferMappingEntryRequest Class
#' @format An \code{R6Class} generator object
#' @field offerMappingEntries Информация о товарах в каталоге. list(\link{UpdateOfferMappingEntryDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdateOfferMappingEntryRequest <- R6::R6Class(
  "UpdateOfferMappingEntryRequest",
  public = list(
    `offerMappingEntries` = NULL,
    #' Initialize a new UpdateOfferMappingEntryRequest class.
    #'
    #' @description
    #' Initialize a new UpdateOfferMappingEntryRequest class.
    #'
    #' @param offerMappingEntries Информация о товарах в каталоге.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offerMappingEntries`, ...) {
      if (!missing(`offerMappingEntries`)) {
        stopifnot(is.vector(`offerMappingEntries`), length(`offerMappingEntries`) != 0)
        sapply(`offerMappingEntries`, function(x) stopifnot(R6::is.R6(x)))
        self$`offerMappingEntries` <- `offerMappingEntries`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateOfferMappingEntryRequest in JSON format
    #' @export
    toJSON = function() {
      UpdateOfferMappingEntryRequestObject <- list()
      if (!is.null(self$`offerMappingEntries`)) {
        UpdateOfferMappingEntryRequestObject[["offerMappingEntries"]] <-
          lapply(self$`offerMappingEntries`, function(x) x$toJSON())
      }
      UpdateOfferMappingEntryRequestObject
    },
    #' Deserialize JSON string into an instance of UpdateOfferMappingEntryRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateOfferMappingEntryRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateOfferMappingEntryRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`offerMappingEntries`)) {
        self$`offerMappingEntries` <- ApiClient$new()$deserializeObj(this_object$`offerMappingEntries`, "array[UpdateOfferMappingEntryDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateOfferMappingEntryRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`offerMappingEntries`)) {
          sprintf(
          '"offerMappingEntries":
          [%s]
',
          paste(sapply(self$`offerMappingEntries`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of UpdateOfferMappingEntryRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateOfferMappingEntryRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateOfferMappingEntryRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`offerMappingEntries` <- ApiClient$new()$deserializeObj(this_object$`offerMappingEntries`, "array[UpdateOfferMappingEntryDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to UpdateOfferMappingEntryRequest
    #'
    #' @description
    #' Validate JSON input with respect to UpdateOfferMappingEntryRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `offerMappingEntries`
      if (!is.null(input_json$`offerMappingEntries`)) {
        stopifnot(is.vector(input_json$`offerMappingEntries`), length(input_json$`offerMappingEntries`) != 0)
        tmp <- sapply(input_json$`offerMappingEntries`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UpdateOfferMappingEntryRequest: the required field `offerMappingEntries` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UpdateOfferMappingEntryRequest
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
      # check if the required `offerMappingEntries` is null
      if (is.null(self$`offerMappingEntries`)) {
        return(FALSE)
      }

      if (length(self$`offerMappingEntries`) > 500) {
        return(FALSE)
      }
      if (length(self$`offerMappingEntries`) < 1) {
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
      # check if the required `offerMappingEntries` is null
      if (is.null(self$`offerMappingEntries`)) {
        invalid_fields["offerMappingEntries"] <- "Non-nullable required field `offerMappingEntries` cannot be null."
      }

      if (length(self$`offerMappingEntries`) > 500) {
        invalid_fields["offerMappingEntries"] <- "Invalid length for `offerMappingEntries`, number of items must be less than or equal to 500."
      }
      if (length(self$`offerMappingEntries`) < 1) {
        invalid_fields["offerMappingEntries"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# UpdateOfferMappingEntryRequest$unlock()
#
## Below is an example to define the print function
# UpdateOfferMappingEntryRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UpdateOfferMappingEntryRequest$lock()

