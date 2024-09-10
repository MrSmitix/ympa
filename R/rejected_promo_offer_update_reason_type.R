#' @docType class
#' @title RejectedPromoOfferUpdateReasonType
#' @description RejectedPromoOfferUpdateReasonType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RejectedPromoOfferUpdateReasonType <- R6::R6Class(
  "RejectedPromoOfferUpdateReasonType",
  public = list(
    #' Initialize a new RejectedPromoOfferUpdateReasonType class.
    #'
    #' @description
    #' Initialize a new RejectedPromoOfferUpdateReasonType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_RejectedPromoOfferUpdateReasonType()

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
        warning("Initializing RejectedPromoOfferUpdateReasonType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize RejectedPromoOfferUpdateReasonType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return RejectedPromoOfferUpdateReasonType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of RejectedPromoOfferUpdateReasonType
    #'
    #' @description
    #' Deserialize JSON string into an instance of RejectedPromoOfferUpdateReasonType
    #'
    #' @param input_json the JSON input
    #' @return the instance of RejectedPromoOfferUpdateReasonType
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
    #' @return RejectedPromoOfferUpdateReasonType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of RejectedPromoOfferUpdateReasonType
    #'
    #' @description
    #' Deserialize JSON string into an instance of RejectedPromoOfferUpdateReasonType
    #'
    #' @param input_json the JSON input
    #' @return the instance of RejectedPromoOfferUpdateReasonType
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
.parse_RejectedPromoOfferUpdateReasonType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[OFFER_DOES_NOT_EXIST, OFFER_DUPLICATION, OFFER_NOT_ELIGIBLE_FOR_PROMO, OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED, DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED, EMPTY_OLD_PRICE, EMPTY_PROMO_PRICE, MAX_PROMO_PRICE_EXCEEDED, PROMO_PRICE_BIGGER_THAN_MAX, PROMO_PRICE_SMALLER_THAN_MIN]")
  unlist(strsplit(res, ", "))
}

