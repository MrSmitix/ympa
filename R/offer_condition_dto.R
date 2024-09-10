#' Create a new OfferConditionDTO
#'
#' @description
#' Состояние уцененного товара. 
#'
#' @docType class
#' @title OfferConditionDTO
#' @description OfferConditionDTO Class
#' @format An \code{R6Class} generator object
#' @field type  \link{OfferConditionType} [optional]
#' @field quality  \link{OfferConditionQualityType} [optional]
#' @field reason Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OfferConditionDTO <- R6::R6Class(
  "OfferConditionDTO",
  public = list(
    `type` = NULL,
    `quality` = NULL,
    `reason` = NULL,
    #' Initialize a new OfferConditionDTO class.
    #'
    #' @description
    #' Initialize a new OfferConditionDTO class.
    #'
    #' @param type type
    #' @param quality quality
    #' @param reason Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`type` = NULL, `quality` = NULL, `reason` = NULL, ...) {
      if (!is.null(`type`)) {
        if (!(`type` %in% c())) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
      if (!is.null(`quality`)) {
        if (!(`quality` %in% c())) {
          stop(paste("Error! \"", `quality`, "\" cannot be assigned to `quality`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`quality`))
        self$`quality` <- `quality`
      }
      if (!is.null(`reason`)) {
        if (!(is.character(`reason`) && length(`reason`) == 1)) {
          stop(paste("Error! Invalid data for `reason`. Must be a string:", `reason`))
        }
        self$`reason` <- `reason`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferConditionDTO in JSON format
    #' @export
    toJSON = function() {
      OfferConditionDTOObject <- list()
      if (!is.null(self$`type`)) {
        OfferConditionDTOObject[["type"]] <-
          self$`type`$toJSON()
      }
      if (!is.null(self$`quality`)) {
        OfferConditionDTOObject[["quality"]] <-
          self$`quality`$toJSON()
      }
      if (!is.null(self$`reason`)) {
        OfferConditionDTOObject[["reason"]] <-
          self$`reason`
      }
      OfferConditionDTOObject
    },
    #' Deserialize JSON string into an instance of OfferConditionDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferConditionDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferConditionDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        `type_object` <- OfferConditionType$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
      if (!is.null(this_object$`quality`)) {
        `quality_object` <- OfferConditionQualityType$new()
        `quality_object`$fromJSON(jsonlite::toJSON(this_object$`quality`, auto_unbox = TRUE, digits = NA))
        self$`quality` <- `quality_object`
      }
      if (!is.null(this_object$`reason`)) {
        self$`reason` <- this_object$`reason`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferConditionDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
          %s
          ',
          jsonlite::toJSON(self$`type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`quality`)) {
          sprintf(
          '"quality":
          %s
          ',
          jsonlite::toJSON(self$`quality`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`reason`)) {
          sprintf(
          '"reason":
            "%s"
                    ',
          self$`reason`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OfferConditionDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferConditionDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferConditionDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`type` <- OfferConditionType$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self$`quality` <- OfferConditionQualityType$new()$fromJSON(jsonlite::toJSON(this_object$`quality`, auto_unbox = TRUE, digits = NA))
      self$`reason` <- this_object$`reason`
      self
    },
    #' Validate JSON input with respect to OfferConditionDTO
    #'
    #' @description
    #' Validate JSON input with respect to OfferConditionDTO and throw an exception if invalid
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
    #' @return String representation of OfferConditionDTO
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
# OfferConditionDTO$unlock()
#
## Below is an example to define the print function
# OfferConditionDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OfferConditionDTO$lock()

