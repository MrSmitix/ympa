#' Create a new ExtensionShipmentDTO
#'
#' @description
#' Информация об отгрузке.
#'
#' @docType class
#' @title ExtensionShipmentDTO
#' @description ExtensionShipmentDTO Class
#' @format An \code{R6Class} generator object
#' @field currentStatus  \link{ShipmentStatusChangeDTO} [optional]
#' @field availableActions Доступные действия над отгрузкой. list(\link{ShipmentActionType})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ExtensionShipmentDTO <- R6::R6Class(
  "ExtensionShipmentDTO",
  public = list(
    `currentStatus` = NULL,
    `availableActions` = NULL,
    #' Initialize a new ExtensionShipmentDTO class.
    #'
    #' @description
    #' Initialize a new ExtensionShipmentDTO class.
    #'
    #' @param availableActions Доступные действия над отгрузкой.
    #' @param currentStatus currentStatus
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`availableActions`, `currentStatus` = NULL, ...) {
      if (!missing(`availableActions`)) {
        stopifnot(is.vector(`availableActions`), length(`availableActions`) != 0)
        sapply(`availableActions`, function(x) stopifnot(R6::is.R6(x)))
        if (!identical(`availableActions`, unique(`availableActions`))) {
          stop("Error! Items in `availableActions` are not unique.")
        }
        self$`availableActions` <- `availableActions`
      }
      if (!is.null(`currentStatus`)) {
        stopifnot(R6::is.R6(`currentStatus`))
        self$`currentStatus` <- `currentStatus`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ExtensionShipmentDTO in JSON format
    #' @export
    toJSON = function() {
      ExtensionShipmentDTOObject <- list()
      if (!is.null(self$`currentStatus`)) {
        ExtensionShipmentDTOObject[["currentStatus"]] <-
          self$`currentStatus`$toJSON()
      }
      if (!is.null(self$`availableActions`)) {
        ExtensionShipmentDTOObject[["availableActions"]] <-
          lapply(self$`availableActions`, function(x) x$toJSON())
      }
      ExtensionShipmentDTOObject
    },
    #' Deserialize JSON string into an instance of ExtensionShipmentDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ExtensionShipmentDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ExtensionShipmentDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`currentStatus`)) {
        `currentstatus_object` <- ShipmentStatusChangeDTO$new()
        `currentstatus_object`$fromJSON(jsonlite::toJSON(this_object$`currentStatus`, auto_unbox = TRUE, digits = NA))
        self$`currentStatus` <- `currentstatus_object`
      }
      if (!is.null(this_object$`availableActions`)) {
        self$`availableActions` <- ApiClient$new()$deserializeObj(this_object$`availableActions`, "set[ShipmentActionType]", loadNamespace("ympa_r_client"))
        if (!identical(self$`availableActions`, unique(self$`availableActions`))) {
          stop("Error! Items in `availableActions` are not unique.")
        }
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ExtensionShipmentDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`currentStatus`)) {
          sprintf(
          '"currentStatus":
          %s
          ',
          jsonlite::toJSON(self$`currentStatus`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`availableActions`)) {
          sprintf(
          '"availableActions":
          [%s]
',
          paste(sapply(self$`availableActions`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ExtensionShipmentDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ExtensionShipmentDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ExtensionShipmentDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`currentStatus` <- ShipmentStatusChangeDTO$new()$fromJSON(jsonlite::toJSON(this_object$`currentStatus`, auto_unbox = TRUE, digits = NA))
      self$`availableActions` <- ApiClient$new()$deserializeObj(this_object$`availableActions`, "set[ShipmentActionType]", loadNamespace("ympa_r_client"))
      if (!identical(self$`availableActions`, unique(self$`availableActions`))) {
        stop("Error! Items in `availableActions` are not unique.")
      }
      self
    },
    #' Validate JSON input with respect to ExtensionShipmentDTO
    #'
    #' @description
    #' Validate JSON input with respect to ExtensionShipmentDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `availableActions`
      if (!is.null(input_json$`availableActions`)) {
        stopifnot(is.vector(input_json$`availableActions`), length(input_json$`availableActions`) != 0)
        if (!identical(input_json$`availableActions`, unique(input_json$`availableActions`))) {
          stop("Error! Items in `availableActions` are not unique.")
        }
        tmp <- sapply(input_json$`availableActions`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ExtensionShipmentDTO: the required field `availableActions` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ExtensionShipmentDTO
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
      # check if the required `availableActions` is null
      if (is.null(self$`availableActions`)) {
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
      # check if the required `availableActions` is null
      if (is.null(self$`availableActions`)) {
        invalid_fields["availableActions"] <- "Non-nullable required field `availableActions` cannot be null."
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
# ExtensionShipmentDTO$unlock()
#
## Below is an example to define the print function
# ExtensionShipmentDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ExtensionShipmentDTO$lock()

