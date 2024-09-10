#' @docType class
#' @title ShipmentStatusType
#' @description ShipmentStatusType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ShipmentStatusType <- R6::R6Class(
  "ShipmentStatusType",
  public = list(
    #' Initialize a new ShipmentStatusType class.
    #'
    #' @description
    #' Initialize a new ShipmentStatusType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_ShipmentStatusType()

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
        warning("Initializing ShipmentStatusType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize ShipmentStatusType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ShipmentStatusType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of ShipmentStatusType
    #'
    #' @description
    #' Deserialize JSON string into an instance of ShipmentStatusType
    #'
    #' @param input_json the JSON input
    #' @return the instance of ShipmentStatusType
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
    #' @return ShipmentStatusType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of ShipmentStatusType
    #'
    #' @description
    #' Deserialize JSON string into an instance of ShipmentStatusType
    #'
    #' @param input_json the JSON input
    #' @return the instance of ShipmentStatusType
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
.parse_ShipmentStatusType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[OUTBOUND_CREATED, OUTBOUND_READY_FOR_CONFIRMATION, OUTBOUND_CONFIRMED, OUTBOUND_SIGNED, FINISHED, ACCEPTED, ACCEPTED_WITH_DISCREPANCIES, ERROR]")
  unlist(strsplit(res, ", "))
}

