#' Create a new GetOutletsResponse
#'
#' @description
#' Ответ на запрос информации о точках продаж.
#'
#' @docType class
#' @title GetOutletsResponse
#' @description GetOutletsResponse Class
#' @format An \code{R6Class} generator object
#' @field outlets Информация о точках продаж. list(\link{FullOutletDTO})
#' @field paging  \link{ScrollingPagerDTO} [optional]
#' @field pager  \link{FlippingPagerDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetOutletsResponse <- R6::R6Class(
  "GetOutletsResponse",
  public = list(
    `outlets` = NULL,
    `paging` = NULL,
    `pager` = NULL,
    #' Initialize a new GetOutletsResponse class.
    #'
    #' @description
    #' Initialize a new GetOutletsResponse class.
    #'
    #' @param outlets Информация о точках продаж.
    #' @param paging paging
    #' @param pager pager
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`outlets`, `paging` = NULL, `pager` = NULL, ...) {
      if (!missing(`outlets`)) {
        stopifnot(is.vector(`outlets`), length(`outlets`) != 0)
        sapply(`outlets`, function(x) stopifnot(R6::is.R6(x)))
        self$`outlets` <- `outlets`
      }
      if (!is.null(`paging`)) {
        stopifnot(R6::is.R6(`paging`))
        self$`paging` <- `paging`
      }
      if (!is.null(`pager`)) {
        stopifnot(R6::is.R6(`pager`))
        self$`pager` <- `pager`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetOutletsResponse in JSON format
    #' @export
    toJSON = function() {
      GetOutletsResponseObject <- list()
      if (!is.null(self$`outlets`)) {
        GetOutletsResponseObject[["outlets"]] <-
          lapply(self$`outlets`, function(x) x$toJSON())
      }
      if (!is.null(self$`paging`)) {
        GetOutletsResponseObject[["paging"]] <-
          self$`paging`$toJSON()
      }
      if (!is.null(self$`pager`)) {
        GetOutletsResponseObject[["pager"]] <-
          self$`pager`$toJSON()
      }
      GetOutletsResponseObject
    },
    #' Deserialize JSON string into an instance of GetOutletsResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetOutletsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetOutletsResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`outlets`)) {
        self$`outlets` <- ApiClient$new()$deserializeObj(this_object$`outlets`, "array[FullOutletDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`paging`)) {
        `paging_object` <- ScrollingPagerDTO$new()
        `paging_object`$fromJSON(jsonlite::toJSON(this_object$`paging`, auto_unbox = TRUE, digits = NA))
        self$`paging` <- `paging_object`
      }
      if (!is.null(this_object$`pager`)) {
        `pager_object` <- FlippingPagerDTO$new()
        `pager_object`$fromJSON(jsonlite::toJSON(this_object$`pager`, auto_unbox = TRUE, digits = NA))
        self$`pager` <- `pager_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetOutletsResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`outlets`)) {
          sprintf(
          '"outlets":
          [%s]
',
          paste(sapply(self$`outlets`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`paging`)) {
          sprintf(
          '"paging":
          %s
          ',
          jsonlite::toJSON(self$`paging`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`pager`)) {
          sprintf(
          '"pager":
          %s
          ',
          jsonlite::toJSON(self$`pager`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetOutletsResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetOutletsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetOutletsResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`outlets` <- ApiClient$new()$deserializeObj(this_object$`outlets`, "array[FullOutletDTO]", loadNamespace("ympa_r_client"))
      self$`paging` <- ScrollingPagerDTO$new()$fromJSON(jsonlite::toJSON(this_object$`paging`, auto_unbox = TRUE, digits = NA))
      self$`pager` <- FlippingPagerDTO$new()$fromJSON(jsonlite::toJSON(this_object$`pager`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to GetOutletsResponse
    #'
    #' @description
    #' Validate JSON input with respect to GetOutletsResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `outlets`
      if (!is.null(input_json$`outlets`)) {
        stopifnot(is.vector(input_json$`outlets`), length(input_json$`outlets`) != 0)
        tmp <- sapply(input_json$`outlets`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetOutletsResponse: the required field `outlets` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetOutletsResponse
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
      # check if the required `outlets` is null
      if (is.null(self$`outlets`)) {
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
      # check if the required `outlets` is null
      if (is.null(self$`outlets`)) {
        invalid_fields["outlets"] <- "Non-nullable required field `outlets` cannot be null."
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
# GetOutletsResponse$unlock()
#
## Below is an example to define the print function
# GetOutletsResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetOutletsResponse$lock()

