#' Create a new OfferProcessingNoteDTO
#'
#' @description
#' Причины, по которым товар не прошел модерацию.
#'
#' @docType class
#' @title OfferProcessingNoteDTO
#' @description OfferProcessingNoteDTO Class
#' @format An \code{R6Class} generator object
#' @field type  \link{OfferProcessingNoteType} [optional]
#' @field payload Дополнительная информация о причине отклонения товара. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OfferProcessingNoteDTO <- R6::R6Class(
  "OfferProcessingNoteDTO",
  public = list(
    `type` = NULL,
    `payload` = NULL,
    #' Initialize a new OfferProcessingNoteDTO class.
    #'
    #' @description
    #' Initialize a new OfferProcessingNoteDTO class.
    #'
    #' @param type type
    #' @param payload Дополнительная информация о причине отклонения товара.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`type` = NULL, `payload` = NULL, ...) {
      if (!is.null(`type`)) {
        if (!(`type` %in% c())) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
      if (!is.null(`payload`)) {
        if (!(is.character(`payload`) && length(`payload`) == 1)) {
          stop(paste("Error! Invalid data for `payload`. Must be a string:", `payload`))
        }
        self$`payload` <- `payload`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferProcessingNoteDTO in JSON format
    #' @export
    toJSON = function() {
      OfferProcessingNoteDTOObject <- list()
      if (!is.null(self$`type`)) {
        OfferProcessingNoteDTOObject[["type"]] <-
          self$`type`$toJSON()
      }
      if (!is.null(self$`payload`)) {
        OfferProcessingNoteDTOObject[["payload"]] <-
          self$`payload`
      }
      OfferProcessingNoteDTOObject
    },
    #' Deserialize JSON string into an instance of OfferProcessingNoteDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferProcessingNoteDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferProcessingNoteDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        `type_object` <- OfferProcessingNoteType$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
      if (!is.null(this_object$`payload`)) {
        self$`payload` <- this_object$`payload`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferProcessingNoteDTO in JSON format
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
        if (!is.null(self$`payload`)) {
          sprintf(
          '"payload":
            "%s"
                    ',
          self$`payload`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OfferProcessingNoteDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferProcessingNoteDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferProcessingNoteDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`type` <- OfferProcessingNoteType$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self$`payload` <- this_object$`payload`
      self
    },
    #' Validate JSON input with respect to OfferProcessingNoteDTO
    #'
    #' @description
    #' Validate JSON input with respect to OfferProcessingNoteDTO and throw an exception if invalid
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
    #' @return String representation of OfferProcessingNoteDTO
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
# OfferProcessingNoteDTO$unlock()
#
## Below is an example to define the print function
# OfferProcessingNoteDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OfferProcessingNoteDTO$lock()

