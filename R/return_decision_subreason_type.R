#' @docType class
#' @title ReturnDecisionSubreasonType
#' @description ReturnDecisionSubreasonType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ReturnDecisionSubreasonType <- R6::R6Class(
  "ReturnDecisionSubreasonType",
  public = list(
    #' Initialize a new ReturnDecisionSubreasonType class.
    #'
    #' @description
    #' Initialize a new ReturnDecisionSubreasonType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_ReturnDecisionSubreasonType()

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
        warning("Initializing ReturnDecisionSubreasonType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize ReturnDecisionSubreasonType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ReturnDecisionSubreasonType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of ReturnDecisionSubreasonType
    #'
    #' @description
    #' Deserialize JSON string into an instance of ReturnDecisionSubreasonType
    #'
    #' @param input_json the JSON input
    #' @return the instance of ReturnDecisionSubreasonType
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
    #' @return ReturnDecisionSubreasonType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of ReturnDecisionSubreasonType
    #'
    #' @description
    #' Deserialize JSON string into an instance of ReturnDecisionSubreasonType
    #'
    #' @param input_json the JSON input
    #' @return the instance of ReturnDecisionSubreasonType
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
.parse_ReturnDecisionSubreasonType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[USER_DID_NOT_LIKE, USER_CHANGED_MIND, DELIVERED_TOO_LONG, BAD_PACKAGE, DAMAGED, NOT_WORKING, INCOMPLETENESS, WRONG_ITEM, WRONG_COLOR, DID_NOT_MATCH_DESCRIPTION, UNKNOWN]")
  unlist(strsplit(res, ", "))
}

