#' Create a new GetCampaignOfferDTO
#'
#' @description
#' Параметры размещения товара в магазине.
#'
#' @docType class
#' @title GetCampaignOfferDTO
#' @description GetCampaignOfferDTO Class
#' @format An \code{R6Class} generator object
#' @field offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) character
#' @field quantum  \link{QuantumDTO} [optional]
#' @field available Есть ли товар в продаже. character [optional]
#' @field basicPrice  \link{GetPriceWithDiscountDTO} [optional]
#' @field campaignPrice  \link{GetPriceWithVatDTO} [optional]
#' @field status  \link{OfferCampaignStatusType} [optional]
#' @field errors Ошибки, препятствующие размещению товара на витрине. list(\link{OfferErrorDTO}) [optional]
#' @field warnings Предупреждения, не препятствующие размещению товара на витрине. list(\link{OfferErrorDTO}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetCampaignOfferDTO <- R6::R6Class(
  "GetCampaignOfferDTO",
  public = list(
    `offerId` = NULL,
    `quantum` = NULL,
    `available` = NULL,
    `basicPrice` = NULL,
    `campaignPrice` = NULL,
    `status` = NULL,
    `errors` = NULL,
    `warnings` = NULL,
    #' Initialize a new GetCampaignOfferDTO class.
    #'
    #' @description
    #' Initialize a new GetCampaignOfferDTO class.
    #'
    #' @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
    #' @param quantum quantum
    #' @param available Есть ли товар в продаже.
    #' @param basicPrice basicPrice
    #' @param campaignPrice campaignPrice
    #' @param status status
    #' @param errors Ошибки, препятствующие размещению товара на витрине.
    #' @param warnings Предупреждения, не препятствующие размещению товара на витрине.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offerId`, `quantum` = NULL, `available` = NULL, `basicPrice` = NULL, `campaignPrice` = NULL, `status` = NULL, `errors` = NULL, `warnings` = NULL, ...) {
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
      if (!is.null(`basicPrice`)) {
        stopifnot(R6::is.R6(`basicPrice`))
        self$`basicPrice` <- `basicPrice`
      }
      if (!is.null(`campaignPrice`)) {
        stopifnot(R6::is.R6(`campaignPrice`))
        self$`campaignPrice` <- `campaignPrice`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
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
    #' @return GetCampaignOfferDTO in JSON format
    #' @export
    toJSON = function() {
      GetCampaignOfferDTOObject <- list()
      if (!is.null(self$`offerId`)) {
        GetCampaignOfferDTOObject[["offerId"]] <-
          self$`offerId`
      }
      if (!is.null(self$`quantum`)) {
        GetCampaignOfferDTOObject[["quantum"]] <-
          self$`quantum`$toJSON()
      }
      if (!is.null(self$`available`)) {
        GetCampaignOfferDTOObject[["available"]] <-
          self$`available`
      }
      if (!is.null(self$`basicPrice`)) {
        GetCampaignOfferDTOObject[["basicPrice"]] <-
          self$`basicPrice`$toJSON()
      }
      if (!is.null(self$`campaignPrice`)) {
        GetCampaignOfferDTOObject[["campaignPrice"]] <-
          self$`campaignPrice`$toJSON()
      }
      if (!is.null(self$`status`)) {
        GetCampaignOfferDTOObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`errors`)) {
        GetCampaignOfferDTOObject[["errors"]] <-
          lapply(self$`errors`, function(x) x$toJSON())
      }
      if (!is.null(self$`warnings`)) {
        GetCampaignOfferDTOObject[["warnings"]] <-
          lapply(self$`warnings`, function(x) x$toJSON())
      }
      GetCampaignOfferDTOObject
    },
    #' Deserialize JSON string into an instance of GetCampaignOfferDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetCampaignOfferDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetCampaignOfferDTO
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
      if (!is.null(this_object$`basicPrice`)) {
        `basicprice_object` <- GetPriceWithDiscountDTO$new()
        `basicprice_object`$fromJSON(jsonlite::toJSON(this_object$`basicPrice`, auto_unbox = TRUE, digits = NA))
        self$`basicPrice` <- `basicprice_object`
      }
      if (!is.null(this_object$`campaignPrice`)) {
        `campaignprice_object` <- GetPriceWithVatDTO$new()
        `campaignprice_object`$fromJSON(jsonlite::toJSON(this_object$`campaignPrice`, auto_unbox = TRUE, digits = NA))
        self$`campaignPrice` <- `campaignprice_object`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- OfferCampaignStatusType$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
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
    #' @return GetCampaignOfferDTO in JSON format
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
        if (!is.null(self$`basicPrice`)) {
          sprintf(
          '"basicPrice":
          %s
          ',
          jsonlite::toJSON(self$`basicPrice`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`campaignPrice`)) {
          sprintf(
          '"campaignPrice":
          %s
          ',
          jsonlite::toJSON(self$`campaignPrice`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
          %s
          ',
          jsonlite::toJSON(self$`status`$toJSON(), auto_unbox = TRUE, digits = NA)
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
    #' Deserialize JSON string into an instance of GetCampaignOfferDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetCampaignOfferDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetCampaignOfferDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`offerId` <- this_object$`offerId`
      self$`quantum` <- QuantumDTO$new()$fromJSON(jsonlite::toJSON(this_object$`quantum`, auto_unbox = TRUE, digits = NA))
      self$`available` <- this_object$`available`
      self$`basicPrice` <- GetPriceWithDiscountDTO$new()$fromJSON(jsonlite::toJSON(this_object$`basicPrice`, auto_unbox = TRUE, digits = NA))
      self$`campaignPrice` <- GetPriceWithVatDTO$new()$fromJSON(jsonlite::toJSON(this_object$`campaignPrice`, auto_unbox = TRUE, digits = NA))
      self$`status` <- OfferCampaignStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`errors` <- ApiClient$new()$deserializeObj(this_object$`errors`, "array[OfferErrorDTO]", loadNamespace("ympa_r_client"))
      self$`warnings` <- ApiClient$new()$deserializeObj(this_object$`warnings`, "array[OfferErrorDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to GetCampaignOfferDTO
    #'
    #' @description
    #' Validate JSON input with respect to GetCampaignOfferDTO and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for GetCampaignOfferDTO: the required field `offerId` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetCampaignOfferDTO
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
# GetCampaignOfferDTO$unlock()
#
## Below is an example to define the print function
# GetCampaignOfferDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetCampaignOfferDTO$lock()

