#' @docType class
#' @title RefundStatusType
#' @description RefundStatusType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RefundStatusType <- R6::R6Class(
  "RefundStatusType",
  public = list(
    #' Initialize a new RefundStatusType class.
    #'
    #' @description
    #' Initialize a new RefundStatusType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_RefundStatusType()

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
        warning("Initializing RefundStatusType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize RefundStatusType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return RefundStatusType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of RefundStatusType
    #'
    #' @description
    #' Deserialize JSON string into an instance of RefundStatusType
    #'
    #' @param input_json the JSON input
    #' @return the instance of RefundStatusType
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
    #' @return RefundStatusType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of RefundStatusType
    #'
    #' @description
    #' Deserialize JSON string into an instance of RefundStatusType
    #'
    #' @param input_json the JSON input
    #' @return the instance of RefundStatusType
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
.parse_RefundStatusType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[STARTED_BY_USER, REFUND_IN_PROGRESS, REFUNDED, FAILED, WAITING_FOR_DECISION, DECISION_MADE, REFUNDED_WITH_BONUSES, REFUNDED_BY_SHOP, CANCELLED, COMPLETE_WITHOUT_REFUND, UNKNOWN]")
  unlist(strsplit(res, ", "))
}

