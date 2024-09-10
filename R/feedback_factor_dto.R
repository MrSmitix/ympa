#' Create a new FeedbackFactorDTO
#'
#' @description
#' Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. 
#'
#' @docType class
#' @title FeedbackFactorDTO
#' @description FeedbackFactorDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор параметра. integer [optional]
#' @field title Название параметра. Например, `Скорость обработки заказа`. character [optional]
#' @field description Описание параметра. Например, `Как быстро с вами связались для подтверждения заказа?`. character [optional]
#' @field value Оценка по параметру, указанная в отзыве: от `1` (низшая оценка) до `5` (высшая оценка). integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FeedbackFactorDTO <- R6::R6Class(
  "FeedbackFactorDTO",
  public = list(
    `id` = NULL,
    `title` = NULL,
    `description` = NULL,
    `value` = NULL,
    #' Initialize a new FeedbackFactorDTO class.
    #'
    #' @description
    #' Initialize a new FeedbackFactorDTO class.
    #'
    #' @param id Идентификатор параметра.
    #' @param title Название параметра. Например, `Скорость обработки заказа`.
    #' @param description Описание параметра. Например, `Как быстро с вами связались для подтверждения заказа?`.
    #' @param value Оценка по параметру, указанная в отзыве: от `1` (низшая оценка) до `5` (высшая оценка).
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id` = NULL, `title` = NULL, `description` = NULL, `value` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`title`)) {
        if (!(is.character(`title`) && length(`title`) == 1)) {
          stop(paste("Error! Invalid data for `title`. Must be a string:", `title`))
        }
        self$`title` <- `title`
      }
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!is.null(`value`)) {
        if (!(is.numeric(`value`) && length(`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be an integer:", `value`))
        }
        self$`value` <- `value`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedbackFactorDTO in JSON format
    #' @export
    toJSON = function() {
      FeedbackFactorDTOObject <- list()
      if (!is.null(self$`id`)) {
        FeedbackFactorDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`title`)) {
        FeedbackFactorDTOObject[["title"]] <-
          self$`title`
      }
      if (!is.null(self$`description`)) {
        FeedbackFactorDTOObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`value`)) {
        FeedbackFactorDTOObject[["value"]] <-
          self$`value`
      }
      FeedbackFactorDTOObject
    },
    #' Deserialize JSON string into an instance of FeedbackFactorDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedbackFactorDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedbackFactorDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`title`)) {
        self$`title` <- this_object$`title`
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`value`)) {
        self$`value` <- this_object$`value`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedbackFactorDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            %d
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`title`)) {
          sprintf(
          '"title":
            "%s"
                    ',
          self$`title`
          )
        },
        if (!is.null(self$`description`)) {
          sprintf(
          '"description":
            "%s"
                    ',
          self$`description`
          )
        },
        if (!is.null(self$`value`)) {
          sprintf(
          '"value":
            %d
                    ',
          self$`value`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of FeedbackFactorDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedbackFactorDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedbackFactorDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`title` <- this_object$`title`
      self$`description` <- this_object$`description`
      self$`value` <- this_object$`value`
      self
    },
    #' Validate JSON input with respect to FeedbackFactorDTO
    #'
    #' @description
    #' Validate JSON input with respect to FeedbackFactorDTO and throw an exception if invalid
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
    #' @return String representation of FeedbackFactorDTO
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
# FeedbackFactorDTO$unlock()
#
## Below is an example to define the print function
# FeedbackFactorDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FeedbackFactorDTO$lock()

