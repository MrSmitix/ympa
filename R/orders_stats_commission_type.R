#' @docType class
#' @title OrdersStatsCommissionType
#' @description OrdersStatsCommissionType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrdersStatsCommissionType <- R6::R6Class(
  "OrdersStatsCommissionType",
  public = list(
    #' Initialize a new OrdersStatsCommissionType class.
    #'
    #' @description
    #' Initialize a new OrdersStatsCommissionType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_OrdersStatsCommissionType()

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
        warning("Initializing OrdersStatsCommissionType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize OrdersStatsCommissionType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrdersStatsCommissionType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of OrdersStatsCommissionType
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrdersStatsCommissionType
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrdersStatsCommissionType
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
    #' @return OrdersStatsCommissionType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of OrdersStatsCommissionType
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrdersStatsCommissionType
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrdersStatsCommissionType
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
.parse_OrdersStatsCommissionType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[FEE, FULFILLMENT, LOYALTY_PARTICIPATION_FEE, AUCTION_PROMOTION, INSTALLMENT, DELIVERY_TO_CUSTOMER, EXPRESS_DELIVERY_TO_CUSTOMER, AGENCY, PAYMENT_TRANSFER, RETURNED_ORDERS_STORAGE, SORTING, INTAKE_SORTING, RETURN_PROCESSING, ILLIQUID_GOODS_SALE]")
  unlist(strsplit(res, ", "))
}

