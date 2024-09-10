#' Create a new GetChatsInfoDTO
#'
#' @description
#' Список чатов.
#'
#' @docType class
#' @title GetChatsInfoDTO
#' @description GetChatsInfoDTO Class
#' @format An \code{R6Class} generator object
#' @field chats Информация о чатах. list(\link{GetChatInfoDTO})
#' @field paging  \link{ForwardScrollingPagerDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetChatsInfoDTO <- R6::R6Class(
  "GetChatsInfoDTO",
  public = list(
    `chats` = NULL,
    `paging` = NULL,
    #' Initialize a new GetChatsInfoDTO class.
    #'
    #' @description
    #' Initialize a new GetChatsInfoDTO class.
    #'
    #' @param chats Информация о чатах.
    #' @param paging paging
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`chats`, `paging` = NULL, ...) {
      if (!missing(`chats`)) {
        stopifnot(is.vector(`chats`), length(`chats`) != 0)
        sapply(`chats`, function(x) stopifnot(R6::is.R6(x)))
        self$`chats` <- `chats`
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
    #' @return GetChatsInfoDTO in JSON format
    #' @export
    toJSON = function() {
      GetChatsInfoDTOObject <- list()
      if (!is.null(self$`chats`)) {
        GetChatsInfoDTOObject[["chats"]] <-
          lapply(self$`chats`, function(x) x$toJSON())
      }
      if (!is.null(self$`paging`)) {
        GetChatsInfoDTOObject[["paging"]] <-
          self$`paging`$toJSON()
      }
      GetChatsInfoDTOObject
    },
    #' Deserialize JSON string into an instance of GetChatsInfoDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetChatsInfoDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetChatsInfoDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`chats`)) {
        self$`chats` <- ApiClient$new()$deserializeObj(this_object$`chats`, "array[GetChatInfoDTO]", loadNamespace("ympa_r_client"))
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
    #' @return GetChatsInfoDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`chats`)) {
          sprintf(
          '"chats":
          [%s]
',
          paste(sapply(self$`chats`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
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
    #' Deserialize JSON string into an instance of GetChatsInfoDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetChatsInfoDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetChatsInfoDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`chats` <- ApiClient$new()$deserializeObj(this_object$`chats`, "array[GetChatInfoDTO]", loadNamespace("ympa_r_client"))
      self$`paging` <- ForwardScrollingPagerDTO$new()$fromJSON(jsonlite::toJSON(this_object$`paging`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to GetChatsInfoDTO
    #'
    #' @description
    #' Validate JSON input with respect to GetChatsInfoDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `chats`
      if (!is.null(input_json$`chats`)) {
        stopifnot(is.vector(input_json$`chats`), length(input_json$`chats`) != 0)
        tmp <- sapply(input_json$`chats`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetChatsInfoDTO: the required field `chats` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetChatsInfoDTO
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
      # check if the required `chats` is null
      if (is.null(self$`chats`)) {
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
      # check if the required `chats` is null
      if (is.null(self$`chats`)) {
        invalid_fields["chats"] <- "Non-nullable required field `chats` cannot be null."
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
# GetChatsInfoDTO$unlock()
#
## Below is an example to define the print function
# GetChatsInfoDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetChatsInfoDTO$lock()

