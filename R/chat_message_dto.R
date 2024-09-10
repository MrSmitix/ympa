#' Create a new ChatMessageDTO
#'
#' @description
#' Информация о сообщениях.
#'
#' @docType class
#' @title ChatMessageDTO
#' @description ChatMessageDTO Class
#' @format An \code{R6Class} generator object
#' @field messageId Идентификатор сообщения. integer
#' @field createdAt Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. character
#' @field sender  \link{ChatMessageSenderType}
#' @field message Текст сообщения.  Необязательный параметр, если возвращается параметр `payload`. character [optional]
#' @field payload Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр `message`. list(\link{ChatMessagePayloadDTO}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ChatMessageDTO <- R6::R6Class(
  "ChatMessageDTO",
  public = list(
    `messageId` = NULL,
    `createdAt` = NULL,
    `sender` = NULL,
    `message` = NULL,
    `payload` = NULL,
    #' Initialize a new ChatMessageDTO class.
    #'
    #' @description
    #' Initialize a new ChatMessageDTO class.
    #'
    #' @param messageId Идентификатор сообщения.
    #' @param createdAt Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.
    #' @param sender sender
    #' @param message Текст сообщения.  Необязательный параметр, если возвращается параметр `payload`.
    #' @param payload Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр `message`.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`messageId`, `createdAt`, `sender`, `message` = NULL, `payload` = NULL, ...) {
      if (!missing(`messageId`)) {
        if (!(is.numeric(`messageId`) && length(`messageId`) == 1)) {
          stop(paste("Error! Invalid data for `messageId`. Must be an integer:", `messageId`))
        }
        self$`messageId` <- `messageId`
      }
      if (!missing(`createdAt`)) {
        if (!(is.character(`createdAt`) && length(`createdAt`) == 1)) {
          stop(paste("Error! Invalid data for `createdAt`. Must be a string:", `createdAt`))
        }
        self$`createdAt` <- `createdAt`
      }
      if (!missing(`sender`)) {
        if (!(`sender` %in% c())) {
          stop(paste("Error! \"", `sender`, "\" cannot be assigned to `sender`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`sender`))
        self$`sender` <- `sender`
      }
      if (!is.null(`message`)) {
        if (!(is.character(`message`) && length(`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", `message`))
        }
        self$`message` <- `message`
      }
      if (!is.null(`payload`)) {
        stopifnot(is.vector(`payload`), length(`payload`) != 0)
        sapply(`payload`, function(x) stopifnot(R6::is.R6(x)))
        self$`payload` <- `payload`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ChatMessageDTO in JSON format
    #' @export
    toJSON = function() {
      ChatMessageDTOObject <- list()
      if (!is.null(self$`messageId`)) {
        ChatMessageDTOObject[["messageId"]] <-
          self$`messageId`
      }
      if (!is.null(self$`createdAt`)) {
        ChatMessageDTOObject[["createdAt"]] <-
          self$`createdAt`
      }
      if (!is.null(self$`sender`)) {
        ChatMessageDTOObject[["sender"]] <-
          self$`sender`$toJSON()
      }
      if (!is.null(self$`message`)) {
        ChatMessageDTOObject[["message"]] <-
          self$`message`
      }
      if (!is.null(self$`payload`)) {
        ChatMessageDTOObject[["payload"]] <-
          lapply(self$`payload`, function(x) x$toJSON())
      }
      ChatMessageDTOObject
    },
    #' Deserialize JSON string into an instance of ChatMessageDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ChatMessageDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatMessageDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`messageId`)) {
        self$`messageId` <- this_object$`messageId`
      }
      if (!is.null(this_object$`createdAt`)) {
        self$`createdAt` <- this_object$`createdAt`
      }
      if (!is.null(this_object$`sender`)) {
        `sender_object` <- ChatMessageSenderType$new()
        `sender_object`$fromJSON(jsonlite::toJSON(this_object$`sender`, auto_unbox = TRUE, digits = NA))
        self$`sender` <- `sender_object`
      }
      if (!is.null(this_object$`message`)) {
        self$`message` <- this_object$`message`
      }
      if (!is.null(this_object$`payload`)) {
        self$`payload` <- ApiClient$new()$deserializeObj(this_object$`payload`, "array[ChatMessagePayloadDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ChatMessageDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`messageId`)) {
          sprintf(
          '"messageId":
            %d
                    ',
          self$`messageId`
          )
        },
        if (!is.null(self$`createdAt`)) {
          sprintf(
          '"createdAt":
            "%s"
                    ',
          self$`createdAt`
          )
        },
        if (!is.null(self$`sender`)) {
          sprintf(
          '"sender":
          %s
          ',
          jsonlite::toJSON(self$`sender`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`message`)) {
          sprintf(
          '"message":
            "%s"
                    ',
          self$`message`
          )
        },
        if (!is.null(self$`payload`)) {
          sprintf(
          '"payload":
          [%s]
',
          paste(sapply(self$`payload`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ChatMessageDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ChatMessageDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatMessageDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`messageId` <- this_object$`messageId`
      self$`createdAt` <- this_object$`createdAt`
      self$`sender` <- ChatMessageSenderType$new()$fromJSON(jsonlite::toJSON(this_object$`sender`, auto_unbox = TRUE, digits = NA))
      self$`message` <- this_object$`message`
      self$`payload` <- ApiClient$new()$deserializeObj(this_object$`payload`, "array[ChatMessagePayloadDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to ChatMessageDTO
    #'
    #' @description
    #' Validate JSON input with respect to ChatMessageDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `messageId`
      if (!is.null(input_json$`messageId`)) {
        if (!(is.numeric(input_json$`messageId`) && length(input_json$`messageId`) == 1)) {
          stop(paste("Error! Invalid data for `messageId`. Must be an integer:", input_json$`messageId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatMessageDTO: the required field `messageId` is missing."))
      }
      # check the required field `createdAt`
      if (!is.null(input_json$`createdAt`)) {
        if (!(is.character(input_json$`createdAt`) && length(input_json$`createdAt`) == 1)) {
          stop(paste("Error! Invalid data for `createdAt`. Must be a string:", input_json$`createdAt`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatMessageDTO: the required field `createdAt` is missing."))
      }
      # check the required field `sender`
      if (!is.null(input_json$`sender`)) {
        stopifnot(R6::is.R6(input_json$`sender`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatMessageDTO: the required field `sender` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ChatMessageDTO
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
      # check if the required `messageId` is null
      if (is.null(self$`messageId`)) {
        return(FALSE)
      }

      # check if the required `createdAt` is null
      if (is.null(self$`createdAt`)) {
        return(FALSE)
      }

      # check if the required `sender` is null
      if (is.null(self$`sender`)) {
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
      # check if the required `messageId` is null
      if (is.null(self$`messageId`)) {
        invalid_fields["messageId"] <- "Non-nullable required field `messageId` cannot be null."
      }

      # check if the required `createdAt` is null
      if (is.null(self$`createdAt`)) {
        invalid_fields["createdAt"] <- "Non-nullable required field `createdAt` cannot be null."
      }

      # check if the required `sender` is null
      if (is.null(self$`sender`)) {
        invalid_fields["sender"] <- "Non-nullable required field `sender` cannot be null."
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
# ChatMessageDTO$unlock()
#
## Below is an example to define the print function
# ChatMessageDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ChatMessageDTO$lock()

