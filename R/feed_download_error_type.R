#' @docType class
#' @title FeedDownloadErrorType
#' @description FeedDownloadErrorType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FeedDownloadErrorType <- R6::R6Class(
  "FeedDownloadErrorType",
  public = list(
    #' Initialize a new FeedDownloadErrorType class.
    #'
    #' @description
    #' Initialize a new FeedDownloadErrorType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_FeedDownloadErrorType()

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
        warning("Initializing FeedDownloadErrorType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize FeedDownloadErrorType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedDownloadErrorType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of FeedDownloadErrorType
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedDownloadErrorType
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedDownloadErrorType
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
    #' @return FeedDownloadErrorType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of FeedDownloadErrorType
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedDownloadErrorType
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedDownloadErrorType
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
.parse_FeedDownloadErrorType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[DOWNLOAD_ERROR, DOWNLOAD_HTTP_ERROR]")
  unlist(strsplit(res, ", "))
}

