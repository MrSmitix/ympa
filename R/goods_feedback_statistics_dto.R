#' Create a new GoodsFeedbackStatisticsDTO
#'
#' @description
#' Статистическая информация по отзыву.
#'
#' @docType class
#' @title GoodsFeedbackStatisticsDTO
#' @description GoodsFeedbackStatisticsDTO Class
#' @format An \code{R6Class} generator object
#' @field rating Оценка товара. integer
#' @field commentsCount Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии. integer
#' @field recommended Рекомендуют ли этот товар. character [optional]
#' @field paidAmount Количество баллов Плюса, которое автор получил за отзыв. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GoodsFeedbackStatisticsDTO <- R6::R6Class(
  "GoodsFeedbackStatisticsDTO",
  public = list(
    `rating` = NULL,
    `commentsCount` = NULL,
    `recommended` = NULL,
    `paidAmount` = NULL,
    #' Initialize a new GoodsFeedbackStatisticsDTO class.
    #'
    #' @description
    #' Initialize a new GoodsFeedbackStatisticsDTO class.
    #'
    #' @param rating Оценка товара.
    #' @param commentsCount Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии.
    #' @param recommended Рекомендуют ли этот товар.
    #' @param paidAmount Количество баллов Плюса, которое автор получил за отзыв.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`rating`, `commentsCount`, `recommended` = NULL, `paidAmount` = NULL, ...) {
      if (!missing(`rating`)) {
        if (!(is.numeric(`rating`) && length(`rating`) == 1)) {
          stop(paste("Error! Invalid data for `rating`. Must be an integer:", `rating`))
        }
        self$`rating` <- `rating`
      }
      if (!missing(`commentsCount`)) {
        if (!(is.numeric(`commentsCount`) && length(`commentsCount`) == 1)) {
          stop(paste("Error! Invalid data for `commentsCount`. Must be an integer:", `commentsCount`))
        }
        self$`commentsCount` <- `commentsCount`
      }
      if (!is.null(`recommended`)) {
        if (!(is.logical(`recommended`) && length(`recommended`) == 1)) {
          stop(paste("Error! Invalid data for `recommended`. Must be a boolean:", `recommended`))
        }
        self$`recommended` <- `recommended`
      }
      if (!is.null(`paidAmount`)) {
        if (!(is.numeric(`paidAmount`) && length(`paidAmount`) == 1)) {
          stop(paste("Error! Invalid data for `paidAmount`. Must be an integer:", `paidAmount`))
        }
        self$`paidAmount` <- `paidAmount`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GoodsFeedbackStatisticsDTO in JSON format
    #' @export
    toJSON = function() {
      GoodsFeedbackStatisticsDTOObject <- list()
      if (!is.null(self$`rating`)) {
        GoodsFeedbackStatisticsDTOObject[["rating"]] <-
          self$`rating`
      }
      if (!is.null(self$`commentsCount`)) {
        GoodsFeedbackStatisticsDTOObject[["commentsCount"]] <-
          self$`commentsCount`
      }
      if (!is.null(self$`recommended`)) {
        GoodsFeedbackStatisticsDTOObject[["recommended"]] <-
          self$`recommended`
      }
      if (!is.null(self$`paidAmount`)) {
        GoodsFeedbackStatisticsDTOObject[["paidAmount"]] <-
          self$`paidAmount`
      }
      GoodsFeedbackStatisticsDTOObject
    },
    #' Deserialize JSON string into an instance of GoodsFeedbackStatisticsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GoodsFeedbackStatisticsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GoodsFeedbackStatisticsDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`rating`)) {
        self$`rating` <- this_object$`rating`
      }
      if (!is.null(this_object$`commentsCount`)) {
        self$`commentsCount` <- this_object$`commentsCount`
      }
      if (!is.null(this_object$`recommended`)) {
        self$`recommended` <- this_object$`recommended`
      }
      if (!is.null(this_object$`paidAmount`)) {
        self$`paidAmount` <- this_object$`paidAmount`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GoodsFeedbackStatisticsDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`rating`)) {
          sprintf(
          '"rating":
            %d
                    ',
          self$`rating`
          )
        },
        if (!is.null(self$`commentsCount`)) {
          sprintf(
          '"commentsCount":
            %d
                    ',
          self$`commentsCount`
          )
        },
        if (!is.null(self$`recommended`)) {
          sprintf(
          '"recommended":
            %s
                    ',
          tolower(self$`recommended`)
          )
        },
        if (!is.null(self$`paidAmount`)) {
          sprintf(
          '"paidAmount":
            %d
                    ',
          self$`paidAmount`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GoodsFeedbackStatisticsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GoodsFeedbackStatisticsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GoodsFeedbackStatisticsDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`rating` <- this_object$`rating`
      self$`commentsCount` <- this_object$`commentsCount`
      self$`recommended` <- this_object$`recommended`
      self$`paidAmount` <- this_object$`paidAmount`
      self
    },
    #' Validate JSON input with respect to GoodsFeedbackStatisticsDTO
    #'
    #' @description
    #' Validate JSON input with respect to GoodsFeedbackStatisticsDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `rating`
      if (!is.null(input_json$`rating`)) {
        if (!(is.numeric(input_json$`rating`) && length(input_json$`rating`) == 1)) {
          stop(paste("Error! Invalid data for `rating`. Must be an integer:", input_json$`rating`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GoodsFeedbackStatisticsDTO: the required field `rating` is missing."))
      }
      # check the required field `commentsCount`
      if (!is.null(input_json$`commentsCount`)) {
        if (!(is.numeric(input_json$`commentsCount`) && length(input_json$`commentsCount`) == 1)) {
          stop(paste("Error! Invalid data for `commentsCount`. Must be an integer:", input_json$`commentsCount`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GoodsFeedbackStatisticsDTO: the required field `commentsCount` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GoodsFeedbackStatisticsDTO
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
      # check if the required `rating` is null
      if (is.null(self$`rating`)) {
        return(FALSE)
      }

      if (self$`rating` > 5) {
        return(FALSE)
      }
      if (self$`rating` < 1) {
        return(FALSE)
      }

      # check if the required `commentsCount` is null
      if (is.null(self$`commentsCount`)) {
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
      # check if the required `rating` is null
      if (is.null(self$`rating`)) {
        invalid_fields["rating"] <- "Non-nullable required field `rating` cannot be null."
      }

      if (self$`rating` > 5) {
        invalid_fields["rating"] <- "Invalid value for `rating`, must be smaller than or equal to 5."
      }
      if (self$`rating` < 1) {
        invalid_fields["rating"] <- "Invalid value for `rating`, must be bigger than or equal to 1."
      }

      # check if the required `commentsCount` is null
      if (is.null(self$`commentsCount`)) {
        invalid_fields["commentsCount"] <- "Non-nullable required field `commentsCount` cannot be null."
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
# GoodsFeedbackStatisticsDTO$unlock()
#
## Below is an example to define the print function
# GoodsFeedbackStatisticsDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GoodsFeedbackStatisticsDTO$lock()

