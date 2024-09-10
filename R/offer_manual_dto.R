#' Create a new OfferManualDTO
#'
#' @description
#' Инструкция по использованию товара. 
#'
#' @docType class
#' @title OfferManualDTO
#' @description OfferManualDTO Class
#' @format An \code{R6Class} generator object
#' @field url Ссылка на инструкцию. character
#' @field title Название инструкции, которое будет отображаться на карточке товара. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OfferManualDTO <- R6::R6Class(
  "OfferManualDTO",
  public = list(
    `url` = NULL,
    `title` = NULL,
    #' Initialize a new OfferManualDTO class.
    #'
    #' @description
    #' Initialize a new OfferManualDTO class.
    #'
    #' @param url Ссылка на инструкцию.
    #' @param title Название инструкции, которое будет отображаться на карточке товара.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`url`, `title` = NULL, ...) {
      if (!missing(`url`)) {
        if (!(is.character(`url`) && length(`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", `url`))
        }
        self$`url` <- `url`
      }
      if (!is.null(`title`)) {
        if (!(is.character(`title`) && length(`title`) == 1)) {
          stop(paste("Error! Invalid data for `title`. Must be a string:", `title`))
        }
        self$`title` <- `title`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferManualDTO in JSON format
    #' @export
    toJSON = function() {
      OfferManualDTOObject <- list()
      if (!is.null(self$`url`)) {
        OfferManualDTOObject[["url"]] <-
          self$`url`
      }
      if (!is.null(self$`title`)) {
        OfferManualDTOObject[["title"]] <-
          self$`title`
      }
      OfferManualDTOObject
    },
    #' Deserialize JSON string into an instance of OfferManualDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferManualDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferManualDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`url`)) {
        self$`url` <- this_object$`url`
      }
      if (!is.null(this_object$`title`)) {
        self$`title` <- this_object$`title`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferManualDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`url`)) {
          sprintf(
          '"url":
            "%s"
                    ',
          self$`url`
          )
        },
        if (!is.null(self$`title`)) {
          sprintf(
          '"title":
            "%s"
                    ',
          self$`title`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OfferManualDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferManualDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferManualDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`url` <- this_object$`url`
      self$`title` <- this_object$`title`
      self
    },
    #' Validate JSON input with respect to OfferManualDTO
    #'
    #' @description
    #' Validate JSON input with respect to OfferManualDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `url`
      if (!is.null(input_json$`url`)) {
        if (!(is.character(input_json$`url`) && length(input_json$`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", input_json$`url`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OfferManualDTO: the required field `url` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OfferManualDTO
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
      # check if the required `url` is null
      if (is.null(self$`url`)) {
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
      # check if the required `url` is null
      if (is.null(self$`url`)) {
        invalid_fields["url"] <- "Non-nullable required field `url` cannot be null."
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
# OfferManualDTO$unlock()
#
## Below is an example to define the print function
# OfferManualDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OfferManualDTO$lock()

