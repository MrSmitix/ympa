#' Create a new OfferCardsContentStatusDTO
#'
#' @description
#' Список товаров с информацией о состоянии карточек.
#'
#' @docType class
#' @title OfferCardsContentStatusDTO
#' @description OfferCardsContentStatusDTO Class
#' @format An \code{R6Class} generator object
#' @field offerCards Страница списка товаров с информацией о состоянии карточек. list(\link{OfferCardDTO})
#' @field paging  \link{ForwardScrollingPagerDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OfferCardsContentStatusDTO <- R6::R6Class(
  "OfferCardsContentStatusDTO",
  public = list(
    `offerCards` = NULL,
    `paging` = NULL,
    #' Initialize a new OfferCardsContentStatusDTO class.
    #'
    #' @description
    #' Initialize a new OfferCardsContentStatusDTO class.
    #'
    #' @param offerCards Страница списка товаров с информацией о состоянии карточек.
    #' @param paging paging
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offerCards`, `paging` = NULL, ...) {
      if (!missing(`offerCards`)) {
        stopifnot(is.vector(`offerCards`), length(`offerCards`) != 0)
        sapply(`offerCards`, function(x) stopifnot(R6::is.R6(x)))
        self$`offerCards` <- `offerCards`
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
    #' @return OfferCardsContentStatusDTO in JSON format
    #' @export
    toJSON = function() {
      OfferCardsContentStatusDTOObject <- list()
      if (!is.null(self$`offerCards`)) {
        OfferCardsContentStatusDTOObject[["offerCards"]] <-
          lapply(self$`offerCards`, function(x) x$toJSON())
      }
      if (!is.null(self$`paging`)) {
        OfferCardsContentStatusDTOObject[["paging"]] <-
          self$`paging`$toJSON()
      }
      OfferCardsContentStatusDTOObject
    },
    #' Deserialize JSON string into an instance of OfferCardsContentStatusDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferCardsContentStatusDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferCardsContentStatusDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`offerCards`)) {
        self$`offerCards` <- ApiClient$new()$deserializeObj(this_object$`offerCards`, "array[OfferCardDTO]", loadNamespace("ympa_r_client"))
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
    #' @return OfferCardsContentStatusDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`offerCards`)) {
          sprintf(
          '"offerCards":
          [%s]
',
          paste(sapply(self$`offerCards`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
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
    #' Deserialize JSON string into an instance of OfferCardsContentStatusDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferCardsContentStatusDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferCardsContentStatusDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`offerCards` <- ApiClient$new()$deserializeObj(this_object$`offerCards`, "array[OfferCardDTO]", loadNamespace("ympa_r_client"))
      self$`paging` <- ForwardScrollingPagerDTO$new()$fromJSON(jsonlite::toJSON(this_object$`paging`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to OfferCardsContentStatusDTO
    #'
    #' @description
    #' Validate JSON input with respect to OfferCardsContentStatusDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `offerCards`
      if (!is.null(input_json$`offerCards`)) {
        stopifnot(is.vector(input_json$`offerCards`), length(input_json$`offerCards`) != 0)
        tmp <- sapply(input_json$`offerCards`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OfferCardsContentStatusDTO: the required field `offerCards` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OfferCardsContentStatusDTO
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
      # check if the required `offerCards` is null
      if (is.null(self$`offerCards`)) {
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
      # check if the required `offerCards` is null
      if (is.null(self$`offerCards`)) {
        invalid_fields["offerCards"] <- "Non-nullable required field `offerCards` cannot be null."
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
# OfferCardsContentStatusDTO$unlock()
#
## Below is an example to define the print function
# OfferCardsContentStatusDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OfferCardsContentStatusDTO$lock()

