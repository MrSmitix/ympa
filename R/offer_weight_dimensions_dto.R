#' Create a new OfferWeightDimensionsDTO
#'
#' @description
#' Габариты упаковки и вес товара.  Если товар занимает несколько коробок, перед измерением размеров сложите их компактно.  ![Схема измерения многоместных грузов](../../_images/reference/boxes-measure.png) 
#'
#' @docType class
#' @title OfferWeightDimensionsDTO
#' @description OfferWeightDimensionsDTO Class
#' @format An \code{R6Class} generator object
#' @field length Длина упаковки в см. numeric
#' @field width Ширина упаковки в см. numeric
#' @field height Высота упаковки в см. numeric
#' @field weight Вес товара в кг с учетом упаковки (брутто). numeric
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OfferWeightDimensionsDTO <- R6::R6Class(
  "OfferWeightDimensionsDTO",
  public = list(
    `length` = NULL,
    `width` = NULL,
    `height` = NULL,
    `weight` = NULL,
    #' Initialize a new OfferWeightDimensionsDTO class.
    #'
    #' @description
    #' Initialize a new OfferWeightDimensionsDTO class.
    #'
    #' @param length Длина упаковки в см.
    #' @param width Ширина упаковки в см.
    #' @param height Высота упаковки в см.
    #' @param weight Вес товара в кг с учетом упаковки (брутто).
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`length`, `width`, `height`, `weight`, ...) {
      if (!missing(`length`)) {
        self$`length` <- `length`
      }
      if (!missing(`width`)) {
        self$`width` <- `width`
      }
      if (!missing(`height`)) {
        self$`height` <- `height`
      }
      if (!missing(`weight`)) {
        self$`weight` <- `weight`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferWeightDimensionsDTO in JSON format
    #' @export
    toJSON = function() {
      OfferWeightDimensionsDTOObject <- list()
      if (!is.null(self$`length`)) {
        OfferWeightDimensionsDTOObject[["length"]] <-
          self$`length`
      }
      if (!is.null(self$`width`)) {
        OfferWeightDimensionsDTOObject[["width"]] <-
          self$`width`
      }
      if (!is.null(self$`height`)) {
        OfferWeightDimensionsDTOObject[["height"]] <-
          self$`height`
      }
      if (!is.null(self$`weight`)) {
        OfferWeightDimensionsDTOObject[["weight"]] <-
          self$`weight`
      }
      OfferWeightDimensionsDTOObject
    },
    #' Deserialize JSON string into an instance of OfferWeightDimensionsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferWeightDimensionsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferWeightDimensionsDTO
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
    #' @return OfferWeightDimensionsDTO in JSON format
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
    #' Deserialize JSON string into an instance of OfferWeightDimensionsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferWeightDimensionsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferWeightDimensionsDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`length` <- this_object$`length`
      self$`width` <- this_object$`width`
      self$`height` <- this_object$`height`
      self$`weight` <- this_object$`weight`
      self
    },
    #' Validate JSON input with respect to OfferWeightDimensionsDTO
    #'
    #' @description
    #' Validate JSON input with respect to OfferWeightDimensionsDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `length`
      if (!is.null(input_json$`length`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OfferWeightDimensionsDTO: the required field `length` is missing."))
      }
      # check the required field `width`
      if (!is.null(input_json$`width`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OfferWeightDimensionsDTO: the required field `width` is missing."))
      }
      # check the required field `height`
      if (!is.null(input_json$`height`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OfferWeightDimensionsDTO: the required field `height` is missing."))
      }
      # check the required field `weight`
      if (!is.null(input_json$`weight`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OfferWeightDimensionsDTO: the required field `weight` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OfferWeightDimensionsDTO
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
      # check if the required `length` is null
      if (is.null(self$`length`)) {
        return(FALSE)
      }

      # check if the required `width` is null
      if (is.null(self$`width`)) {
        return(FALSE)
      }

      # check if the required `height` is null
      if (is.null(self$`height`)) {
        return(FALSE)
      }

      # check if the required `weight` is null
      if (is.null(self$`weight`)) {
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
      # check if the required `length` is null
      if (is.null(self$`length`)) {
        invalid_fields["length"] <- "Non-nullable required field `length` cannot be null."
      }

      # check if the required `width` is null
      if (is.null(self$`width`)) {
        invalid_fields["width"] <- "Non-nullable required field `width` cannot be null."
      }

      # check if the required `height` is null
      if (is.null(self$`height`)) {
        invalid_fields["height"] <- "Non-nullable required field `height` cannot be null."
      }

      # check if the required `weight` is null
      if (is.null(self$`weight`)) {
        invalid_fields["weight"] <- "Non-nullable required field `weight` cannot be null."
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
# OfferWeightDimensionsDTO$unlock()
#
## Below is an example to define the print function
# OfferWeightDimensionsDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OfferWeightDimensionsDTO$lock()

