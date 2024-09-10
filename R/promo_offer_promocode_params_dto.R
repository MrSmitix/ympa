#' Create a new PromoOfferPromocodeParamsDTO
#'
#' @description
#' Параметры товара в акции с типом `MARKET_PROMOCODE`.
#'
#' @docType class
#' @title PromoOfferPromocodeParamsDTO
#' @description PromoOfferPromocodeParamsDTO Class
#' @format An \code{R6Class} generator object
#' @field maxPrice Максимально возможная цена для участия в акции до применения промокода.  Указывается в рублях.  Возвращается для всех товаров. integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PromoOfferPromocodeParamsDTO <- R6::R6Class(
  "PromoOfferPromocodeParamsDTO",
  public = list(
    `maxPrice` = NULL,
    #' Initialize a new PromoOfferPromocodeParamsDTO class.
    #'
    #' @description
    #' Initialize a new PromoOfferPromocodeParamsDTO class.
    #'
    #' @param maxPrice Максимально возможная цена для участия в акции до применения промокода.  Указывается в рублях.  Возвращается для всех товаров.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`maxPrice`, ...) {
      if (!missing(`maxPrice`)) {
        if (!(is.numeric(`maxPrice`) && length(`maxPrice`) == 1)) {
          stop(paste("Error! Invalid data for `maxPrice`. Must be an integer:", `maxPrice`))
        }
        self$`maxPrice` <- `maxPrice`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PromoOfferPromocodeParamsDTO in JSON format
    #' @export
    toJSON = function() {
      PromoOfferPromocodeParamsDTOObject <- list()
      if (!is.null(self$`maxPrice`)) {
        PromoOfferPromocodeParamsDTOObject[["maxPrice"]] <-
          self$`maxPrice`
      }
      PromoOfferPromocodeParamsDTOObject
    },
    #' Deserialize JSON string into an instance of PromoOfferPromocodeParamsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of PromoOfferPromocodeParamsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of PromoOfferPromocodeParamsDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`maxPrice`)) {
        self$`maxPrice` <- this_object$`maxPrice`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PromoOfferPromocodeParamsDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`maxPrice`)) {
          sprintf(
          '"maxPrice":
            %d
                    ',
          self$`maxPrice`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of PromoOfferPromocodeParamsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of PromoOfferPromocodeParamsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of PromoOfferPromocodeParamsDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`maxPrice` <- this_object$`maxPrice`
      self
    },
    #' Validate JSON input with respect to PromoOfferPromocodeParamsDTO
    #'
    #' @description
    #' Validate JSON input with respect to PromoOfferPromocodeParamsDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `maxPrice`
      if (!is.null(input_json$`maxPrice`)) {
        if (!(is.numeric(input_json$`maxPrice`) && length(input_json$`maxPrice`) == 1)) {
          stop(paste("Error! Invalid data for `maxPrice`. Must be an integer:", input_json$`maxPrice`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PromoOfferPromocodeParamsDTO: the required field `maxPrice` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PromoOfferPromocodeParamsDTO
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
      # check if the required `maxPrice` is null
      if (is.null(self$`maxPrice`)) {
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
      # check if the required `maxPrice` is null
      if (is.null(self$`maxPrice`)) {
        invalid_fields["maxPrice"] <- "Non-nullable required field `maxPrice` cannot be null."
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
# PromoOfferPromocodeParamsDTO$unlock()
#
## Below is an example to define the print function
# PromoOfferPromocodeParamsDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PromoOfferPromocodeParamsDTO$lock()

