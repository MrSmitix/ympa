#' Create a new CampaignSettingsLocalRegionDTO
#'
#' @description
#' Информация о своем регионе магазина.
#'
#' @docType class
#' @title CampaignSettingsLocalRegionDTO
#' @description CampaignSettingsLocalRegionDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор региона. integer [optional]
#' @field name Название региона. character [optional]
#' @field type  \link{RegionType} [optional]
#' @field deliveryOptionsSource  \link{CampaignSettingsScheduleSourceType} [optional]
#' @field delivery  \link{CampaignSettingsDeliveryDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignSettingsLocalRegionDTO <- R6::R6Class(
  "CampaignSettingsLocalRegionDTO",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `type` = NULL,
    `deliveryOptionsSource` = NULL,
    `delivery` = NULL,
    #' Initialize a new CampaignSettingsLocalRegionDTO class.
    #'
    #' @description
    #' Initialize a new CampaignSettingsLocalRegionDTO class.
    #'
    #' @param id Идентификатор региона.
    #' @param name Название региона.
    #' @param type type
    #' @param deliveryOptionsSource deliveryOptionsSource
    #' @param delivery delivery
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id` = NULL, `name` = NULL, `type` = NULL, `deliveryOptionsSource` = NULL, `delivery` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`type`)) {
        if (!(`type` %in% c())) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
      if (!is.null(`deliveryOptionsSource`)) {
        if (!(`deliveryOptionsSource` %in% c())) {
          stop(paste("Error! \"", `deliveryOptionsSource`, "\" cannot be assigned to `deliveryOptionsSource`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`deliveryOptionsSource`))
        self$`deliveryOptionsSource` <- `deliveryOptionsSource`
      }
      if (!is.null(`delivery`)) {
        stopifnot(R6::is.R6(`delivery`))
        self$`delivery` <- `delivery`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CampaignSettingsLocalRegionDTO in JSON format
    #' @export
    toJSON = function() {
      CampaignSettingsLocalRegionDTOObject <- list()
      if (!is.null(self$`id`)) {
        CampaignSettingsLocalRegionDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        CampaignSettingsLocalRegionDTOObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`type`)) {
        CampaignSettingsLocalRegionDTOObject[["type"]] <-
          self$`type`$toJSON()
      }
      if (!is.null(self$`deliveryOptionsSource`)) {
        CampaignSettingsLocalRegionDTOObject[["deliveryOptionsSource"]] <-
          self$`deliveryOptionsSource`$toJSON()
      }
      if (!is.null(self$`delivery`)) {
        CampaignSettingsLocalRegionDTOObject[["delivery"]] <-
          self$`delivery`$toJSON()
      }
      CampaignSettingsLocalRegionDTOObject
    },
    #' Deserialize JSON string into an instance of CampaignSettingsLocalRegionDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of CampaignSettingsLocalRegionDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignSettingsLocalRegionDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`type`)) {
        `type_object` <- RegionType$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
      if (!is.null(this_object$`deliveryOptionsSource`)) {
        `deliveryoptionssource_object` <- CampaignSettingsScheduleSourceType$new()
        `deliveryoptionssource_object`$fromJSON(jsonlite::toJSON(this_object$`deliveryOptionsSource`, auto_unbox = TRUE, digits = NA))
        self$`deliveryOptionsSource` <- `deliveryoptionssource_object`
      }
      if (!is.null(this_object$`delivery`)) {
        `delivery_object` <- CampaignSettingsDeliveryDTO$new()
        `delivery_object`$fromJSON(jsonlite::toJSON(this_object$`delivery`, auto_unbox = TRUE, digits = NA))
        self$`delivery` <- `delivery_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CampaignSettingsLocalRegionDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            %d
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        },
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
          %s
          ',
          jsonlite::toJSON(self$`type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`deliveryOptionsSource`)) {
          sprintf(
          '"deliveryOptionsSource":
          %s
          ',
          jsonlite::toJSON(self$`deliveryOptionsSource`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`delivery`)) {
          sprintf(
          '"delivery":
          %s
          ',
          jsonlite::toJSON(self$`delivery`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CampaignSettingsLocalRegionDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of CampaignSettingsLocalRegionDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignSettingsLocalRegionDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`type` <- RegionType$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self$`deliveryOptionsSource` <- CampaignSettingsScheduleSourceType$new()$fromJSON(jsonlite::toJSON(this_object$`deliveryOptionsSource`, auto_unbox = TRUE, digits = NA))
      self$`delivery` <- CampaignSettingsDeliveryDTO$new()$fromJSON(jsonlite::toJSON(this_object$`delivery`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to CampaignSettingsLocalRegionDTO
    #'
    #' @description
    #' Validate JSON input with respect to CampaignSettingsLocalRegionDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CampaignSettingsLocalRegionDTO
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
# CampaignSettingsLocalRegionDTO$unlock()
#
## Below is an example to define the print function
# CampaignSettingsLocalRegionDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CampaignSettingsLocalRegionDTO$lock()

