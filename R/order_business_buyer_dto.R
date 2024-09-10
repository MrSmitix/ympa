#' Create a new OrderBusinessBuyerDTO
#'
#' @description
#' Информация о покупателе. 
#'
#' @docType class
#' @title OrderBusinessBuyerDTO
#' @description OrderBusinessBuyerDTO Class
#' @format An \code{R6Class} generator object
#' @field inn ИНН. character [optional]
#' @field kpp КПП. character [optional]
#' @field organizationName Наименование юридического лица. character [optional]
#' @field organizationJurAddress Юридический адрес. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderBusinessBuyerDTO <- R6::R6Class(
  "OrderBusinessBuyerDTO",
  public = list(
    `inn` = NULL,
    `kpp` = NULL,
    `organizationName` = NULL,
    `organizationJurAddress` = NULL,
    #' Initialize a new OrderBusinessBuyerDTO class.
    #'
    #' @description
    #' Initialize a new OrderBusinessBuyerDTO class.
    #'
    #' @param inn ИНН.
    #' @param kpp КПП.
    #' @param organizationName Наименование юридического лица.
    #' @param organizationJurAddress Юридический адрес.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`inn` = NULL, `kpp` = NULL, `organizationName` = NULL, `organizationJurAddress` = NULL, ...) {
      if (!is.null(`inn`)) {
        if (!(is.character(`inn`) && length(`inn`) == 1)) {
          stop(paste("Error! Invalid data for `inn`. Must be a string:", `inn`))
        }
        self$`inn` <- `inn`
      }
      if (!is.null(`kpp`)) {
        if (!(is.character(`kpp`) && length(`kpp`) == 1)) {
          stop(paste("Error! Invalid data for `kpp`. Must be a string:", `kpp`))
        }
        self$`kpp` <- `kpp`
      }
      if (!is.null(`organizationName`)) {
        if (!(is.character(`organizationName`) && length(`organizationName`) == 1)) {
          stop(paste("Error! Invalid data for `organizationName`. Must be a string:", `organizationName`))
        }
        self$`organizationName` <- `organizationName`
      }
      if (!is.null(`organizationJurAddress`)) {
        if (!(is.character(`organizationJurAddress`) && length(`organizationJurAddress`) == 1)) {
          stop(paste("Error! Invalid data for `organizationJurAddress`. Must be a string:", `organizationJurAddress`))
        }
        self$`organizationJurAddress` <- `organizationJurAddress`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderBusinessBuyerDTO in JSON format
    #' @export
    toJSON = function() {
      OrderBusinessBuyerDTOObject <- list()
      if (!is.null(self$`inn`)) {
        OrderBusinessBuyerDTOObject[["inn"]] <-
          self$`inn`
      }
      if (!is.null(self$`kpp`)) {
        OrderBusinessBuyerDTOObject[["kpp"]] <-
          self$`kpp`
      }
      if (!is.null(self$`organizationName`)) {
        OrderBusinessBuyerDTOObject[["organizationName"]] <-
          self$`organizationName`
      }
      if (!is.null(self$`organizationJurAddress`)) {
        OrderBusinessBuyerDTOObject[["organizationJurAddress"]] <-
          self$`organizationJurAddress`
      }
      OrderBusinessBuyerDTOObject
    },
    #' Deserialize JSON string into an instance of OrderBusinessBuyerDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderBusinessBuyerDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderBusinessBuyerDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`inn`)) {
        self$`inn` <- this_object$`inn`
      }
      if (!is.null(this_object$`kpp`)) {
        self$`kpp` <- this_object$`kpp`
      }
      if (!is.null(this_object$`organizationName`)) {
        self$`organizationName` <- this_object$`organizationName`
      }
      if (!is.null(this_object$`organizationJurAddress`)) {
        self$`organizationJurAddress` <- this_object$`organizationJurAddress`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderBusinessBuyerDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`inn`)) {
          sprintf(
          '"inn":
            "%s"
                    ',
          self$`inn`
          )
        },
        if (!is.null(self$`kpp`)) {
          sprintf(
          '"kpp":
            "%s"
                    ',
          self$`kpp`
          )
        },
        if (!is.null(self$`organizationName`)) {
          sprintf(
          '"organizationName":
            "%s"
                    ',
          self$`organizationName`
          )
        },
        if (!is.null(self$`organizationJurAddress`)) {
          sprintf(
          '"organizationJurAddress":
            "%s"
                    ',
          self$`organizationJurAddress`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OrderBusinessBuyerDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderBusinessBuyerDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderBusinessBuyerDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`inn` <- this_object$`inn`
      self$`kpp` <- this_object$`kpp`
      self$`organizationName` <- this_object$`organizationName`
      self$`organizationJurAddress` <- this_object$`organizationJurAddress`
      self
    },
    #' Validate JSON input with respect to OrderBusinessBuyerDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrderBusinessBuyerDTO and throw an exception if invalid
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
    #' @return String representation of OrderBusinessBuyerDTO
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
# OrderBusinessBuyerDTO$unlock()
#
## Below is an example to define the print function
# OrderBusinessBuyerDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderBusinessBuyerDTO$lock()

