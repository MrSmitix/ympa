#' Create a new GetSuggestedOfferMappingsRequest
#'
#' @description
#' GetSuggestedOfferMappingsRequest Class
#'
#' @docType class
#' @title GetSuggestedOfferMappingsRequest
#' @description GetSuggestedOfferMappingsRequest Class
#' @format An \code{R6Class} generator object
#' @field offers Список товаров. list(\link{SuggestedOfferDTO}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetSuggestedOfferMappingsRequest <- R6::R6Class(
  "GetSuggestedOfferMappingsRequest",
  public = list(
    `offers` = NULL,
    #' Initialize a new GetSuggestedOfferMappingsRequest class.
    #'
    #' @description
    #' Initialize a new GetSuggestedOfferMappingsRequest class.
    #'
    #' @param offers Список товаров.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offers` = NULL, ...) {
      if (!is.null(`offers`)) {
        stopifnot(is.vector(`offers`), length(`offers`) != 0)
        sapply(`offers`, function(x) stopifnot(R6::is.R6(x)))
        self$`offers` <- `offers`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetSuggestedOfferMappingsRequest in JSON format
    #' @export
    toJSON = function() {
      GetSuggestedOfferMappingsRequestObject <- list()
      if (!is.null(self$`offers`)) {
        GetSuggestedOfferMappingsRequestObject[["offers"]] <-
          lapply(self$`offers`, function(x) x$toJSON())
      }
      GetSuggestedOfferMappingsRequestObject
    },
    #' Deserialize JSON string into an instance of GetSuggestedOfferMappingsRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetSuggestedOfferMappingsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetSuggestedOfferMappingsRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`offers`)) {
        self$`offers` <- ApiClient$new()$deserializeObj(this_object$`offers`, "array[SuggestedOfferDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetSuggestedOfferMappingsRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`offers`)) {
          sprintf(
          '"offers":
          [%s]
',
          paste(sapply(self$`offers`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetSuggestedOfferMappingsRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetSuggestedOfferMappingsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetSuggestedOfferMappingsRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`offers` <- ApiClient$new()$deserializeObj(this_object$`offers`, "array[SuggestedOfferDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to GetSuggestedOfferMappingsRequest
    #'
    #' @description
    #' Validate JSON input with respect to GetSuggestedOfferMappingsRequest and throw an exception if invalid
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
    #' @return String representation of GetSuggestedOfferMappingsRequest
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
      if (length(self$`offers`) > 500) {
        return(FALSE)
      }
      if (length(self$`offers`) < 1) {
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
      if (length(self$`offers`) > 500) {
        invalid_fields["offers"] <- "Invalid length for `offers`, number of items must be less than or equal to 500."
      }
      if (length(self$`offers`) < 1) {
        invalid_fields["offers"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# GetSuggestedOfferMappingsRequest$unlock()
#
## Below is an example to define the print function
# GetSuggestedOfferMappingsRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetSuggestedOfferMappingsRequest$lock()

