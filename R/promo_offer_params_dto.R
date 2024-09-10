#' Create a new PromoOfferParamsDTO
#'
#' @description
#' Параметры товара в акции.  Возвращается параметр, который соответствует типу акции. 
#'
#' @docType class
#' @title PromoOfferParamsDTO
#' @description PromoOfferParamsDTO Class
#' @format An \code{R6Class} generator object
#' @field discountParams  \link{PromoOfferDiscountParamsDTO} [optional]
#' @field promocodeParams  \link{PromoOfferPromocodeParamsDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PromoOfferParamsDTO <- R6::R6Class(
  "PromoOfferParamsDTO",
  public = list(
    `discountParams` = NULL,
    `promocodeParams` = NULL,
    #' Initialize a new PromoOfferParamsDTO class.
    #'
    #' @description
    #' Initialize a new PromoOfferParamsDTO class.
    #'
    #' @param discountParams discountParams
    #' @param promocodeParams promocodeParams
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`discountParams` = NULL, `promocodeParams` = NULL, ...) {
      if (!is.null(`discountParams`)) {
        stopifnot(R6::is.R6(`discountParams`))
        self$`discountParams` <- `discountParams`
      }
      if (!is.null(`promocodeParams`)) {
        stopifnot(R6::is.R6(`promocodeParams`))
        self$`promocodeParams` <- `promocodeParams`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PromoOfferParamsDTO in JSON format
    #' @export
    toJSON = function() {
      PromoOfferParamsDTOObject <- list()
      if (!is.null(self$`discountParams`)) {
        PromoOfferParamsDTOObject[["discountParams"]] <-
          self$`discountParams`$toJSON()
      }
      if (!is.null(self$`promocodeParams`)) {
        PromoOfferParamsDTOObject[["promocodeParams"]] <-
          self$`promocodeParams`$toJSON()
      }
      PromoOfferParamsDTOObject
    },
    #' Deserialize JSON string into an instance of PromoOfferParamsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of PromoOfferParamsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of PromoOfferParamsDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`discountParams`)) {
        `discountparams_object` <- PromoOfferDiscountParamsDTO$new()
        `discountparams_object`$fromJSON(jsonlite::toJSON(this_object$`discountParams`, auto_unbox = TRUE, digits = NA))
        self$`discountParams` <- `discountparams_object`
      }
      if (!is.null(this_object$`promocodeParams`)) {
        `promocodeparams_object` <- PromoOfferPromocodeParamsDTO$new()
        `promocodeparams_object`$fromJSON(jsonlite::toJSON(this_object$`promocodeParams`, auto_unbox = TRUE, digits = NA))
        self$`promocodeParams` <- `promocodeparams_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PromoOfferParamsDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`discountParams`)) {
          sprintf(
          '"discountParams":
          %s
          ',
          jsonlite::toJSON(self$`discountParams`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`promocodeParams`)) {
          sprintf(
          '"promocodeParams":
          %s
          ',
          jsonlite::toJSON(self$`promocodeParams`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of PromoOfferParamsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of PromoOfferParamsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of PromoOfferParamsDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`discountParams` <- PromoOfferDiscountParamsDTO$new()$fromJSON(jsonlite::toJSON(this_object$`discountParams`, auto_unbox = TRUE, digits = NA))
      self$`promocodeParams` <- PromoOfferPromocodeParamsDTO$new()$fromJSON(jsonlite::toJSON(this_object$`promocodeParams`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to PromoOfferParamsDTO
    #'
    #' @description
    #' Validate JSON input with respect to PromoOfferParamsDTO and throw an exception if invalid
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
    #' @return String representation of PromoOfferParamsDTO
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
# PromoOfferParamsDTO$unlock()
#
## Below is an example to define the print function
# PromoOfferParamsDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PromoOfferParamsDTO$lock()

