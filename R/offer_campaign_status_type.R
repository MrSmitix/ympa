#' @docType class
#' @title OfferCampaignStatusType
#' @description OfferCampaignStatusType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OfferCampaignStatusType <- R6::R6Class(
  "OfferCampaignStatusType",
  public = list(
    #' Initialize a new OfferCampaignStatusType class.
    #'
    #' @description
    #' Initialize a new OfferCampaignStatusType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_OfferCampaignStatusType()

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
        warning("Initializing OfferCampaignStatusType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize OfferCampaignStatusType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferCampaignStatusType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of OfferCampaignStatusType
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferCampaignStatusType
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferCampaignStatusType
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
    #' @return OfferCampaignStatusType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of OfferCampaignStatusType
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferCampaignStatusType
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferCampaignStatusType
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
.parse_OfferCampaignStatusType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[PUBLISHED, CHECKING, DISABLED_BY_PARTNER, DISABLED_AUTOMATICALLY, REJECTED_BY_MARKET, CREATING_CARD, NO_CARD, NO_STOCKS, ARCHIVED]")
  unlist(strsplit(res, ", "))
}

