#' Create a new WarningPromoOfferUpdateDTO
#'
#' @description
#' Описание предупреждения, которое появилось при добавлении товара.
#'
#' @docType class
#' @title WarningPromoOfferUpdateDTO
#' @description WarningPromoOfferUpdateDTO Class
#' @format An \code{R6Class} generator object
#' @field offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) character
#' @field warnings Предупреждения, которые появились при добавлении товара в акцию или изменении его цен. list(\link{PromoOfferUpdateWarningDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
WarningPromoOfferUpdateDTO <- R6::R6Class(
  "WarningPromoOfferUpdateDTO",
  public = list(
    `offerId` = NULL,
    `warnings` = NULL,
    #' Initialize a new WarningPromoOfferUpdateDTO class.
    #'
    #' @description
    #' Initialize a new WarningPromoOfferUpdateDTO class.
    #'
    #' @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
    #' @param warnings Предупреждения, которые появились при добавлении товара в акцию или изменении его цен.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offerId`, `warnings`, ...) {
      if (!missing(`offerId`)) {
        if (!(is.character(`offerId`) && length(`offerId`) == 1)) {
          stop(paste("Error! Invalid data for `offerId`. Must be a string:", `offerId`))
        }
        self$`offerId` <- `offerId`
      }
      if (!missing(`warnings`)) {
        stopifnot(is.vector(`warnings`), length(`warnings`) != 0)
        sapply(`warnings`, function(x) stopifnot(R6::is.R6(x)))
        self$`warnings` <- `warnings`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return WarningPromoOfferUpdateDTO in JSON format
    #' @export
    toJSON = function() {
      WarningPromoOfferUpdateDTOObject <- list()
      if (!is.null(self$`offerId`)) {
        WarningPromoOfferUpdateDTOObject[["offerId"]] <-
          self$`offerId`
      }
      if (!is.null(self$`warnings`)) {
        WarningPromoOfferUpdateDTOObject[["warnings"]] <-
          lapply(self$`warnings`, function(x) x$toJSON())
      }
      WarningPromoOfferUpdateDTOObject
    },
    #' Deserialize JSON string into an instance of WarningPromoOfferUpdateDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of WarningPromoOfferUpdateDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of WarningPromoOfferUpdateDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`offerId`)) {
        self$`offerId` <- this_object$`offerId`
      }
      if (!is.null(this_object$`warnings`)) {
        self$`warnings` <- ApiClient$new()$deserializeObj(this_object$`warnings`, "array[PromoOfferUpdateWarningDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return WarningPromoOfferUpdateDTO in JSON format
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
        if (!is.null(self$`warnings`)) {
          sprintf(
          '"warnings":
          [%s]
',
          paste(sapply(self$`warnings`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of WarningPromoOfferUpdateDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of WarningPromoOfferUpdateDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of WarningPromoOfferUpdateDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`offerId` <- this_object$`offerId`
      self$`warnings` <- ApiClient$new()$deserializeObj(this_object$`warnings`, "array[PromoOfferUpdateWarningDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to WarningPromoOfferUpdateDTO
    #'
    #' @description
    #' Validate JSON input with respect to WarningPromoOfferUpdateDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `offerId`
      if (!is.null(input_json$`offerId`)) {
        if (!(is.character(input_json$`offerId`) && length(input_json$`offerId`) == 1)) {
          stop(paste("Error! Invalid data for `offerId`. Must be a string:", input_json$`offerId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for WarningPromoOfferUpdateDTO: the required field `offerId` is missing."))
      }
      # check the required field `warnings`
      if (!is.null(input_json$`warnings`)) {
        stopifnot(is.vector(input_json$`warnings`), length(input_json$`warnings`) != 0)
        tmp <- sapply(input_json$`warnings`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for WarningPromoOfferUpdateDTO: the required field `warnings` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of WarningPromoOfferUpdateDTO
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
      # check if the required `offerId` is null
      if (is.null(self$`offerId`)) {
        return(FALSE)
      }

      if (nchar(self$`offerId`) > 255) {
        return(FALSE)
      }
      if (nchar(self$`offerId`) < 1) {
        return(FALSE)
      }
      if (!str_detect(self$`offerId`, "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")) {
        return(FALSE)
      }

      # check if the required `warnings` is null
      if (is.null(self$`warnings`)) {
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
      # check if the required `offerId` is null
      if (is.null(self$`offerId`)) {
        invalid_fields["offerId"] <- "Non-nullable required field `offerId` cannot be null."
      }

      if (nchar(self$`offerId`) > 255) {
        invalid_fields["offerId"] <- "Invalid length for `offerId`, must be smaller than or equal to 255."
      }
      if (nchar(self$`offerId`) < 1) {
        invalid_fields["offerId"] <- "Invalid length for `offerId`, must be bigger than or equal to 1."
      }
      if (!str_detect(self$`offerId`, "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")) {
        invalid_fields["offerId"] <- "Invalid value for `offerId`, must conform to the pattern ^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$."
      }

      # check if the required `warnings` is null
      if (is.null(self$`warnings`)) {
        invalid_fields["warnings"] <- "Non-nullable required field `warnings` cannot be null."
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
# WarningPromoOfferUpdateDTO$unlock()
#
## Below is an example to define the print function
# WarningPromoOfferUpdateDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# WarningPromoOfferUpdateDTO$lock()

