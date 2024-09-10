#' @docType class
#' @title ShelfsStatisticsAttributionType
#' @description ShelfsStatisticsAttributionType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ShelfsStatisticsAttributionType <- R6::R6Class(
  "ShelfsStatisticsAttributionType",
  public = list(
    #' Initialize a new ShelfsStatisticsAttributionType class.
    #'
    #' @description
    #' Initialize a new ShelfsStatisticsAttributionType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_ShelfsStatisticsAttributionType()

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
        warning("Initializing ShelfsStatisticsAttributionType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize ShelfsStatisticsAttributionType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ShelfsStatisticsAttributionType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of ShelfsStatisticsAttributionType
    #'
    #' @description
    #' Deserialize JSON string into an instance of ShelfsStatisticsAttributionType
    #'
    #' @param input_json the JSON input
    #' @return the instance of ShelfsStatisticsAttributionType
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
    #' @return ShelfsStatisticsAttributionType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of ShelfsStatisticsAttributionType
    #'
    #' @description
    #' Deserialize JSON string into an instance of ShelfsStatisticsAttributionType
    #'
    #' @param input_json the JSON input
    #' @return the instance of ShelfsStatisticsAttributionType
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
.parse_ShelfsStatisticsAttributionType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[CLICKS, SHOWS]")
  unlist(strsplit(res, ", "))
}

