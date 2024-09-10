#' @docType class
#' @title LogisticPointType
#' @description LogisticPointType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LogisticPointType <- R6::R6Class(
  "LogisticPointType",
  public = list(
    #' Initialize a new LogisticPointType class.
    #'
    #' @description
    #' Initialize a new LogisticPointType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_LogisticPointType()

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
        warning("Initializing LogisticPointType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize LogisticPointType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return LogisticPointType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of LogisticPointType
    #'
    #' @description
    #' Deserialize JSON string into an instance of LogisticPointType
    #'
    #' @param input_json the JSON input
    #' @return the instance of LogisticPointType
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
    #' @return LogisticPointType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of LogisticPointType
    #'
    #' @description
    #' Deserialize JSON string into an instance of LogisticPointType
    #'
    #' @param input_json the JSON input
    #' @return the instance of LogisticPointType
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
.parse_LogisticPointType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[WAREHOUSE, PICKUP_POINT, PICKUP_TERMINAL, PICKUP_POST_OFFICE, PICKUP_MIXED, PICKUP_RETAIL, UNKNOWN]")
  unlist(strsplit(res, ", "))
}

