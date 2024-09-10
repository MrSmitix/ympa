#' Create a new GetRegionsResponse
#'
#' @description
#' GetRegionsResponse Class
#'
#' @docType class
#' @title GetRegionsResponse
#' @description GetRegionsResponse Class
#' @format An \code{R6Class} generator object
#' @field regions Регион доставки. list(\link{RegionDTO})
#' @field paging  \link{ForwardScrollingPagerDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetRegionsResponse <- R6::R6Class(
  "GetRegionsResponse",
  public = list(
    `regions` = NULL,
    `paging` = NULL,
    #' Initialize a new GetRegionsResponse class.
    #'
    #' @description
    #' Initialize a new GetRegionsResponse class.
    #'
    #' @param regions Регион доставки.
    #' @param paging paging
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`regions`, `paging` = NULL, ...) {
      if (!missing(`regions`)) {
        stopifnot(is.vector(`regions`), length(`regions`) != 0)
        sapply(`regions`, function(x) stopifnot(R6::is.R6(x)))
        self$`regions` <- `regions`
      }
      if (!is.null(`paging`)) {
        stopifnot(R6::is.R6(`paging`))
        self$`paging` <- `paging`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetRegionsResponse in JSON format
    #' @export
    toJSON = function() {
      GetRegionsResponseObject <- list()
      if (!is.null(self$`regions`)) {
        GetRegionsResponseObject[["regions"]] <-
          lapply(self$`regions`, function(x) x$toJSON())
      }
      if (!is.null(self$`paging`)) {
        GetRegionsResponseObject[["paging"]] <-
          self$`paging`$toJSON()
      }
      GetRegionsResponseObject
    },
    #' Deserialize JSON string into an instance of GetRegionsResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetRegionsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetRegionsResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`regions`)) {
        self$`regions` <- ApiClient$new()$deserializeObj(this_object$`regions`, "array[RegionDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`paging`)) {
        `paging_object` <- ForwardScrollingPagerDTO$new()
        `paging_object`$fromJSON(jsonlite::toJSON(this_object$`paging`, auto_unbox = TRUE, digits = NA))
        self$`paging` <- `paging_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetRegionsResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`regions`)) {
          sprintf(
          '"regions":
          [%s]
',
          paste(sapply(self$`regions`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`paging`)) {
          sprintf(
          '"paging":
          %s
          ',
          jsonlite::toJSON(self$`paging`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetRegionsResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetRegionsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetRegionsResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`regions` <- ApiClient$new()$deserializeObj(this_object$`regions`, "array[RegionDTO]", loadNamespace("ympa_r_client"))
      self$`paging` <- ForwardScrollingPagerDTO$new()$fromJSON(jsonlite::toJSON(this_object$`paging`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to GetRegionsResponse
    #'
    #' @description
    #' Validate JSON input with respect to GetRegionsResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `regions`
      if (!is.null(input_json$`regions`)) {
        stopifnot(is.vector(input_json$`regions`), length(input_json$`regions`) != 0)
        tmp <- sapply(input_json$`regions`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetRegionsResponse: the required field `regions` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetRegionsResponse
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
      # check if the required `regions` is null
      if (is.null(self$`regions`)) {
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
      # check if the required `regions` is null
      if (is.null(self$`regions`)) {
        invalid_fields["regions"] <- "Non-nullable required field `regions` cannot be null."
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
# GetRegionsResponse$unlock()
#
## Below is an example to define the print function
# GetRegionsResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetRegionsResponse$lock()

