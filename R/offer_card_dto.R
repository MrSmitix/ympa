#' Create a new OfferCardDTO
#'
#' @description
#' Информация о состоянии карточки товара.  Если поле `mapping` отсутствует в ответе, Маркет еще не успел обработать информацию о товаре. Чтобы определить категорию такого товара, повторите запрос через несколько минут. 
#'
#' @docType class
#' @title OfferCardDTO
#' @description OfferCardDTO Class
#' @format An \code{R6Class} generator object
#' @field offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) character
#' @field mapping  \link{GetMappingDTO} [optional]
#' @field parameterValues Список характеристик с их значениями. list(\link{ParameterValueDTO}) [optional]
#' @field cardStatus  \link{OfferCardStatusType} [optional]
#' @field contentRating Процент заполненности карточки. integer [optional]
#' @field recommendations Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку. list(\link{OfferCardRecommendationDTO}) [optional]
#' @field errors Ошибки в контенте, препятствующие размещению товара на витрине. list(\link{OfferErrorDTO}) [optional]
#' @field warnings Связанные с контентом предупреждения, не препятствующие размещению товара на витрине. list(\link{OfferErrorDTO}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OfferCardDTO <- R6::R6Class(
  "OfferCardDTO",
  public = list(
    `offerId` = NULL,
    `mapping` = NULL,
    `parameterValues` = NULL,
    `cardStatus` = NULL,
    `contentRating` = NULL,
    `recommendations` = NULL,
    `errors` = NULL,
    `warnings` = NULL,
    #' Initialize a new OfferCardDTO class.
    #'
    #' @description
    #' Initialize a new OfferCardDTO class.
    #'
    #' @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
    #' @param mapping mapping
    #' @param parameterValues Список характеристик с их значениями.
    #' @param cardStatus cardStatus
    #' @param contentRating Процент заполненности карточки.
    #' @param recommendations Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку.
    #' @param errors Ошибки в контенте, препятствующие размещению товара на витрине.
    #' @param warnings Связанные с контентом предупреждения, не препятствующие размещению товара на витрине.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offerId`, `mapping` = NULL, `parameterValues` = NULL, `cardStatus` = NULL, `contentRating` = NULL, `recommendations` = NULL, `errors` = NULL, `warnings` = NULL, ...) {
      if (!missing(`offerId`)) {
        if (!(is.character(`offerId`) && length(`offerId`) == 1)) {
          stop(paste("Error! Invalid data for `offerId`. Must be a string:", `offerId`))
        }
        self$`offerId` <- `offerId`
      }
      if (!is.null(`mapping`)) {
        stopifnot(R6::is.R6(`mapping`))
        self$`mapping` <- `mapping`
      }
      if (!is.null(`parameterValues`)) {
        stopifnot(is.vector(`parameterValues`), length(`parameterValues`) != 0)
        sapply(`parameterValues`, function(x) stopifnot(R6::is.R6(x)))
        self$`parameterValues` <- `parameterValues`
      }
      if (!is.null(`cardStatus`)) {
        if (!(`cardStatus` %in% c())) {
          stop(paste("Error! \"", `cardStatus`, "\" cannot be assigned to `cardStatus`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`cardStatus`))
        self$`cardStatus` <- `cardStatus`
      }
      if (!is.null(`contentRating`)) {
        if (!(is.numeric(`contentRating`) && length(`contentRating`) == 1)) {
          stop(paste("Error! Invalid data for `contentRating`. Must be an integer:", `contentRating`))
        }
        self$`contentRating` <- `contentRating`
      }
      if (!is.null(`recommendations`)) {
        stopifnot(is.vector(`recommendations`), length(`recommendations`) != 0)
        sapply(`recommendations`, function(x) stopifnot(R6::is.R6(x)))
        self$`recommendations` <- `recommendations`
      }
      if (!is.null(`errors`)) {
        stopifnot(is.vector(`errors`), length(`errors`) != 0)
        sapply(`errors`, function(x) stopifnot(R6::is.R6(x)))
        self$`errors` <- `errors`
      }
      if (!is.null(`warnings`)) {
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
    #' @return OfferCardDTO in JSON format
    #' @export
    toJSON = function() {
      OfferCardDTOObject <- list()
      if (!is.null(self$`offerId`)) {
        OfferCardDTOObject[["offerId"]] <-
          self$`offerId`
      }
      if (!is.null(self$`mapping`)) {
        OfferCardDTOObject[["mapping"]] <-
          self$`mapping`$toJSON()
      }
      if (!is.null(self$`parameterValues`)) {
        OfferCardDTOObject[["parameterValues"]] <-
          lapply(self$`parameterValues`, function(x) x$toJSON())
      }
      if (!is.null(self$`cardStatus`)) {
        OfferCardDTOObject[["cardStatus"]] <-
          self$`cardStatus`$toJSON()
      }
      if (!is.null(self$`contentRating`)) {
        OfferCardDTOObject[["contentRating"]] <-
          self$`contentRating`
      }
      if (!is.null(self$`recommendations`)) {
        OfferCardDTOObject[["recommendations"]] <-
          lapply(self$`recommendations`, function(x) x$toJSON())
      }
      if (!is.null(self$`errors`)) {
        OfferCardDTOObject[["errors"]] <-
          lapply(self$`errors`, function(x) x$toJSON())
      }
      if (!is.null(self$`warnings`)) {
        OfferCardDTOObject[["warnings"]] <-
          lapply(self$`warnings`, function(x) x$toJSON())
      }
      OfferCardDTOObject
    },
    #' Deserialize JSON string into an instance of OfferCardDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferCardDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferCardDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`offerId`)) {
        self$`offerId` <- this_object$`offerId`
      }
      if (!is.null(this_object$`mapping`)) {
        `mapping_object` <- GetMappingDTO$new()
        `mapping_object`$fromJSON(jsonlite::toJSON(this_object$`mapping`, auto_unbox = TRUE, digits = NA))
        self$`mapping` <- `mapping_object`
      }
      if (!is.null(this_object$`parameterValues`)) {
        self$`parameterValues` <- ApiClient$new()$deserializeObj(this_object$`parameterValues`, "array[ParameterValueDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`cardStatus`)) {
        `cardstatus_object` <- OfferCardStatusType$new()
        `cardstatus_object`$fromJSON(jsonlite::toJSON(this_object$`cardStatus`, auto_unbox = TRUE, digits = NA))
        self$`cardStatus` <- `cardstatus_object`
      }
      if (!is.null(this_object$`contentRating`)) {
        self$`contentRating` <- this_object$`contentRating`
      }
      if (!is.null(this_object$`recommendations`)) {
        self$`recommendations` <- ApiClient$new()$deserializeObj(this_object$`recommendations`, "array[OfferCardRecommendationDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`errors`)) {
        self$`errors` <- ApiClient$new()$deserializeObj(this_object$`errors`, "array[OfferErrorDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`warnings`)) {
        self$`warnings` <- ApiClient$new()$deserializeObj(this_object$`warnings`, "array[OfferErrorDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferCardDTO in JSON format
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
        if (!is.null(self$`mapping`)) {
          sprintf(
          '"mapping":
          %s
          ',
          jsonlite::toJSON(self$`mapping`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`parameterValues`)) {
          sprintf(
          '"parameterValues":
          [%s]
',
          paste(sapply(self$`parameterValues`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`cardStatus`)) {
          sprintf(
          '"cardStatus":
          %s
          ',
          jsonlite::toJSON(self$`cardStatus`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`contentRating`)) {
          sprintf(
          '"contentRating":
            %d
                    ',
          self$`contentRating`
          )
        },
        if (!is.null(self$`recommendations`)) {
          sprintf(
          '"recommendations":
          [%s]
',
          paste(sapply(self$`recommendations`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`errors`)) {
          sprintf(
          '"errors":
          [%s]
',
          paste(sapply(self$`errors`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
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
    #' Deserialize JSON string into an instance of OfferCardDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferCardDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferCardDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`offerId` <- this_object$`offerId`
      self$`mapping` <- GetMappingDTO$new()$fromJSON(jsonlite::toJSON(this_object$`mapping`, auto_unbox = TRUE, digits = NA))
      self$`parameterValues` <- ApiClient$new()$deserializeObj(this_object$`parameterValues`, "array[ParameterValueDTO]", loadNamespace("ympa_r_client"))
      self$`cardStatus` <- OfferCardStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`cardStatus`, auto_unbox = TRUE, digits = NA))
      self$`contentRating` <- this_object$`contentRating`
      self$`recommendations` <- ApiClient$new()$deserializeObj(this_object$`recommendations`, "array[OfferCardRecommendationDTO]", loadNamespace("ympa_r_client"))
      self$`errors` <- ApiClient$new()$deserializeObj(this_object$`errors`, "array[OfferErrorDTO]", loadNamespace("ympa_r_client"))
      self$`warnings` <- ApiClient$new()$deserializeObj(this_object$`warnings`, "array[OfferErrorDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to OfferCardDTO
    #'
    #' @description
    #' Validate JSON input with respect to OfferCardDTO and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for OfferCardDTO: the required field `offerId` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OfferCardDTO
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
# OfferCardDTO$unlock()
#
## Below is an example to define the print function
# OfferCardDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OfferCardDTO$lock()

