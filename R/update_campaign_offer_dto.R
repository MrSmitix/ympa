#' Create a new UpdateCampaignOfferDTO
#'
#' @description
#' Параметры размещения товара в магазине.
#'
#' @docType class
#' @title UpdateCampaignOfferDTO
#' @description UpdateCampaignOfferDTO Class
#' @format An \code{R6Class} generator object
#' @field offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) character
#' @field quantum  \link{QuantumDTO} [optional]
#' @field available Есть ли товар в продаже. character [optional]
#' @field vat Ставка НДС, применяемая для товара. Задается цифрой:  * `2` — 10\%. * `5` — 0\%. * `6` — не облагается НДС. * `7` — 20\%.  Если параметр не указан, используется ставка НДС, установленная в кабинете продавца на Маркете. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdateCampaignOfferDTO <- R6::R6Class(
  "UpdateCampaignOfferDTO",
  public = list(
    `offerId` = NULL,
    `quantum` = NULL,
    `available` = NULL,
    `vat` = NULL,
    #' Initialize a new UpdateCampaignOfferDTO class.
    #'
    #' @description
    #' Initialize a new UpdateCampaignOfferDTO class.
    #'
    #' @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
    #' @param quantum quantum
    #' @param available Есть ли товар в продаже.
    #' @param vat Ставка НДС, применяемая для товара. Задается цифрой:  * `2` — 10\%. * `5` — 0\%. * `6` — не облагается НДС. * `7` — 20\%.  Если параметр не указан, используется ставка НДС, установленная в кабинете продавца на Маркете.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offerId`, `quantum` = NULL, `available` = NULL, `vat` = NULL, ...) {
      if (!missing(`offerId`)) {
        if (!(is.character(`offerId`) && length(`offerId`) == 1)) {
          stop(paste("Error! Invalid data for `offerId`. Must be a string:", `offerId`))
        }
        self$`offerId` <- `offerId`
      }
      if (!is.null(`quantum`)) {
        stopifnot(R6::is.R6(`quantum`))
        self$`quantum` <- `quantum`
      }
      if (!is.null(`available`)) {
        if (!(is.logical(`available`) && length(`available`) == 1)) {
          stop(paste("Error! Invalid data for `available`. Must be a boolean:", `available`))
        }
        self$`available` <- `available`
      }
      if (!is.null(`vat`)) {
        if (!(is.numeric(`vat`) && length(`vat`) == 1)) {
          stop(paste("Error! Invalid data for `vat`. Must be an integer:", `vat`))
        }
        self$`vat` <- `vat`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateCampaignOfferDTO in JSON format
    #' @export
    toJSON = function() {
      UpdateCampaignOfferDTOObject <- list()
      if (!is.null(self$`offerId`)) {
        UpdateCampaignOfferDTOObject[["offerId"]] <-
          self$`offerId`
      }
      if (!is.null(self$`quantum`)) {
        UpdateCampaignOfferDTOObject[["quantum"]] <-
          self$`quantum`$toJSON()
      }
      if (!is.null(self$`available`)) {
        UpdateCampaignOfferDTOObject[["available"]] <-
          self$`available`
      }
      if (!is.null(self$`vat`)) {
        UpdateCampaignOfferDTOObject[["vat"]] <-
          self$`vat`
      }
      UpdateCampaignOfferDTOObject
    },
    #' Deserialize JSON string into an instance of UpdateCampaignOfferDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateCampaignOfferDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateCampaignOfferDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`offerId`)) {
        self$`offerId` <- this_object$`offerId`
      }
      if (!is.null(this_object$`quantum`)) {
        `quantum_object` <- QuantumDTO$new()
        `quantum_object`$fromJSON(jsonlite::toJSON(this_object$`quantum`, auto_unbox = TRUE, digits = NA))
        self$`quantum` <- `quantum_object`
      }
      if (!is.null(this_object$`available`)) {
        self$`available` <- this_object$`available`
      }
      if (!is.null(this_object$`vat`)) {
        self$`vat` <- this_object$`vat`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateCampaignOfferDTO in JSON format
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
        if (!is.null(self$`quantum`)) {
          sprintf(
          '"quantum":
          %s
          ',
          jsonlite::toJSON(self$`quantum`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`available`)) {
          sprintf(
          '"available":
            %s
                    ',
          tolower(self$`available`)
          )
        },
        if (!is.null(self$`vat`)) {
          sprintf(
          '"vat":
            %d
                    ',
          self$`vat`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of UpdateCampaignOfferDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateCampaignOfferDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateCampaignOfferDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`offerId` <- this_object$`offerId`
      self$`quantum` <- QuantumDTO$new()$fromJSON(jsonlite::toJSON(this_object$`quantum`, auto_unbox = TRUE, digits = NA))
      self$`available` <- this_object$`available`
      self$`vat` <- this_object$`vat`
      self
    },
    #' Validate JSON input with respect to UpdateCampaignOfferDTO
    #'
    #' @description
    #' Validate JSON input with respect to UpdateCampaignOfferDTO and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for UpdateCampaignOfferDTO: the required field `offerId` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UpdateCampaignOfferDTO
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
# UpdateCampaignOfferDTO$unlock()
#
## Below is an example to define the print function
# UpdateCampaignOfferDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UpdateCampaignOfferDTO$lock()

