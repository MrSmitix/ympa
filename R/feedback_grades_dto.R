#' Create a new FeedbackGradesDTO
#'
#' @description
#' Информация об оценках, которые поставил автор отзыва магазину, и об оценках полезности отзыва от других пользователей Маркета.
#'
#' @docType class
#' @title FeedbackGradesDTO
#' @description FeedbackGradesDTO Class
#' @format An \code{R6Class} generator object
#' @field average Общая оценка, указанная в отзыве: от `1` («Ужасный магазин») до `5` («Отличный магазин»). numeric [optional]
#' @field agreeCount Количество пользователей, считающих отзыв полезным. integer [optional]
#' @field rejectCount Количество пользователей, считающих отзыв бесполезным. integer [optional]
#' @field factors Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. list(\link{FeedbackFactorDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FeedbackGradesDTO <- R6::R6Class(
  "FeedbackGradesDTO",
  public = list(
    `average` = NULL,
    `agreeCount` = NULL,
    `rejectCount` = NULL,
    `factors` = NULL,
    #' Initialize a new FeedbackGradesDTO class.
    #'
    #' @description
    #' Initialize a new FeedbackGradesDTO class.
    #'
    #' @param factors Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор.
    #' @param average Общая оценка, указанная в отзыве: от `1` («Ужасный магазин») до `5` («Отличный магазин»).
    #' @param agreeCount Количество пользователей, считающих отзыв полезным.
    #' @param rejectCount Количество пользователей, считающих отзыв бесполезным.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`factors`, `average` = NULL, `agreeCount` = NULL, `rejectCount` = NULL, ...) {
      if (!missing(`factors`)) {
        stopifnot(is.vector(`factors`), length(`factors`) != 0)
        sapply(`factors`, function(x) stopifnot(R6::is.R6(x)))
        self$`factors` <- `factors`
      }
      if (!is.null(`average`)) {
        self$`average` <- `average`
      }
      if (!is.null(`agreeCount`)) {
        if (!(is.numeric(`agreeCount`) && length(`agreeCount`) == 1)) {
          stop(paste("Error! Invalid data for `agreeCount`. Must be an integer:", `agreeCount`))
        }
        self$`agreeCount` <- `agreeCount`
      }
      if (!is.null(`rejectCount`)) {
        if (!(is.numeric(`rejectCount`) && length(`rejectCount`) == 1)) {
          stop(paste("Error! Invalid data for `rejectCount`. Must be an integer:", `rejectCount`))
        }
        self$`rejectCount` <- `rejectCount`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedbackGradesDTO in JSON format
    #' @export
    toJSON = function() {
      FeedbackGradesDTOObject <- list()
      if (!is.null(self$`average`)) {
        FeedbackGradesDTOObject[["average"]] <-
          self$`average`
      }
      if (!is.null(self$`agreeCount`)) {
        FeedbackGradesDTOObject[["agreeCount"]] <-
          self$`agreeCount`
      }
      if (!is.null(self$`rejectCount`)) {
        FeedbackGradesDTOObject[["rejectCount"]] <-
          self$`rejectCount`
      }
      if (!is.null(self$`factors`)) {
        FeedbackGradesDTOObject[["factors"]] <-
          lapply(self$`factors`, function(x) x$toJSON())
      }
      FeedbackGradesDTOObject
    },
    #' Deserialize JSON string into an instance of FeedbackGradesDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedbackGradesDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedbackGradesDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`average`)) {
        self$`average` <- this_object$`average`
      }
      if (!is.null(this_object$`agreeCount`)) {
        self$`agreeCount` <- this_object$`agreeCount`
      }
      if (!is.null(this_object$`rejectCount`)) {
        self$`rejectCount` <- this_object$`rejectCount`
      }
      if (!is.null(this_object$`factors`)) {
        self$`factors` <- ApiClient$new()$deserializeObj(this_object$`factors`, "array[FeedbackFactorDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedbackGradesDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`average`)) {
          sprintf(
          '"average":
            %d
                    ',
          self$`average`
          )
        },
        if (!is.null(self$`agreeCount`)) {
          sprintf(
          '"agreeCount":
            %d
                    ',
          self$`agreeCount`
          )
        },
        if (!is.null(self$`rejectCount`)) {
          sprintf(
          '"rejectCount":
            %d
                    ',
          self$`rejectCount`
          )
        },
        if (!is.null(self$`factors`)) {
          sprintf(
          '"factors":
          [%s]
',
          paste(sapply(self$`factors`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of FeedbackGradesDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedbackGradesDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedbackGradesDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`average` <- this_object$`average`
      self$`agreeCount` <- this_object$`agreeCount`
      self$`rejectCount` <- this_object$`rejectCount`
      self$`factors` <- ApiClient$new()$deserializeObj(this_object$`factors`, "array[FeedbackFactorDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to FeedbackGradesDTO
    #'
    #' @description
    #' Validate JSON input with respect to FeedbackGradesDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `factors`
      if (!is.null(input_json$`factors`)) {
        stopifnot(is.vector(input_json$`factors`), length(input_json$`factors`) != 0)
        tmp <- sapply(input_json$`factors`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FeedbackGradesDTO: the required field `factors` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of FeedbackGradesDTO
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
      # check if the required `factors` is null
      if (is.null(self$`factors`)) {
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
      # check if the required `factors` is null
      if (is.null(self$`factors`)) {
        invalid_fields["factors"] <- "Non-nullable required field `factors` cannot be null."
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
# FeedbackGradesDTO$unlock()
#
## Below is an example to define the print function
# FeedbackGradesDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FeedbackGradesDTO$lock()

