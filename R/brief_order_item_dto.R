#' Create a new BriefOrderItemDTO
#'
#' @description
#' Информация о маркированном товаре.
#'
#' @docType class
#' @title BriefOrderItemDTO
#' @description BriefOrderItemDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. integer [optional]
#' @field vat  \link{OrderVatType} [optional]
#' @field count Количество единиц товара. integer [optional]
#' @field price Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка. numeric [optional]
#' @field offerName Название товара. character [optional]
#' @field offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) character [optional]
#' @field instances Переданные вами коды маркировки. list(\link{OrderItemInstanceDTO}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BriefOrderItemDTO <- R6::R6Class(
  "BriefOrderItemDTO",
  public = list(
    `id` = NULL,
    `vat` = NULL,
    `count` = NULL,
    `price` = NULL,
    `offerName` = NULL,
    `offerId` = NULL,
    `instances` = NULL,
    #' Initialize a new BriefOrderItemDTO class.
    #'
    #' @description
    #' Initialize a new BriefOrderItemDTO class.
    #'
    #' @param id Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа.
    #' @param vat vat
    #' @param count Количество единиц товара.
    #' @param price Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка.
    #' @param offerName Название товара.
    #' @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
    #' @param instances Переданные вами коды маркировки.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id` = NULL, `vat` = NULL, `count` = NULL, `price` = NULL, `offerName` = NULL, `offerId` = NULL, `instances` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`vat`)) {
        if (!(`vat` %in% c())) {
          stop(paste("Error! \"", `vat`, "\" cannot be assigned to `vat`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`vat`))
        self$`vat` <- `vat`
      }
      if (!is.null(`count`)) {
        if (!(is.numeric(`count`) && length(`count`) == 1)) {
          stop(paste("Error! Invalid data for `count`. Must be an integer:", `count`))
        }
        self$`count` <- `count`
      }
      if (!is.null(`price`)) {
        self$`price` <- `price`
      }
      if (!is.null(`offerName`)) {
        if (!(is.character(`offerName`) && length(`offerName`) == 1)) {
          stop(paste("Error! Invalid data for `offerName`. Must be a string:", `offerName`))
        }
        self$`offerName` <- `offerName`
      }
      if (!is.null(`offerId`)) {
        if (!(is.character(`offerId`) && length(`offerId`) == 1)) {
          stop(paste("Error! Invalid data for `offerId`. Must be a string:", `offerId`))
        }
        self$`offerId` <- `offerId`
      }
      if (!is.null(`instances`)) {
        stopifnot(is.vector(`instances`), length(`instances`) != 0)
        sapply(`instances`, function(x) stopifnot(R6::is.R6(x)))
        self$`instances` <- `instances`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return BriefOrderItemDTO in JSON format
    #' @export
    toJSON = function() {
      BriefOrderItemDTOObject <- list()
      if (!is.null(self$`id`)) {
        BriefOrderItemDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`vat`)) {
        BriefOrderItemDTOObject[["vat"]] <-
          self$`vat`$toJSON()
      }
      if (!is.null(self$`count`)) {
        BriefOrderItemDTOObject[["count"]] <-
          self$`count`
      }
      if (!is.null(self$`price`)) {
        BriefOrderItemDTOObject[["price"]] <-
          self$`price`
      }
      if (!is.null(self$`offerName`)) {
        BriefOrderItemDTOObject[["offerName"]] <-
          self$`offerName`
      }
      if (!is.null(self$`offerId`)) {
        BriefOrderItemDTOObject[["offerId"]] <-
          self$`offerId`
      }
      if (!is.null(self$`instances`)) {
        BriefOrderItemDTOObject[["instances"]] <-
          lapply(self$`instances`, function(x) x$toJSON())
      }
      BriefOrderItemDTOObject
    },
    #' Deserialize JSON string into an instance of BriefOrderItemDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of BriefOrderItemDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of BriefOrderItemDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`vat`)) {
        `vat_object` <- OrderVatType$new()
        `vat_object`$fromJSON(jsonlite::toJSON(this_object$`vat`, auto_unbox = TRUE, digits = NA))
        self$`vat` <- `vat_object`
      }
      if (!is.null(this_object$`count`)) {
        self$`count` <- this_object$`count`
      }
      if (!is.null(this_object$`price`)) {
        self$`price` <- this_object$`price`
      }
      if (!is.null(this_object$`offerName`)) {
        self$`offerName` <- this_object$`offerName`
      }
      if (!is.null(this_object$`offerId`)) {
        self$`offerId` <- this_object$`offerId`
      }
      if (!is.null(this_object$`instances`)) {
        self$`instances` <- ApiClient$new()$deserializeObj(this_object$`instances`, "array[OrderItemInstanceDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return BriefOrderItemDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            %d
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`vat`)) {
          sprintf(
          '"vat":
          %s
          ',
          jsonlite::toJSON(self$`vat`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`count`)) {
          sprintf(
          '"count":
            %d
                    ',
          self$`count`
          )
        },
        if (!is.null(self$`price`)) {
          sprintf(
          '"price":
            %d
                    ',
          self$`price`
          )
        },
        if (!is.null(self$`offerName`)) {
          sprintf(
          '"offerName":
            "%s"
                    ',
          self$`offerName`
          )
        },
        if (!is.null(self$`offerId`)) {
          sprintf(
          '"offerId":
            "%s"
                    ',
          self$`offerId`
          )
        },
        if (!is.null(self$`instances`)) {
          sprintf(
          '"instances":
          [%s]
',
          paste(sapply(self$`instances`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of BriefOrderItemDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of BriefOrderItemDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of BriefOrderItemDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`vat` <- OrderVatType$new()$fromJSON(jsonlite::toJSON(this_object$`vat`, auto_unbox = TRUE, digits = NA))
      self$`count` <- this_object$`count`
      self$`price` <- this_object$`price`
      self$`offerName` <- this_object$`offerName`
      self$`offerId` <- this_object$`offerId`
      self$`instances` <- ApiClient$new()$deserializeObj(this_object$`instances`, "array[OrderItemInstanceDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to BriefOrderItemDTO
    #'
    #' @description
    #' Validate JSON input with respect to BriefOrderItemDTO and throw an exception if invalid
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
    #' @return String representation of BriefOrderItemDTO
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
# BriefOrderItemDTO$unlock()
#
## Below is an example to define the print function
# BriefOrderItemDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BriefOrderItemDTO$lock()

