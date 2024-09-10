#' Create a new ModelDTO
#'
#' @description
#' Модель товара.
#'
#' @docType class
#' @title ModelDTO
#' @description ModelDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор модели товара. integer [optional]
#' @field name Название модели товара. character [optional]
#' @field prices  \link{ModelPriceDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ModelDTO <- R6::R6Class(
  "ModelDTO",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `prices` = NULL,
    #' Initialize a new ModelDTO class.
    #'
    #' @description
    #' Initialize a new ModelDTO class.
    #'
    #' @param id Идентификатор модели товара.
    #' @param name Название модели товара.
    #' @param prices prices
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id` = NULL, `name` = NULL, `prices` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`prices`)) {
        stopifnot(R6::is.R6(`prices`))
        self$`prices` <- `prices`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ModelDTO in JSON format
    #' @export
    toJSON = function() {
      ModelDTOObject <- list()
      if (!is.null(self$`id`)) {
        ModelDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        ModelDTOObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`prices`)) {
        ModelDTOObject[["prices"]] <-
          self$`prices`$toJSON()
      }
      ModelDTOObject
    },
    #' Deserialize JSON string into an instance of ModelDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ModelDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ModelDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`prices`)) {
        `prices_object` <- ModelPriceDTO$new()
        `prices_object`$fromJSON(jsonlite::toJSON(this_object$`prices`, auto_unbox = TRUE, digits = NA))
        self$`prices` <- `prices_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ModelDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            %d
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        },
        if (!is.null(self$`prices`)) {
          sprintf(
          '"prices":
          %s
          ',
          jsonlite::toJSON(self$`prices`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ModelDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ModelDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ModelDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`prices` <- ModelPriceDTO$new()$fromJSON(jsonlite::toJSON(this_object$`prices`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to ModelDTO
    #'
    #' @description
    #' Validate JSON input with respect to ModelDTO and throw an exception if invalid
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
    #' @return String representation of ModelDTO
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
# ModelDTO$unlock()
#
## Below is an example to define the print function
# ModelDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ModelDTO$lock()

