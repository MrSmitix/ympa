#' Create a new BriefOrderItemInstanceDTO
#'
#' @description
#' Идентификатор единицы товара.  Заполните только одно поле в зависимости от того, в какой системе маркирован товар.  Подробно о работе с маркируемыми товарами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/cz.html). 
#'
#' @docType class
#' @title BriefOrderItemInstanceDTO
#' @description BriefOrderItemInstanceDTO Class
#' @format An \code{R6Class} generator object
#' @field cis Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  {\% note warning \%}  Не экранируйте косую черту в коде символа-разделителя `\\u001d`!  ✅ `01030410947874432155Qbag!\\u001d93Zjqw`  ❌ `01030410947874432155Qbag!\\\\u001d93Zjqw`  Косые черты и кавычки в других местах экранируйте по правилам JSON: `\\\\` и `\\\"`  {\% endnote \%} character [optional]
#' @field uin Уникальный идентификационный номер ювелирного изделия.  Представляет собой число из 16 цифр. character [optional]
#' @field rnpt Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации. character [optional]
#' @field gtd Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BriefOrderItemInstanceDTO <- R6::R6Class(
  "BriefOrderItemInstanceDTO",
  public = list(
    `cis` = NULL,
    `uin` = NULL,
    `rnpt` = NULL,
    `gtd` = NULL,
    #' Initialize a new BriefOrderItemInstanceDTO class.
    #'
    #' @description
    #' Initialize a new BriefOrderItemInstanceDTO class.
    #'
    #' @param cis Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  {\% note warning \%}  Не экранируйте косую черту в коде символа-разделителя `\\u001d`!  ✅ `01030410947874432155Qbag!\\u001d93Zjqw`  ❌ `01030410947874432155Qbag!\\\\u001d93Zjqw`  Косые черты и кавычки в других местах экранируйте по правилам JSON: `\\\\` и `\\\"`  {\% endnote \%}
    #' @param uin Уникальный идентификационный номер ювелирного изделия.  Представляет собой число из 16 цифр.
    #' @param rnpt Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации.
    #' @param gtd Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`cis` = NULL, `uin` = NULL, `rnpt` = NULL, `gtd` = NULL, ...) {
      if (!is.null(`cis`)) {
        if (!(is.character(`cis`) && length(`cis`) == 1)) {
          stop(paste("Error! Invalid data for `cis`. Must be a string:", `cis`))
        }
        self$`cis` <- `cis`
      }
      if (!is.null(`uin`)) {
        if (!(is.character(`uin`) && length(`uin`) == 1)) {
          stop(paste("Error! Invalid data for `uin`. Must be a string:", `uin`))
        }
        self$`uin` <- `uin`
      }
      if (!is.null(`rnpt`)) {
        if (!(is.character(`rnpt`) && length(`rnpt`) == 1)) {
          stop(paste("Error! Invalid data for `rnpt`. Must be a string:", `rnpt`))
        }
        self$`rnpt` <- `rnpt`
      }
      if (!is.null(`gtd`)) {
        if (!(is.character(`gtd`) && length(`gtd`) == 1)) {
          stop(paste("Error! Invalid data for `gtd`. Must be a string:", `gtd`))
        }
        self$`gtd` <- `gtd`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return BriefOrderItemInstanceDTO in JSON format
    #' @export
    toJSON = function() {
      BriefOrderItemInstanceDTOObject <- list()
      if (!is.null(self$`cis`)) {
        BriefOrderItemInstanceDTOObject[["cis"]] <-
          self$`cis`
      }
      if (!is.null(self$`uin`)) {
        BriefOrderItemInstanceDTOObject[["uin"]] <-
          self$`uin`
      }
      if (!is.null(self$`rnpt`)) {
        BriefOrderItemInstanceDTOObject[["rnpt"]] <-
          self$`rnpt`
      }
      if (!is.null(self$`gtd`)) {
        BriefOrderItemInstanceDTOObject[["gtd"]] <-
          self$`gtd`
      }
      BriefOrderItemInstanceDTOObject
    },
    #' Deserialize JSON string into an instance of BriefOrderItemInstanceDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of BriefOrderItemInstanceDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of BriefOrderItemInstanceDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`cis`)) {
        self$`cis` <- this_object$`cis`
      }
      if (!is.null(this_object$`uin`)) {
        self$`uin` <- this_object$`uin`
      }
      if (!is.null(this_object$`rnpt`)) {
        self$`rnpt` <- this_object$`rnpt`
      }
      if (!is.null(this_object$`gtd`)) {
        self$`gtd` <- this_object$`gtd`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return BriefOrderItemInstanceDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`cis`)) {
          sprintf(
          '"cis":
            "%s"
                    ',
          self$`cis`
          )
        },
        if (!is.null(self$`uin`)) {
          sprintf(
          '"uin":
            "%s"
                    ',
          self$`uin`
          )
        },
        if (!is.null(self$`rnpt`)) {
          sprintf(
          '"rnpt":
            "%s"
                    ',
          self$`rnpt`
          )
        },
        if (!is.null(self$`gtd`)) {
          sprintf(
          '"gtd":
            "%s"
                    ',
          self$`gtd`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of BriefOrderItemInstanceDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of BriefOrderItemInstanceDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of BriefOrderItemInstanceDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`cis` <- this_object$`cis`
      self$`uin` <- this_object$`uin`
      self$`rnpt` <- this_object$`rnpt`
      self$`gtd` <- this_object$`gtd`
      self
    },
    #' Validate JSON input with respect to BriefOrderItemInstanceDTO
    #'
    #' @description
    #' Validate JSON input with respect to BriefOrderItemInstanceDTO and throw an exception if invalid
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
    #' @return String representation of BriefOrderItemInstanceDTO
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
# BriefOrderItemInstanceDTO$unlock()
#
## Below is an example to define the print function
# BriefOrderItemInstanceDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BriefOrderItemInstanceDTO$lock()

