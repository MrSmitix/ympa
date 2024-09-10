#' Create a new OrderCourierDTO
#'
#' @description
#' Информация о курьере.
#'
#' @docType class
#' @title OrderCourierDTO
#' @description OrderCourierDTO Class
#' @format An \code{R6Class} generator object
#' @field fullName Полное имя курьера. character [optional]
#' @field phone Номер телефона курьера. character [optional]
#' @field phoneExtension Добавочный номер телефона. character [optional]
#' @field vehicleNumber Номер транспортного средства. character [optional]
#' @field vehicleDescription Описание машины. Например, модель и цвет. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderCourierDTO <- R6::R6Class(
  "OrderCourierDTO",
  public = list(
    `fullName` = NULL,
    `phone` = NULL,
    `phoneExtension` = NULL,
    `vehicleNumber` = NULL,
    `vehicleDescription` = NULL,
    #' Initialize a new OrderCourierDTO class.
    #'
    #' @description
    #' Initialize a new OrderCourierDTO class.
    #'
    #' @param fullName Полное имя курьера.
    #' @param phone Номер телефона курьера.
    #' @param phoneExtension Добавочный номер телефона.
    #' @param vehicleNumber Номер транспортного средства.
    #' @param vehicleDescription Описание машины. Например, модель и цвет.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`fullName` = NULL, `phone` = NULL, `phoneExtension` = NULL, `vehicleNumber` = NULL, `vehicleDescription` = NULL, ...) {
      if (!is.null(`fullName`)) {
        if (!(is.character(`fullName`) && length(`fullName`) == 1)) {
          stop(paste("Error! Invalid data for `fullName`. Must be a string:", `fullName`))
        }
        self$`fullName` <- `fullName`
      }
      if (!is.null(`phone`)) {
        if (!(is.character(`phone`) && length(`phone`) == 1)) {
          stop(paste("Error! Invalid data for `phone`. Must be a string:", `phone`))
        }
        self$`phone` <- `phone`
      }
      if (!is.null(`phoneExtension`)) {
        if (!(is.character(`phoneExtension`) && length(`phoneExtension`) == 1)) {
          stop(paste("Error! Invalid data for `phoneExtension`. Must be a string:", `phoneExtension`))
        }
        self$`phoneExtension` <- `phoneExtension`
      }
      if (!is.null(`vehicleNumber`)) {
        if (!(is.character(`vehicleNumber`) && length(`vehicleNumber`) == 1)) {
          stop(paste("Error! Invalid data for `vehicleNumber`. Must be a string:", `vehicleNumber`))
        }
        self$`vehicleNumber` <- `vehicleNumber`
      }
      if (!is.null(`vehicleDescription`)) {
        if (!(is.character(`vehicleDescription`) && length(`vehicleDescription`) == 1)) {
          stop(paste("Error! Invalid data for `vehicleDescription`. Must be a string:", `vehicleDescription`))
        }
        self$`vehicleDescription` <- `vehicleDescription`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderCourierDTO in JSON format
    #' @export
    toJSON = function() {
      OrderCourierDTOObject <- list()
      if (!is.null(self$`fullName`)) {
        OrderCourierDTOObject[["fullName"]] <-
          self$`fullName`
      }
      if (!is.null(self$`phone`)) {
        OrderCourierDTOObject[["phone"]] <-
          self$`phone`
      }
      if (!is.null(self$`phoneExtension`)) {
        OrderCourierDTOObject[["phoneExtension"]] <-
          self$`phoneExtension`
      }
      if (!is.null(self$`vehicleNumber`)) {
        OrderCourierDTOObject[["vehicleNumber"]] <-
          self$`vehicleNumber`
      }
      if (!is.null(self$`vehicleDescription`)) {
        OrderCourierDTOObject[["vehicleDescription"]] <-
          self$`vehicleDescription`
      }
      OrderCourierDTOObject
    },
    #' Deserialize JSON string into an instance of OrderCourierDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderCourierDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderCourierDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`fullName`)) {
        self$`fullName` <- this_object$`fullName`
      }
      if (!is.null(this_object$`phone`)) {
        self$`phone` <- this_object$`phone`
      }
      if (!is.null(this_object$`phoneExtension`)) {
        self$`phoneExtension` <- this_object$`phoneExtension`
      }
      if (!is.null(this_object$`vehicleNumber`)) {
        self$`vehicleNumber` <- this_object$`vehicleNumber`
      }
      if (!is.null(this_object$`vehicleDescription`)) {
        self$`vehicleDescription` <- this_object$`vehicleDescription`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderCourierDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`fullName`)) {
          sprintf(
          '"fullName":
            "%s"
                    ',
          self$`fullName`
          )
        },
        if (!is.null(self$`phone`)) {
          sprintf(
          '"phone":
            "%s"
                    ',
          self$`phone`
          )
        },
        if (!is.null(self$`phoneExtension`)) {
          sprintf(
          '"phoneExtension":
            "%s"
                    ',
          self$`phoneExtension`
          )
        },
        if (!is.null(self$`vehicleNumber`)) {
          sprintf(
          '"vehicleNumber":
            "%s"
                    ',
          self$`vehicleNumber`
          )
        },
        if (!is.null(self$`vehicleDescription`)) {
          sprintf(
          '"vehicleDescription":
            "%s"
                    ',
          self$`vehicleDescription`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OrderCourierDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderCourierDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderCourierDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`fullName` <- this_object$`fullName`
      self$`phone` <- this_object$`phone`
      self$`phoneExtension` <- this_object$`phoneExtension`
      self$`vehicleNumber` <- this_object$`vehicleNumber`
      self$`vehicleDescription` <- this_object$`vehicleDescription`
      self
    },
    #' Validate JSON input with respect to OrderCourierDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrderCourierDTO and throw an exception if invalid
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
    #' @return String representation of OrderCourierDTO
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
# OrderCourierDTO$unlock()
#
## Below is an example to define the print function
# OrderCourierDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderCourierDTO$lock()

