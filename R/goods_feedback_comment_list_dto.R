#' Create a new GoodsFeedbackCommentListDTO
#'
#' @description
#' Комментарии к отзыву.
#'
#' @docType class
#' @title GoodsFeedbackCommentListDTO
#' @description GoodsFeedbackCommentListDTO Class
#' @format An \code{R6Class} generator object
#' @field comments Список комментариев. list(\link{GoodsFeedbackCommentDTO})
#' @field paging  \link{ForwardScrollingPagerDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GoodsFeedbackCommentListDTO <- R6::R6Class(
  "GoodsFeedbackCommentListDTO",
  public = list(
    `comments` = NULL,
    `paging` = NULL,
    #' Initialize a new GoodsFeedbackCommentListDTO class.
    #'
    #' @description
    #' Initialize a new GoodsFeedbackCommentListDTO class.
    #'
    #' @param comments Список комментариев.
    #' @param paging paging
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`comments`, `paging` = NULL, ...) {
      if (!missing(`comments`)) {
        stopifnot(is.vector(`comments`), length(`comments`) != 0)
        sapply(`comments`, function(x) stopifnot(R6::is.R6(x)))
        self$`comments` <- `comments`
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
    #' @return GoodsFeedbackCommentListDTO in JSON format
    #' @export
    toJSON = function() {
      GoodsFeedbackCommentListDTOObject <- list()
      if (!is.null(self$`comments`)) {
        GoodsFeedbackCommentListDTOObject[["comments"]] <-
          lapply(self$`comments`, function(x) x$toJSON())
      }
      if (!is.null(self$`paging`)) {
        GoodsFeedbackCommentListDTOObject[["paging"]] <-
          self$`paging`$toJSON()
      }
      GoodsFeedbackCommentListDTOObject
    },
    #' Deserialize JSON string into an instance of GoodsFeedbackCommentListDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GoodsFeedbackCommentListDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GoodsFeedbackCommentListDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`comments`)) {
        self$`comments` <- ApiClient$new()$deserializeObj(this_object$`comments`, "array[GoodsFeedbackCommentDTO]", loadNamespace("ympa_r_client"))
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
    #' @return GoodsFeedbackCommentListDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`comments`)) {
          sprintf(
          '"comments":
          [%s]
',
          paste(sapply(self$`comments`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
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
    #' Deserialize JSON string into an instance of GoodsFeedbackCommentListDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GoodsFeedbackCommentListDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GoodsFeedbackCommentListDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`comments` <- ApiClient$new()$deserializeObj(this_object$`comments`, "array[GoodsFeedbackCommentDTO]", loadNamespace("ympa_r_client"))
      self$`paging` <- ForwardScrollingPagerDTO$new()$fromJSON(jsonlite::toJSON(this_object$`paging`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to GoodsFeedbackCommentListDTO
    #'
    #' @description
    #' Validate JSON input with respect to GoodsFeedbackCommentListDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `comments`
      if (!is.null(input_json$`comments`)) {
        stopifnot(is.vector(input_json$`comments`), length(input_json$`comments`) != 0)
        tmp <- sapply(input_json$`comments`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GoodsFeedbackCommentListDTO: the required field `comments` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GoodsFeedbackCommentListDTO
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
      # check if the required `comments` is null
      if (is.null(self$`comments`)) {
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
      # check if the required `comments` is null
      if (is.null(self$`comments`)) {
        invalid_fields["comments"] <- "Non-nullable required field `comments` cannot be null."
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
# GoodsFeedbackCommentListDTO$unlock()
#
## Below is an example to define the print function
# GoodsFeedbackCommentListDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GoodsFeedbackCommentListDTO$lock()

