#' @docType class
#' @title ReturnInstanceStockType
#' @description ReturnInstanceStockType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ReturnInstanceStockType <- R6::R6Class(
  "ReturnInstanceStockType",
  public = list(
    #' Initialize a new ReturnInstanceStockType class.
    #'
    #' @description
    #' Initialize a new ReturnInstanceStockType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_ReturnInstanceStockType()

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
        warning("Initializing ReturnInstanceStockType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize ReturnInstanceStockType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ReturnInstanceStockType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of ReturnInstanceStockType
    #'
    #' @description
    #' Deserialize JSON string into an instance of ReturnInstanceStockType
    #'
    #' @param input_json the JSON input
    #' @return the instance of ReturnInstanceStockType
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
    #' @return ReturnInstanceStockType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of ReturnInstanceStockType
    #'
    #' @description
    #' Deserialize JSON string into an instance of ReturnInstanceStockType
    #'
    #' @param input_json the JSON input
    #' @return the instance of ReturnInstanceStockType
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
.parse_ReturnInstanceStockType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[FIT, DEFECT, ANOMALY, SURPLUS, EXPIRED, MISGRADING, UNDEFINED, INCORRECT_IMEI, INCORRECT_SERIAL_NUMBER, INCORRECT_CIS, PART_MISSING, NON_COMPLIENT, NOT_ACCEPTABLE, SERVICE, MARKDOWN, DEMO, REPAIR, FIRMWARE, UNKNOWN]")
  unlist(strsplit(res, ", "))
}

