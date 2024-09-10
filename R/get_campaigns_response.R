#' Create a new GetCampaignsResponse
#'
#' @description
#' Результаты поиска магазинов.
#'
#' @docType class
#' @title GetCampaignsResponse
#' @description GetCampaignsResponse Class
#' @format An \code{R6Class} generator object
#' @field campaigns Список с информацией по каждому магазину. list(\link{CampaignDTO})
#' @field pager  \link{FlippingPagerDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetCampaignsResponse <- R6::R6Class(
  "GetCampaignsResponse",
  public = list(
    `campaigns` = NULL,
    `pager` = NULL,
    #' Initialize a new GetCampaignsResponse class.
    #'
    #' @description
    #' Initialize a new GetCampaignsResponse class.
    #'
    #' @param campaigns Список с информацией по каждому магазину.
    #' @param pager pager
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`campaigns`, `pager` = NULL, ...) {
      if (!missing(`campaigns`)) {
        stopifnot(is.vector(`campaigns`), length(`campaigns`) != 0)
        sapply(`campaigns`, function(x) stopifnot(R6::is.R6(x)))
        self$`campaigns` <- `campaigns`
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
    #' @return GetCampaignsResponse in JSON format
    #' @export
    toJSON = function() {
      GetCampaignsResponseObject <- list()
      if (!is.null(self$`campaigns`)) {
        GetCampaignsResponseObject[["campaigns"]] <-
          lapply(self$`campaigns`, function(x) x$toJSON())
      }
      if (!is.null(self$`pager`)) {
        GetCampaignsResponseObject[["pager"]] <-
          self$`pager`$toJSON()
      }
      GetCampaignsResponseObject
    },
    #' Deserialize JSON string into an instance of GetCampaignsResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetCampaignsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetCampaignsResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`campaigns`)) {
        self$`campaigns` <- ApiClient$new()$deserializeObj(this_object$`campaigns`, "array[CampaignDTO]", loadNamespace("ympa_r_client"))
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
    #' @return GetCampaignsResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`campaigns`)) {
          sprintf(
          '"campaigns":
          [%s]
',
          paste(sapply(self$`campaigns`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
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
    #' Deserialize JSON string into an instance of GetCampaignsResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetCampaignsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetCampaignsResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`campaigns` <- ApiClient$new()$deserializeObj(this_object$`campaigns`, "array[CampaignDTO]", loadNamespace("ympa_r_client"))
      self$`pager` <- FlippingPagerDTO$new()$fromJSON(jsonlite::toJSON(this_object$`pager`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to GetCampaignsResponse
    #'
    #' @description
    #' Validate JSON input with respect to GetCampaignsResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `campaigns`
      if (!is.null(input_json$`campaigns`)) {
        stopifnot(is.vector(input_json$`campaigns`), length(input_json$`campaigns`) != 0)
        tmp <- sapply(input_json$`campaigns`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetCampaignsResponse: the required field `campaigns` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetCampaignsResponse
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
      # check if the required `campaigns` is null
      if (is.null(self$`campaigns`)) {
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
      # check if the required `campaigns` is null
      if (is.null(self$`campaigns`)) {
        invalid_fields["campaigns"] <- "Non-nullable required field `campaigns` cannot be null."
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
# GetCampaignsResponse$unlock()
#
## Below is an example to define the print function
# GetCampaignsResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetCampaignsResponse$lock()

