#' Create a new UpdateOfferContentRequest
#'
#' @description
#' Запрос на установку новых значений для параметров.
#'
#' @docType class
#' @title UpdateOfferContentRequest
#' @description UpdateOfferContentRequest Class
#' @format An \code{R6Class} generator object
#' @field offersContent Список товаров с указанными характеристиками. list(\link{OfferContentDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdateOfferContentRequest <- R6::R6Class(
  "UpdateOfferContentRequest",
  public = list(
    `offersContent` = NULL,
    #' Initialize a new UpdateOfferContentRequest class.
    #'
    #' @description
    #' Initialize a new UpdateOfferContentRequest class.
    #'
    #' @param offersContent Список товаров с указанными характеристиками.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offersContent`, ...) {
      if (!missing(`offersContent`)) {
        stopifnot(is.vector(`offersContent`), length(`offersContent`) != 0)
        sapply(`offersContent`, function(x) stopifnot(R6::is.R6(x)))
        self$`offersContent` <- `offersContent`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateOfferContentRequest in JSON format
    #' @export
    toJSON = function() {
      UpdateOfferContentRequestObject <- list()
      if (!is.null(self$`offersContent`)) {
        UpdateOfferContentRequestObject[["offersContent"]] <-
          lapply(self$`offersContent`, function(x) x$toJSON())
      }
      UpdateOfferContentRequestObject
    },
    #' Deserialize JSON string into an instance of UpdateOfferContentRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateOfferContentRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateOfferContentRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`offersContent`)) {
        self$`offersContent` <- ApiClient$new()$deserializeObj(this_object$`offersContent`, "array[OfferContentDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateOfferContentRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`offersContent`)) {
          sprintf(
          '"offersContent":
          [%s]
',
          paste(sapply(self$`offersContent`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of UpdateOfferContentRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateOfferContentRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateOfferContentRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`offersContent` <- ApiClient$new()$deserializeObj(this_object$`offersContent`, "array[OfferContentDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to UpdateOfferContentRequest
    #'
    #' @description
    #' Validate JSON input with respect to UpdateOfferContentRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `offersContent`
      if (!is.null(input_json$`offersContent`)) {
        stopifnot(is.vector(input_json$`offersContent`), length(input_json$`offersContent`) != 0)
        tmp <- sapply(input_json$`offersContent`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UpdateOfferContentRequest: the required field `offersContent` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UpdateOfferContentRequest
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
      # check if the required `offersContent` is null
      if (is.null(self$`offersContent`)) {
        return(FALSE)
      }

      if (length(self$`offersContent`) > 100) {
        return(FALSE)
      }
      if (length(self$`offersContent`) < 1) {
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
      # check if the required `offersContent` is null
      if (is.null(self$`offersContent`)) {
        invalid_fields["offersContent"] <- "Non-nullable required field `offersContent` cannot be null."
      }

      if (length(self$`offersContent`) > 100) {
        invalid_fields["offersContent"] <- "Invalid length for `offersContent`, number of items must be less than or equal to 100."
      }
      if (length(self$`offersContent`) < 1) {
        invalid_fields["offersContent"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# UpdateOfferContentRequest$unlock()
#
## Below is an example to define the print function
# UpdateOfferContentRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UpdateOfferContentRequest$lock()

