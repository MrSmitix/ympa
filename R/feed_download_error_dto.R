#' Create a new FeedDownloadErrorDTO
#'
#' @description
#' Информация об ошибке при загрузке прайс-листа. Выводится, если параметр `download status=ERROR`. 
#'
#' @docType class
#' @title FeedDownloadErrorDTO
#' @description FeedDownloadErrorDTO Class
#' @format An \code{R6Class} generator object
#' @field httpStatusCode HTTP-код ошибки индексации прайс-листа. Выводится, если `type=DOWNLOAD_HTTP_ERROR`. integer [optional]
#' @field type  \link{FeedDownloadErrorType} [optional]
#' @field description Описание ошибки. Выводится, если `type=DOWNLOAD_ERROR`. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FeedDownloadErrorDTO <- R6::R6Class(
  "FeedDownloadErrorDTO",
  public = list(
    `httpStatusCode` = NULL,
    `type` = NULL,
    `description` = NULL,
    #' Initialize a new FeedDownloadErrorDTO class.
    #'
    #' @description
    #' Initialize a new FeedDownloadErrorDTO class.
    #'
    #' @param httpStatusCode HTTP-код ошибки индексации прайс-листа. Выводится, если `type=DOWNLOAD_HTTP_ERROR`.
    #' @param type type
    #' @param description Описание ошибки. Выводится, если `type=DOWNLOAD_ERROR`.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`httpStatusCode` = NULL, `type` = NULL, `description` = NULL, ...) {
      if (!is.null(`httpStatusCode`)) {
        if (!(is.numeric(`httpStatusCode`) && length(`httpStatusCode`) == 1)) {
          stop(paste("Error! Invalid data for `httpStatusCode`. Must be an integer:", `httpStatusCode`))
        }
        self$`httpStatusCode` <- `httpStatusCode`
      }
      if (!is.null(`type`)) {
        if (!(`type` %in% c())) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedDownloadErrorDTO in JSON format
    #' @export
    toJSON = function() {
      FeedDownloadErrorDTOObject <- list()
      if (!is.null(self$`httpStatusCode`)) {
        FeedDownloadErrorDTOObject[["httpStatusCode"]] <-
          self$`httpStatusCode`
      }
      if (!is.null(self$`type`)) {
        FeedDownloadErrorDTOObject[["type"]] <-
          self$`type`$toJSON()
      }
      if (!is.null(self$`description`)) {
        FeedDownloadErrorDTOObject[["description"]] <-
          self$`description`
      }
      FeedDownloadErrorDTOObject
    },
    #' Deserialize JSON string into an instance of FeedDownloadErrorDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedDownloadErrorDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedDownloadErrorDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`httpStatusCode`)) {
        self$`httpStatusCode` <- this_object$`httpStatusCode`
      }
      if (!is.null(this_object$`type`)) {
        `type_object` <- FeedDownloadErrorType$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedDownloadErrorDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`httpStatusCode`)) {
          sprintf(
          '"httpStatusCode":
            %d
                    ',
          self$`httpStatusCode`
          )
        },
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
          %s
          ',
          jsonlite::toJSON(self$`type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`description`)) {
          sprintf(
          '"description":
            "%s"
                    ',
          self$`description`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of FeedDownloadErrorDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedDownloadErrorDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedDownloadErrorDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`httpStatusCode` <- this_object$`httpStatusCode`
      self$`type` <- FeedDownloadErrorType$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self$`description` <- this_object$`description`
      self
    },
    #' Validate JSON input with respect to FeedDownloadErrorDTO
    #'
    #' @description
    #' Validate JSON input with respect to FeedDownloadErrorDTO and throw an exception if invalid
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
    #' @return String representation of FeedDownloadErrorDTO
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
# FeedDownloadErrorDTO$unlock()
#
## Below is an example to define the print function
# FeedDownloadErrorDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FeedDownloadErrorDTO$lock()

