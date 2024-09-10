#' @docType class
#' @title OfferProcessingStatusType
#' @description OfferProcessingStatusType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OfferProcessingStatusType <- R6::R6Class(
  "OfferProcessingStatusType",
  public = list(
    #' Initialize a new OfferProcessingStatusType class.
    #'
    #' @description
    #' Initialize a new OfferProcessingStatusType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_OfferProcessingStatusType()

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
        warning("Initializing OfferProcessingStatusType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize OfferProcessingStatusType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferProcessingStatusType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of OfferProcessingStatusType
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferProcessingStatusType
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferProcessingStatusType
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
    #' @return OfferProcessingStatusType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of OfferProcessingStatusType
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferProcessingStatusType
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferProcessingStatusType
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
.parse_OfferProcessingStatusType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[UNKNOWN, READY, IN_WORK, NEED_INFO, NEED_MAPPING, NEED_CONTENT, CONTENT_PROCESSING, SUSPENDED, REJECTED, REVIEW, CREATE_ERROR, UPDATE_ERROR]")
  unlist(strsplit(res, ", "))
}

