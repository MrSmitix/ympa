#' Create a new OfferProcessingStateDTO
#'
#' @description
#' Информация о статусе публикации товара на Маркете.
#'
#' @docType class
#' @title OfferProcessingStateDTO
#' @description OfferProcessingStateDTO Class
#' @format An \code{R6Class} generator object
#' @field status  \link{OfferProcessingStatusType} [optional]
#' @field notes Причины, по которым товар не прошел модерацию. list(\link{OfferProcessingNoteDTO}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OfferProcessingStateDTO <- R6::R6Class(
  "OfferProcessingStateDTO",
  public = list(
    `status` = NULL,
    `notes` = NULL,
    #' Initialize a new OfferProcessingStateDTO class.
    #'
    #' @description
    #' Initialize a new OfferProcessingStateDTO class.
    #'
    #' @param status status
    #' @param notes Причины, по которым товар не прошел модерацию.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`status` = NULL, `notes` = NULL, ...) {
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`notes`)) {
        stopifnot(is.vector(`notes`), length(`notes`) != 0)
        sapply(`notes`, function(x) stopifnot(R6::is.R6(x)))
        self$`notes` <- `notes`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferProcessingStateDTO in JSON format
    #' @export
    toJSON = function() {
      OfferProcessingStateDTOObject <- list()
      if (!is.null(self$`status`)) {
        OfferProcessingStateDTOObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`notes`)) {
        OfferProcessingStateDTOObject[["notes"]] <-
          lapply(self$`notes`, function(x) x$toJSON())
      }
      OfferProcessingStateDTOObject
    },
    #' Deserialize JSON string into an instance of OfferProcessingStateDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferProcessingStateDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferProcessingStateDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`status`)) {
        `status_object` <- OfferProcessingStatusType$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`notes`)) {
        self$`notes` <- ApiClient$new()$deserializeObj(this_object$`notes`, "array[OfferProcessingNoteDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferProcessingStateDTO in JSON format
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
        if (!is.null(self$`notes`)) {
          sprintf(
          '"notes":
          [%s]
',
          paste(sapply(self$`notes`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OfferProcessingStateDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferProcessingStateDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferProcessingStateDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`status` <- OfferProcessingStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`notes` <- ApiClient$new()$deserializeObj(this_object$`notes`, "array[OfferProcessingNoteDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to OfferProcessingStateDTO
    #'
    #' @description
    #' Validate JSON input with respect to OfferProcessingStateDTO and throw an exception if invalid
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
    #' @return String representation of OfferProcessingStateDTO
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
# OfferProcessingStateDTO$unlock()
#
## Below is an example to define the print function
# OfferProcessingStateDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OfferProcessingStateDTO$lock()

