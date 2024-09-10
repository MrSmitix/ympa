#' Create a new GetPricesByOfferIdsRequest
#'
#' @description
#' Запрос списка цен.
#'
#' @docType class
#' @title GetPricesByOfferIdsRequest
#' @description GetPricesByOfferIdsRequest Class
#' @format An \code{R6Class} generator object
#' @field offerIds Список SKU.  {\% note warning \"Такой список возвращается только целиком\" \%}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {\% endnote \%}    list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetPricesByOfferIdsRequest <- R6::R6Class(
  "GetPricesByOfferIdsRequest",
  public = list(
    `offerIds` = NULL,
    #' Initialize a new GetPricesByOfferIdsRequest class.
    #'
    #' @description
    #' Initialize a new GetPricesByOfferIdsRequest class.
    #'
    #' @param offerIds Список SKU.  {\% note warning \"Такой список возвращается только целиком\" \%}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {\% endnote \%}   
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offerIds` = NULL, ...) {
      if (!is.null(`offerIds`)) {
        stopifnot(is.vector(`offerIds`), length(`offerIds`) != 0)
        sapply(`offerIds`, function(x) stopifnot(is.character(x)))
        self$`offerIds` <- `offerIds`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetPricesByOfferIdsRequest in JSON format
    #' @export
    toJSON = function() {
      GetPricesByOfferIdsRequestObject <- list()
      if (!is.null(self$`offerIds`)) {
        GetPricesByOfferIdsRequestObject[["offerIds"]] <-
          self$`offerIds`
      }
      GetPricesByOfferIdsRequestObject
    },
    #' Deserialize JSON string into an instance of GetPricesByOfferIdsRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetPricesByOfferIdsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetPricesByOfferIdsRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`offerIds`)) {
        self$`offerIds` <- ApiClient$new()$deserializeObj(this_object$`offerIds`, "array[character]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetPricesByOfferIdsRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`offerIds`)) {
          sprintf(
          '"offerIds":
             [%s]
          ',
          paste(unlist(lapply(self$`offerIds`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetPricesByOfferIdsRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetPricesByOfferIdsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetPricesByOfferIdsRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`offerIds` <- ApiClient$new()$deserializeObj(this_object$`offerIds`, "array[character]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to GetPricesByOfferIdsRequest
    #'
    #' @description
    #' Validate JSON input with respect to GetPricesByOfferIdsRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetPricesByOfferIdsRequest
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      if (length(self$`offerIds`) > 2000) {
        return(FALSE)
      }
      if (length(self$`offerIds`) < 1) {
        return(FALSE)
      }

      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      if (length(self$`offerIds`) > 2000) {
        invalid_fields["offerIds"] <- "Invalid length for `offerIds`, number of items must be less than or equal to 2000."
      }
      if (length(self$`offerIds`) < 1) {
        invalid_fields["offerIds"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
      }

      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# GetPricesByOfferIdsRequest$unlock()
#
## Below is an example to define the print function
# GetPricesByOfferIdsRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetPricesByOfferIdsRequest$lock()

