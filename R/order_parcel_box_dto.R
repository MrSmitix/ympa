#' Create a new OrderParcelBoxDTO
#'
#' @description
#' Информация о грузоместе.
#'
#' @docType class
#' @title OrderParcelBoxDTO
#' @description OrderParcelBoxDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор грузоместа. integer [optional]
#' @field fulfilmentId Идентификатор грузового места в информационной системе магазина. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderParcelBoxDTO <- R6::R6Class(
  "OrderParcelBoxDTO",
  public = list(
    `id` = NULL,
    `fulfilmentId` = NULL,
    #' Initialize a new OrderParcelBoxDTO class.
    #'
    #' @description
    #' Initialize a new OrderParcelBoxDTO class.
    #'
    #' @param id Идентификатор грузоместа.
    #' @param fulfilmentId Идентификатор грузового места в информационной системе магазина.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id` = NULL, `fulfilmentId` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`fulfilmentId`)) {
        if (!(is.character(`fulfilmentId`) && length(`fulfilmentId`) == 1)) {
          stop(paste("Error! Invalid data for `fulfilmentId`. Must be a string:", `fulfilmentId`))
        }
        self$`fulfilmentId` <- `fulfilmentId`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderParcelBoxDTO in JSON format
    #' @export
    toJSON = function() {
      OrderParcelBoxDTOObject <- list()
      if (!is.null(self$`id`)) {
        OrderParcelBoxDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`fulfilmentId`)) {
        OrderParcelBoxDTOObject[["fulfilmentId"]] <-
          self$`fulfilmentId`
      }
      OrderParcelBoxDTOObject
    },
    #' Deserialize JSON string into an instance of OrderParcelBoxDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderParcelBoxDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderParcelBoxDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`fulfilmentId`)) {
        self$`fulfilmentId` <- this_object$`fulfilmentId`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderParcelBoxDTO in JSON format
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
        if (!is.null(self$`fulfilmentId`)) {
          sprintf(
          '"fulfilmentId":
            "%s"
                    ',
          self$`fulfilmentId`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OrderParcelBoxDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderParcelBoxDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderParcelBoxDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`fulfilmentId` <- this_object$`fulfilmentId`
      self
    },
    #' Validate JSON input with respect to OrderParcelBoxDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrderParcelBoxDTO and throw an exception if invalid
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
    #' @return String representation of OrderParcelBoxDTO
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
# OrderParcelBoxDTO$unlock()
#
## Below is an example to define the print function
# OrderParcelBoxDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderParcelBoxDTO$lock()

