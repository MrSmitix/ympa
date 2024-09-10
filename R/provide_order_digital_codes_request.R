#' Create a new ProvideOrderDigitalCodesRequest
#'
#' @description
#' Запрос на передачу ключей цифровых товаров.
#'
#' @docType class
#' @title ProvideOrderDigitalCodesRequest
#' @description ProvideOrderDigitalCodesRequest Class
#' @format An \code{R6Class} generator object
#' @field items Список проданных ключей.  Если в заказе есть несколько **одинаковых** товаров (например, несколько ключей к одной и той же подписке), передайте каждый в виде отдельного элемента массива. `id` у этих элементов должен быть один и тот же. list(\link{OrderDigitalItemDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ProvideOrderDigitalCodesRequest <- R6::R6Class(
  "ProvideOrderDigitalCodesRequest",
  public = list(
    `items` = NULL,
    #' Initialize a new ProvideOrderDigitalCodesRequest class.
    #'
    #' @description
    #' Initialize a new ProvideOrderDigitalCodesRequest class.
    #'
    #' @param items Список проданных ключей.  Если в заказе есть несколько **одинаковых** товаров (например, несколько ключей к одной и той же подписке), передайте каждый в виде отдельного элемента массива. `id` у этих элементов должен быть один и тот же.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`items`, ...) {
      if (!missing(`items`)) {
        stopifnot(is.vector(`items`), length(`items`) != 0)
        sapply(`items`, function(x) stopifnot(R6::is.R6(x)))
        self$`items` <- `items`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ProvideOrderDigitalCodesRequest in JSON format
    #' @export
    toJSON = function() {
      ProvideOrderDigitalCodesRequestObject <- list()
      if (!is.null(self$`items`)) {
        ProvideOrderDigitalCodesRequestObject[["items"]] <-
          lapply(self$`items`, function(x) x$toJSON())
      }
      ProvideOrderDigitalCodesRequestObject
    },
    #' Deserialize JSON string into an instance of ProvideOrderDigitalCodesRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of ProvideOrderDigitalCodesRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProvideOrderDigitalCodesRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`items`)) {
        self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[OrderDigitalItemDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ProvideOrderDigitalCodesRequest in JSON format
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
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ProvideOrderDigitalCodesRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of ProvideOrderDigitalCodesRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProvideOrderDigitalCodesRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[OrderDigitalItemDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to ProvideOrderDigitalCodesRequest
    #'
    #' @description
    #' Validate JSON input with respect to ProvideOrderDigitalCodesRequest and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for ProvideOrderDigitalCodesRequest: the required field `items` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ProvideOrderDigitalCodesRequest
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
# ProvideOrderDigitalCodesRequest$unlock()
#
## Below is an example to define the print function
# ProvideOrderDigitalCodesRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ProvideOrderDigitalCodesRequest$lock()

