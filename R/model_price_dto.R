#' Create a new ModelPriceDTO
#'
#' @description
#' Информация о ценах на модель товара.
#'
#' @docType class
#' @title ModelPriceDTO
#' @description ModelPriceDTO Class
#' @format An \code{R6Class} generator object
#' @field avg Средняя цена предложения для модели в регионе. numeric [optional]
#' @field max Максимальная цена предложения для модели в регионе. numeric [optional]
#' @field min Минимальная цена предложения для модели в регионе. numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ModelPriceDTO <- R6::R6Class(
  "ModelPriceDTO",
  public = list(
    `avg` = NULL,
    `max` = NULL,
    `min` = NULL,
    #' Initialize a new ModelPriceDTO class.
    #'
    #' @description
    #' Initialize a new ModelPriceDTO class.
    #'
    #' @param avg Средняя цена предложения для модели в регионе.
    #' @param max Максимальная цена предложения для модели в регионе.
    #' @param min Минимальная цена предложения для модели в регионе.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`avg` = NULL, `max` = NULL, `min` = NULL, ...) {
      if (!is.null(`avg`)) {
        self$`avg` <- `avg`
      }
      if (!is.null(`max`)) {
        self$`max` <- `max`
      }
      if (!is.null(`min`)) {
        self$`min` <- `min`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ModelPriceDTO in JSON format
    #' @export
    toJSON = function() {
      ModelPriceDTOObject <- list()
      if (!is.null(self$`avg`)) {
        ModelPriceDTOObject[["avg"]] <-
          self$`avg`
      }
      if (!is.null(self$`max`)) {
        ModelPriceDTOObject[["max"]] <-
          self$`max`
      }
      if (!is.null(self$`min`)) {
        ModelPriceDTOObject[["min"]] <-
          self$`min`
      }
      ModelPriceDTOObject
    },
    #' Deserialize JSON string into an instance of ModelPriceDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ModelPriceDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ModelPriceDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`avg`)) {
        self$`avg` <- this_object$`avg`
      }
      if (!is.null(this_object$`max`)) {
        self$`max` <- this_object$`max`
      }
      if (!is.null(this_object$`min`)) {
        self$`min` <- this_object$`min`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ModelPriceDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`avg`)) {
          sprintf(
          '"avg":
            %d
                    ',
          self$`avg`
          )
        },
        if (!is.null(self$`max`)) {
          sprintf(
          '"max":
            %d
                    ',
          self$`max`
          )
        },
        if (!is.null(self$`min`)) {
          sprintf(
          '"min":
            %d
                    ',
          self$`min`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ModelPriceDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ModelPriceDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ModelPriceDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`avg` <- this_object$`avg`
      self$`max` <- this_object$`max`
      self$`min` <- this_object$`min`
      self
    },
    #' Validate JSON input with respect to ModelPriceDTO
    #'
    #' @description
    #' Validate JSON input with respect to ModelPriceDTO and throw an exception if invalid
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
    #' @return String representation of ModelPriceDTO
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
# ModelPriceDTO$unlock()
#
## Below is an example to define the print function
# ModelPriceDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ModelPriceDTO$lock()

