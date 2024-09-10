#' Create a new OrderBuyerDTO
#'
#' @description
#' Информация о покупателе.  Параметры `id`, `lastName`, `firstName` и `middleName` возвращаются, только если вы работаете по модели DBS. 
#'
#' @docType class
#' @title OrderBuyerDTO
#' @description OrderBuyerDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор покупателя. character [optional]
#' @field lastName Фамилия покупателя. character [optional]
#' @field firstName Имя покупателя. character [optional]
#' @field middleName Отчество покупателя. character [optional]
#' @field type  \link{OrderBuyerType} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderBuyerDTO <- R6::R6Class(
  "OrderBuyerDTO",
  public = list(
    `id` = NULL,
    `lastName` = NULL,
    `firstName` = NULL,
    `middleName` = NULL,
    `type` = NULL,
    #' Initialize a new OrderBuyerDTO class.
    #'
    #' @description
    #' Initialize a new OrderBuyerDTO class.
    #'
    #' @param id Идентификатор покупателя.
    #' @param lastName Фамилия покупателя.
    #' @param firstName Имя покупателя.
    #' @param middleName Отчество покупателя.
    #' @param type type
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id` = NULL, `lastName` = NULL, `firstName` = NULL, `middleName` = NULL, `type` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`lastName`)) {
        if (!(is.character(`lastName`) && length(`lastName`) == 1)) {
          stop(paste("Error! Invalid data for `lastName`. Must be a string:", `lastName`))
        }
        self$`lastName` <- `lastName`
      }
      if (!is.null(`firstName`)) {
        if (!(is.character(`firstName`) && length(`firstName`) == 1)) {
          stop(paste("Error! Invalid data for `firstName`. Must be a string:", `firstName`))
        }
        self$`firstName` <- `firstName`
      }
      if (!is.null(`middleName`)) {
        if (!(is.character(`middleName`) && length(`middleName`) == 1)) {
          stop(paste("Error! Invalid data for `middleName`. Must be a string:", `middleName`))
        }
        self$`middleName` <- `middleName`
      }
      if (!is.null(`type`)) {
        if (!(`type` %in% c())) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderBuyerDTO in JSON format
    #' @export
    toJSON = function() {
      OrderBuyerDTOObject <- list()
      if (!is.null(self$`id`)) {
        OrderBuyerDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`lastName`)) {
        OrderBuyerDTOObject[["lastName"]] <-
          self$`lastName`
      }
      if (!is.null(self$`firstName`)) {
        OrderBuyerDTOObject[["firstName"]] <-
          self$`firstName`
      }
      if (!is.null(self$`middleName`)) {
        OrderBuyerDTOObject[["middleName"]] <-
          self$`middleName`
      }
      if (!is.null(self$`type`)) {
        OrderBuyerDTOObject[["type"]] <-
          self$`type`$toJSON()
      }
      OrderBuyerDTOObject
    },
    #' Deserialize JSON string into an instance of OrderBuyerDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderBuyerDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderBuyerDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`lastName`)) {
        self$`lastName` <- this_object$`lastName`
      }
      if (!is.null(this_object$`firstName`)) {
        self$`firstName` <- this_object$`firstName`
      }
      if (!is.null(this_object$`middleName`)) {
        self$`middleName` <- this_object$`middleName`
      }
      if (!is.null(this_object$`type`)) {
        `type_object` <- OrderBuyerType$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderBuyerDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`lastName`)) {
          sprintf(
          '"lastName":
            "%s"
                    ',
          self$`lastName`
          )
        },
        if (!is.null(self$`firstName`)) {
          sprintf(
          '"firstName":
            "%s"
                    ',
          self$`firstName`
          )
        },
        if (!is.null(self$`middleName`)) {
          sprintf(
          '"middleName":
            "%s"
                    ',
          self$`middleName`
          )
        },
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
          %s
          ',
          jsonlite::toJSON(self$`type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OrderBuyerDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderBuyerDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderBuyerDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`lastName` <- this_object$`lastName`
      self$`firstName` <- this_object$`firstName`
      self$`middleName` <- this_object$`middleName`
      self$`type` <- OrderBuyerType$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to OrderBuyerDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrderBuyerDTO and throw an exception if invalid
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
    #' @return String representation of OrderBuyerDTO
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
# OrderBuyerDTO$unlock()
#
## Below is an example to define the print function
# OrderBuyerDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderBuyerDTO$lock()

