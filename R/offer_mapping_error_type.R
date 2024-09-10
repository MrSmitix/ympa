#' @docType class
#' @title OfferMappingErrorType
#' @description OfferMappingErrorType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OfferMappingErrorType <- R6::R6Class(
  "OfferMappingErrorType",
  public = list(
    #' Initialize a new OfferMappingErrorType class.
    #'
    #' @description
    #' Initialize a new OfferMappingErrorType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_OfferMappingErrorType()

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
        warning("Initializing OfferMappingErrorType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize OfferMappingErrorType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferMappingErrorType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of OfferMappingErrorType
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferMappingErrorType
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferMappingErrorType
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
    #' @return OfferMappingErrorType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of OfferMappingErrorType
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferMappingErrorType
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferMappingErrorType
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
.parse_OfferMappingErrorType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[UNKNOWN_CATEGORY, CATEGORY_MISMATCH, EMPTY_MARKET_CATEGORY, UNKNOWN_PARAMETER, UNEXPECTED_BOOLEAN_VALUE, NUMBER_FORMAT, VALUE_BLANK, INVALID_UNIT_ID, INVALID_GROUP_ID_LENGTH, INVALID_GROUP_ID_CHARACTERS, INVALID_PICKER_URL]")
  unlist(strsplit(res, ", "))
}

