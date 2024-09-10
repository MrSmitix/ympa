#' Create a new ModelsDTO
#'
#' @description
#' Список моделей товаров.
#'
#' @docType class
#' @title ModelsDTO
#' @description ModelsDTO Class
#' @format An \code{R6Class} generator object
#' @field models Список моделей товаров. list(\link{ModelDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ModelsDTO <- R6::R6Class(
  "ModelsDTO",
  public = list(
    `models` = NULL,
    #' Initialize a new ModelsDTO class.
    #'
    #' @description
    #' Initialize a new ModelsDTO class.
    #'
    #' @param models Список моделей товаров.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`models`, ...) {
      if (!missing(`models`)) {
        stopifnot(is.vector(`models`), length(`models`) != 0)
        sapply(`models`, function(x) stopifnot(R6::is.R6(x)))
        self$`models` <- `models`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ModelsDTO in JSON format
    #' @export
    toJSON = function() {
      ModelsDTOObject <- list()
      if (!is.null(self$`models`)) {
        ModelsDTOObject[["models"]] <-
          lapply(self$`models`, function(x) x$toJSON())
      }
      ModelsDTOObject
    },
    #' Deserialize JSON string into an instance of ModelsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ModelsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ModelsDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`models`)) {
        self$`models` <- ApiClient$new()$deserializeObj(this_object$`models`, "array[ModelDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ModelsDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`models`)) {
          sprintf(
          '"models":
          [%s]
',
          paste(sapply(self$`models`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ModelsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ModelsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ModelsDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`models` <- ApiClient$new()$deserializeObj(this_object$`models`, "array[ModelDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to ModelsDTO
    #'
    #' @description
    #' Validate JSON input with respect to ModelsDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `models`
      if (!is.null(input_json$`models`)) {
        stopifnot(is.vector(input_json$`models`), length(input_json$`models`) != 0)
        tmp <- sapply(input_json$`models`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ModelsDTO: the required field `models` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ModelsDTO
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
      # check if the required `models` is null
      if (is.null(self$`models`)) {
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
      # check if the required `models` is null
      if (is.null(self$`models`)) {
        invalid_fields["models"] <- "Non-nullable required field `models` cannot be null."
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
# ModelsDTO$unlock()
#
## Below is an example to define the print function
# ModelsDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ModelsDTO$lock()

