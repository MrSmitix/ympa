#' Create a new GetRegionWithChildrenResponse
#'
#' @description
#' GetRegionWithChildrenResponse Class
#'
#' @docType class
#' @title GetRegionWithChildrenResponse
#' @description GetRegionWithChildrenResponse Class
#' @format An \code{R6Class} generator object
#' @field pager  \link{FlippingPagerDTO} [optional]
#' @field regions  \link{RegionDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetRegionWithChildrenResponse <- R6::R6Class(
  "GetRegionWithChildrenResponse",
  public = list(
    `pager` = NULL,
    `regions` = NULL,
    #' Initialize a new GetRegionWithChildrenResponse class.
    #'
    #' @description
    #' Initialize a new GetRegionWithChildrenResponse class.
    #'
    #' @param pager pager
    #' @param regions regions
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`pager` = NULL, `regions` = NULL, ...) {
      if (!is.null(`pager`)) {
        stopifnot(R6::is.R6(`pager`))
        self$`pager` <- `pager`
      }
      if (!is.null(`regions`)) {
        stopifnot(R6::is.R6(`regions`))
        self$`regions` <- `regions`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetRegionWithChildrenResponse in JSON format
    #' @export
    toJSON = function() {
      GetRegionWithChildrenResponseObject <- list()
      if (!is.null(self$`pager`)) {
        GetRegionWithChildrenResponseObject[["pager"]] <-
          self$`pager`$toJSON()
      }
      if (!is.null(self$`regions`)) {
        GetRegionWithChildrenResponseObject[["regions"]] <-
          self$`regions`$toJSON()
      }
      GetRegionWithChildrenResponseObject
    },
    #' Deserialize JSON string into an instance of GetRegionWithChildrenResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetRegionWithChildrenResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetRegionWithChildrenResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`pager`)) {
        `pager_object` <- FlippingPagerDTO$new()
        `pager_object`$fromJSON(jsonlite::toJSON(this_object$`pager`, auto_unbox = TRUE, digits = NA))
        self$`pager` <- `pager_object`
      }
      if (!is.null(this_object$`regions`)) {
        `regions_object` <- RegionDTO$new()
        `regions_object`$fromJSON(jsonlite::toJSON(this_object$`regions`, auto_unbox = TRUE, digits = NA))
        self$`regions` <- `regions_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetRegionWithChildrenResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`pager`)) {
          sprintf(
          '"pager":
          %s
          ',
          jsonlite::toJSON(self$`pager`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`regions`)) {
          sprintf(
          '"regions":
          %s
          ',
          jsonlite::toJSON(self$`regions`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetRegionWithChildrenResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetRegionWithChildrenResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetRegionWithChildrenResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`pager` <- FlippingPagerDTO$new()$fromJSON(jsonlite::toJSON(this_object$`pager`, auto_unbox = TRUE, digits = NA))
      self$`regions` <- RegionDTO$new()$fromJSON(jsonlite::toJSON(this_object$`regions`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to GetRegionWithChildrenResponse
    #'
    #' @description
    #' Validate JSON input with respect to GetRegionWithChildrenResponse and throw an exception if invalid
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
    #' @return String representation of GetRegionWithChildrenResponse
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
# GetRegionWithChildrenResponse$unlock()
#
## Below is an example to define the print function
# GetRegionWithChildrenResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetRegionWithChildrenResponse$lock()

