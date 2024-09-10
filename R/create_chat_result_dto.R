#' Create a new CreateChatResultDTO
#'
#' @description
#' Информация о созданном чате.
#'
#' @docType class
#' @title CreateChatResultDTO
#' @description CreateChatResultDTO Class
#' @format An \code{R6Class} generator object
#' @field chatId Идентификатор чата. integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateChatResultDTO <- R6::R6Class(
  "CreateChatResultDTO",
  public = list(
    `chatId` = NULL,
    #' Initialize a new CreateChatResultDTO class.
    #'
    #' @description
    #' Initialize a new CreateChatResultDTO class.
    #'
    #' @param chatId Идентификатор чата.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`chatId`, ...) {
      if (!missing(`chatId`)) {
        if (!(is.numeric(`chatId`) && length(`chatId`) == 1)) {
          stop(paste("Error! Invalid data for `chatId`. Must be an integer:", `chatId`))
        }
        self$`chatId` <- `chatId`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateChatResultDTO in JSON format
    #' @export
    toJSON = function() {
      CreateChatResultDTOObject <- list()
      if (!is.null(self$`chatId`)) {
        CreateChatResultDTOObject[["chatId"]] <-
          self$`chatId`
      }
      CreateChatResultDTOObject
    },
    #' Deserialize JSON string into an instance of CreateChatResultDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateChatResultDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateChatResultDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`chatId`)) {
        self$`chatId` <- this_object$`chatId`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateChatResultDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`chatId`)) {
          sprintf(
          '"chatId":
            %d
                    ',
          self$`chatId`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CreateChatResultDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateChatResultDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateChatResultDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`chatId` <- this_object$`chatId`
      self
    },
    #' Validate JSON input with respect to CreateChatResultDTO
    #'
    #' @description
    #' Validate JSON input with respect to CreateChatResultDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `chatId`
      if (!is.null(input_json$`chatId`)) {
        if (!(is.numeric(input_json$`chatId`) && length(input_json$`chatId`) == 1)) {
          stop(paste("Error! Invalid data for `chatId`. Must be an integer:", input_json$`chatId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateChatResultDTO: the required field `chatId` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateChatResultDTO
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
      # check if the required `chatId` is null
      if (is.null(self$`chatId`)) {
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
      # check if the required `chatId` is null
      if (is.null(self$`chatId`)) {
        invalid_fields["chatId"] <- "Non-nullable required field `chatId` cannot be null."
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
# CreateChatResultDTO$unlock()
#
## Below is an example to define the print function
# CreateChatResultDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateChatResultDTO$lock()

