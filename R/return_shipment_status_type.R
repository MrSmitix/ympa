#' @docType class
#' @title ReturnShipmentStatusType
#' @description ReturnShipmentStatusType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ReturnShipmentStatusType <- R6::R6Class(
  "ReturnShipmentStatusType",
  public = list(
    #' Initialize a new ReturnShipmentStatusType class.
    #'
    #' @description
    #' Initialize a new ReturnShipmentStatusType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_ReturnShipmentStatusType()

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
        warning("Initializing ReturnShipmentStatusType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize ReturnShipmentStatusType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ReturnShipmentStatusType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of ReturnShipmentStatusType
    #'
    #' @description
    #' Deserialize JSON string into an instance of ReturnShipmentStatusType
    #'
    #' @param input_json the JSON input
    #' @return the instance of ReturnShipmentStatusType
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
    #' @return ReturnShipmentStatusType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of ReturnShipmentStatusType
    #'
    #' @description
    #' Deserialize JSON string into an instance of ReturnShipmentStatusType
    #'
    #' @param input_json the JSON input
    #' @return the instance of ReturnShipmentStatusType
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
.parse_ReturnShipmentStatusType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[CREATED, RECEIVED, IN_TRANSIT, READY_FOR_PICKUP, PICKED, LOST, EXPIRED, CANCELLED, FULFILMENT_RECEIVED, PREPARED_FOR_UTILIZATION, NOT_IN_DEMAND, UTILIZED, READY_FOR_EXPROPRIATION, RECEIVED_FOR_EXPROPRIATION]")
  unlist(strsplit(res, ", "))
}

