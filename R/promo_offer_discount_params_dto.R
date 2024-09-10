#' Create a new PromoOfferDiscountParamsDTO
#'
#' @description
#' Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.
#'
#' @docType class
#' @title PromoOfferDiscountParamsDTO
#' @description PromoOfferDiscountParamsDTO Class
#' @format An \code{R6Class} generator object
#' @field price Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции. integer [optional]
#' @field promoPrice Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции. integer [optional]
#' @field maxPromoPrice Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров. integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PromoOfferDiscountParamsDTO <- R6::R6Class(
  "PromoOfferDiscountParamsDTO",
  public = list(
    `price` = NULL,
    `promoPrice` = NULL,
    `maxPromoPrice` = NULL,
    #' Initialize a new PromoOfferDiscountParamsDTO class.
    #'
    #' @description
    #' Initialize a new PromoOfferDiscountParamsDTO class.
    #'
    #' @param maxPromoPrice Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров.
    #' @param price Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции.
    #' @param promoPrice Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`maxPromoPrice`, `price` = NULL, `promoPrice` = NULL, ...) {
      if (!missing(`maxPromoPrice`)) {
        if (!(is.numeric(`maxPromoPrice`) && length(`maxPromoPrice`) == 1)) {
          stop(paste("Error! Invalid data for `maxPromoPrice`. Must be an integer:", `maxPromoPrice`))
        }
        self$`maxPromoPrice` <- `maxPromoPrice`
      }
      if (!is.null(`price`)) {
        if (!(is.numeric(`price`) && length(`price`) == 1)) {
          stop(paste("Error! Invalid data for `price`. Must be an integer:", `price`))
        }
        self$`price` <- `price`
      }
      if (!is.null(`promoPrice`)) {
        if (!(is.numeric(`promoPrice`) && length(`promoPrice`) == 1)) {
          stop(paste("Error! Invalid data for `promoPrice`. Must be an integer:", `promoPrice`))
        }
        self$`promoPrice` <- `promoPrice`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PromoOfferDiscountParamsDTO in JSON format
    #' @export
    toJSON = function() {
      PromoOfferDiscountParamsDTOObject <- list()
      if (!is.null(self$`price`)) {
        PromoOfferDiscountParamsDTOObject[["price"]] <-
          self$`price`
      }
      if (!is.null(self$`promoPrice`)) {
        PromoOfferDiscountParamsDTOObject[["promoPrice"]] <-
          self$`promoPrice`
      }
      if (!is.null(self$`maxPromoPrice`)) {
        PromoOfferDiscountParamsDTOObject[["maxPromoPrice"]] <-
          self$`maxPromoPrice`
      }
      PromoOfferDiscountParamsDTOObject
    },
    #' Deserialize JSON string into an instance of PromoOfferDiscountParamsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of PromoOfferDiscountParamsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of PromoOfferDiscountParamsDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`price`)) {
        self$`price` <- this_object$`price`
      }
      if (!is.null(this_object$`promoPrice`)) {
        self$`promoPrice` <- this_object$`promoPrice`
      }
      if (!is.null(this_object$`maxPromoPrice`)) {
        self$`maxPromoPrice` <- this_object$`maxPromoPrice`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PromoOfferDiscountParamsDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`price`)) {
          sprintf(
          '"price":
            %d
                    ',
          self$`price`
          )
        },
        if (!is.null(self$`promoPrice`)) {
          sprintf(
          '"promoPrice":
            %d
                    ',
          self$`promoPrice`
          )
        },
        if (!is.null(self$`maxPromoPrice`)) {
          sprintf(
          '"maxPromoPrice":
            %d
                    ',
          self$`maxPromoPrice`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of PromoOfferDiscountParamsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of PromoOfferDiscountParamsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of PromoOfferDiscountParamsDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`price` <- this_object$`price`
      self$`promoPrice` <- this_object$`promoPrice`
      self$`maxPromoPrice` <- this_object$`maxPromoPrice`
      self
    },
    #' Validate JSON input with respect to PromoOfferDiscountParamsDTO
    #'
    #' @description
    #' Validate JSON input with respect to PromoOfferDiscountParamsDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `maxPromoPrice`
      if (!is.null(input_json$`maxPromoPrice`)) {
        if (!(is.numeric(input_json$`maxPromoPrice`) && length(input_json$`maxPromoPrice`) == 1)) {
          stop(paste("Error! Invalid data for `maxPromoPrice`. Must be an integer:", input_json$`maxPromoPrice`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PromoOfferDiscountParamsDTO: the required field `maxPromoPrice` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PromoOfferDiscountParamsDTO
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
      # check if the required `maxPromoPrice` is null
      if (is.null(self$`maxPromoPrice`)) {
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
      # check if the required `maxPromoPrice` is null
      if (is.null(self$`maxPromoPrice`)) {
        invalid_fields["maxPromoPrice"] <- "Non-nullable required field `maxPromoPrice` cannot be null."
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
# PromoOfferDiscountParamsDTO$unlock()
#
## Below is an example to define the print function
# PromoOfferDiscountParamsDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PromoOfferDiscountParamsDTO$lock()

