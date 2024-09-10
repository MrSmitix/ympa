#' Create a new UpdateOrderStatusesRequest
#'
#' @description
#' Список заказов.
#'
#' @docType class
#' @title UpdateOrderStatusesRequest
#' @description UpdateOrderStatusesRequest Class
#' @format An \code{R6Class} generator object
#' @field orders Список заказов. list(\link{OrderStateDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdateOrderStatusesRequest <- R6::R6Class(
  "UpdateOrderStatusesRequest",
  public = list(
    `orders` = NULL,
    #' Initialize a new UpdateOrderStatusesRequest class.
    #'
    #' @description
    #' Initialize a new UpdateOrderStatusesRequest class.
    #'
    #' @param orders Список заказов.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`orders`, ...) {
      if (!missing(`orders`)) {
        stopifnot(is.vector(`orders`), length(`orders`) != 0)
        sapply(`orders`, function(x) stopifnot(R6::is.R6(x)))
        self$`orders` <- `orders`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateOrderStatusesRequest in JSON format
    #' @export
    toJSON = function() {
      UpdateOrderStatusesRequestObject <- list()
      if (!is.null(self$`orders`)) {
        UpdateOrderStatusesRequestObject[["orders"]] <-
          lapply(self$`orders`, function(x) x$toJSON())
      }
      UpdateOrderStatusesRequestObject
    },
    #' Deserialize JSON string into an instance of UpdateOrderStatusesRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateOrderStatusesRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateOrderStatusesRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`orders`)) {
        self$`orders` <- ApiClient$new()$deserializeObj(this_object$`orders`, "array[OrderStateDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateOrderStatusesRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`orders`)) {
          sprintf(
          '"orders":
          [%s]
',
          paste(sapply(self$`orders`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of UpdateOrderStatusesRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateOrderStatusesRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateOrderStatusesRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`orders` <- ApiClient$new()$deserializeObj(this_object$`orders`, "array[OrderStateDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to UpdateOrderStatusesRequest
    #'
    #' @description
    #' Validate JSON input with respect to UpdateOrderStatusesRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `orders`
      if (!is.null(input_json$`orders`)) {
        stopifnot(is.vector(input_json$`orders`), length(input_json$`orders`) != 0)
        tmp <- sapply(input_json$`orders`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UpdateOrderStatusesRequest: the required field `orders` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UpdateOrderStatusesRequest
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
      # check if the required `orders` is null
      if (is.null(self$`orders`)) {
        return(FALSE)
      }

      if (length(self$`orders`) > 30) {
        return(FALSE)
      }
      if (length(self$`orders`) < 1) {
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
      # check if the required `orders` is null
      if (is.null(self$`orders`)) {
        invalid_fields["orders"] <- "Non-nullable required field `orders` cannot be null."
      }

      if (length(self$`orders`) > 30) {
        invalid_fields["orders"] <- "Invalid length for `orders`, number of items must be less than or equal to 30."
      }
      if (length(self$`orders`) < 1) {
        invalid_fields["orders"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# UpdateOrderStatusesRequest$unlock()
#
## Below is an example to define the print function
# UpdateOrderStatusesRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UpdateOrderStatusesRequest$lock()

