#' Create a new OfferContentDTO
#'
#' @description
#' Товар с указанными характеристиками.
#'
#' @docType class
#' @title OfferContentDTO
#' @description OfferContentDTO Class
#' @format An \code{R6Class} generator object
#' @field offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) character
#' @field categoryId Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). integer
#' @field parameterValues Список характеристик с их значениями.  С `parameterValues` обязательно передавайте `marketCategoryId` — идентификатор категории на Маркете, к которой относятся указанные характеристики товара.  При **изменении** характеристик передавайте только те, значение которых нужно обновить.  Чтобы **удалить** значение заданной характеристики, передайте ее `parameterId` с пустым `value`.  Максимальное количество характеристик — 300. list(\link{ParameterValueDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OfferContentDTO <- R6::R6Class(
  "OfferContentDTO",
  public = list(
    `offerId` = NULL,
    `categoryId` = NULL,
    `parameterValues` = NULL,
    #' Initialize a new OfferContentDTO class.
    #'
    #' @description
    #' Initialize a new OfferContentDTO class.
    #'
    #' @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
    #' @param categoryId Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).
    #' @param parameterValues Список характеристик с их значениями.  С `parameterValues` обязательно передавайте `marketCategoryId` — идентификатор категории на Маркете, к которой относятся указанные характеристики товара.  При **изменении** характеристик передавайте только те, значение которых нужно обновить.  Чтобы **удалить** значение заданной характеристики, передайте ее `parameterId` с пустым `value`.  Максимальное количество характеристик — 300.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offerId`, `categoryId`, `parameterValues`, ...) {
      if (!missing(`offerId`)) {
        if (!(is.character(`offerId`) && length(`offerId`) == 1)) {
          stop(paste("Error! Invalid data for `offerId`. Must be a string:", `offerId`))
        }
        self$`offerId` <- `offerId`
      }
      if (!missing(`categoryId`)) {
        if (!(is.numeric(`categoryId`) && length(`categoryId`) == 1)) {
          stop(paste("Error! Invalid data for `categoryId`. Must be an integer:", `categoryId`))
        }
        self$`categoryId` <- `categoryId`
      }
      if (!missing(`parameterValues`)) {
        stopifnot(is.vector(`parameterValues`), length(`parameterValues`) != 0)
        sapply(`parameterValues`, function(x) stopifnot(R6::is.R6(x)))
        self$`parameterValues` <- `parameterValues`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferContentDTO in JSON format
    #' @export
    toJSON = function() {
      OfferContentDTOObject <- list()
      if (!is.null(self$`offerId`)) {
        OfferContentDTOObject[["offerId"]] <-
          self$`offerId`
      }
      if (!is.null(self$`categoryId`)) {
        OfferContentDTOObject[["categoryId"]] <-
          self$`categoryId`
      }
      if (!is.null(self$`parameterValues`)) {
        OfferContentDTOObject[["parameterValues"]] <-
          lapply(self$`parameterValues`, function(x) x$toJSON())
      }
      OfferContentDTOObject
    },
    #' Deserialize JSON string into an instance of OfferContentDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferContentDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferContentDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`offerId`)) {
        self$`offerId` <- this_object$`offerId`
      }
      if (!is.null(this_object$`categoryId`)) {
        self$`categoryId` <- this_object$`categoryId`
      }
      if (!is.null(this_object$`parameterValues`)) {
        self$`parameterValues` <- ApiClient$new()$deserializeObj(this_object$`parameterValues`, "array[ParameterValueDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferContentDTO in JSON format
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
        if (!is.null(self$`categoryId`)) {
          sprintf(
          '"categoryId":
            %d
                    ',
          self$`categoryId`
          )
        },
        if (!is.null(self$`parameterValues`)) {
          sprintf(
          '"parameterValues":
          [%s]
',
          paste(sapply(self$`parameterValues`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OfferContentDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferContentDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferContentDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`offerId` <- this_object$`offerId`
      self$`categoryId` <- this_object$`categoryId`
      self$`parameterValues` <- ApiClient$new()$deserializeObj(this_object$`parameterValues`, "array[ParameterValueDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to OfferContentDTO
    #'
    #' @description
    #' Validate JSON input with respect to OfferContentDTO and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for OfferContentDTO: the required field `offerId` is missing."))
      }
      # check the required field `categoryId`
      if (!is.null(input_json$`categoryId`)) {
        if (!(is.numeric(input_json$`categoryId`) && length(input_json$`categoryId`) == 1)) {
          stop(paste("Error! Invalid data for `categoryId`. Must be an integer:", input_json$`categoryId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OfferContentDTO: the required field `categoryId` is missing."))
      }
      # check the required field `parameterValues`
      if (!is.null(input_json$`parameterValues`)) {
        stopifnot(is.vector(input_json$`parameterValues`), length(input_json$`parameterValues`) != 0)
        tmp <- sapply(input_json$`parameterValues`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OfferContentDTO: the required field `parameterValues` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OfferContentDTO
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

      # check if the required `categoryId` is null
      if (is.null(self$`categoryId`)) {
        return(FALSE)
      }

      # check if the required `parameterValues` is null
      if (is.null(self$`parameterValues`)) {
        return(FALSE)
      }

      if (length(self$`parameterValues`) > 300) {
        return(FALSE)
      }
      if (length(self$`parameterValues`) < 1) {
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

      # check if the required `categoryId` is null
      if (is.null(self$`categoryId`)) {
        invalid_fields["categoryId"] <- "Non-nullable required field `categoryId` cannot be null."
      }

      # check if the required `parameterValues` is null
      if (is.null(self$`parameterValues`)) {
        invalid_fields["parameterValues"] <- "Non-nullable required field `parameterValues` cannot be null."
      }

      if (length(self$`parameterValues`) > 300) {
        invalid_fields["parameterValues"] <- "Invalid length for `parameterValues`, number of items must be less than or equal to 300."
      }
      if (length(self$`parameterValues`) < 1) {
        invalid_fields["parameterValues"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# OfferContentDTO$unlock()
#
## Below is an example to define the print function
# OfferContentDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OfferContentDTO$lock()

