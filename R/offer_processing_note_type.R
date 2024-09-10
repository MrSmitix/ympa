#' @docType class
#' @title OfferProcessingNoteType
#' @description OfferProcessingNoteType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OfferProcessingNoteType <- R6::R6Class(
  "OfferProcessingNoteType",
  public = list(
    #' Initialize a new OfferProcessingNoteType class.
    #'
    #' @description
    #' Initialize a new OfferProcessingNoteType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_OfferProcessingNoteType()

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
        warning("Initializing OfferProcessingNoteType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize OfferProcessingNoteType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferProcessingNoteType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of OfferProcessingNoteType
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferProcessingNoteType
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferProcessingNoteType
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
    #' @return OfferProcessingNoteType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of OfferProcessingNoteType
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferProcessingNoteType
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferProcessingNoteType
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
.parse_OfferProcessingNoteType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[ASSORTMENT, CANCELLED, CONFLICTING_INFORMATION, OTHER, DEPARTMENT_FROZEN, INCORRECT_INFORMATION, LEGAL_CONFLICT, NEED_CLASSIFICATION_INFORMATION, NEED_INFORMATION, NEED_PICTURES, NEED_VENDOR, NO_CATEGORY, NO_KNOWLEDGE, NO_PARAMETERS_IN_SHOP_TITLE, NO_SIZE_MEASURE, SAMPLE_LINE]")
  unlist(strsplit(res, ", "))
}

