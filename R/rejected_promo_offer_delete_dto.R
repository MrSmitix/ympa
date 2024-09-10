#' Create a new RejectedPromoOfferDeleteDTO
#'
#' @description
#' Информация о товаре и ошибки, которые появились при его удалении.
#'
#' @docType class
#' @title RejectedPromoOfferDeleteDTO
#' @description RejectedPromoOfferDeleteDTO Class
#' @format An \code{R6Class} generator object
#' @field offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) character
#' @field reason  \link{RejectedPromoOfferDeleteReasonType}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RejectedPromoOfferDeleteDTO <- R6::R6Class(
  "RejectedPromoOfferDeleteDTO",
  public = list(
    `offerId` = NULL,
    `reason` = NULL,
    #' Initialize a new RejectedPromoOfferDeleteDTO class.
    #'
    #' @description
    #' Initialize a new RejectedPromoOfferDeleteDTO class.
    #'
    #' @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
    #' @param reason reason
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offerId`, `reason`, ...) {
      if (!missing(`offerId`)) {
        if (!(is.character(`offerId`) && length(`offerId`) == 1)) {
          stop(paste("Error! Invalid data for `offerId`. Must be a string:", `offerId`))
        }
        self$`offerId` <- `offerId`
      }
      if (!missing(`reason`)) {
        if (!(`reason` %in% c())) {
          stop(paste("Error! \"", `reason`, "\" cannot be assigned to `reason`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`reason`))
        self$`reason` <- `reason`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return RejectedPromoOfferDeleteDTO in JSON format
    #' @export
    toJSON = function() {
      RejectedPromoOfferDeleteDTOObject <- list()
      if (!is.null(self$`offerId`)) {
        RejectedPromoOfferDeleteDTOObject[["offerId"]] <-
          self$`offerId`
      }
      if (!is.null(self$`reason`)) {
        RejectedPromoOfferDeleteDTOObject[["reason"]] <-
          self$`reason`$toJSON()
      }
      RejectedPromoOfferDeleteDTOObject
    },
    #' Deserialize JSON string into an instance of RejectedPromoOfferDeleteDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of RejectedPromoOfferDeleteDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of RejectedPromoOfferDeleteDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`offerId`)) {
        self$`offerId` <- this_object$`offerId`
      }
      if (!is.null(this_object$`reason`)) {
        `reason_object` <- RejectedPromoOfferDeleteReasonType$new()
        `reason_object`$fromJSON(jsonlite::toJSON(this_object$`reason`, auto_unbox = TRUE, digits = NA))
        self$`reason` <- `reason_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return RejectedPromoOfferDeleteDTO in JSON format
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
        if (!is.null(self$`reason`)) {
          sprintf(
          '"reason":
          %s
          ',
          jsonlite::toJSON(self$`reason`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of RejectedPromoOfferDeleteDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of RejectedPromoOfferDeleteDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of RejectedPromoOfferDeleteDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`offerId` <- this_object$`offerId`
      self$`reason` <- RejectedPromoOfferDeleteReasonType$new()$fromJSON(jsonlite::toJSON(this_object$`reason`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to RejectedPromoOfferDeleteDTO
    #'
    #' @description
    #' Validate JSON input with respect to RejectedPromoOfferDeleteDTO and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for RejectedPromoOfferDeleteDTO: the required field `offerId` is missing."))
      }
      # check the required field `reason`
      if (!is.null(input_json$`reason`)) {
        stopifnot(R6::is.R6(input_json$`reason`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RejectedPromoOfferDeleteDTO: the required field `reason` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RejectedPromoOfferDeleteDTO
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

      # check if the required `reason` is null
      if (is.null(self$`reason`)) {
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

      # check if the required `reason` is null
      if (is.null(self$`reason`)) {
        invalid_fields["reason"] <- "Non-nullable required field `reason` cannot be null."
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
# RejectedPromoOfferDeleteDTO$unlock()
#
## Below is an example to define the print function
# RejectedPromoOfferDeleteDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RejectedPromoOfferDeleteDTO$lock()

