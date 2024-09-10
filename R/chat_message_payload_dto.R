#' Create a new ChatMessagePayloadDTO
#'
#' @description
#' Информация о приложенных к сообщению файлах.
#'
#' @docType class
#' @title ChatMessagePayloadDTO
#' @description ChatMessagePayloadDTO Class
#' @format An \code{R6Class} generator object
#' @field name Имя файла. character
#' @field url Ссылка для скачивания файла. character
#' @field size Размер файла в байтах. integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ChatMessagePayloadDTO <- R6::R6Class(
  "ChatMessagePayloadDTO",
  public = list(
    `name` = NULL,
    `url` = NULL,
    `size` = NULL,
    #' Initialize a new ChatMessagePayloadDTO class.
    #'
    #' @description
    #' Initialize a new ChatMessagePayloadDTO class.
    #'
    #' @param name Имя файла.
    #' @param url Ссылка для скачивания файла.
    #' @param size Размер файла в байтах.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`name`, `url`, `size`, ...) {
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!missing(`url`)) {
        if (!(is.character(`url`) && length(`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", `url`))
        }
        self$`url` <- `url`
      }
      if (!missing(`size`)) {
        if (!(is.numeric(`size`) && length(`size`) == 1)) {
          stop(paste("Error! Invalid data for `size`. Must be an integer:", `size`))
        }
        self$`size` <- `size`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ChatMessagePayloadDTO in JSON format
    #' @export
    toJSON = function() {
      ChatMessagePayloadDTOObject <- list()
      if (!is.null(self$`name`)) {
        ChatMessagePayloadDTOObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`url`)) {
        ChatMessagePayloadDTOObject[["url"]] <-
          self$`url`
      }
      if (!is.null(self$`size`)) {
        ChatMessagePayloadDTOObject[["size"]] <-
          self$`size`
      }
      ChatMessagePayloadDTOObject
    },
    #' Deserialize JSON string into an instance of ChatMessagePayloadDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ChatMessagePayloadDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatMessagePayloadDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`url`)) {
        self$`url` <- this_object$`url`
      }
      if (!is.null(this_object$`size`)) {
        self$`size` <- this_object$`size`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ChatMessagePayloadDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        },
        if (!is.null(self$`url`)) {
          sprintf(
          '"url":
            "%s"
                    ',
          self$`url`
          )
        },
        if (!is.null(self$`size`)) {
          sprintf(
          '"size":
            %d
                    ',
          self$`size`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ChatMessagePayloadDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ChatMessagePayloadDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatMessagePayloadDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name` <- this_object$`name`
      self$`url` <- this_object$`url`
      self$`size` <- this_object$`size`
      self
    },
    #' Validate JSON input with respect to ChatMessagePayloadDTO
    #'
    #' @description
    #' Validate JSON input with respect to ChatMessagePayloadDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatMessagePayloadDTO: the required field `name` is missing."))
      }
      # check the required field `url`
      if (!is.null(input_json$`url`)) {
        if (!(is.character(input_json$`url`) && length(input_json$`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", input_json$`url`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatMessagePayloadDTO: the required field `url` is missing."))
      }
      # check the required field `size`
      if (!is.null(input_json$`size`)) {
        if (!(is.numeric(input_json$`size`) && length(input_json$`size`) == 1)) {
          stop(paste("Error! Invalid data for `size`. Must be an integer:", input_json$`size`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatMessagePayloadDTO: the required field `size` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ChatMessagePayloadDTO
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
      # check if the required `name` is null
      if (is.null(self$`name`)) {
        return(FALSE)
      }

      # check if the required `url` is null
      if (is.null(self$`url`)) {
        return(FALSE)
      }

      # check if the required `size` is null
      if (is.null(self$`size`)) {
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
      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
      }

      # check if the required `url` is null
      if (is.null(self$`url`)) {
        invalid_fields["url"] <- "Non-nullable required field `url` cannot be null."
      }

      # check if the required `size` is null
      if (is.null(self$`size`)) {
        invalid_fields["size"] <- "Non-nullable required field `size` cannot be null."
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
# ChatMessagePayloadDTO$unlock()
#
## Below is an example to define the print function
# ChatMessagePayloadDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ChatMessagePayloadDTO$lock()

