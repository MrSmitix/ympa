#' Create a new UpdateStocksRequest
#'
#' @description
#' Запрос на изменение информации по остаткам товаров.
#'
#' @docType class
#' @title UpdateStocksRequest
#' @description UpdateStocksRequest Class
#' @format An \code{R6Class} generator object
#' @field skus Данные об остатках товаров. list(\link{UpdateStockDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdateStocksRequest <- R6::R6Class(
  "UpdateStocksRequest",
  public = list(
    `skus` = NULL,
    #' Initialize a new UpdateStocksRequest class.
    #'
    #' @description
    #' Initialize a new UpdateStocksRequest class.
    #'
    #' @param skus Данные об остатках товаров.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`skus`, ...) {
      if (!missing(`skus`)) {
        stopifnot(is.vector(`skus`), length(`skus`) != 0)
        sapply(`skus`, function(x) stopifnot(R6::is.R6(x)))
        if (!identical(`skus`, unique(`skus`))) {
          stop("Error! Items in `skus` are not unique.")
        }
        self$`skus` <- `skus`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateStocksRequest in JSON format
    #' @export
    toJSON = function() {
      UpdateStocksRequestObject <- list()
      if (!is.null(self$`skus`)) {
        UpdateStocksRequestObject[["skus"]] <-
          lapply(self$`skus`, function(x) x$toJSON())
      }
      UpdateStocksRequestObject
    },
    #' Deserialize JSON string into an instance of UpdateStocksRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateStocksRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateStocksRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`skus`)) {
        self$`skus` <- ApiClient$new()$deserializeObj(this_object$`skus`, "set[UpdateStockDTO]", loadNamespace("ympa_r_client"))
        if (!identical(self$`skus`, unique(self$`skus`))) {
          stop("Error! Items in `skus` are not unique.")
        }
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateStocksRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`skus`)) {
          sprintf(
          '"skus":
          [%s]
',
          paste(sapply(self$`skus`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of UpdateStocksRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateStocksRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateStocksRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`skus` <- ApiClient$new()$deserializeObj(this_object$`skus`, "set[UpdateStockDTO]", loadNamespace("ympa_r_client"))
      if (!identical(self$`skus`, unique(self$`skus`))) {
        stop("Error! Items in `skus` are not unique.")
      }
      self
    },
    #' Validate JSON input with respect to UpdateStocksRequest
    #'
    #' @description
    #' Validate JSON input with respect to UpdateStocksRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `skus`
      if (!is.null(input_json$`skus`)) {
        stopifnot(is.vector(input_json$`skus`), length(input_json$`skus`) != 0)
        if (!identical(input_json$`skus`, unique(input_json$`skus`))) {
          stop("Error! Items in `skus` are not unique.")
        }
        tmp <- sapply(input_json$`skus`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UpdateStocksRequest: the required field `skus` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UpdateStocksRequest
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
      # check if the required `skus` is null
      if (is.null(self$`skus`)) {
        return(FALSE)
      }

      if (length(self$`skus`) > 2000) {
        return(FALSE)
      }
      if (length(self$`skus`) < 1) {
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
      # check if the required `skus` is null
      if (is.null(self$`skus`)) {
        invalid_fields["skus"] <- "Non-nullable required field `skus` cannot be null."
      }

      if (length(self$`skus`) > 2000) {
        invalid_fields["skus"] <- "Invalid length for `skus`, number of items must be less than or equal to 2000."
      }
      if (length(self$`skus`) < 1) {
        invalid_fields["skus"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# UpdateStocksRequest$unlock()
#
## Below is an example to define the print function
# UpdateStocksRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UpdateStocksRequest$lock()

