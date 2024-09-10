#' Create a new OrdersShipmentInfoDTO
#'
#' @description
#' Годные/негодные ярлыки по заказам в отгрузке.
#'
#' @docType class
#' @title OrdersShipmentInfoDTO
#' @description OrdersShipmentInfoDTO Class
#' @format An \code{R6Class} generator object
#' @field orderIdsWithLabels Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки. list(integer)
#' @field orderIdsWithoutLabels Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки. list(integer)
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrdersShipmentInfoDTO <- R6::R6Class(
  "OrdersShipmentInfoDTO",
  public = list(
    `orderIdsWithLabels` = NULL,
    `orderIdsWithoutLabels` = NULL,
    #' Initialize a new OrdersShipmentInfoDTO class.
    #'
    #' @description
    #' Initialize a new OrdersShipmentInfoDTO class.
    #'
    #' @param orderIdsWithLabels Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки.
    #' @param orderIdsWithoutLabels Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`orderIdsWithLabels`, `orderIdsWithoutLabels`, ...) {
      if (!missing(`orderIdsWithLabels`)) {
        stopifnot(is.vector(`orderIdsWithLabels`), length(`orderIdsWithLabels`) != 0)
        sapply(`orderIdsWithLabels`, function(x) stopifnot(is.character(x)))
        if (!identical(`orderIdsWithLabels`, unique(`orderIdsWithLabels`))) {
          stop("Error! Items in `orderIdsWithLabels` are not unique.")
        }
        self$`orderIdsWithLabels` <- `orderIdsWithLabels`
      }
      if (!missing(`orderIdsWithoutLabels`)) {
        stopifnot(is.vector(`orderIdsWithoutLabels`), length(`orderIdsWithoutLabels`) != 0)
        sapply(`orderIdsWithoutLabels`, function(x) stopifnot(is.character(x)))
        if (!identical(`orderIdsWithoutLabels`, unique(`orderIdsWithoutLabels`))) {
          stop("Error! Items in `orderIdsWithoutLabels` are not unique.")
        }
        self$`orderIdsWithoutLabels` <- `orderIdsWithoutLabels`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrdersShipmentInfoDTO in JSON format
    #' @export
    toJSON = function() {
      OrdersShipmentInfoDTOObject <- list()
      if (!is.null(self$`orderIdsWithLabels`)) {
        OrdersShipmentInfoDTOObject[["orderIdsWithLabels"]] <-
          self$`orderIdsWithLabels`
      }
      if (!is.null(self$`orderIdsWithoutLabels`)) {
        OrdersShipmentInfoDTOObject[["orderIdsWithoutLabels"]] <-
          self$`orderIdsWithoutLabels`
      }
      OrdersShipmentInfoDTOObject
    },
    #' Deserialize JSON string into an instance of OrdersShipmentInfoDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrdersShipmentInfoDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrdersShipmentInfoDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`orderIdsWithLabels`)) {
        self$`orderIdsWithLabels` <- ApiClient$new()$deserializeObj(this_object$`orderIdsWithLabels`, "set[integer]", loadNamespace("ympa_r_client"))
        if (!identical(self$`orderIdsWithLabels`, unique(self$`orderIdsWithLabels`))) {
          stop("Error! Items in `orderIdsWithLabels` are not unique.")
        }
      }
      if (!is.null(this_object$`orderIdsWithoutLabels`)) {
        self$`orderIdsWithoutLabels` <- ApiClient$new()$deserializeObj(this_object$`orderIdsWithoutLabels`, "set[integer]", loadNamespace("ympa_r_client"))
        if (!identical(self$`orderIdsWithoutLabels`, unique(self$`orderIdsWithoutLabels`))) {
          stop("Error! Items in `orderIdsWithoutLabels` are not unique.")
        }
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrdersShipmentInfoDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`orderIdsWithLabels`)) {
          sprintf(
          '"orderIdsWithLabels":
             [%s]
          ',
          paste(unlist(lapply(self$`orderIdsWithLabels`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`orderIdsWithoutLabels`)) {
          sprintf(
          '"orderIdsWithoutLabels":
             [%s]
          ',
          paste(unlist(lapply(self$`orderIdsWithoutLabels`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OrdersShipmentInfoDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrdersShipmentInfoDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrdersShipmentInfoDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`orderIdsWithLabels` <- ApiClient$new()$deserializeObj(this_object$`orderIdsWithLabels`, "set[integer]", loadNamespace("ympa_r_client"))
      if (!identical(self$`orderIdsWithLabels`, unique(self$`orderIdsWithLabels`))) {
        stop("Error! Items in `orderIdsWithLabels` are not unique.")
      }
      self$`orderIdsWithoutLabels` <- ApiClient$new()$deserializeObj(this_object$`orderIdsWithoutLabels`, "set[integer]", loadNamespace("ympa_r_client"))
      if (!identical(self$`orderIdsWithoutLabels`, unique(self$`orderIdsWithoutLabels`))) {
        stop("Error! Items in `orderIdsWithoutLabels` are not unique.")
      }
      self
    },
    #' Validate JSON input with respect to OrdersShipmentInfoDTO
    #'
    #' @description
    #' Validate JSON input with respect to OrdersShipmentInfoDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `orderIdsWithLabels`
      if (!is.null(input_json$`orderIdsWithLabels`)) {
        stopifnot(is.vector(input_json$`orderIdsWithLabels`), length(input_json$`orderIdsWithLabels`) != 0)
        if (!identical(input_json$`orderIdsWithLabels`, unique(input_json$`orderIdsWithLabels`))) {
          stop("Error! Items in `orderIdsWithLabels` are not unique.")
        }
        tmp <- sapply(input_json$`orderIdsWithLabels`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OrdersShipmentInfoDTO: the required field `orderIdsWithLabels` is missing."))
      }
      # check the required field `orderIdsWithoutLabels`
      if (!is.null(input_json$`orderIdsWithoutLabels`)) {
        stopifnot(is.vector(input_json$`orderIdsWithoutLabels`), length(input_json$`orderIdsWithoutLabels`) != 0)
        if (!identical(input_json$`orderIdsWithoutLabels`, unique(input_json$`orderIdsWithoutLabels`))) {
          stop("Error! Items in `orderIdsWithoutLabels` are not unique.")
        }
        tmp <- sapply(input_json$`orderIdsWithoutLabels`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OrdersShipmentInfoDTO: the required field `orderIdsWithoutLabels` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OrdersShipmentInfoDTO
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
      # check if the required `orderIdsWithLabels` is null
      if (is.null(self$`orderIdsWithLabels`)) {
        return(FALSE)
      }


      # check if the required `orderIdsWithoutLabels` is null
      if (is.null(self$`orderIdsWithoutLabels`)) {
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
      # check if the required `orderIdsWithLabels` is null
      if (is.null(self$`orderIdsWithLabels`)) {
        invalid_fields["orderIdsWithLabels"] <- "Non-nullable required field `orderIdsWithLabels` cannot be null."
      }


      # check if the required `orderIdsWithoutLabels` is null
      if (is.null(self$`orderIdsWithoutLabels`)) {
        invalid_fields["orderIdsWithoutLabels"] <- "Non-nullable required field `orderIdsWithoutLabels` cannot be null."
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
# OrdersShipmentInfoDTO$unlock()
#
## Below is an example to define the print function
# OrdersShipmentInfoDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrdersShipmentInfoDTO$lock()

