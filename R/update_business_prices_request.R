#' Create a new UpdateBusinessPricesRequest
#'
#' @description
#' Запрос на установку базовых цен на товары.
#'
#' @docType class
#' @title UpdateBusinessPricesRequest
#' @description UpdateBusinessPricesRequest Class
#' @format An \code{R6Class} generator object
#' @field offers Список товаров с ценами. list(\link{UpdateBusinessOfferPriceDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdateBusinessPricesRequest <- R6::R6Class(
  "UpdateBusinessPricesRequest",
  public = list(
    `offers` = NULL,
    #' Initialize a new UpdateBusinessPricesRequest class.
    #'
    #' @description
    #' Initialize a new UpdateBusinessPricesRequest class.
    #'
    #' @param offers Список товаров с ценами.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offers`, ...) {
      if (!missing(`offers`)) {
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
    #' @return UpdateBusinessPricesRequest in JSON format
    #' @export
    toJSON = function() {
      UpdateBusinessPricesRequestObject <- list()
      if (!is.null(self$`offers`)) {
        UpdateBusinessPricesRequestObject[["offers"]] <-
          lapply(self$`offers`, function(x) x$toJSON())
      }
      UpdateBusinessPricesRequestObject
    },
    #' Deserialize JSON string into an instance of UpdateBusinessPricesRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateBusinessPricesRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateBusinessPricesRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`offers`)) {
        self$`offers` <- ApiClient$new()$deserializeObj(this_object$`offers`, "array[UpdateBusinessOfferPriceDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateBusinessPricesRequest in JSON format
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
    #' Deserialize JSON string into an instance of UpdateBusinessPricesRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateBusinessPricesRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateBusinessPricesRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`offers` <- ApiClient$new()$deserializeObj(this_object$`offers`, "array[UpdateBusinessOfferPriceDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to UpdateBusinessPricesRequest
    #'
    #' @description
    #' Validate JSON input with respect to UpdateBusinessPricesRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `offers`
      if (!is.null(input_json$`offers`)) {
        stopifnot(is.vector(input_json$`offers`), length(input_json$`offers`) != 0)
        tmp <- sapply(input_json$`offers`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UpdateBusinessPricesRequest: the required field `offers` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UpdateBusinessPricesRequest
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
      # check if the required `offers` is null
      if (is.null(self$`offers`)) {
        return(FALSE)
      }

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
      # check if the required `offers` is null
      if (is.null(self$`offers`)) {
        invalid_fields["offers"] <- "Non-nullable required field `offers` cannot be null."
      }

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
# UpdateBusinessPricesRequest$unlock()
#
## Below is an example to define the print function
# UpdateBusinessPricesRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UpdateBusinessPricesRequest$lock()

