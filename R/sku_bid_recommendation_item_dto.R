#' Create a new SkuBidRecommendationItemDTO
#'
#' @description
#' Список товаров с рекомендованными ставками.
#'
#' @docType class
#' @title SkuBidRecommendationItemDTO
#' @description SkuBidRecommendationItemDTO Class
#' @format An \code{R6Class} generator object
#' @field sku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) character
#' @field bid Значение ставки. integer
#' @field bidRecommendations Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить. list(\link{BidRecommendationItemDTO}) [optional]
#' @field priceRecommendations Рекомендованные цены. list(\link{PriceRecommendationItemDTO}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SkuBidRecommendationItemDTO <- R6::R6Class(
  "SkuBidRecommendationItemDTO",
  public = list(
    `sku` = NULL,
    `bid` = NULL,
    `bidRecommendations` = NULL,
    `priceRecommendations` = NULL,
    #' Initialize a new SkuBidRecommendationItemDTO class.
    #'
    #' @description
    #' Initialize a new SkuBidRecommendationItemDTO class.
    #'
    #' @param sku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
    #' @param bid Значение ставки.
    #' @param bidRecommendations Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить.
    #' @param priceRecommendations Рекомендованные цены.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`sku`, `bid`, `bidRecommendations` = NULL, `priceRecommendations` = NULL, ...) {
      if (!missing(`sku`)) {
        if (!(is.character(`sku`) && length(`sku`) == 1)) {
          stop(paste("Error! Invalid data for `sku`. Must be a string:", `sku`))
        }
        self$`sku` <- `sku`
      }
      if (!missing(`bid`)) {
        if (!(is.numeric(`bid`) && length(`bid`) == 1)) {
          stop(paste("Error! Invalid data for `bid`. Must be an integer:", `bid`))
        }
        self$`bid` <- `bid`
      }
      if (!is.null(`bidRecommendations`)) {
        stopifnot(is.vector(`bidRecommendations`), length(`bidRecommendations`) != 0)
        sapply(`bidRecommendations`, function(x) stopifnot(R6::is.R6(x)))
        self$`bidRecommendations` <- `bidRecommendations`
      }
      if (!is.null(`priceRecommendations`)) {
        stopifnot(is.vector(`priceRecommendations`), length(`priceRecommendations`) != 0)
        sapply(`priceRecommendations`, function(x) stopifnot(R6::is.R6(x)))
        self$`priceRecommendations` <- `priceRecommendations`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SkuBidRecommendationItemDTO in JSON format
    #' @export
    toJSON = function() {
      SkuBidRecommendationItemDTOObject <- list()
      if (!is.null(self$`sku`)) {
        SkuBidRecommendationItemDTOObject[["sku"]] <-
          self$`sku`
      }
      if (!is.null(self$`bid`)) {
        SkuBidRecommendationItemDTOObject[["bid"]] <-
          self$`bid`
      }
      if (!is.null(self$`bidRecommendations`)) {
        SkuBidRecommendationItemDTOObject[["bidRecommendations"]] <-
          lapply(self$`bidRecommendations`, function(x) x$toJSON())
      }
      if (!is.null(self$`priceRecommendations`)) {
        SkuBidRecommendationItemDTOObject[["priceRecommendations"]] <-
          lapply(self$`priceRecommendations`, function(x) x$toJSON())
      }
      SkuBidRecommendationItemDTOObject
    },
    #' Deserialize JSON string into an instance of SkuBidRecommendationItemDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of SkuBidRecommendationItemDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of SkuBidRecommendationItemDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`sku`)) {
        self$`sku` <- this_object$`sku`
      }
      if (!is.null(this_object$`bid`)) {
        self$`bid` <- this_object$`bid`
      }
      if (!is.null(this_object$`bidRecommendations`)) {
        self$`bidRecommendations` <- ApiClient$new()$deserializeObj(this_object$`bidRecommendations`, "array[BidRecommendationItemDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`priceRecommendations`)) {
        self$`priceRecommendations` <- ApiClient$new()$deserializeObj(this_object$`priceRecommendations`, "array[PriceRecommendationItemDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SkuBidRecommendationItemDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`sku`)) {
          sprintf(
          '"sku":
            "%s"
                    ',
          self$`sku`
          )
        },
        if (!is.null(self$`bid`)) {
          sprintf(
          '"bid":
            %d
                    ',
          self$`bid`
          )
        },
        if (!is.null(self$`bidRecommendations`)) {
          sprintf(
          '"bidRecommendations":
          [%s]
',
          paste(sapply(self$`bidRecommendations`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`priceRecommendations`)) {
          sprintf(
          '"priceRecommendations":
          [%s]
',
          paste(sapply(self$`priceRecommendations`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of SkuBidRecommendationItemDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of SkuBidRecommendationItemDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of SkuBidRecommendationItemDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`sku` <- this_object$`sku`
      self$`bid` <- this_object$`bid`
      self$`bidRecommendations` <- ApiClient$new()$deserializeObj(this_object$`bidRecommendations`, "array[BidRecommendationItemDTO]", loadNamespace("ympa_r_client"))
      self$`priceRecommendations` <- ApiClient$new()$deserializeObj(this_object$`priceRecommendations`, "array[PriceRecommendationItemDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to SkuBidRecommendationItemDTO
    #'
    #' @description
    #' Validate JSON input with respect to SkuBidRecommendationItemDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `sku`
      if (!is.null(input_json$`sku`)) {
        if (!(is.character(input_json$`sku`) && length(input_json$`sku`) == 1)) {
          stop(paste("Error! Invalid data for `sku`. Must be a string:", input_json$`sku`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SkuBidRecommendationItemDTO: the required field `sku` is missing."))
      }
      # check the required field `bid`
      if (!is.null(input_json$`bid`)) {
        if (!(is.numeric(input_json$`bid`) && length(input_json$`bid`) == 1)) {
          stop(paste("Error! Invalid data for `bid`. Must be an integer:", input_json$`bid`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SkuBidRecommendationItemDTO: the required field `bid` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SkuBidRecommendationItemDTO
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
      # check if the required `sku` is null
      if (is.null(self$`sku`)) {
        return(FALSE)
      }

      if (nchar(self$`sku`) > 255) {
        return(FALSE)
      }
      if (nchar(self$`sku`) < 1) {
        return(FALSE)
      }
      if (!str_detect(self$`sku`, "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")) {
        return(FALSE)
      }

      # check if the required `bid` is null
      if (is.null(self$`bid`)) {
        return(FALSE)
      }

      if (self$`bid` > 9999) {
        return(FALSE)
      }
      if (self$`bid` < 0) {
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
      # check if the required `sku` is null
      if (is.null(self$`sku`)) {
        invalid_fields["sku"] <- "Non-nullable required field `sku` cannot be null."
      }

      if (nchar(self$`sku`) > 255) {
        invalid_fields["sku"] <- "Invalid length for `sku`, must be smaller than or equal to 255."
      }
      if (nchar(self$`sku`) < 1) {
        invalid_fields["sku"] <- "Invalid length for `sku`, must be bigger than or equal to 1."
      }
      if (!str_detect(self$`sku`, "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")) {
        invalid_fields["sku"] <- "Invalid value for `sku`, must conform to the pattern ^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$."
      }

      # check if the required `bid` is null
      if (is.null(self$`bid`)) {
        invalid_fields["bid"] <- "Non-nullable required field `bid` cannot be null."
      }

      if (self$`bid` > 9999) {
        invalid_fields["bid"] <- "Invalid value for `bid`, must be smaller than or equal to 9999."
      }
      if (self$`bid` < 0) {
        invalid_fields["bid"] <- "Invalid value for `bid`, must be bigger than or equal to 0."
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
# SkuBidRecommendationItemDTO$unlock()
#
## Below is an example to define the print function
# SkuBidRecommendationItemDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SkuBidRecommendationItemDTO$lock()

