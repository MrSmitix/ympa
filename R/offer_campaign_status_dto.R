#' Create a new OfferCampaignStatusDTO
#'
#' @description
#' Статус товара в магазине.
#'
#' @docType class
#' @title OfferCampaignStatusDTO
#' @description OfferCampaignStatusDTO Class
#' @format An \code{R6Class} generator object
#' @field campaignId Идентификатор кампании. integer
#' @field status  \link{OfferCampaignStatusType}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OfferCampaignStatusDTO <- R6::R6Class(
  "OfferCampaignStatusDTO",
  public = list(
    `campaignId` = NULL,
    `status` = NULL,
    #' Initialize a new OfferCampaignStatusDTO class.
    #'
    #' @description
    #' Initialize a new OfferCampaignStatusDTO class.
    #'
    #' @param campaignId Идентификатор кампании.
    #' @param status status
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`campaignId`, `status`, ...) {
      if (!missing(`campaignId`)) {
        if (!(is.numeric(`campaignId`) && length(`campaignId`) == 1)) {
          stop(paste("Error! Invalid data for `campaignId`. Must be an integer:", `campaignId`))
        }
        self$`campaignId` <- `campaignId`
      }
      if (!missing(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferCampaignStatusDTO in JSON format
    #' @export
    toJSON = function() {
      OfferCampaignStatusDTOObject <- list()
      if (!is.null(self$`campaignId`)) {
        OfferCampaignStatusDTOObject[["campaignId"]] <-
          self$`campaignId`
      }
      if (!is.null(self$`status`)) {
        OfferCampaignStatusDTOObject[["status"]] <-
          self$`status`$toJSON()
      }
      OfferCampaignStatusDTOObject
    },
    #' Deserialize JSON string into an instance of OfferCampaignStatusDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferCampaignStatusDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferCampaignStatusDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`campaignId`)) {
        self$`campaignId` <- this_object$`campaignId`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- OfferCampaignStatusType$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferCampaignStatusDTO in JSON format
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
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
          %s
          ',
          jsonlite::toJSON(self$`status`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OfferCampaignStatusDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferCampaignStatusDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferCampaignStatusDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`campaignId` <- this_object$`campaignId`
      self$`status` <- OfferCampaignStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to OfferCampaignStatusDTO
    #'
    #' @description
    #' Validate JSON input with respect to OfferCampaignStatusDTO and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for OfferCampaignStatusDTO: the required field `campaignId` is missing."))
      }
      # check the required field `status`
      if (!is.null(input_json$`status`)) {
        stopifnot(R6::is.R6(input_json$`status`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OfferCampaignStatusDTO: the required field `status` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OfferCampaignStatusDTO
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

      # check if the required `status` is null
      if (is.null(self$`status`)) {
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

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        invalid_fields["status"] <- "Non-nullable required field `status` cannot be null."
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
# OfferCampaignStatusDTO$unlock()
#
## Below is an example to define the print function
# OfferCampaignStatusDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OfferCampaignStatusDTO$lock()

