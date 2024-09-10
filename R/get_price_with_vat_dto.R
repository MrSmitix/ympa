#' Create a new GetPriceWithVatDTO
#'
#' @description
#' Цена с указанием ставки НДС и времени последнего обновления.
#'
#' @docType class
#' @title GetPriceWithVatDTO
#' @description GetPriceWithVatDTO Class
#' @format An \code{R6Class} generator object
#' @field value Цена на товар. numeric [optional]
#' @field discountBase Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99\%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. numeric [optional]
#' @field currencyId  \link{CurrencyType} [optional]
#' @field vat Идентификатор ставки НДС, применяемой для товара:  * `2` — 10\%. * `5` — 0\%. * `6` — не облагается НДС. * `7` — 20\%.  Если параметр не указан, используется ставка НДС, установленная в кабинете. integer [optional]
#' @field updatedAt Время последнего обновления. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetPriceWithVatDTO <- R6::R6Class(
  "GetPriceWithVatDTO",
  public = list(
    `value` = NULL,
    `discountBase` = NULL,
    `currencyId` = NULL,
    `vat` = NULL,
    `updatedAt` = NULL,
    #' Initialize a new GetPriceWithVatDTO class.
    #'
    #' @description
    #' Initialize a new GetPriceWithVatDTO class.
    #'
    #' @param updatedAt Время последнего обновления.
    #' @param value Цена на товар.
    #' @param discountBase Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99\%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.
    #' @param currencyId currencyId
    #' @param vat Идентификатор ставки НДС, применяемой для товара:  * `2` — 10\%. * `5` — 0\%. * `6` — не облагается НДС. * `7` — 20\%.  Если параметр не указан, используется ставка НДС, установленная в кабинете.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`updatedAt`, `value` = NULL, `discountBase` = NULL, `currencyId` = NULL, `vat` = NULL, ...) {
      if (!missing(`updatedAt`)) {
        if (!(is.character(`updatedAt`) && length(`updatedAt`) == 1)) {
          stop(paste("Error! Invalid data for `updatedAt`. Must be a string:", `updatedAt`))
        }
        self$`updatedAt` <- `updatedAt`
      }
      if (!is.null(`value`)) {
        self$`value` <- `value`
      }
      if (!is.null(`discountBase`)) {
        self$`discountBase` <- `discountBase`
      }
      if (!is.null(`currencyId`)) {
        if (!(`currencyId` %in% c())) {
          stop(paste("Error! \"", `currencyId`, "\" cannot be assigned to `currencyId`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`currencyId`))
        self$`currencyId` <- `currencyId`
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
    #' @return GetPriceWithVatDTO in JSON format
    #' @export
    toJSON = function() {
      GetPriceWithVatDTOObject <- list()
      if (!is.null(self$`value`)) {
        GetPriceWithVatDTOObject[["value"]] <-
          self$`value`
      }
      if (!is.null(self$`discountBase`)) {
        GetPriceWithVatDTOObject[["discountBase"]] <-
          self$`discountBase`
      }
      if (!is.null(self$`currencyId`)) {
        GetPriceWithVatDTOObject[["currencyId"]] <-
          self$`currencyId`$toJSON()
      }
      if (!is.null(self$`vat`)) {
        GetPriceWithVatDTOObject[["vat"]] <-
          self$`vat`
      }
      if (!is.null(self$`updatedAt`)) {
        GetPriceWithVatDTOObject[["updatedAt"]] <-
          self$`updatedAt`
      }
      GetPriceWithVatDTOObject
    },
    #' Deserialize JSON string into an instance of GetPriceWithVatDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetPriceWithVatDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetPriceWithVatDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`value`)) {
        self$`value` <- this_object$`value`
      }
      if (!is.null(this_object$`discountBase`)) {
        self$`discountBase` <- this_object$`discountBase`
      }
      if (!is.null(this_object$`currencyId`)) {
        `currencyid_object` <- CurrencyType$new()
        `currencyid_object`$fromJSON(jsonlite::toJSON(this_object$`currencyId`, auto_unbox = TRUE, digits = NA))
        self$`currencyId` <- `currencyid_object`
      }
      if (!is.null(this_object$`vat`)) {
        self$`vat` <- this_object$`vat`
      }
      if (!is.null(this_object$`updatedAt`)) {
        self$`updatedAt` <- this_object$`updatedAt`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetPriceWithVatDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`value`)) {
          sprintf(
          '"value":
            %d
                    ',
          self$`value`
          )
        },
        if (!is.null(self$`discountBase`)) {
          sprintf(
          '"discountBase":
            %d
                    ',
          self$`discountBase`
          )
        },
        if (!is.null(self$`currencyId`)) {
          sprintf(
          '"currencyId":
          %s
          ',
          jsonlite::toJSON(self$`currencyId`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`vat`)) {
          sprintf(
          '"vat":
            %d
                    ',
          self$`vat`
          )
        },
        if (!is.null(self$`updatedAt`)) {
          sprintf(
          '"updatedAt":
            "%s"
                    ',
          self$`updatedAt`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetPriceWithVatDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetPriceWithVatDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetPriceWithVatDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`value` <- this_object$`value`
      self$`discountBase` <- this_object$`discountBase`
      self$`currencyId` <- CurrencyType$new()$fromJSON(jsonlite::toJSON(this_object$`currencyId`, auto_unbox = TRUE, digits = NA))
      self$`vat` <- this_object$`vat`
      self$`updatedAt` <- this_object$`updatedAt`
      self
    },
    #' Validate JSON input with respect to GetPriceWithVatDTO
    #'
    #' @description
    #' Validate JSON input with respect to GetPriceWithVatDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `updatedAt`
      if (!is.null(input_json$`updatedAt`)) {
        if (!(is.character(input_json$`updatedAt`) && length(input_json$`updatedAt`) == 1)) {
          stop(paste("Error! Invalid data for `updatedAt`. Must be a string:", input_json$`updatedAt`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetPriceWithVatDTO: the required field `updatedAt` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetPriceWithVatDTO
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
      # check if the required `updatedAt` is null
      if (is.null(self$`updatedAt`)) {
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
      # check if the required `updatedAt` is null
      if (is.null(self$`updatedAt`)) {
        invalid_fields["updatedAt"] <- "Non-nullable required field `updatedAt` cannot be null."
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
# GetPriceWithVatDTO$unlock()
#
## Below is an example to define the print function
# GetPriceWithVatDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetPriceWithVatDTO$lock()

