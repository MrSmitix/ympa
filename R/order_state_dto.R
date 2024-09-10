#' Create a new OrderStateDTO
#'
#' @description
#' Информация по заказу.
#'
#' @docType class
#' @title OrderStateDTO
#' @description OrderStateDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор заказа. integer
#' @field status  \link{OrderStatusType}
#' @field substatus  \link{OrderSubstatusType} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderStateDTO <- R6::R6Class(
  "OrderStateDTO",
  public = list(
    `id` = NULL,
    `status` = NULL,
    `substatus` = NULL,
    #' Initialize a new OrderStateDTO class.
    #'
    #' @description
    #' Initialize a new OrderStateDTO class.
    #'
    #' @param id Идентификатор заказа.
    #' @param status status
    #' @param substatus substatus
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id`, `status`, `substatus` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`status`)) {
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
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderStateDTO in JSON format
    #' @export
    toJSON = function() {
      OrderStateDTOObject <- list()
      if (!is.null(self$`id`)) {
        OrderStateDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`status`)) {
        OrderStateDTOObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`substatus`)) {
        OrderStateDTOObject[["substatus"]] <-
          self$`substatus`$toJSON()
      }
      OrderStateDTOObject
    },
    #' Deserialize JSON string into an instance of OrderStateDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderStateDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderStateDTO
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
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderStateDTO in JSON format
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
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OrderStateDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderStateDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderStateDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`status` <- OrderStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`substatus` <- OrderSubstatusType$new()$fromJSON(jsonlite::toJSON(this_object$`substatus`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to OrderStateDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrderStateDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.numeric(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OrderStateDTO: the required field `id` is missing."))
      }
      # check the required field `status`
      if (!is.null(input_json$`status`)) {
        stopifnot(R6::is.R6(input_json$`status`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OrderStateDTO: the required field `status` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OrderStateDTO
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        invalid_fields["status"] <- "Non-nullable required field `status` cannot be null."
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
# OrderStateDTO$unlock()
#
## Below is an example to define the print function
# OrderStateDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderStateDTO$lock()

