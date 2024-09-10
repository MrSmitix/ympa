#' Create a new SkuBidItemDTO
#'
#' @description
#' Список товаров и ставок на них.
#'
#' @docType class
#' @title SkuBidItemDTO
#' @description SkuBidItemDTO Class
#' @format An \code{R6Class} generator object
#' @field sku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) character
#' @field bid Значение ставки. integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SkuBidItemDTO <- R6::R6Class(
  "SkuBidItemDTO",
  public = list(
    `sku` = NULL,
    `bid` = NULL,
    #' Initialize a new SkuBidItemDTO class.
    #'
    #' @description
    #' Initialize a new SkuBidItemDTO class.
    #'
    #' @param sku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
    #' @param bid Значение ставки.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`sku`, `bid`, ...) {
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
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SkuBidItemDTO in JSON format
    #' @export
    toJSON = function() {
      SkuBidItemDTOObject <- list()
      if (!is.null(self$`sku`)) {
        SkuBidItemDTOObject[["sku"]] <-
          self$`sku`
      }
      if (!is.null(self$`bid`)) {
        SkuBidItemDTOObject[["bid"]] <-
          self$`bid`
      }
      SkuBidItemDTOObject
    },
    #' Deserialize JSON string into an instance of SkuBidItemDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of SkuBidItemDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of SkuBidItemDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`sku`)) {
        self$`sku` <- this_object$`sku`
      }
      if (!is.null(this_object$`bid`)) {
        self$`bid` <- this_object$`bid`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SkuBidItemDTO in JSON format
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
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of SkuBidItemDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of SkuBidItemDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of SkuBidItemDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`sku` <- this_object$`sku`
      self$`bid` <- this_object$`bid`
      self
    },
    #' Validate JSON input with respect to SkuBidItemDTO
    #'
    #' @description
    #' Validate JSON input with respect to SkuBidItemDTO and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for SkuBidItemDTO: the required field `sku` is missing."))
      }
      # check the required field `bid`
      if (!is.null(input_json$`bid`)) {
        if (!(is.numeric(input_json$`bid`) && length(input_json$`bid`) == 1)) {
          stop(paste("Error! Invalid data for `bid`. Must be an integer:", input_json$`bid`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SkuBidItemDTO: the required field `bid` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SkuBidItemDTO
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
# SkuBidItemDTO$unlock()
#
## Below is an example to define the print function
# SkuBidItemDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SkuBidItemDTO$lock()

