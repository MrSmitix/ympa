#' @docType class
#' @title ChatStatusType
#' @description ChatStatusType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ChatStatusType <- R6::R6Class(
  "ChatStatusType",
  public = list(
    #' Initialize a new ChatStatusType class.
    #'
    #' @description
    #' Initialize a new ChatStatusType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_ChatStatusType()

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
        warning("Initializing ChatStatusType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize ChatStatusType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ChatStatusType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of ChatStatusType
    #'
    #' @description
    #' Deserialize JSON string into an instance of ChatStatusType
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatStatusType
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
    #' @return ChatStatusType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of ChatStatusType
    #'
    #' @description
    #' Deserialize JSON string into an instance of ChatStatusType
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatStatusType
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
.parse_ChatStatusType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[NEW, WAITING_FOR_CUSTOMER, WAITING_FOR_PARTNER, WAITING_FOR_ARBITER, WAITING_FOR_MARKET, FINISHED]")
  unlist(strsplit(res, ", "))
}

