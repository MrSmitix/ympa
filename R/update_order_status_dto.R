#' Create a new UpdateOrderStatusDTO
#'
#' @description
#' Список заказов.
#'
#' @docType class
#' @title UpdateOrderStatusDTO
#' @description UpdateOrderStatusDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор заказа. integer [optional]
#' @field status  \link{OrderStatusType} [optional]
#' @field substatus  \link{OrderSubstatusType} [optional]
#' @field updateStatus  \link{OrderUpdateStatusType} [optional]
#' @field errorDetails Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр `updateStatus` принимает значение `ERROR`. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdateOrderStatusDTO <- R6::R6Class(
  "UpdateOrderStatusDTO",
  public = list(
    `id` = NULL,
    `status` = NULL,
    `substatus` = NULL,
    `updateStatus` = NULL,
    `errorDetails` = NULL,
    #' Initialize a new UpdateOrderStatusDTO class.
    #'
    #' @description
    #' Initialize a new UpdateOrderStatusDTO class.
    #'
    #' @param id Идентификатор заказа.
    #' @param status status
    #' @param substatus substatus
    #' @param updateStatus updateStatus
    #' @param errorDetails Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр `updateStatus` принимает значение `ERROR`.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id` = NULL, `status` = NULL, `substatus` = NULL, `updateStatus` = NULL, `errorDetails` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`substatus`)) {
        if (!(`substatus` %in% c())) {
          stop(paste("Error! \"", `substatus`, "\" cannot be assigned to `substatus`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`substatus`))
        self$`substatus` <- `substatus`
      }
      if (!is.null(`updateStatus`)) {
        if (!(`updateStatus` %in% c())) {
          stop(paste("Error! \"", `updateStatus`, "\" cannot be assigned to `updateStatus`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`updateStatus`))
        self$`updateStatus` <- `updateStatus`
      }
      if (!is.null(`errorDetails`)) {
        if (!(is.character(`errorDetails`) && length(`errorDetails`) == 1)) {
          stop(paste("Error! Invalid data for `errorDetails`. Must be a string:", `errorDetails`))
        }
        self$`errorDetails` <- `errorDetails`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateOrderStatusDTO in JSON format
    #' @export
    toJSON = function() {
      UpdateOrderStatusDTOObject <- list()
      if (!is.null(self$`id`)) {
        UpdateOrderStatusDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`status`)) {
        UpdateOrderStatusDTOObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`substatus`)) {
        UpdateOrderStatusDTOObject[["substatus"]] <-
          self$`substatus`$toJSON()
      }
      if (!is.null(self$`updateStatus`)) {
        UpdateOrderStatusDTOObject[["updateStatus"]] <-
          self$`updateStatus`$toJSON()
      }
      if (!is.null(self$`errorDetails`)) {
        UpdateOrderStatusDTOObject[["errorDetails"]] <-
          self$`errorDetails`
      }
      UpdateOrderStatusDTOObject
    },
    #' Deserialize JSON string into an instance of UpdateOrderStatusDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateOrderStatusDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateOrderStatusDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- OrderStatusType$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`substatus`)) {
        `substatus_object` <- OrderSubstatusType$new()
        `substatus_object`$fromJSON(jsonlite::toJSON(this_object$`substatus`, auto_unbox = TRUE, digits = NA))
        self$`substatus` <- `substatus_object`
      }
      if (!is.null(this_object$`updateStatus`)) {
        `updatestatus_object` <- OrderUpdateStatusType$new()
        `updatestatus_object`$fromJSON(jsonlite::toJSON(this_object$`updateStatus`, auto_unbox = TRUE, digits = NA))
        self$`updateStatus` <- `updatestatus_object`
      }
      if (!is.null(this_object$`errorDetails`)) {
        self$`errorDetails` <- this_object$`errorDetails`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdateOrderStatusDTO in JSON format
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
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
          %s
          ',
          jsonlite::toJSON(self$`status`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`substatus`)) {
          sprintf(
          '"substatus":
          %s
          ',
          jsonlite::toJSON(self$`substatus`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`updateStatus`)) {
          sprintf(
          '"updateStatus":
          %s
          ',
          jsonlite::toJSON(self$`updateStatus`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`errorDetails`)) {
          sprintf(
          '"errorDetails":
            "%s"
                    ',
          self$`errorDetails`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of UpdateOrderStatusDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdateOrderStatusDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateOrderStatusDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`status` <- OrderStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`substatus` <- OrderSubstatusType$new()$fromJSON(jsonlite::toJSON(this_object$`substatus`, auto_unbox = TRUE, digits = NA))
      self$`updateStatus` <- OrderUpdateStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`updateStatus`, auto_unbox = TRUE, digits = NA))
      self$`errorDetails` <- this_object$`errorDetails`
      self
    },
    #' Validate JSON input with respect to UpdateOrderStatusDTO
    #'
    #' @description
    #' Validate JSON input with respect to UpdateOrderStatusDTO and throw an exception if invalid
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
    #' @return String representation of UpdateOrderStatusDTO
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
# UpdateOrderStatusDTO$unlock()
#
## Below is an example to define the print function
# UpdateOrderStatusDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UpdateOrderStatusDTO$lock()

