#' Create a new TransferOrdersFromShipmentRequest
#'
#' @description
#' Запрос переноса заказов из отгрузки.
#'
#' @docType class
#' @title TransferOrdersFromShipmentRequest
#' @description TransferOrdersFromShipmentRequest Class
#' @format An \code{R6Class} generator object
#' @field orderIds Список заказов, которые вы не успеваете подготовить. list(integer)
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TransferOrdersFromShipmentRequest <- R6::R6Class(
  "TransferOrdersFromShipmentRequest",
  public = list(
    `orderIds` = NULL,
    #' Initialize a new TransferOrdersFromShipmentRequest class.
    #'
    #' @description
    #' Initialize a new TransferOrdersFromShipmentRequest class.
    #'
    #' @param orderIds Список заказов, которые вы не успеваете подготовить.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`orderIds`, ...) {
      if (!missing(`orderIds`)) {
        stopifnot(is.vector(`orderIds`), length(`orderIds`) != 0)
        sapply(`orderIds`, function(x) stopifnot(is.character(x)))
        self$`orderIds` <- `orderIds`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return TransferOrdersFromShipmentRequest in JSON format
    #' @export
    toJSON = function() {
      TransferOrdersFromShipmentRequestObject <- list()
      if (!is.null(self$`orderIds`)) {
        TransferOrdersFromShipmentRequestObject[["orderIds"]] <-
          self$`orderIds`
      }
      TransferOrdersFromShipmentRequestObject
    },
    #' Deserialize JSON string into an instance of TransferOrdersFromShipmentRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of TransferOrdersFromShipmentRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of TransferOrdersFromShipmentRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`orderIds`)) {
        self$`orderIds` <- ApiClient$new()$deserializeObj(this_object$`orderIds`, "array[integer]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return TransferOrdersFromShipmentRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`orderIds`)) {
          sprintf(
          '"orderIds":
             [%s]
          ',
          paste(unlist(lapply(self$`orderIds`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of TransferOrdersFromShipmentRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of TransferOrdersFromShipmentRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of TransferOrdersFromShipmentRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`orderIds` <- ApiClient$new()$deserializeObj(this_object$`orderIds`, "array[integer]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to TransferOrdersFromShipmentRequest
    #'
    #' @description
    #' Validate JSON input with respect to TransferOrdersFromShipmentRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `orderIds`
      if (!is.null(input_json$`orderIds`)) {
        stopifnot(is.vector(input_json$`orderIds`), length(input_json$`orderIds`) != 0)
        tmp <- sapply(input_json$`orderIds`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TransferOrdersFromShipmentRequest: the required field `orderIds` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TransferOrdersFromShipmentRequest
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
      # check if the required `orderIds` is null
      if (is.null(self$`orderIds`)) {
        return(FALSE)
      }

      if (length(self$`orderIds`) > 500) {
        return(FALSE)
      }
      if (length(self$`orderIds`) < 1) {
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
      # check if the required `orderIds` is null
      if (is.null(self$`orderIds`)) {
        invalid_fields["orderIds"] <- "Non-nullable required field `orderIds` cannot be null."
      }

      if (length(self$`orderIds`) > 500) {
        invalid_fields["orderIds"] <- "Invalid length for `orderIds`, number of items must be less than or equal to 500."
      }
      if (length(self$`orderIds`) < 1) {
        invalid_fields["orderIds"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# TransferOrdersFromShipmentRequest$unlock()
#
## Below is an example to define the print function
# TransferOrdersFromShipmentRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TransferOrdersFromShipmentRequest$lock()

