#' @docType class
#' @title OrderStatsStatusType
#' @description OrderStatsStatusType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderStatsStatusType <- R6::R6Class(
  "OrderStatsStatusType",
  public = list(
    #' Initialize a new OrderStatsStatusType class.
    #'
    #' @description
    #' Initialize a new OrderStatsStatusType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_OrderStatsStatusType()

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
        warning("Initializing OrderStatsStatusType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize OrderStatsStatusType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderStatsStatusType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of OrderStatsStatusType
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderStatsStatusType
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderStatsStatusType
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
    #' @return OrderStatsStatusType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of OrderStatsStatusType
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderStatsStatusType
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderStatsStatusType
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
.parse_OrderStatsStatusType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[CANCELLED_BEFORE_PROCESSING, CANCELLED_IN_DELIVERY, CANCELLED_IN_PROCESSING, DELIVERY, DELIVERED, PARTIALLY_DELIVERED, PARTIALLY_RETURNED, PENDING, PICKUP, PROCESSING, RESERVED, RETURNED, UNKNOWN, UNPAID, LOST]")
  unlist(strsplit(res, ", "))
}

