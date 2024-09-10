#' Create a new GetBidsInfoResponseDTO
#'
#' @description
#' Список товаров с указанными ставками.
#'
#' @docType class
#' @title GetBidsInfoResponseDTO
#' @description GetBidsInfoResponseDTO Class
#' @format An \code{R6Class} generator object
#' @field bids Страница списка товаров. list(\link{SkuBidItemDTO})
#' @field paging  \link{ForwardScrollingPagerDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetBidsInfoResponseDTO <- R6::R6Class(
  "GetBidsInfoResponseDTO",
  public = list(
    `bids` = NULL,
    `paging` = NULL,
    #' Initialize a new GetBidsInfoResponseDTO class.
    #'
    #' @description
    #' Initialize a new GetBidsInfoResponseDTO class.
    #'
    #' @param bids Страница списка товаров.
    #' @param paging paging
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`bids`, `paging` = NULL, ...) {
      if (!missing(`bids`)) {
        stopifnot(is.vector(`bids`), length(`bids`) != 0)
        sapply(`bids`, function(x) stopifnot(R6::is.R6(x)))
        self$`bids` <- `bids`
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
    #' @return GetBidsInfoResponseDTO in JSON format
    #' @export
    toJSON = function() {
      GetBidsInfoResponseDTOObject <- list()
      if (!is.null(self$`bids`)) {
        GetBidsInfoResponseDTOObject[["bids"]] <-
          lapply(self$`bids`, function(x) x$toJSON())
      }
      if (!is.null(self$`paging`)) {
        GetBidsInfoResponseDTOObject[["paging"]] <-
          self$`paging`$toJSON()
      }
      GetBidsInfoResponseDTOObject
    },
    #' Deserialize JSON string into an instance of GetBidsInfoResponseDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetBidsInfoResponseDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetBidsInfoResponseDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`bids`)) {
        self$`bids` <- ApiClient$new()$deserializeObj(this_object$`bids`, "array[SkuBidItemDTO]", loadNamespace("ympa_r_client"))
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
    #' @return GetBidsInfoResponseDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`bids`)) {
          sprintf(
          '"bids":
          [%s]
',
          paste(sapply(self$`bids`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
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
    #' Deserialize JSON string into an instance of GetBidsInfoResponseDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetBidsInfoResponseDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetBidsInfoResponseDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`bids` <- ApiClient$new()$deserializeObj(this_object$`bids`, "array[SkuBidItemDTO]", loadNamespace("ympa_r_client"))
      self$`paging` <- ForwardScrollingPagerDTO$new()$fromJSON(jsonlite::toJSON(this_object$`paging`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to GetBidsInfoResponseDTO
    #'
    #' @description
    #' Validate JSON input with respect to GetBidsInfoResponseDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `bids`
      if (!is.null(input_json$`bids`)) {
        stopifnot(is.vector(input_json$`bids`), length(input_json$`bids`) != 0)
        tmp <- sapply(input_json$`bids`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetBidsInfoResponseDTO: the required field `bids` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetBidsInfoResponseDTO
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
      # check if the required `bids` is null
      if (is.null(self$`bids`)) {
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
      # check if the required `bids` is null
      if (is.null(self$`bids`)) {
        invalid_fields["bids"] <- "Non-nullable required field `bids` cannot be null."
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
# GetBidsInfoResponseDTO$unlock()
#
## Below is an example to define the print function
# GetBidsInfoResponseDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetBidsInfoResponseDTO$lock()

