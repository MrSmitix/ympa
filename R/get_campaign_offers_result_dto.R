#' Create a new GetCampaignOffersResultDTO
#'
#' @description
#' Список товаров в заданном магазине.
#'
#' @docType class
#' @title GetCampaignOffersResultDTO
#' @description GetCampaignOffersResultDTO Class
#' @format An \code{R6Class} generator object
#' @field paging  \link{ScrollingPagerDTO} [optional]
#' @field offers Страница списка товаров. list(\link{GetCampaignOfferDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetCampaignOffersResultDTO <- R6::R6Class(
  "GetCampaignOffersResultDTO",
  public = list(
    `paging` = NULL,
    `offers` = NULL,
    #' Initialize a new GetCampaignOffersResultDTO class.
    #'
    #' @description
    #' Initialize a new GetCampaignOffersResultDTO class.
    #'
    #' @param offers Страница списка товаров.
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
    #' @return GetCampaignOffersResultDTO in JSON format
    #' @export
    toJSON = function() {
      GetCampaignOffersResultDTOObject <- list()
      if (!is.null(self$`paging`)) {
        GetCampaignOffersResultDTOObject[["paging"]] <-
          self$`paging`$toJSON()
      }
      if (!is.null(self$`offers`)) {
        GetCampaignOffersResultDTOObject[["offers"]] <-
          lapply(self$`offers`, function(x) x$toJSON())
      }
      GetCampaignOffersResultDTOObject
    },
    #' Deserialize JSON string into an instance of GetCampaignOffersResultDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetCampaignOffersResultDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetCampaignOffersResultDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`paging`)) {
        `paging_object` <- ScrollingPagerDTO$new()
        `paging_object`$fromJSON(jsonlite::toJSON(this_object$`paging`, auto_unbox = TRUE, digits = NA))
        self$`paging` <- `paging_object`
      }
      if (!is.null(this_object$`offers`)) {
        self$`offers` <- ApiClient$new()$deserializeObj(this_object$`offers`, "array[GetCampaignOfferDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetCampaignOffersResultDTO in JSON format
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
    #' Deserialize JSON string into an instance of GetCampaignOffersResultDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetCampaignOffersResultDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetCampaignOffersResultDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`paging` <- ScrollingPagerDTO$new()$fromJSON(jsonlite::toJSON(this_object$`paging`, auto_unbox = TRUE, digits = NA))
      self$`offers` <- ApiClient$new()$deserializeObj(this_object$`offers`, "array[GetCampaignOfferDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to GetCampaignOffersResultDTO
    #'
    #' @description
    #' Validate JSON input with respect to GetCampaignOffersResultDTO and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for GetCampaignOffersResultDTO: the required field `offers` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetCampaignOffersResultDTO
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
# GetCampaignOffersResultDTO$unlock()
#
## Below is an example to define the print function
# GetCampaignOffersResultDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetCampaignOffersResultDTO$lock()

