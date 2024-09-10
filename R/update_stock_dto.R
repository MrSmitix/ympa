#' Create a new UpdateStockDTO
#'
#' @description
#' Информация об остатках одного товара на одном из складов.
#'
#' @docType class
#' @title UpdateStockDTO
#' @description UpdateStockDTO Class
#' @format An \code{R6Class} generator object
#' @field sku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) character
#' @field items Информация об остатках товара. list(\link{UpdateStockItemDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdateStockDTO <- R6::R6Class(
  "UpdateStockDTO",
  public = list(
    `sku` = NULL,
    `items` = NULL,
    #' Initialize a new UpdateStockDTO class.
    #'
    #' @description
    #' Initialize a new UpdateStockDTO class.
    #'
    #' @param sku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
    #' @param items Информация об остатках товара.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`sku`, `items`, ...) {
      if (!missing(`sku`)) {
        if (!(is.character(`sku`) && length(`sku`) == 1)) {
          stop(paste("Error! Invalid data for `sku`. Must be a string:", `sku`))
        }
        self$`sku` <- `sku`
      }
      if (!missing(`items`)) {
        stopifnot(is.vector(`items`), length(`items`) != 0)
        sapply(`items`, function(x) stopifnot(R6::is.R6(x)))
        self$`items` <- `items`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateStockDTO in JSON format
    #' @export
    toJSON = function() {
      UpdateStockDTOObject <- list()
      if (!is.null(self$`sku`)) {
        UpdateStockDTOObject[["sku"]] <-
          self$`sku`
      }
      if (!is.null(self$`items`)) {
        UpdateStockDTOObject[["items"]] <-
          lapply(self$`items`, function(x) x$toJSON())
      }
      UpdateStockDTOObject
    },
    #' Deserialize JSON string into an instance of UpdateStockDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateStockDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateStockDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`sku`)) {
        self$`sku` <- this_object$`sku`
      }
      if (!is.null(this_object$`items`)) {
        self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[UpdateStockItemDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateStockDTO in JSON format
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
        if (!is.null(self$`items`)) {
          sprintf(
          '"items":
          [%s]
',
          paste(sapply(self$`items`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of UpdateStockDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateStockDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateStockDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`sku` <- this_object$`sku`
      self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[UpdateStockItemDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to UpdateStockDTO
    #'
    #' @description
    #' Validate JSON input with respect to UpdateStockDTO and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for UpdateStockDTO: the required field `sku` is missing."))
      }
      # check the required field `items`
      if (!is.null(input_json$`items`)) {
        stopifnot(is.vector(input_json$`items`), length(input_json$`items`) != 0)
        tmp <- sapply(input_json$`items`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UpdateStockDTO: the required field `items` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UpdateStockDTO
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

      # check if the required `items` is null
      if (is.null(self$`items`)) {
        return(FALSE)
      }

      if (length(self$`items`) > 1) {
        return(FALSE)
      }
      if (length(self$`items`) < 1) {
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

      # check if the required `items` is null
      if (is.null(self$`items`)) {
        invalid_fields["items"] <- "Non-nullable required field `items` cannot be null."
      }

      if (length(self$`items`) > 1) {
        invalid_fields["items"] <- "Invalid length for `items`, number of items must be less than or equal to 1."
      }
      if (length(self$`items`) < 1) {
        invalid_fields["items"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# UpdateStockDTO$unlock()
#
## Below is an example to define the print function
# UpdateStockDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UpdateStockDTO$lock()

