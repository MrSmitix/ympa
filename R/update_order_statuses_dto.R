#' Create a new UpdateOrderStatusesDTO
#'
#' @description
#' Список заказов, статус которых обновился.
#'
#' @docType class
#' @title UpdateOrderStatusesDTO
#' @description UpdateOrderStatusesDTO Class
#' @format An \code{R6Class} generator object
#' @field orders Список с обновленными заказами. list(\link{UpdateOrderStatusDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdateOrderStatusesDTO <- R6::R6Class(
  "UpdateOrderStatusesDTO",
  public = list(
    `orders` = NULL,
    #' Initialize a new UpdateOrderStatusesDTO class.
    #'
    #' @description
    #' Initialize a new UpdateOrderStatusesDTO class.
    #'
    #' @param orders Список с обновленными заказами.
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
    #' @return UpdateOrderStatusesDTO in JSON format
    #' @export
    toJSON = function() {
      UpdateOrderStatusesDTOObject <- list()
      if (!is.null(self$`orders`)) {
        UpdateOrderStatusesDTOObject[["orders"]] <-
          lapply(self$`orders`, function(x) x$toJSON())
      }
      UpdateOrderStatusesDTOObject
    },
    #' Deserialize JSON string into an instance of UpdateOrderStatusesDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateOrderStatusesDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateOrderStatusesDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`orders`)) {
        self$`orders` <- ApiClient$new()$deserializeObj(this_object$`orders`, "array[UpdateOrderStatusDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateOrderStatusesDTO in JSON format
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
    #' Deserialize JSON string into an instance of UpdateOrderStatusesDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateOrderStatusesDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateOrderStatusesDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`orders` <- ApiClient$new()$deserializeObj(this_object$`orders`, "array[UpdateOrderStatusDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to UpdateOrderStatusesDTO
    #'
    #' @description
    #' Validate JSON input with respect to UpdateOrderStatusesDTO and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for UpdateOrderStatusesDTO: the required field `orders` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UpdateOrderStatusesDTO
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
# UpdateOrderStatusesDTO$unlock()
#
## Below is an example to define the print function
# UpdateOrderStatusesDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UpdateOrderStatusesDTO$lock()

