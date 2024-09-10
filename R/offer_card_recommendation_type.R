#' @docType class
#' @title OfferCardRecommendationType
#' @description OfferCardRecommendationType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OfferCardRecommendationType <- R6::R6Class(
  "OfferCardRecommendationType",
  public = list(
    #' Initialize a new OfferCardRecommendationType class.
    #'
    #' @description
    #' Initialize a new OfferCardRecommendationType class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_OfferCardRecommendationType()

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
        warning("Initializing OfferCardRecommendationType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize OfferCardRecommendationType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferCardRecommendationType in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of OfferCardRecommendationType
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferCardRecommendationType
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferCardRecommendationType
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
    #' @return OfferCardRecommendationType in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of OfferCardRecommendationType
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferCardRecommendationType
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferCardRecommendationType
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
.parse_OfferCardRecommendationType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[HAS_VIDEO, RECOGNIZED_VENDOR, MAIN, ADDITIONAL, DISTINCTIVE, FILTERABLE, PICTURE_COUNT, HAS_DESCRIPTION, HAS_BARCODE, FIRST_PICTURE_SIZE, TITLE_LENGTH, DESCRIPTION_LENGTH, AVERAGE_PICTURE_SIZE, FIRST_VIDEO_SIZE, FIRST_VIDEO_LENGTH, AVERAGE_VIDEO_SIZE, VIDEO_COUNT]")
  unlist(strsplit(res, ", "))
}

