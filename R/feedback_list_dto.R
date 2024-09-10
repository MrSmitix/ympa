#' Create a new FeedbackListDTO
#'
#' @description
#' Отзывы пользователей Яндекс Маркета об указанном магазине.
#'
#' @docType class
#' @title FeedbackListDTO
#' @description FeedbackListDTO Class
#' @format An \code{R6Class} generator object
#' @field paging  \link{ScrollingPagerDTO} [optional]
#' @field feedbackList Список отзывов.  Содержит не более 20 отзывов. list(\link{FeedbackDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FeedbackListDTO <- R6::R6Class(
  "FeedbackListDTO",
  public = list(
    `paging` = NULL,
    `feedbackList` = NULL,
    #' Initialize a new FeedbackListDTO class.
    #'
    #' @description
    #' Initialize a new FeedbackListDTO class.
    #'
    #' @param feedbackList Список отзывов.  Содержит не более 20 отзывов.
    #' @param paging paging
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`feedbackList`, `paging` = NULL, ...) {
      if (!missing(`feedbackList`)) {
        stopifnot(is.vector(`feedbackList`), length(`feedbackList`) != 0)
        sapply(`feedbackList`, function(x) stopifnot(R6::is.R6(x)))
        self$`feedbackList` <- `feedbackList`
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
    #' @return FeedbackListDTO in JSON format
    #' @export
    toJSON = function() {
      FeedbackListDTOObject <- list()
      if (!is.null(self$`paging`)) {
        FeedbackListDTOObject[["paging"]] <-
          self$`paging`$toJSON()
      }
      if (!is.null(self$`feedbackList`)) {
        FeedbackListDTOObject[["feedbackList"]] <-
          lapply(self$`feedbackList`, function(x) x$toJSON())
      }
      FeedbackListDTOObject
    },
    #' Deserialize JSON string into an instance of FeedbackListDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedbackListDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedbackListDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`paging`)) {
        `paging_object` <- ScrollingPagerDTO$new()
        `paging_object`$fromJSON(jsonlite::toJSON(this_object$`paging`, auto_unbox = TRUE, digits = NA))
        self$`paging` <- `paging_object`
      }
      if (!is.null(this_object$`feedbackList`)) {
        self$`feedbackList` <- ApiClient$new()$deserializeObj(this_object$`feedbackList`, "array[FeedbackDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedbackListDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`paging`)) {
          sprintf(
          '"paging":
          %s
          ',
          jsonlite::toJSON(self$`paging`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`feedbackList`)) {
          sprintf(
          '"feedbackList":
          [%s]
',
          paste(sapply(self$`feedbackList`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of FeedbackListDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedbackListDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedbackListDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`paging` <- ScrollingPagerDTO$new()$fromJSON(jsonlite::toJSON(this_object$`paging`, auto_unbox = TRUE, digits = NA))
      self$`feedbackList` <- ApiClient$new()$deserializeObj(this_object$`feedbackList`, "array[FeedbackDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to FeedbackListDTO
    #'
    #' @description
    #' Validate JSON input with respect to FeedbackListDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `feedbackList`
      if (!is.null(input_json$`feedbackList`)) {
        stopifnot(is.vector(input_json$`feedbackList`), length(input_json$`feedbackList`) != 0)
        tmp <- sapply(input_json$`feedbackList`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FeedbackListDTO: the required field `feedbackList` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of FeedbackListDTO
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
      # check if the required `feedbackList` is null
      if (is.null(self$`feedbackList`)) {
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
      # check if the required `feedbackList` is null
      if (is.null(self$`feedbackList`)) {
        invalid_fields["feedbackList"] <- "Non-nullable required field `feedbackList` cannot be null."
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
# FeedbackListDTO$unlock()
#
## Below is an example to define the print function
# FeedbackListDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FeedbackListDTO$lock()

