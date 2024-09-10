#' Create a new UpdateOrderItemRequest
#'
#' @description
#' Запрос на обновление состава заказа.
#'
#' @docType class
#' @title UpdateOrderItemRequest
#' @description UpdateOrderItemRequest Class
#' @format An \code{R6Class} generator object
#' @field items Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. list(\link{OrderItemModificationDTO})
#' @field reason  \link{OrderItemsModificationRequestReasonType} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdateOrderItemRequest <- R6::R6Class(
  "UpdateOrderItemRequest",
  public = list(
    `items` = NULL,
    `reason` = NULL,
    #' Initialize a new UpdateOrderItemRequest class.
    #'
    #' @description
    #' Initialize a new UpdateOrderItemRequest class.
    #'
    #' @param items Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр.
    #' @param reason reason
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`items`, `reason` = NULL, ...) {
      if (!missing(`items`)) {
        stopifnot(is.vector(`items`), length(`items`) != 0)
        sapply(`items`, function(x) stopifnot(R6::is.R6(x)))
        self$`items` <- `items`
      }
      if (!is.null(`reason`)) {
        if (!(`reason` %in% c())) {
          stop(paste("Error! \"", `reason`, "\" cannot be assigned to `reason`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`reason`))
        self$`reason` <- `reason`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateOrderItemRequest in JSON format
    #' @export
    toJSON = function() {
      UpdateOrderItemRequestObject <- list()
      if (!is.null(self$`items`)) {
        UpdateOrderItemRequestObject[["items"]] <-
          lapply(self$`items`, function(x) x$toJSON())
      }
      if (!is.null(self$`reason`)) {
        UpdateOrderItemRequestObject[["reason"]] <-
          self$`reason`$toJSON()
      }
      UpdateOrderItemRequestObject
    },
    #' Deserialize JSON string into an instance of UpdateOrderItemRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateOrderItemRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateOrderItemRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`items`)) {
        self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[OrderItemModificationDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`reason`)) {
        `reason_object` <- OrderItemsModificationRequestReasonType$new()
        `reason_object`$fromJSON(jsonlite::toJSON(this_object$`reason`, auto_unbox = TRUE, digits = NA))
        self$`reason` <- `reason_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateOrderItemRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`items`)) {
          sprintf(
          '"items":
          [%s]
',
          paste(sapply(self$`items`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`reason`)) {
          sprintf(
          '"reason":
          %s
          ',
          jsonlite::toJSON(self$`reason`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of UpdateOrderItemRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateOrderItemRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateOrderItemRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[OrderItemModificationDTO]", loadNamespace("ympa_r_client"))
      self$`reason` <- OrderItemsModificationRequestReasonType$new()$fromJSON(jsonlite::toJSON(this_object$`reason`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to UpdateOrderItemRequest
    #'
    #' @description
    #' Validate JSON input with respect to UpdateOrderItemRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `items`
      if (!is.null(input_json$`items`)) {
        stopifnot(is.vector(input_json$`items`), length(input_json$`items`) != 0)
        tmp <- sapply(input_json$`items`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UpdateOrderItemRequest: the required field `items` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UpdateOrderItemRequest
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
      # check if the required `items` is null
      if (is.null(self$`items`)) {
        return(FALSE)
      }

      if (length(self$`items`) < 1) {
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
      # check if the required `items` is null
      if (is.null(self$`items`)) {
        invalid_fields["items"] <- "Non-nullable required field `items` cannot be null."
      }

      if (length(self$`items`) < 1) {
        invalid_fields["items"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# UpdateOrderItemRequest$unlock()
#
## Below is an example to define the print function
# UpdateOrderItemRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UpdateOrderItemRequest$lock()

