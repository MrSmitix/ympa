#' Create a new OfferForRecommendationDTO
#'
#' @description
#' Информация о состоянии цены на товар.
#'
#' @docType class
#' @title OfferForRecommendationDTO
#' @description OfferForRecommendationDTO Class
#' @format An \code{R6Class} generator object
#' @field offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) character [optional]
#' @field price  \link{BasePriceDTO} [optional]
#' @field cofinancePrice  \link{GetPriceDTO} [optional]
#' @field competitiveness  \link{PriceCompetitivenessType} [optional]
#' @field shows Количество показов карточки товара за последние 7 дней. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OfferForRecommendationDTO <- R6::R6Class(
  "OfferForRecommendationDTO",
  public = list(
    `offerId` = NULL,
    `price` = NULL,
    `cofinancePrice` = NULL,
    `competitiveness` = NULL,
    `shows` = NULL,
    #' Initialize a new OfferForRecommendationDTO class.
    #'
    #' @description
    #' Initialize a new OfferForRecommendationDTO class.
    #'
    #' @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
    #' @param price price
    #' @param cofinancePrice cofinancePrice
    #' @param competitiveness competitiveness
    #' @param shows Количество показов карточки товара за последние 7 дней.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offerId` = NULL, `price` = NULL, `cofinancePrice` = NULL, `competitiveness` = NULL, `shows` = NULL, ...) {
      if (!is.null(`offerId`)) {
        if (!(is.character(`offerId`) && length(`offerId`) == 1)) {
          stop(paste("Error! Invalid data for `offerId`. Must be a string:", `offerId`))
        }
        self$`offerId` <- `offerId`
      }
      if (!is.null(`price`)) {
        stopifnot(R6::is.R6(`price`))
        self$`price` <- `price`
      }
      if (!is.null(`cofinancePrice`)) {
        stopifnot(R6::is.R6(`cofinancePrice`))
        self$`cofinancePrice` <- `cofinancePrice`
      }
      if (!is.null(`competitiveness`)) {
        if (!(`competitiveness` %in% c())) {
          stop(paste("Error! \"", `competitiveness`, "\" cannot be assigned to `competitiveness`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`competitiveness`))
        self$`competitiveness` <- `competitiveness`
      }
      if (!is.null(`shows`)) {
        if (!(is.numeric(`shows`) && length(`shows`) == 1)) {
          stop(paste("Error! Invalid data for `shows`. Must be an integer:", `shows`))
        }
        self$`shows` <- `shows`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferForRecommendationDTO in JSON format
    #' @export
    toJSON = function() {
      OfferForRecommendationDTOObject <- list()
      if (!is.null(self$`offerId`)) {
        OfferForRecommendationDTOObject[["offerId"]] <-
          self$`offerId`
      }
      if (!is.null(self$`price`)) {
        OfferForRecommendationDTOObject[["price"]] <-
          self$`price`$toJSON()
      }
      if (!is.null(self$`cofinancePrice`)) {
        OfferForRecommendationDTOObject[["cofinancePrice"]] <-
          self$`cofinancePrice`$toJSON()
      }
      if (!is.null(self$`competitiveness`)) {
        OfferForRecommendationDTOObject[["competitiveness"]] <-
          self$`competitiveness`$toJSON()
      }
      if (!is.null(self$`shows`)) {
        OfferForRecommendationDTOObject[["shows"]] <-
          self$`shows`
      }
      OfferForRecommendationDTOObject
    },
    #' Deserialize JSON string into an instance of OfferForRecommendationDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferForRecommendationDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferForRecommendationDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`offerId`)) {
        self$`offerId` <- this_object$`offerId`
      }
      if (!is.null(this_object$`price`)) {
        `price_object` <- BasePriceDTO$new()
        `price_object`$fromJSON(jsonlite::toJSON(this_object$`price`, auto_unbox = TRUE, digits = NA))
        self$`price` <- `price_object`
      }
      if (!is.null(this_object$`cofinancePrice`)) {
        `cofinanceprice_object` <- GetPriceDTO$new()
        `cofinanceprice_object`$fromJSON(jsonlite::toJSON(this_object$`cofinancePrice`, auto_unbox = TRUE, digits = NA))
        self$`cofinancePrice` <- `cofinanceprice_object`
      }
      if (!is.null(this_object$`competitiveness`)) {
        `competitiveness_object` <- PriceCompetitivenessType$new()
        `competitiveness_object`$fromJSON(jsonlite::toJSON(this_object$`competitiveness`, auto_unbox = TRUE, digits = NA))
        self$`competitiveness` <- `competitiveness_object`
      }
      if (!is.null(this_object$`shows`)) {
        self$`shows` <- this_object$`shows`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferForRecommendationDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`offerId`)) {
          sprintf(
          '"offerId":
            "%s"
                    ',
          self$`offerId`
          )
        },
        if (!is.null(self$`price`)) {
          sprintf(
          '"price":
          %s
          ',
          jsonlite::toJSON(self$`price`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`cofinancePrice`)) {
          sprintf(
          '"cofinancePrice":
          %s
          ',
          jsonlite::toJSON(self$`cofinancePrice`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`competitiveness`)) {
          sprintf(
          '"competitiveness":
          %s
          ',
          jsonlite::toJSON(self$`competitiveness`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`shows`)) {
          sprintf(
          '"shows":
            %d
                    ',
          self$`shows`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OfferForRecommendationDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferForRecommendationDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferForRecommendationDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`offerId` <- this_object$`offerId`
      self$`price` <- BasePriceDTO$new()$fromJSON(jsonlite::toJSON(this_object$`price`, auto_unbox = TRUE, digits = NA))
      self$`cofinancePrice` <- GetPriceDTO$new()$fromJSON(jsonlite::toJSON(this_object$`cofinancePrice`, auto_unbox = TRUE, digits = NA))
      self$`competitiveness` <- PriceCompetitivenessType$new()$fromJSON(jsonlite::toJSON(this_object$`competitiveness`, auto_unbox = TRUE, digits = NA))
      self$`shows` <- this_object$`shows`
      self
    },
    #' Validate JSON input with respect to OfferForRecommendationDTO
    #'
    #' @description
    #' Validate JSON input with respect to OfferForRecommendationDTO and throw an exception if invalid
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
    #' @return String representation of OfferForRecommendationDTO
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
      if (nchar(self$`offerId`) > 255) {
        return(FALSE)
      }
      if (nchar(self$`offerId`) < 1) {
        return(FALSE)
      }
      if (!str_detect(self$`offerId`, "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")) {
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
      if (nchar(self$`offerId`) > 255) {
        invalid_fields["offerId"] <- "Invalid length for `offerId`, must be smaller than or equal to 255."
      }
      if (nchar(self$`offerId`) < 1) {
        invalid_fields["offerId"] <- "Invalid length for `offerId`, must be bigger than or equal to 1."
      }
      if (!str_detect(self$`offerId`, "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")) {
        invalid_fields["offerId"] <- "Invalid value for `offerId`, must conform to the pattern ^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$."
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
# OfferForRecommendationDTO$unlock()
#
## Below is an example to define the print function
# OfferForRecommendationDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OfferForRecommendationDTO$lock()

