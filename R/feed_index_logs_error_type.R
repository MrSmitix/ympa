#' @docType class
#' @title FeedIndexLogsErrorType
#' @description FeedIndexLogsErrorType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FeedIndexLogsErrorType <- R6::R6Class(
  "FeedIndexLogsErrorType",
  public = list(
    #' Initialize a new FeedIndexLogsErrorType class.
    #'
    #' @description
    #' Initialize a new FeedIndexLogsErrorType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_FeedIndexLogsErrorType()

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
        warning("Initializing FeedIndexLogsErrorType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize FeedIndexLogsErrorType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedIndexLogsErrorType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of FeedIndexLogsErrorType
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedIndexLogsErrorType
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedIndexLogsErrorType
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
    #' @return FeedIndexLogsErrorType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of FeedIndexLogsErrorType
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedIndexLogsErrorType
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedIndexLogsErrorType
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
.parse_FeedIndexLogsErrorType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[DOWNLOAD_ERROR, DOWNLOAD_HTTP_ERROR, PARSE_ERROR, PARSE_XML_ERROR, TOO_MANY_REJECTED_OFFERS, NOT_INDEXED]")
  unlist(strsplit(res, ", "))
}

