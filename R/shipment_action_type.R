#' @docType class
#' @title ShipmentActionType
#' @description ShipmentActionType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ShipmentActionType <- R6::R6Class(
  "ShipmentActionType",
  public = list(
    #' Initialize a new ShipmentActionType class.
    #'
    #' @description
    #' Initialize a new ShipmentActionType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_ShipmentActionType()

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
        warning("Initializing ShipmentActionType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize ShipmentActionType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ShipmentActionType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of ShipmentActionType
    #'
    #' @description
    #' Deserialize JSON string into an instance of ShipmentActionType
    #'
    #' @param input_json the JSON input
    #' @return the instance of ShipmentActionType
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
    #' @return ShipmentActionType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of ShipmentActionType
    #'
    #' @description
    #' Deserialize JSON string into an instance of ShipmentActionType
    #'
    #' @param input_json the JSON input
    #' @return the instance of ShipmentActionType
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
.parse_ShipmentActionType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[CONFIRM, DOWNLOAD_ACT, DOWNLOAD_INBOUND_ACT, DOWNLOAD_DISCREPANCY_ACT, CHANGE_PALLETS_COUNT]")
  unlist(strsplit(res, ", "))
}

