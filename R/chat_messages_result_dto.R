#' Create a new ChatMessagesResultDTO
#'
#' @description
#' Информация о сообщениях.
#'
#' @docType class
#' @title ChatMessagesResultDTO
#' @description ChatMessagesResultDTO Class
#' @format An \code{R6Class} generator object
#' @field orderId Идентификатор заказа. integer
#' @field messages Информация о сообщениях. list(\link{ChatMessageDTO})
#' @field paging  \link{ForwardScrollingPagerDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ChatMessagesResultDTO <- R6::R6Class(
  "ChatMessagesResultDTO",
  public = list(
    `orderId` = NULL,
    `messages` = NULL,
    `paging` = NULL,
    #' Initialize a new ChatMessagesResultDTO class.
    #'
    #' @description
    #' Initialize a new ChatMessagesResultDTO class.
    #'
    #' @param orderId Идентификатор заказа.
    #' @param messages Информация о сообщениях.
    #' @param paging paging
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`orderId`, `messages`, `paging` = NULL, ...) {
      if (!missing(`orderId`)) {
        if (!(is.numeric(`orderId`) && length(`orderId`) == 1)) {
          stop(paste("Error! Invalid data for `orderId`. Must be an integer:", `orderId`))
        }
        self$`orderId` <- `orderId`
      }
      if (!missing(`messages`)) {
        stopifnot(is.vector(`messages`), length(`messages`) != 0)
        sapply(`messages`, function(x) stopifnot(R6::is.R6(x)))
        self$`messages` <- `messages`
      }
      if (!is.null(`paging`)) {
        stopifnot(R6::is.R6(`paging`))
        self$`paging` <- `paging`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ChatMessagesResultDTO in JSON format
    #' @export
    toJSON = function() {
      ChatMessagesResultDTOObject <- list()
      if (!is.null(self$`orderId`)) {
        ChatMessagesResultDTOObject[["orderId"]] <-
          self$`orderId`
      }
      if (!is.null(self$`messages`)) {
        ChatMessagesResultDTOObject[["messages"]] <-
          lapply(self$`messages`, function(x) x$toJSON())
      }
      if (!is.null(self$`paging`)) {
        ChatMessagesResultDTOObject[["paging"]] <-
          self$`paging`$toJSON()
      }
      ChatMessagesResultDTOObject
    },
    #' Deserialize JSON string into an instance of ChatMessagesResultDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ChatMessagesResultDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatMessagesResultDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`orderId`)) {
        self$`orderId` <- this_object$`orderId`
      }
      if (!is.null(this_object$`messages`)) {
        self$`messages` <- ApiClient$new()$deserializeObj(this_object$`messages`, "array[ChatMessageDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`paging`)) {
        `paging_object` <- ForwardScrollingPagerDTO$new()
        `paging_object`$fromJSON(jsonlite::toJSON(this_object$`paging`, auto_unbox = TRUE, digits = NA))
        self$`paging` <- `paging_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ChatMessagesResultDTO in JSON format
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
        },
        if (!is.null(self$`messages`)) {
          sprintf(
          '"messages":
          [%s]
',
          paste(sapply(self$`messages`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`paging`)) {
          sprintf(
          '"paging":
          %s
          ',
          jsonlite::toJSON(self$`paging`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ChatMessagesResultDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ChatMessagesResultDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatMessagesResultDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`orderId` <- this_object$`orderId`
      self$`messages` <- ApiClient$new()$deserializeObj(this_object$`messages`, "array[ChatMessageDTO]", loadNamespace("ympa_r_client"))
      self$`paging` <- ForwardScrollingPagerDTO$new()$fromJSON(jsonlite::toJSON(this_object$`paging`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to ChatMessagesResultDTO
    #'
    #' @description
    #' Validate JSON input with respect to ChatMessagesResultDTO and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for ChatMessagesResultDTO: the required field `orderId` is missing."))
      }
      # check the required field `messages`
      if (!is.null(input_json$`messages`)) {
        stopifnot(is.vector(input_json$`messages`), length(input_json$`messages`) != 0)
        tmp <- sapply(input_json$`messages`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatMessagesResultDTO: the required field `messages` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ChatMessagesResultDTO
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

      # check if the required `messages` is null
      if (is.null(self$`messages`)) {
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

      # check if the required `messages` is null
      if (is.null(self$`messages`)) {
        invalid_fields["messages"] <- "Non-nullable required field `messages` cannot be null."
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
# ChatMessagesResultDTO$unlock()
#
## Below is an example to define the print function
# ChatMessagesResultDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ChatMessagesResultDTO$lock()

