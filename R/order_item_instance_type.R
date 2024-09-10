#' @docType class
#' @title OrderItemInstanceType
#' @description OrderItemInstanceType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderItemInstanceType <- R6::R6Class(
  "OrderItemInstanceType",
  public = list(
    #' Initialize a new OrderItemInstanceType class.
    #'
    #' @description
    #' Initialize a new OrderItemInstanceType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_OrderItemInstanceType()

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
        warning("Initializing OrderItemInstanceType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize OrderItemInstanceType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderItemInstanceType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of OrderItemInstanceType
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderItemInstanceType
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderItemInstanceType
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
    #' @return OrderItemInstanceType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of OrderItemInstanceType
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderItemInstanceType
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderItemInstanceType
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
.parse_OrderItemInstanceType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[CIS, UIN, RNPT, GTD]")
  unlist(strsplit(res, ", "))
}

