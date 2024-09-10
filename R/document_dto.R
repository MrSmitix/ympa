#' Create a new DocumentDTO
#'
#' @description
#' Информация о документе.
#'
#' @docType class
#' @title DocumentDTO
#' @description DocumentDTO Class
#' @format An \code{R6Class} generator object
#' @field status  \link{OrderDocumentStatusType} [optional]
#' @field number Номер документа. character [optional]
#' @field date Дата создания документа. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DocumentDTO <- R6::R6Class(
  "DocumentDTO",
  public = list(
    `status` = NULL,
    `number` = NULL,
    `date` = NULL,
    #' Initialize a new DocumentDTO class.
    #'
    #' @description
    #' Initialize a new DocumentDTO class.
    #'
    #' @param status status
    #' @param number Номер документа.
    #' @param date Дата создания документа.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`status` = NULL, `number` = NULL, `date` = NULL, ...) {
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`number`)) {
        if (!(is.character(`number`) && length(`number`) == 1)) {
          stop(paste("Error! Invalid data for `number`. Must be a string:", `number`))
        }
        self$`number` <- `number`
      }
      if (!is.null(`date`)) {
        if (!is.character(`date`)) {
          stop(paste("Error! Invalid data for `date`. Must be a string:", `date`))
        }
        self$`date` <- `date`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return DocumentDTO in JSON format
    #' @export
    toJSON = function() {
      DocumentDTOObject <- list()
      if (!is.null(self$`status`)) {
        DocumentDTOObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`number`)) {
        DocumentDTOObject[["number"]] <-
          self$`number`
      }
      if (!is.null(self$`date`)) {
        DocumentDTOObject[["date"]] <-
          self$`date`
      }
      DocumentDTOObject
    },
    #' Deserialize JSON string into an instance of DocumentDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of DocumentDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of DocumentDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`status`)) {
        `status_object` <- OrderDocumentStatusType$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`number`)) {
        self$`number` <- this_object$`number`
      }
      if (!is.null(this_object$`date`)) {
        self$`date` <- this_object$`date`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return DocumentDTO in JSON format
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
        if (!is.null(self$`number`)) {
          sprintf(
          '"number":
            "%s"
                    ',
          self$`number`
          )
        },
        if (!is.null(self$`date`)) {
          sprintf(
          '"date":
            "%s"
                    ',
          self$`date`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of DocumentDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of DocumentDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of DocumentDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`status` <- OrderDocumentStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`number` <- this_object$`number`
      self$`date` <- this_object$`date`
      self
    },
    #' Validate JSON input with respect to DocumentDTO
    #'
    #' @description
    #' Validate JSON input with respect to DocumentDTO and throw an exception if invalid
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
    #' @return String representation of DocumentDTO
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
# DocumentDTO$unlock()
#
## Below is an example to define the print function
# DocumentDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# DocumentDTO$lock()

