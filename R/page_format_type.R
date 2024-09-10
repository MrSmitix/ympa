#' @docType class
#' @title PageFormatType
#' @description PageFormatType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PageFormatType <- R6::R6Class(
  "PageFormatType",
  public = list(
    #' Initialize a new PageFormatType class.
    #'
    #' @description
    #' Initialize a new PageFormatType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_PageFormatType()

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
        warning("Initializing PageFormatType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize PageFormatType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PageFormatType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of PageFormatType
    #'
    #' @description
    #' Deserialize JSON string into an instance of PageFormatType
    #'
    #' @param input_json the JSON input
    #' @return the instance of PageFormatType
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
    #' @return PageFormatType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of PageFormatType
    #'
    #' @description
    #' Deserialize JSON string into an instance of PageFormatType
    #'
    #' @param input_json the JSON input
    #' @return the instance of PageFormatType
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
.parse_PageFormatType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[A7, A4]")
  unlist(strsplit(res, ", "))
}

