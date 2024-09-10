#' @docType class
#' @title OrderPaymentMethodType
#' @description OrderPaymentMethodType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderPaymentMethodType <- R6::R6Class(
  "OrderPaymentMethodType",
  public = list(
    #' Initialize a new OrderPaymentMethodType class.
    #'
    #' @description
    #' Initialize a new OrderPaymentMethodType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_OrderPaymentMethodType()

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
        warning("Initializing OrderPaymentMethodType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize OrderPaymentMethodType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderPaymentMethodType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of OrderPaymentMethodType
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderPaymentMethodType
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderPaymentMethodType
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
    #' @return OrderPaymentMethodType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of OrderPaymentMethodType
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderPaymentMethodType
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderPaymentMethodType
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
.parse_OrderPaymentMethodType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[CASH_ON_DELIVERY, CARD_ON_DELIVERY, BOUND_CARD_ON_DELIVERY, YANDEX, APPLE_PAY, EXTERNAL_CERTIFICATE, CREDIT, GOOGLE_PAY, TINKOFF_CREDIT, SBP, TINKOFF_INSTALLMENTS, B2B_ACCOUNT_PREPAYMENT, B2B_ACCOUNT_POSTPAYMENT, UNKNOWN]")
  unlist(strsplit(res, ", "))
}

