#' @docType class
#' @title AgeUnitType
#' @description AgeUnitType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AgeUnitType <- R6::R6Class(
  "AgeUnitType",
  public = list(
    #' Initialize a new AgeUnitType class.
    #'
    #' @description
    #' Initialize a new AgeUnitType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_AgeUnitType()

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
        warning("Initializing AgeUnitType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize AgeUnitType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AgeUnitType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of AgeUnitType
    #'
    #' @description
    #' Deserialize JSON string into an instance of AgeUnitType
    #'
    #' @param input_json the JSON input
    #' @return the instance of AgeUnitType
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
    #' @return AgeUnitType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of AgeUnitType
    #'
    #' @description
    #' Deserialize JSON string into an instance of AgeUnitType
    #'
    #' @param input_json the JSON input
    #' @return the instance of AgeUnitType
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
.parse_AgeUnitType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[YEAR, MONTH]")
  unlist(strsplit(res, ", "))
}

