#' @docType class
#' @title AffectedOrderQualityRatingComponentType
#' @description AffectedOrderQualityRatingComponentType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AffectedOrderQualityRatingComponentType <- R6::R6Class(
  "AffectedOrderQualityRatingComponentType",
  public = list(
    #' Initialize a new AffectedOrderQualityRatingComponentType class.
    #'
    #' @description
    #' Initialize a new AffectedOrderQualityRatingComponentType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_AffectedOrderQualityRatingComponentType()

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
        warning("Initializing AffectedOrderQualityRatingComponentType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize AffectedOrderQualityRatingComponentType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AffectedOrderQualityRatingComponentType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of AffectedOrderQualityRatingComponentType
    #'
    #' @description
    #' Deserialize JSON string into an instance of AffectedOrderQualityRatingComponentType
    #'
    #' @param input_json the JSON input
    #' @return the instance of AffectedOrderQualityRatingComponentType
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
    #' @return AffectedOrderQualityRatingComponentType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of AffectedOrderQualityRatingComponentType
    #'
    #' @description
    #' Deserialize JSON string into an instance of AffectedOrderQualityRatingComponentType
    #'
    #' @param input_json the JSON input
    #' @return the instance of AffectedOrderQualityRatingComponentType
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
.parse_AffectedOrderQualityRatingComponentType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[DBS_CANCELLATION_RATE, DBS_LATE_DELIVERY_RATE, FBS_CANCELLATION_RATE, FBS_LATE_SHIP_RATE]")
  unlist(strsplit(res, ", "))
}

