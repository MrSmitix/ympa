#' Create a new SendMessageToChatRequest
#'
#' @description
#' В какой чат нужно отправить сообщение и текст сообщения.
#'
#' @docType class
#' @title SendMessageToChatRequest
#' @description SendMessageToChatRequest Class
#' @format An \code{R6Class} generator object
#' @field message Текст сообщения. Максимальная длина — 4096 символа. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SendMessageToChatRequest <- R6::R6Class(
  "SendMessageToChatRequest",
  public = list(
    `message` = NULL,
    #' Initialize a new SendMessageToChatRequest class.
    #'
    #' @description
    #' Initialize a new SendMessageToChatRequest class.
    #'
    #' @param message Текст сообщения. Максимальная длина — 4096 символа.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`message`, ...) {
      if (!missing(`message`)) {
        if (!(is.character(`message`) && length(`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", `message`))
        }
        self$`message` <- `message`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SendMessageToChatRequest in JSON format
    #' @export
    toJSON = function() {
      SendMessageToChatRequestObject <- list()
      if (!is.null(self$`message`)) {
        SendMessageToChatRequestObject[["message"]] <-
          self$`message`
      }
      SendMessageToChatRequestObject
    },
    #' Deserialize JSON string into an instance of SendMessageToChatRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of SendMessageToChatRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of SendMessageToChatRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`message`)) {
        self$`message` <- this_object$`message`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SendMessageToChatRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`message`)) {
          sprintf(
          '"message":
            "%s"
                    ',
          self$`message`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of SendMessageToChatRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of SendMessageToChatRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of SendMessageToChatRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`message` <- this_object$`message`
      self
    },
    #' Validate JSON input with respect to SendMessageToChatRequest
    #'
    #' @description
    #' Validate JSON input with respect to SendMessageToChatRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `message`
      if (!is.null(input_json$`message`)) {
        if (!(is.character(input_json$`message`) && length(input_json$`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", input_json$`message`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SendMessageToChatRequest: the required field `message` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SendMessageToChatRequest
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
      # check if the required `message` is null
      if (is.null(self$`message`)) {
        return(FALSE)
      }

      if (nchar(self$`message`) > 4096) {
        return(FALSE)
      }
      if (nchar(self$`message`) < 1) {
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
      # check if the required `message` is null
      if (is.null(self$`message`)) {
        invalid_fields["message"] <- "Non-nullable required field `message` cannot be null."
      }

      if (nchar(self$`message`) > 4096) {
        invalid_fields["message"] <- "Invalid length for `message`, must be smaller than or equal to 4096."
      }
      if (nchar(self$`message`) < 1) {
        invalid_fields["message"] <- "Invalid length for `message`, must be bigger than or equal to 1."
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
# SendMessageToChatRequest$unlock()
#
## Below is an example to define the print function
# SendMessageToChatRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SendMessageToChatRequest$lock()

