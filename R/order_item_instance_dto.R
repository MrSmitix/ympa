#' Create a new OrderItemInstanceDTO
#'
#' @description
#' Переданные вами для данной позиции коды маркировки или УИНы. Коды «Честного знака» возвращаются в двух вариантах — с криптохвостом и без. 
#'
#' @docType class
#' @title OrderItemInstanceDTO
#' @description OrderItemInstanceDTO Class
#' @format An \code{R6Class} generator object
#' @field cis Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) без криптохвоста. character [optional]
#' @field cisFull Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) с криптохвостом. character [optional]
#' @field uin УИН ювелирного изделия (16-значный код) Производитель получает УИН, когда регистрирует изделие в системе контроля за оборотом драгоценных металлов и камней — ГИИС ДМДК. character [optional]
#' @field rnpt Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации. character [optional]
#' @field gtd Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderItemInstanceDTO <- R6::R6Class(
  "OrderItemInstanceDTO",
  public = list(
    `cis` = NULL,
    `cisFull` = NULL,
    `uin` = NULL,
    `rnpt` = NULL,
    `gtd` = NULL,
    #' Initialize a new OrderItemInstanceDTO class.
    #'
    #' @description
    #' Initialize a new OrderItemInstanceDTO class.
    #'
    #' @param cis Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) без криптохвоста.
    #' @param cisFull Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) с криптохвостом.
    #' @param uin УИН ювелирного изделия (16-значный код) Производитель получает УИН, когда регистрирует изделие в системе контроля за оборотом драгоценных металлов и камней — ГИИС ДМДК.
    #' @param rnpt Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации.
    #' @param gtd Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`cis` = NULL, `cisFull` = NULL, `uin` = NULL, `rnpt` = NULL, `gtd` = NULL, ...) {
      if (!is.null(`cis`)) {
        if (!(is.character(`cis`) && length(`cis`) == 1)) {
          stop(paste("Error! Invalid data for `cis`. Must be a string:", `cis`))
        }
        self$`cis` <- `cis`
      }
      if (!is.null(`cisFull`)) {
        if (!(is.character(`cisFull`) && length(`cisFull`) == 1)) {
          stop(paste("Error! Invalid data for `cisFull`. Must be a string:", `cisFull`))
        }
        self$`cisFull` <- `cisFull`
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
    #' @return OrderItemInstanceDTO in JSON format
    #' @export
    toJSON = function() {
      OrderItemInstanceDTOObject <- list()
      if (!is.null(self$`cis`)) {
        OrderItemInstanceDTOObject[["cis"]] <-
          self$`cis`
      }
      if (!is.null(self$`cisFull`)) {
        OrderItemInstanceDTOObject[["cisFull"]] <-
          self$`cisFull`
      }
      if (!is.null(self$`uin`)) {
        OrderItemInstanceDTOObject[["uin"]] <-
          self$`uin`
      }
      if (!is.null(self$`rnpt`)) {
        OrderItemInstanceDTOObject[["rnpt"]] <-
          self$`rnpt`
      }
      if (!is.null(self$`gtd`)) {
        OrderItemInstanceDTOObject[["gtd"]] <-
          self$`gtd`
      }
      OrderItemInstanceDTOObject
    },
    #' Deserialize JSON string into an instance of OrderItemInstanceDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderItemInstanceDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderItemInstanceDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`cis`)) {
        self$`cis` <- this_object$`cis`
      }
      if (!is.null(this_object$`cisFull`)) {
        self$`cisFull` <- this_object$`cisFull`
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
    #' @return OrderItemInstanceDTO in JSON format
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
        if (!is.null(self$`cisFull`)) {
          sprintf(
          '"cisFull":
            "%s"
                    ',
          self$`cisFull`
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
    #' Deserialize JSON string into an instance of OrderItemInstanceDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderItemInstanceDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderItemInstanceDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`cis` <- this_object$`cis`
      self$`cisFull` <- this_object$`cisFull`
      self$`uin` <- this_object$`uin`
      self$`rnpt` <- this_object$`rnpt`
      self$`gtd` <- this_object$`gtd`
      self
    },
    #' Validate JSON input with respect to OrderItemInstanceDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrderItemInstanceDTO and throw an exception if invalid
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
    #' @return String representation of OrderItemInstanceDTO
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
# OrderItemInstanceDTO$unlock()
#
## Below is an example to define the print function
# OrderItemInstanceDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderItemInstanceDTO$lock()

