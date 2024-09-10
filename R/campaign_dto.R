#' Create a new CampaignDTO
#'
#' @description
#' Информация о магазине.
#'
#' @docType class
#' @title CampaignDTO
#' @description CampaignDTO Class
#' @format An \code{R6Class} generator object
#' @field domain URL магазина. character [optional]
#' @field id Идентификатор кампании. integer [optional]
#' @field clientId Идентификатор плательщика в Яндекс Балансе. integer [optional]
#' @field business  \link{BusinessDTO} [optional]
#' @field placementType  \link{PlacementType} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignDTO <- R6::R6Class(
  "CampaignDTO",
  public = list(
    `domain` = NULL,
    `id` = NULL,
    `clientId` = NULL,
    `business` = NULL,
    `placementType` = NULL,
    #' Initialize a new CampaignDTO class.
    #'
    #' @description
    #' Initialize a new CampaignDTO class.
    #'
    #' @param domain URL магазина.
    #' @param id Идентификатор кампании.
    #' @param clientId Идентификатор плательщика в Яндекс Балансе.
    #' @param business business
    #' @param placementType placementType
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`domain` = NULL, `id` = NULL, `clientId` = NULL, `business` = NULL, `placementType` = NULL, ...) {
      if (!is.null(`domain`)) {
        if (!(is.character(`domain`) && length(`domain`) == 1)) {
          stop(paste("Error! Invalid data for `domain`. Must be a string:", `domain`))
        }
        self$`domain` <- `domain`
      }
      if (!is.null(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`clientId`)) {
        if (!(is.numeric(`clientId`) && length(`clientId`) == 1)) {
          stop(paste("Error! Invalid data for `clientId`. Must be an integer:", `clientId`))
        }
        self$`clientId` <- `clientId`
      }
      if (!is.null(`business`)) {
        stopifnot(R6::is.R6(`business`))
        self$`business` <- `business`
      }
      if (!is.null(`placementType`)) {
        if (!(`placementType` %in% c())) {
          stop(paste("Error! \"", `placementType`, "\" cannot be assigned to `placementType`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`placementType`))
        self$`placementType` <- `placementType`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CampaignDTO in JSON format
    #' @export
    toJSON = function() {
      CampaignDTOObject <- list()
      if (!is.null(self$`domain`)) {
        CampaignDTOObject[["domain"]] <-
          self$`domain`
      }
      if (!is.null(self$`id`)) {
        CampaignDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`clientId`)) {
        CampaignDTOObject[["clientId"]] <-
          self$`clientId`
      }
      if (!is.null(self$`business`)) {
        CampaignDTOObject[["business"]] <-
          self$`business`$toJSON()
      }
      if (!is.null(self$`placementType`)) {
        CampaignDTOObject[["placementType"]] <-
          self$`placementType`$toJSON()
      }
      CampaignDTOObject
    },
    #' Deserialize JSON string into an instance of CampaignDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of CampaignDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`domain`)) {
        self$`domain` <- this_object$`domain`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`clientId`)) {
        self$`clientId` <- this_object$`clientId`
      }
      if (!is.null(this_object$`business`)) {
        `business_object` <- BusinessDTO$new()
        `business_object`$fromJSON(jsonlite::toJSON(this_object$`business`, auto_unbox = TRUE, digits = NA))
        self$`business` <- `business_object`
      }
      if (!is.null(this_object$`placementType`)) {
        `placementtype_object` <- PlacementType$new()
        `placementtype_object`$fromJSON(jsonlite::toJSON(this_object$`placementType`, auto_unbox = TRUE, digits = NA))
        self$`placementType` <- `placementtype_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CampaignDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`domain`)) {
          sprintf(
          '"domain":
            "%s"
                    ',
          self$`domain`
          )
        },
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            %d
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`clientId`)) {
          sprintf(
          '"clientId":
            %d
                    ',
          self$`clientId`
          )
        },
        if (!is.null(self$`business`)) {
          sprintf(
          '"business":
          %s
          ',
          jsonlite::toJSON(self$`business`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`placementType`)) {
          sprintf(
          '"placementType":
          %s
          ',
          jsonlite::toJSON(self$`placementType`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CampaignDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of CampaignDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`domain` <- this_object$`domain`
      self$`id` <- this_object$`id`
      self$`clientId` <- this_object$`clientId`
      self$`business` <- BusinessDTO$new()$fromJSON(jsonlite::toJSON(this_object$`business`, auto_unbox = TRUE, digits = NA))
      self$`placementType` <- PlacementType$new()$fromJSON(jsonlite::toJSON(this_object$`placementType`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to CampaignDTO
    #'
    #' @description
    #' Validate JSON input with respect to CampaignDTO and throw an exception if invalid
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
    #' @return String representation of CampaignDTO
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
# CampaignDTO$unlock()
#
## Below is an example to define the print function
# CampaignDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CampaignDTO$lock()

