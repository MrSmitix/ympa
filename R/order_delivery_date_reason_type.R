#' @docType class
#' @title OrderDeliveryDateReasonType
#' @description OrderDeliveryDateReasonType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderDeliveryDateReasonType <- R6::R6Class(
  "OrderDeliveryDateReasonType",
  public = list(
    #' Initialize a new OrderDeliveryDateReasonType class.
    #'
    #' @description
    #' Initialize a new OrderDeliveryDateReasonType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_OrderDeliveryDateReasonType()

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
        warning("Initializing OrderDeliveryDateReasonType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize OrderDeliveryDateReasonType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderDeliveryDateReasonType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of OrderDeliveryDateReasonType
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderDeliveryDateReasonType
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderDeliveryDateReasonType
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
    #' @return OrderDeliveryDateReasonType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of OrderDeliveryDateReasonType
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderDeliveryDateReasonType
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderDeliveryDateReasonType
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
.parse_OrderDeliveryDateReasonType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[USER_MOVED_DELIVERY_DATES, PARTNER_MOVED_DELIVERY_DATES]")
  unlist(strsplit(res, ", "))
}

