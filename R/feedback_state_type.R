#' @docType class
#' @title FeedbackStateType
#' @description FeedbackStateType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FeedbackStateType <- R6::R6Class(
  "FeedbackStateType",
  public = list(
    #' Initialize a new FeedbackStateType class.
    #'
    #' @description
    #' Initialize a new FeedbackStateType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_FeedbackStateType()

      if (length(val) == 0L) {
        val = "DUMMY_ENUM"
      } else {
        stopifnot(length(val) == 1L)
      }

      if (!val %in% enumvec) {
        if (!(val=="DUMMY_ENUM")) {
          stop("Use one of the valid values: ",
            paste0(enumvec, collapse = ", "))
        }
        warning("Initializing FeedbackStateType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize FeedbackStateType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedbackStateType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of FeedbackStateType
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedbackStateType
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedbackStateType
    #' @export
    fromJSON = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedbackStateType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of FeedbackStateType
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedbackStateType
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedbackStateType
    #' @export
    fromJSONString = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    }
  ),
  private = list(
    value = NULL
  )
)

# add to utils.R
.parse_FeedbackStateType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[LAST, PREVIOUS, DELETED]")
  unlist(strsplit(res, ", "))
}

