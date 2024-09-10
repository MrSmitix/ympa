#' @docType class
#' @title CalculatedTariffType
#' @description CalculatedTariffType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CalculatedTariffType <- R6::R6Class(
  "CalculatedTariffType",
  public = list(
    #' Initialize a new CalculatedTariffType class.
    #'
    #' @description
    #' Initialize a new CalculatedTariffType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_CalculatedTariffType()

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
        warning("Initializing CalculatedTariffType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize CalculatedTariffType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CalculatedTariffType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of CalculatedTariffType
    #'
    #' @description
    #' Deserialize JSON string into an instance of CalculatedTariffType
    #'
    #' @param input_json the JSON input
    #' @return the instance of CalculatedTariffType
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
    #' @return CalculatedTariffType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of CalculatedTariffType
    #'
    #' @description
    #' Deserialize JSON string into an instance of CalculatedTariffType
    #'
    #' @param input_json the JSON input
    #' @return the instance of CalculatedTariffType
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
.parse_CalculatedTariffType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[AGENCY_COMMISSION, PAYMENT_TRANSFER, FEE, DELIVERY_TO_CUSTOMER, CROSSREGIONAL_DELIVERY, EXPRESS_DELIVERY, SORTING, MIDDLE_MILE]")
  unlist(strsplit(res, ", "))
}

