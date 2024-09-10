#' @docType class
#' @title PromoOfferUpdateWarningCodeType
#' @description PromoOfferUpdateWarningCodeType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PromoOfferUpdateWarningCodeType <- R6::R6Class(
  "PromoOfferUpdateWarningCodeType",
  public = list(
    #' Initialize a new PromoOfferUpdateWarningCodeType class.
    #'
    #' @description
    #' Initialize a new PromoOfferUpdateWarningCodeType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_PromoOfferUpdateWarningCodeType()

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
        warning("Initializing PromoOfferUpdateWarningCodeType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize PromoOfferUpdateWarningCodeType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PromoOfferUpdateWarningCodeType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of PromoOfferUpdateWarningCodeType
    #'
    #' @description
    #' Deserialize JSON string into an instance of PromoOfferUpdateWarningCodeType
    #'
    #' @param input_json the JSON input
    #' @return the instance of PromoOfferUpdateWarningCodeType
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
    #' @return PromoOfferUpdateWarningCodeType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of PromoOfferUpdateWarningCodeType
    #'
    #' @description
    #' Deserialize JSON string into an instance of PromoOfferUpdateWarningCodeType
    #'
    #' @param input_json the JSON input
    #' @return the instance of PromoOfferUpdateWarningCodeType
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
.parse_PromoOfferUpdateWarningCodeType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[DEEP_DISCOUNT_OFFER, CATALOG_PRICE_IS_LOWER_THAN_PROMO, SHOP_PRICES_ARE_LOWER_THAN_PROMO, PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE, SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO]")
  unlist(strsplit(res, ", "))
}

