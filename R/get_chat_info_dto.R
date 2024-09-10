#' Create a new GetChatInfoDTO
#'
#' @description
#' Информация о чатах.
#'
#' @docType class
#' @title GetChatInfoDTO
#' @description GetChatInfoDTO Class
#' @format An \code{R6Class} generator object
#' @field chatId Идентификатор чата. integer
#' @field orderId Идентификатор заказа. integer
#' @field type  \link{ChatType}
#' @field status  \link{ChatStatusType}
#' @field createdAt Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. character
#' @field updatedAt Дата и время последнего сообщения в чате. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetChatInfoDTO <- R6::R6Class(
  "GetChatInfoDTO",
  public = list(
    `chatId` = NULL,
    `orderId` = NULL,
    `type` = NULL,
    `status` = NULL,
    `createdAt` = NULL,
    `updatedAt` = NULL,
    #' Initialize a new GetChatInfoDTO class.
    #'
    #' @description
    #' Initialize a new GetChatInfoDTO class.
    #'
    #' @param chatId Идентификатор чата.
    #' @param orderId Идентификатор заказа.
    #' @param type type
    #' @param status status
    #' @param createdAt Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.
    #' @param updatedAt Дата и время последнего сообщения в чате.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`chatId`, `orderId`, `type`, `status`, `createdAt`, `updatedAt`, ...) {
      if (!missing(`chatId`)) {
        if (!(is.numeric(`chatId`) && length(`chatId`) == 1)) {
          stop(paste("Error! Invalid data for `chatId`. Must be an integer:", `chatId`))
        }
        self$`chatId` <- `chatId`
      }
      if (!missing(`orderId`)) {
        if (!(is.numeric(`orderId`) && length(`orderId`) == 1)) {
          stop(paste("Error! Invalid data for `orderId`. Must be an integer:", `orderId`))
        }
        self$`orderId` <- `orderId`
      }
      if (!missing(`type`)) {
        if (!(`type` %in% c())) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
      if (!missing(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!missing(`createdAt`)) {
        if (!(is.character(`createdAt`) && length(`createdAt`) == 1)) {
          stop(paste("Error! Invalid data for `createdAt`. Must be a string:", `createdAt`))
        }
        self$`createdAt` <- `createdAt`
      }
      if (!missing(`updatedAt`)) {
        if (!(is.character(`updatedAt`) && length(`updatedAt`) == 1)) {
          stop(paste("Error! Invalid data for `updatedAt`. Must be a string:", `updatedAt`))
        }
        self$`updatedAt` <- `updatedAt`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetChatInfoDTO in JSON format
    #' @export
    toJSON = function() {
      GetChatInfoDTOObject <- list()
      if (!is.null(self$`chatId`)) {
        GetChatInfoDTOObject[["chatId"]] <-
          self$`chatId`
      }
      if (!is.null(self$`orderId`)) {
        GetChatInfoDTOObject[["orderId"]] <-
          self$`orderId`
      }
      if (!is.null(self$`type`)) {
        GetChatInfoDTOObject[["type"]] <-
          self$`type`$toJSON()
      }
      if (!is.null(self$`status`)) {
        GetChatInfoDTOObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`createdAt`)) {
        GetChatInfoDTOObject[["createdAt"]] <-
          self$`createdAt`
      }
      if (!is.null(self$`updatedAt`)) {
        GetChatInfoDTOObject[["updatedAt"]] <-
          self$`updatedAt`
      }
      GetChatInfoDTOObject
    },
    #' Deserialize JSON string into an instance of GetChatInfoDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetChatInfoDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetChatInfoDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`chatId`)) {
        self$`chatId` <- this_object$`chatId`
      }
      if (!is.null(this_object$`orderId`)) {
        self$`orderId` <- this_object$`orderId`
      }
      if (!is.null(this_object$`type`)) {
        `type_object` <- ChatType$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- ChatStatusType$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`createdAt`)) {
        self$`createdAt` <- this_object$`createdAt`
      }
      if (!is.null(this_object$`updatedAt`)) {
        self$`updatedAt` <- this_object$`updatedAt`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetChatInfoDTO in JSON format
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
        },
        if (!is.null(self$`orderId`)) {
          sprintf(
          '"orderId":
            %d
                    ',
          self$`orderId`
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
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
          %s
          ',
          jsonlite::toJSON(self$`status`$toJSON(), auto_unbox = TRUE, digits = NA)
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
        if (!is.null(self$`updatedAt`)) {
          sprintf(
          '"updatedAt":
            "%s"
                    ',
          self$`updatedAt`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetChatInfoDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetChatInfoDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetChatInfoDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`chatId` <- this_object$`chatId`
      self$`orderId` <- this_object$`orderId`
      self$`type` <- ChatType$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self$`status` <- ChatStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`createdAt` <- this_object$`createdAt`
      self$`updatedAt` <- this_object$`updatedAt`
      self
    },
    #' Validate JSON input with respect to GetChatInfoDTO
    #'
    #' @description
    #' Validate JSON input with respect to GetChatInfoDTO and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for GetChatInfoDTO: the required field `chatId` is missing."))
      }
      # check the required field `orderId`
      if (!is.null(input_json$`orderId`)) {
        if (!(is.numeric(input_json$`orderId`) && length(input_json$`orderId`) == 1)) {
          stop(paste("Error! Invalid data for `orderId`. Must be an integer:", input_json$`orderId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetChatInfoDTO: the required field `orderId` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        stopifnot(R6::is.R6(input_json$`type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetChatInfoDTO: the required field `type` is missing."))
      }
      # check the required field `status`
      if (!is.null(input_json$`status`)) {
        stopifnot(R6::is.R6(input_json$`status`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetChatInfoDTO: the required field `status` is missing."))
      }
      # check the required field `createdAt`
      if (!is.null(input_json$`createdAt`)) {
        if (!(is.character(input_json$`createdAt`) && length(input_json$`createdAt`) == 1)) {
          stop(paste("Error! Invalid data for `createdAt`. Must be a string:", input_json$`createdAt`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetChatInfoDTO: the required field `createdAt` is missing."))
      }
      # check the required field `updatedAt`
      if (!is.null(input_json$`updatedAt`)) {
        if (!(is.character(input_json$`updatedAt`) && length(input_json$`updatedAt`) == 1)) {
          stop(paste("Error! Invalid data for `updatedAt`. Must be a string:", input_json$`updatedAt`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetChatInfoDTO: the required field `updatedAt` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetChatInfoDTO
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

      # check if the required `orderId` is null
      if (is.null(self$`orderId`)) {
        return(FALSE)
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        return(FALSE)
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        return(FALSE)
      }

      # check if the required `createdAt` is null
      if (is.null(self$`createdAt`)) {
        return(FALSE)
      }

      # check if the required `updatedAt` is null
      if (is.null(self$`updatedAt`)) {
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

      # check if the required `orderId` is null
      if (is.null(self$`orderId`)) {
        invalid_fields["orderId"] <- "Non-nullable required field `orderId` cannot be null."
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        invalid_fields["status"] <- "Non-nullable required field `status` cannot be null."
      }

      # check if the required `createdAt` is null
      if (is.null(self$`createdAt`)) {
        invalid_fields["createdAt"] <- "Non-nullable required field `createdAt` cannot be null."
      }

      # check if the required `updatedAt` is null
      if (is.null(self$`updatedAt`)) {
        invalid_fields["updatedAt"] <- "Non-nullable required field `updatedAt` cannot be null."
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
# GetChatInfoDTO$unlock()
#
## Below is an example to define the print function
# GetChatInfoDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetChatInfoDTO$lock()

