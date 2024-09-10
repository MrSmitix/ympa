#' Create a new OrderBoxLayoutDTO
#'
#' @description
#' Информация о коробке.
#'
#' @docType class
#' @title OrderBoxLayoutDTO
#' @description OrderBoxLayoutDTO Class
#' @format An \code{R6Class} generator object
#' @field items Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. list(\link{OrderBoxLayoutItemDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderBoxLayoutDTO <- R6::R6Class(
  "OrderBoxLayoutDTO",
  public = list(
    `items` = NULL,
    #' Initialize a new OrderBoxLayoutDTO class.
    #'
    #' @description
    #' Initialize a new OrderBoxLayoutDTO class.
    #'
    #' @param items Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт.
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
    #' @return OrderBoxLayoutDTO in JSON format
    #' @export
    toJSON = function() {
      OrderBoxLayoutDTOObject <- list()
      if (!is.null(self$`items`)) {
        OrderBoxLayoutDTOObject[["items"]] <-
          lapply(self$`items`, function(x) x$toJSON())
      }
      OrderBoxLayoutDTOObject
    },
    #' Deserialize JSON string into an instance of OrderBoxLayoutDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderBoxLayoutDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderBoxLayoutDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`items`)) {
        self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[OrderBoxLayoutItemDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderBoxLayoutDTO in JSON format
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
    #' Deserialize JSON string into an instance of OrderBoxLayoutDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderBoxLayoutDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderBoxLayoutDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[OrderBoxLayoutItemDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to OrderBoxLayoutDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrderBoxLayoutDTO and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for OrderBoxLayoutDTO: the required field `items` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OrderBoxLayoutDTO
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
# OrderBoxLayoutDTO$unlock()
#
## Below is an example to define the print function
# OrderBoxLayoutDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderBoxLayoutDTO$lock()

