#' @docType class
#' @title OrderVatType
#' @description OrderVatType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderVatType <- R6::R6Class(
  "OrderVatType",
  public = list(
    #' Initialize a new OrderVatType class.
    #'
    #' @description
    #' Initialize a new OrderVatType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_OrderVatType()

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
        warning("Initializing OrderVatType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize OrderVatType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderVatType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of OrderVatType
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderVatType
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderVatType
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
    #' @return OrderVatType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of OrderVatType
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderVatType
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderVatType
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
.parse_OrderVatType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[NO_VAT, VAT_0, VAT_10, VAT_10_110, VAT_20, VAT_20_120, VAT_18, VAT_18_118, UNKNOWN_VALUE]")
  unlist(strsplit(res, ", "))
}

