#' @docType class
#' @title OrderPromoType
#' @description OrderPromoType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderPromoType <- R6::R6Class(
  "OrderPromoType",
  public = list(
    #' Initialize a new OrderPromoType class.
    #'
    #' @description
    #' Initialize a new OrderPromoType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_OrderPromoType()

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
        warning("Initializing OrderPromoType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize OrderPromoType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderPromoType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of OrderPromoType
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderPromoType
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderPromoType
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
    #' @return OrderPromoType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of OrderPromoType
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderPromoType
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderPromoType
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
.parse_OrderPromoType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[DIRECT_DISCOUNT, BLUE_SET, BLUE_FLASH, GENERIC_BUNDLE, MARKET_COUPON, MARKET_PROMOCODE, MARKET_DEAL, MARKET_BLUE, MARKET_PRIME, YANDEX_PLUS, BERU_PLUS, MARKET_COIN, YANDEX_EMPLOYEE, LIMITED_FREE_DELIVERY_PROMO, FREE_DELIVERY_THRESHOLD, MULTICART_DISCOUNT, PRICE_DROP_AS_YOU_SHOP, FREE_DELIVERY_FOR_LDI, FREE_DELIVERY_FOR_LSC, SECRET_SALE, FREE_PICKUP, CHEAPEST_AS_GIFT, CASHBACK, SUPPLIER_MULTICART_DISCOUNT, SPREAD_DISCOUNT_COUNT, SPREAD_DISCOUNT_RECEIPT, ANNOUNCEMENT_PROMO, DISCOUNT_BY_PAYMENT_TYPE, PERCENT_DISCOUNT, DCO_EXTRA_DISCOUNT, EMPTY_PROMO, BLOCKING_PROMO, UNKNOWN]")
  unlist(strsplit(res, ", "))
}

