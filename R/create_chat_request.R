#' Create a new CreateChatRequest
#'
#' @description
#' Заказ, для которого нужно создать чат. 
#'
#' @docType class
#' @title CreateChatRequest
#' @description CreateChatRequest Class
#' @format An \code{R6Class} generator object
#' @field orderId Идентификатор заказа на Маркете. integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateChatRequest <- R6::R6Class(
  "CreateChatRequest",
  public = list(
    `orderId` = NULL,
    #' Initialize a new CreateChatRequest class.
    #'
    #' @description
    #' Initialize a new CreateChatRequest class.
    #'
    #' @param orderId Идентификатор заказа на Маркете.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`orderId`, ...) {
      if (!missing(`orderId`)) {
        if (!(is.numeric(`orderId`) && length(`orderId`) == 1)) {
          stop(paste("Error! Invalid data for `orderId`. Must be an integer:", `orderId`))
        }
        self$`orderId` <- `orderId`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateChatRequest in JSON format
    #' @export
    toJSON = function() {
      CreateChatRequestObject <- list()
      if (!is.null(self$`orderId`)) {
        CreateChatRequestObject[["orderId"]] <-
          self$`orderId`
      }
      CreateChatRequestObject
    },
    #' Deserialize JSON string into an instance of CreateChatRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateChatRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateChatRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`orderId`)) {
        self$`orderId` <- this_object$`orderId`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateChatRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`orderId`)) {
          sprintf(
          '"orderId":
            %d
                    ',
          self$`orderId`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CreateChatRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateChatRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateChatRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`orderId` <- this_object$`orderId`
      self
    },
    #' Validate JSON input with respect to CreateChatRequest
    #'
    #' @description
    #' Validate JSON input with respect to CreateChatRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `orderId`
      if (!is.null(input_json$`orderId`)) {
        if (!(is.numeric(input_json$`orderId`) && length(input_json$`orderId`) == 1)) {
          stop(paste("Error! Invalid data for `orderId`. Must be an integer:", input_json$`orderId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateChatRequest: the required field `orderId` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateChatRequest
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
      # check if the required `orderId` is null
      if (is.null(self$`orderId`)) {
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
      # check if the required `orderId` is null
      if (is.null(self$`orderId`)) {
        invalid_fields["orderId"] <- "Non-nullable required field `orderId` cannot be null."
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
# CreateChatRequest$unlock()
#
## Below is an example to define the print function
# CreateChatRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateChatRequest$lock()

