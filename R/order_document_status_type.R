#' @docType class
#' @title OrderDocumentStatusType
#' @description OrderDocumentStatusType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderDocumentStatusType <- R6::R6Class(
  "OrderDocumentStatusType",
  public = list(
    #' Initialize a new OrderDocumentStatusType class.
    #'
    #' @description
    #' Initialize a new OrderDocumentStatusType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_OrderDocumentStatusType()

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
        warning("Initializing OrderDocumentStatusType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize OrderDocumentStatusType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderDocumentStatusType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of OrderDocumentStatusType
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderDocumentStatusType
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderDocumentStatusType
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
    #' @return OrderDocumentStatusType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of OrderDocumentStatusType
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderDocumentStatusType
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderDocumentStatusType
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
.parse_OrderDocumentStatusType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[READY, NOT_READY]")
  unlist(strsplit(res, ", "))
}

