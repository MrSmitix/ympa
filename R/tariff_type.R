#' @docType class
#' @title TariffType
#' @description TariffType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TariffType <- R6::R6Class(
  "TariffType",
  public = list(
    #' Initialize a new TariffType class.
    #'
    #' @description
    #' Initialize a new TariffType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_TariffType()

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
        warning("Initializing TariffType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize TariffType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return TariffType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of TariffType
    #'
    #' @description
    #' Deserialize JSON string into an instance of TariffType
    #'
    #' @param input_json the JSON input
    #' @return the instance of TariffType
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
    #' @return TariffType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of TariffType
    #'
    #' @description
    #' Deserialize JSON string into an instance of TariffType
    #'
    #' @param input_json the JSON input
    #' @return the instance of TariffType
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
.parse_TariffType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[AGENCY_COMMISSION, PAYMENT_TRANSFER, STORAGE, WITHDRAW, SURPLUS, FEE, DELIVERY_TO_CUSTOMER, CROSSREGIONAL_DELIVERY, CROSSREGIONAL_DELIVERY_RETURN, DISPOSAL, SORTING_CENTER_STORAGE, EXPRESS_DELIVERY, FF_XDOC_SUPPLY_BOX, FF_XDOC_SUPPLY_PALLET, SORTING, MIDDLE_MILE, RETURN_PROCESSING, EXPRESS_CANCELLED_BY_PARTNER, DELIVERY_TO_CUSTOMER_RETURN, CROSSBORDER_DELIVERY, INTAKE_SORTING_BULKY_CARGO, INTAKE_SORTING_SMALL_GOODS, INTAKE_SORTING_DAILY, FF_STORAGE_BILLING, CANCELLED_ORDER_FEE_QI, LATE_ORDER_EXECUTION_FEE_QI]")
  unlist(strsplit(res, ", "))
}

