#' Create a new GetPromoOffersResultDTO
#'
#' @description
#' Список товаров, которые участвуют или могут участвовать в акции.
#'
#' @docType class
#' @title GetPromoOffersResultDTO
#' @description GetPromoOffersResultDTO Class
#' @format An \code{R6Class} generator object
#' @field offers Товары, которые участвуют или могут участвовать в акции. list(\link{GetPromoOfferDTO})
#' @field paging  \link{ForwardScrollingPagerDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetPromoOffersResultDTO <- R6::R6Class(
  "GetPromoOffersResultDTO",
  public = list(
    `offers` = NULL,
    `paging` = NULL,
    #' Initialize a new GetPromoOffersResultDTO class.
    #'
    #' @description
    #' Initialize a new GetPromoOffersResultDTO class.
    #'
    #' @param offers Товары, которые участвуют или могут участвовать в акции.
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
    #' @return GetPromoOffersResultDTO in JSON format
    #' @export
    toJSON = function() {
      GetPromoOffersResultDTOObject <- list()
      if (!is.null(self$`offers`)) {
        GetPromoOffersResultDTOObject[["offers"]] <-
          lapply(self$`offers`, function(x) x$toJSON())
      }
      if (!is.null(self$`paging`)) {
        GetPromoOffersResultDTOObject[["paging"]] <-
          self$`paging`$toJSON()
      }
      GetPromoOffersResultDTOObject
    },
    #' Deserialize JSON string into an instance of GetPromoOffersResultDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetPromoOffersResultDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetPromoOffersResultDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`offers`)) {
        self$`offers` <- ApiClient$new()$deserializeObj(this_object$`offers`, "array[GetPromoOfferDTO]", loadNamespace("ympa_r_client"))
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
    #' @return GetPromoOffersResultDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`offers`)) {
          sprintf(
          '"offers":
          [%s]
',
          paste(sapply(self$`offers`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
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
    #' Deserialize JSON string into an instance of GetPromoOffersResultDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetPromoOffersResultDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetPromoOffersResultDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`offers` <- ApiClient$new()$deserializeObj(this_object$`offers`, "array[GetPromoOfferDTO]", loadNamespace("ympa_r_client"))
      self$`paging` <- ForwardScrollingPagerDTO$new()$fromJSON(jsonlite::toJSON(this_object$`paging`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to GetPromoOffersResultDTO
    #'
    #' @description
    #' Validate JSON input with respect to GetPromoOffersResultDTO and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for GetPromoOffersResultDTO: the required field `offers` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetPromoOffersResultDTO
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
# GetPromoOffersResultDTO$unlock()
#
## Below is an example to define the print function
# GetPromoOffersResultDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetPromoOffersResultDTO$lock()

