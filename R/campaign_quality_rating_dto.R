#' Create a new CampaignQualityRatingDTO
#'
#' @description
#' Информация об индексе качества магазина.
#'
#' @docType class
#' @title CampaignQualityRatingDTO
#' @description CampaignQualityRatingDTO Class
#' @format An \code{R6Class} generator object
#' @field campaignId Идентификатор магазина. integer
#' @field ratings Список значений индекса качества. list(\link{QualityRatingDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignQualityRatingDTO <- R6::R6Class(
  "CampaignQualityRatingDTO",
  public = list(
    `campaignId` = NULL,
    `ratings` = NULL,
    #' Initialize a new CampaignQualityRatingDTO class.
    #'
    #' @description
    #' Initialize a new CampaignQualityRatingDTO class.
    #'
    #' @param campaignId Идентификатор магазина.
    #' @param ratings Список значений индекса качества.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`campaignId`, `ratings`, ...) {
      if (!missing(`campaignId`)) {
        if (!(is.numeric(`campaignId`) && length(`campaignId`) == 1)) {
          stop(paste("Error! Invalid data for `campaignId`. Must be an integer:", `campaignId`))
        }
        self$`campaignId` <- `campaignId`
      }
      if (!missing(`ratings`)) {
        stopifnot(is.vector(`ratings`), length(`ratings`) != 0)
        sapply(`ratings`, function(x) stopifnot(R6::is.R6(x)))
        self$`ratings` <- `ratings`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CampaignQualityRatingDTO in JSON format
    #' @export
    toJSON = function() {
      CampaignQualityRatingDTOObject <- list()
      if (!is.null(self$`campaignId`)) {
        CampaignQualityRatingDTOObject[["campaignId"]] <-
          self$`campaignId`
      }
      if (!is.null(self$`ratings`)) {
        CampaignQualityRatingDTOObject[["ratings"]] <-
          lapply(self$`ratings`, function(x) x$toJSON())
      }
      CampaignQualityRatingDTOObject
    },
    #' Deserialize JSON string into an instance of CampaignQualityRatingDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of CampaignQualityRatingDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignQualityRatingDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`campaignId`)) {
        self$`campaignId` <- this_object$`campaignId`
      }
      if (!is.null(this_object$`ratings`)) {
        self$`ratings` <- ApiClient$new()$deserializeObj(this_object$`ratings`, "array[QualityRatingDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CampaignQualityRatingDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`campaignId`)) {
          sprintf(
          '"campaignId":
            %d
                    ',
          self$`campaignId`
          )
        },
        if (!is.null(self$`ratings`)) {
          sprintf(
          '"ratings":
          [%s]
',
          paste(sapply(self$`ratings`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CampaignQualityRatingDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of CampaignQualityRatingDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignQualityRatingDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`campaignId` <- this_object$`campaignId`
      self$`ratings` <- ApiClient$new()$deserializeObj(this_object$`ratings`, "array[QualityRatingDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to CampaignQualityRatingDTO
    #'
    #' @description
    #' Validate JSON input with respect to CampaignQualityRatingDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `campaignId`
      if (!is.null(input_json$`campaignId`)) {
        if (!(is.numeric(input_json$`campaignId`) && length(input_json$`campaignId`) == 1)) {
          stop(paste("Error! Invalid data for `campaignId`. Must be an integer:", input_json$`campaignId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CampaignQualityRatingDTO: the required field `campaignId` is missing."))
      }
      # check the required field `ratings`
      if (!is.null(input_json$`ratings`)) {
        stopifnot(is.vector(input_json$`ratings`), length(input_json$`ratings`) != 0)
        tmp <- sapply(input_json$`ratings`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CampaignQualityRatingDTO: the required field `ratings` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CampaignQualityRatingDTO
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
      # check if the required `campaignId` is null
      if (is.null(self$`campaignId`)) {
        return(FALSE)
      }

      # check if the required `ratings` is null
      if (is.null(self$`ratings`)) {
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
      # check if the required `campaignId` is null
      if (is.null(self$`campaignId`)) {
        invalid_fields["campaignId"] <- "Non-nullable required field `campaignId` cannot be null."
      }

      # check if the required `ratings` is null
      if (is.null(self$`ratings`)) {
        invalid_fields["ratings"] <- "Non-nullable required field `ratings` cannot be null."
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
# CampaignQualityRatingDTO$unlock()
#
## Below is an example to define the print function
# CampaignQualityRatingDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CampaignQualityRatingDTO$lock()

