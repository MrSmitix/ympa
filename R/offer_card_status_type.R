#' @docType class
#' @title OfferCardStatusType
#' @description OfferCardStatusType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OfferCardStatusType <- R6::R6Class(
  "OfferCardStatusType",
  public = list(
    #' Initialize a new OfferCardStatusType class.
    #'
    #' @description
    #' Initialize a new OfferCardStatusType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_OfferCardStatusType()

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
        warning("Initializing OfferCardStatusType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize OfferCardStatusType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferCardStatusType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of OfferCardStatusType
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferCardStatusType
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferCardStatusType
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
    #' @return OfferCardStatusType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of OfferCardStatusType
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferCardStatusType
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferCardStatusType
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
.parse_OfferCardStatusType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[HAS_CARD_CAN_NOT_UPDATE, HAS_CARD_CAN_UPDATE, HAS_CARD_CAN_UPDATE_ERRORS, HAS_CARD_CAN_UPDATE_PROCESSING, NO_CARD_NEED_CONTENT, NO_CARD_MARKET_WILL_CREATE, NO_CARD_ERRORS, NO_CARD_PROCESSING, NO_CARD_ADD_TO_CAMPAIGN]")
  unlist(strsplit(res, ", "))
}

