#' Create a new ShipmentStatusChangeDTO
#'
#' @description
#' Статус отгрузки.
#'
#' @docType class
#' @title ShipmentStatusChangeDTO
#' @description ShipmentStatusChangeDTO Class
#' @format An \code{R6Class} generator object
#' @field status  \link{ShipmentStatusType} [optional]
#' @field description Описание статуса отгрузки. character [optional]
#' @field updateTime Время последнего изменения статуса отгрузки. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ShipmentStatusChangeDTO <- R6::R6Class(
  "ShipmentStatusChangeDTO",
  public = list(
    `status` = NULL,
    `description` = NULL,
    `updateTime` = NULL,
    #' Initialize a new ShipmentStatusChangeDTO class.
    #'
    #' @description
    #' Initialize a new ShipmentStatusChangeDTO class.
    #'
    #' @param status status
    #' @param description Описание статуса отгрузки.
    #' @param updateTime Время последнего изменения статуса отгрузки.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`status` = NULL, `description` = NULL, `updateTime` = NULL, ...) {
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!is.null(`updateTime`)) {
        if (!is.character(`updateTime`)) {
          stop(paste("Error! Invalid data for `updateTime`. Must be a string:", `updateTime`))
        }
        self$`updateTime` <- `updateTime`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ShipmentStatusChangeDTO in JSON format
    #' @export
    toJSON = function() {
      ShipmentStatusChangeDTOObject <- list()
      if (!is.null(self$`status`)) {
        ShipmentStatusChangeDTOObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`description`)) {
        ShipmentStatusChangeDTOObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`updateTime`)) {
        ShipmentStatusChangeDTOObject[["updateTime"]] <-
          self$`updateTime`
      }
      ShipmentStatusChangeDTOObject
    },
    #' Deserialize JSON string into an instance of ShipmentStatusChangeDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ShipmentStatusChangeDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ShipmentStatusChangeDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`status`)) {
        `status_object` <- ShipmentStatusType$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`updateTime`)) {
        self$`updateTime` <- this_object$`updateTime`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ShipmentStatusChangeDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
          %s
          ',
          jsonlite::toJSON(self$`status`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`description`)) {
          sprintf(
          '"description":
            "%s"
                    ',
          self$`description`
          )
        },
        if (!is.null(self$`updateTime`)) {
          sprintf(
          '"updateTime":
            "%s"
                    ',
          self$`updateTime`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ShipmentStatusChangeDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ShipmentStatusChangeDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ShipmentStatusChangeDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`status` <- ShipmentStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`description` <- this_object$`description`
      self$`updateTime` <- this_object$`updateTime`
      self
    },
    #' Validate JSON input with respect to ShipmentStatusChangeDTO
    #'
    #' @description
    #' Validate JSON input with respect to ShipmentStatusChangeDTO and throw an exception if invalid
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
    #' @return String representation of ShipmentStatusChangeDTO
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
# ShipmentStatusChangeDTO$unlock()
#
## Below is an example to define the print function
# ShipmentStatusChangeDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ShipmentStatusChangeDTO$lock()

