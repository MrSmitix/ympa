#' Create a new GetQuarantineOffersResultDTO
#'
#' @description
#' Список товаров в карантине.
#'
#' @docType class
#' @title GetQuarantineOffersResultDTO
#' @description GetQuarantineOffersResultDTO Class
#' @format An \code{R6Class} generator object
#' @field paging  \link{ScrollingPagerDTO} [optional]
#' @field offers Страница списка товаров в карантине. list(\link{QuarantineOfferDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetQuarantineOffersResultDTO <- R6::R6Class(
  "GetQuarantineOffersResultDTO",
  public = list(
    `paging` = NULL,
    `offers` = NULL,
    #' Initialize a new GetQuarantineOffersResultDTO class.
    #'
    #' @description
    #' Initialize a new GetQuarantineOffersResultDTO class.
    #'
    #' @param offers Страница списка товаров в карантине.
    #' @param paging paging
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offers`, `paging` = NULL, ...) {
      if (!missing(`offers`)) {
        stopifnot(is.vector(`offers`), length(`offers`) != 0)
        sapply(`offers`, function(x) stopifnot(R6::is.R6(x)))
        self$`offers` <- `offers`
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
    #' @return GetQuarantineOffersResultDTO in JSON format
    #' @export
    toJSON = function() {
      GetQuarantineOffersResultDTOObject <- list()
      if (!is.null(self$`paging`)) {
        GetQuarantineOffersResultDTOObject[["paging"]] <-
          self$`paging`$toJSON()
      }
      if (!is.null(self$`offers`)) {
        GetQuarantineOffersResultDTOObject[["offers"]] <-
          lapply(self$`offers`, function(x) x$toJSON())
      }
      GetQuarantineOffersResultDTOObject
    },
    #' Deserialize JSON string into an instance of GetQuarantineOffersResultDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetQuarantineOffersResultDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetQuarantineOffersResultDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`paging`)) {
        `paging_object` <- ScrollingPagerDTO$new()
        `paging_object`$fromJSON(jsonlite::toJSON(this_object$`paging`, auto_unbox = TRUE, digits = NA))
        self$`paging` <- `paging_object`
      }
      if (!is.null(this_object$`offers`)) {
        self$`offers` <- ApiClient$new()$deserializeObj(this_object$`offers`, "array[QuarantineOfferDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetQuarantineOffersResultDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`paging`)) {
          sprintf(
          '"paging":
          %s
          ',
          jsonlite::toJSON(self$`paging`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`offers`)) {
          sprintf(
          '"offers":
          [%s]
',
          paste(sapply(self$`offers`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetQuarantineOffersResultDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetQuarantineOffersResultDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetQuarantineOffersResultDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`paging` <- ScrollingPagerDTO$new()$fromJSON(jsonlite::toJSON(this_object$`paging`, auto_unbox = TRUE, digits = NA))
      self$`offers` <- ApiClient$new()$deserializeObj(this_object$`offers`, "array[QuarantineOfferDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to GetQuarantineOffersResultDTO
    #'
    #' @description
    #' Validate JSON input with respect to GetQuarantineOffersResultDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `offers`
      if (!is.null(input_json$`offers`)) {
        stopifnot(is.vector(input_json$`offers`), length(input_json$`offers`) != 0)
        tmp <- sapply(input_json$`offers`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetQuarantineOffersResultDTO: the required field `offers` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetQuarantineOffersResultDTO
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
      # check if the required `offers` is null
      if (is.null(self$`offers`)) {
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
      # check if the required `offers` is null
      if (is.null(self$`offers`)) {
        invalid_fields["offers"] <- "Non-nullable required field `offers` cannot be null."
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
# GetQuarantineOffersResultDTO$unlock()
#
## Below is an example to define the print function
# GetQuarantineOffersResultDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetQuarantineOffersResultDTO$lock()

