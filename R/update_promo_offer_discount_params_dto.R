#' Create a new UpdatePromoOfferDiscountParamsDTO
#'
#' @description
#' Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.  Обязательный параметр для акций с этими типами. 
#'
#' @docType class
#' @title UpdatePromoOfferDiscountParamsDTO
#' @description UpdatePromoOfferDiscountParamsDTO Class
#' @format An \code{R6Class} generator object
#' @field price Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Число должно быть целым. integer [optional]
#' @field promoPrice Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Число должно быть целым. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdatePromoOfferDiscountParamsDTO <- R6::R6Class(
  "UpdatePromoOfferDiscountParamsDTO",
  public = list(
    `price` = NULL,
    `promoPrice` = NULL,
    #' Initialize a new UpdatePromoOfferDiscountParamsDTO class.
    #'
    #' @description
    #' Initialize a new UpdatePromoOfferDiscountParamsDTO class.
    #'
    #' @param price Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Число должно быть целым.
    #' @param promoPrice Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Число должно быть целым.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`price` = NULL, `promoPrice` = NULL, ...) {
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
    #' @return UpdatePromoOfferDiscountParamsDTO in JSON format
    #' @export
    toJSON = function() {
      UpdatePromoOfferDiscountParamsDTOObject <- list()
      if (!is.null(self$`price`)) {
        UpdatePromoOfferDiscountParamsDTOObject[["price"]] <-
          self$`price`
      }
      if (!is.null(self$`promoPrice`)) {
        UpdatePromoOfferDiscountParamsDTOObject[["promoPrice"]] <-
          self$`promoPrice`
      }
      UpdatePromoOfferDiscountParamsDTOObject
    },
    #' Deserialize JSON string into an instance of UpdatePromoOfferDiscountParamsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdatePromoOfferDiscountParamsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdatePromoOfferDiscountParamsDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`price`)) {
        self$`price` <- this_object$`price`
      }
      if (!is.null(this_object$`promoPrice`)) {
        self$`promoPrice` <- this_object$`promoPrice`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdatePromoOfferDiscountParamsDTO in JSON format
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
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of UpdatePromoOfferDiscountParamsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdatePromoOfferDiscountParamsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdatePromoOfferDiscountParamsDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`price` <- this_object$`price`
      self$`promoPrice` <- this_object$`promoPrice`
      self
    },
    #' Validate JSON input with respect to UpdatePromoOfferDiscountParamsDTO
    #'
    #' @description
    #' Validate JSON input with respect to UpdatePromoOfferDiscountParamsDTO and throw an exception if invalid
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
    #' @return String representation of UpdatePromoOfferDiscountParamsDTO
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
      if (self$`price` < 1) {
        return(FALSE)
      }

      if (self$`promoPrice` < 1) {
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
      if (self$`price` < 1) {
        invalid_fields["price"] <- "Invalid value for `price`, must be bigger than or equal to 1."
      }

      if (self$`promoPrice` < 1) {
        invalid_fields["promoPrice"] <- "Invalid value for `promoPrice`, must be bigger than or equal to 1."
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
# UpdatePromoOfferDiscountParamsDTO$unlock()
#
## Below is an example to define the print function
# UpdatePromoOfferDiscountParamsDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UpdatePromoOfferDiscountParamsDTO$lock()

