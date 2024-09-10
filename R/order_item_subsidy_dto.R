#' Create a new OrderItemSubsidyDTO
#'
#' @description
#' Общее вознаграждение партнеру за все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса.  Передается в валюте заказа. 
#'
#' @docType class
#' @title OrderItemSubsidyDTO
#' @description OrderItemSubsidyDTO Class
#' @format An \code{R6Class} generator object
#' @field type  \link{OrderItemSubsidyType} [optional]
#' @field amount Сумма субсидии. numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderItemSubsidyDTO <- R6::R6Class(
  "OrderItemSubsidyDTO",
  public = list(
    `type` = NULL,
    `amount` = NULL,
    #' Initialize a new OrderItemSubsidyDTO class.
    #'
    #' @description
    #' Initialize a new OrderItemSubsidyDTO class.
    #'
    #' @param type type
    #' @param amount Сумма субсидии.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`type` = NULL, `amount` = NULL, ...) {
      if (!is.null(`type`)) {
        if (!(`type` %in% c())) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
      if (!is.null(`amount`)) {
        self$`amount` <- `amount`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderItemSubsidyDTO in JSON format
    #' @export
    toJSON = function() {
      OrderItemSubsidyDTOObject <- list()
      if (!is.null(self$`type`)) {
        OrderItemSubsidyDTOObject[["type"]] <-
          self$`type`$toJSON()
      }
      if (!is.null(self$`amount`)) {
        OrderItemSubsidyDTOObject[["amount"]] <-
          self$`amount`
      }
      OrderItemSubsidyDTOObject
    },
    #' Deserialize JSON string into an instance of OrderItemSubsidyDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderItemSubsidyDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderItemSubsidyDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        `type_object` <- OrderItemSubsidyType$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
      if (!is.null(this_object$`amount`)) {
        self$`amount` <- this_object$`amount`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderItemSubsidyDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
          %s
          ',
          jsonlite::toJSON(self$`type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`amount`)) {
          sprintf(
          '"amount":
            %d
                    ',
          self$`amount`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OrderItemSubsidyDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderItemSubsidyDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderItemSubsidyDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`type` <- OrderItemSubsidyType$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self$`amount` <- this_object$`amount`
      self
    },
    #' Validate JSON input with respect to OrderItemSubsidyDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrderItemSubsidyDTO and throw an exception if invalid
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
    #' @return String representation of OrderItemSubsidyDTO
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
# OrderItemSubsidyDTO$unlock()
#
## Below is an example to define the print function
# OrderItemSubsidyDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderItemSubsidyDTO$lock()

