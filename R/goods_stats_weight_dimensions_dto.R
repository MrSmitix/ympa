#' Create a new GoodsStatsWeightDimensionsDTO
#'
#' @description
#' Информация о весе и габаритах товара.  Если товар уже привязан к карточке (`marketSku`), в ответе вернутся габариты из карточки Маркета, а не размеры, которые вы передаете. 
#'
#' @docType class
#' @title GoodsStatsWeightDimensionsDTO
#' @description GoodsStatsWeightDimensionsDTO Class
#' @format An \code{R6Class} generator object
#' @field length Длина товара в сантиметрах. numeric [optional]
#' @field width Ширина товара в сантиметрах. numeric [optional]
#' @field height Высота товара в сантиметрах. numeric [optional]
#' @field weight Вес товара в килограммах. numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GoodsStatsWeightDimensionsDTO <- R6::R6Class(
  "GoodsStatsWeightDimensionsDTO",
  public = list(
    `length` = NULL,
    `width` = NULL,
    `height` = NULL,
    `weight` = NULL,
    #' Initialize a new GoodsStatsWeightDimensionsDTO class.
    #'
    #' @description
    #' Initialize a new GoodsStatsWeightDimensionsDTO class.
    #'
    #' @param length Длина товара в сантиметрах.
    #' @param width Ширина товара в сантиметрах.
    #' @param height Высота товара в сантиметрах.
    #' @param weight Вес товара в килограммах.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`length` = NULL, `width` = NULL, `height` = NULL, `weight` = NULL, ...) {
      if (!is.null(`length`)) {
        self$`length` <- `length`
      }
      if (!is.null(`width`)) {
        self$`width` <- `width`
      }
      if (!is.null(`height`)) {
        self$`height` <- `height`
      }
      if (!is.null(`weight`)) {
        self$`weight` <- `weight`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GoodsStatsWeightDimensionsDTO in JSON format
    #' @export
    toJSON = function() {
      GoodsStatsWeightDimensionsDTOObject <- list()
      if (!is.null(self$`length`)) {
        GoodsStatsWeightDimensionsDTOObject[["length"]] <-
          self$`length`
      }
      if (!is.null(self$`width`)) {
        GoodsStatsWeightDimensionsDTOObject[["width"]] <-
          self$`width`
      }
      if (!is.null(self$`height`)) {
        GoodsStatsWeightDimensionsDTOObject[["height"]] <-
          self$`height`
      }
      if (!is.null(self$`weight`)) {
        GoodsStatsWeightDimensionsDTOObject[["weight"]] <-
          self$`weight`
      }
      GoodsStatsWeightDimensionsDTOObject
    },
    #' Deserialize JSON string into an instance of GoodsStatsWeightDimensionsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GoodsStatsWeightDimensionsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GoodsStatsWeightDimensionsDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`length`)) {
        self$`length` <- this_object$`length`
      }
      if (!is.null(this_object$`width`)) {
        self$`width` <- this_object$`width`
      }
      if (!is.null(this_object$`height`)) {
        self$`height` <- this_object$`height`
      }
      if (!is.null(this_object$`weight`)) {
        self$`weight` <- this_object$`weight`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GoodsStatsWeightDimensionsDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`length`)) {
          sprintf(
          '"length":
            %d
                    ',
          self$`length`
          )
        },
        if (!is.null(self$`width`)) {
          sprintf(
          '"width":
            %d
                    ',
          self$`width`
          )
        },
        if (!is.null(self$`height`)) {
          sprintf(
          '"height":
            %d
                    ',
          self$`height`
          )
        },
        if (!is.null(self$`weight`)) {
          sprintf(
          '"weight":
            %d
                    ',
          self$`weight`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GoodsStatsWeightDimensionsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GoodsStatsWeightDimensionsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GoodsStatsWeightDimensionsDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`length` <- this_object$`length`
      self$`width` <- this_object$`width`
      self$`height` <- this_object$`height`
      self$`weight` <- this_object$`weight`
      self
    },
    #' Validate JSON input with respect to GoodsStatsWeightDimensionsDTO
    #'
    #' @description
    #' Validate JSON input with respect to GoodsStatsWeightDimensionsDTO and throw an exception if invalid
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
    #' @return String representation of GoodsStatsWeightDimensionsDTO
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
# GoodsStatsWeightDimensionsDTO$unlock()
#
## Below is an example to define the print function
# GoodsStatsWeightDimensionsDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GoodsStatsWeightDimensionsDTO$lock()

