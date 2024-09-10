#' @docType class
#' @title ReturnDecisionReasonType
#' @description ReturnDecisionReasonType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ReturnDecisionReasonType <- R6::R6Class(
  "ReturnDecisionReasonType",
  public = list(
    #' Initialize a new ReturnDecisionReasonType class.
    #'
    #' @description
    #' Initialize a new ReturnDecisionReasonType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_ReturnDecisionReasonType()

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
        warning("Initializing ReturnDecisionReasonType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize ReturnDecisionReasonType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ReturnDecisionReasonType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of ReturnDecisionReasonType
    #'
    #' @description
    #' Deserialize JSON string into an instance of ReturnDecisionReasonType
    #'
    #' @param input_json the JSON input
    #' @return the instance of ReturnDecisionReasonType
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
    #' @return ReturnDecisionReasonType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of ReturnDecisionReasonType
    #'
    #' @description
    #' Deserialize JSON string into an instance of ReturnDecisionReasonType
    #'
    #' @param input_json the JSON input
    #' @return the instance of ReturnDecisionReasonType
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
.parse_ReturnDecisionReasonType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[BAD_QUALITY, DOES_NOT_FIT, WRONG_ITEM, DAMAGE_DELIVERY, LOYALTY_FAIL, CONTENT_FAIL, UNKNOWN]")
  unlist(strsplit(res, ", "))
}

