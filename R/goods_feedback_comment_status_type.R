#' @docType class
#' @title GoodsFeedbackCommentStatusType
#' @description GoodsFeedbackCommentStatusType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GoodsFeedbackCommentStatusType <- R6::R6Class(
  "GoodsFeedbackCommentStatusType",
  public = list(
    #' Initialize a new GoodsFeedbackCommentStatusType class.
    #'
    #' @description
    #' Initialize a new GoodsFeedbackCommentStatusType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_GoodsFeedbackCommentStatusType()

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
        warning("Initializing GoodsFeedbackCommentStatusType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize GoodsFeedbackCommentStatusType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GoodsFeedbackCommentStatusType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of GoodsFeedbackCommentStatusType
    #'
    #' @description
    #' Deserialize JSON string into an instance of GoodsFeedbackCommentStatusType
    #'
    #' @param input_json the JSON input
    #' @return the instance of GoodsFeedbackCommentStatusType
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
    #' @return GoodsFeedbackCommentStatusType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of GoodsFeedbackCommentStatusType
    #'
    #' @description
    #' Deserialize JSON string into an instance of GoodsFeedbackCommentStatusType
    #'
    #' @param input_json the JSON input
    #' @return the instance of GoodsFeedbackCommentStatusType
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
.parse_GoodsFeedbackCommentStatusType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[PUBLISHED, UNMODERATED, BANNED, DELETED]")
  unlist(strsplit(res, ", "))
}

