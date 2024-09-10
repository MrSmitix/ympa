#' @docType class
#' @title ReturnInstanceStatusType
#' @description ReturnInstanceStatusType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ReturnInstanceStatusType <- R6::R6Class(
  "ReturnInstanceStatusType",
  public = list(
    #' Initialize a new ReturnInstanceStatusType class.
    #'
    #' @description
    #' Initialize a new ReturnInstanceStatusType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_ReturnInstanceStatusType()

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
        warning("Initializing ReturnInstanceStatusType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize ReturnInstanceStatusType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ReturnInstanceStatusType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of ReturnInstanceStatusType
    #'
    #' @description
    #' Deserialize JSON string into an instance of ReturnInstanceStatusType
    #'
    #' @param input_json the JSON input
    #' @return the instance of ReturnInstanceStatusType
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
    #' @return ReturnInstanceStatusType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of ReturnInstanceStatusType
    #'
    #' @description
    #' Deserialize JSON string into an instance of ReturnInstanceStatusType
    #'
    #' @param input_json the JSON input
    #' @return the instance of ReturnInstanceStatusType
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
.parse_ReturnInstanceStatusType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[CREATED, RECEIVED, IN_TRANSIT, READY_FOR_PICKUP, PICKED, RECEIVED_ON_FULFILLMENT, CANCELLED, LOST, UTILIZED, PREPARED_FOR_UTILIZATION, EXPROPRIATED, NOT_IN_DEMAND]")
  unlist(strsplit(res, ", "))
}

