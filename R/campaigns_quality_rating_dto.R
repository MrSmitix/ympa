#' Create a new CampaignsQualityRatingDTO
#'
#' @description
#' Информация об индексе качества магазинов.
#'
#' @docType class
#' @title CampaignsQualityRatingDTO
#' @description CampaignsQualityRatingDTO Class
#' @format An \code{R6Class} generator object
#' @field campaignRatings Список магазинов c информацией об их индексе качества. list(\link{CampaignQualityRatingDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignsQualityRatingDTO <- R6::R6Class(
  "CampaignsQualityRatingDTO",
  public = list(
    `campaignRatings` = NULL,
    #' Initialize a new CampaignsQualityRatingDTO class.
    #'
    #' @description
    #' Initialize a new CampaignsQualityRatingDTO class.
    #'
    #' @param campaignRatings Список магазинов c информацией об их индексе качества.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`campaignRatings`, ...) {
      if (!missing(`campaignRatings`)) {
        stopifnot(is.vector(`campaignRatings`), length(`campaignRatings`) != 0)
        sapply(`campaignRatings`, function(x) stopifnot(R6::is.R6(x)))
        self$`campaignRatings` <- `campaignRatings`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CampaignsQualityRatingDTO in JSON format
    #' @export
    toJSON = function() {
      CampaignsQualityRatingDTOObject <- list()
      if (!is.null(self$`campaignRatings`)) {
        CampaignsQualityRatingDTOObject[["campaignRatings"]] <-
          lapply(self$`campaignRatings`, function(x) x$toJSON())
      }
      CampaignsQualityRatingDTOObject
    },
    #' Deserialize JSON string into an instance of CampaignsQualityRatingDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of CampaignsQualityRatingDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignsQualityRatingDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`campaignRatings`)) {
        self$`campaignRatings` <- ApiClient$new()$deserializeObj(this_object$`campaignRatings`, "array[CampaignQualityRatingDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CampaignsQualityRatingDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`campaignRatings`)) {
          sprintf(
          '"campaignRatings":
          [%s]
',
          paste(sapply(self$`campaignRatings`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CampaignsQualityRatingDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of CampaignsQualityRatingDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignsQualityRatingDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`campaignRatings` <- ApiClient$new()$deserializeObj(this_object$`campaignRatings`, "array[CampaignQualityRatingDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to CampaignsQualityRatingDTO
    #'
    #' @description
    #' Validate JSON input with respect to CampaignsQualityRatingDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `campaignRatings`
      if (!is.null(input_json$`campaignRatings`)) {
        stopifnot(is.vector(input_json$`campaignRatings`), length(input_json$`campaignRatings`) != 0)
        tmp <- sapply(input_json$`campaignRatings`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CampaignsQualityRatingDTO: the required field `campaignRatings` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CampaignsQualityRatingDTO
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
      # check if the required `campaignRatings` is null
      if (is.null(self$`campaignRatings`)) {
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
      # check if the required `campaignRatings` is null
      if (is.null(self$`campaignRatings`)) {
        invalid_fields["campaignRatings"] <- "Non-nullable required field `campaignRatings` cannot be null."
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
# CampaignsQualityRatingDTO$unlock()
#
## Below is an example to define the print function
# CampaignsQualityRatingDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CampaignsQualityRatingDTO$lock()

