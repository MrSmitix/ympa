#' Create a new WarehouseDTO
#'
#' @description
#' Информация о складе.
#'
#' @docType class
#' @title WarehouseDTO
#' @description WarehouseDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор склада. integer
#' @field name Название склада. character
#' @field campaignId Идентификатор кампании в API и идентификатор магазина. integer
#' @field express Возможна ли доставка по модели Экспресс. character
#' @field address  \link{WarehouseAddressDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
WarehouseDTO <- R6::R6Class(
  "WarehouseDTO",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `campaignId` = NULL,
    `express` = NULL,
    `address` = NULL,
    #' Initialize a new WarehouseDTO class.
    #'
    #' @description
    #' Initialize a new WarehouseDTO class.
    #'
    #' @param id Идентификатор склада.
    #' @param name Название склада.
    #' @param campaignId Идентификатор кампании в API и идентификатор магазина.
    #' @param express Возможна ли доставка по модели Экспресс.
    #' @param address address
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id`, `name`, `campaignId`, `express`, `address` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!missing(`campaignId`)) {
        if (!(is.numeric(`campaignId`) && length(`campaignId`) == 1)) {
          stop(paste("Error! Invalid data for `campaignId`. Must be an integer:", `campaignId`))
        }
        self$`campaignId` <- `campaignId`
      }
      if (!missing(`express`)) {
        if (!(is.logical(`express`) && length(`express`) == 1)) {
          stop(paste("Error! Invalid data for `express`. Must be a boolean:", `express`))
        }
        self$`express` <- `express`
      }
      if (!is.null(`address`)) {
        stopifnot(R6::is.R6(`address`))
        self$`address` <- `address`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return WarehouseDTO in JSON format
    #' @export
    toJSON = function() {
      WarehouseDTOObject <- list()
      if (!is.null(self$`id`)) {
        WarehouseDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        WarehouseDTOObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`campaignId`)) {
        WarehouseDTOObject[["campaignId"]] <-
          self$`campaignId`
      }
      if (!is.null(self$`express`)) {
        WarehouseDTOObject[["express"]] <-
          self$`express`
      }
      if (!is.null(self$`address`)) {
        WarehouseDTOObject[["address"]] <-
          self$`address`$toJSON()
      }
      WarehouseDTOObject
    },
    #' Deserialize JSON string into an instance of WarehouseDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of WarehouseDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of WarehouseDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`campaignId`)) {
        self$`campaignId` <- this_object$`campaignId`
      }
      if (!is.null(this_object$`express`)) {
        self$`express` <- this_object$`express`
      }
      if (!is.null(this_object$`address`)) {
        `address_object` <- WarehouseAddressDTO$new()
        `address_object`$fromJSON(jsonlite::toJSON(this_object$`address`, auto_unbox = TRUE, digits = NA))
        self$`address` <- `address_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return WarehouseDTO in JSON format
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
        if (!is.null(self$`campaignId`)) {
          sprintf(
          '"campaignId":
            %d
                    ',
          self$`campaignId`
          )
        },
        if (!is.null(self$`express`)) {
          sprintf(
          '"express":
            %s
                    ',
          tolower(self$`express`)
          )
        },
        if (!is.null(self$`address`)) {
          sprintf(
          '"address":
          %s
          ',
          jsonlite::toJSON(self$`address`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of WarehouseDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of WarehouseDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of WarehouseDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`campaignId` <- this_object$`campaignId`
      self$`express` <- this_object$`express`
      self$`address` <- WarehouseAddressDTO$new()$fromJSON(jsonlite::toJSON(this_object$`address`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to WarehouseDTO
    #'
    #' @description
    #' Validate JSON input with respect to WarehouseDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.numeric(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for WarehouseDTO: the required field `id` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for WarehouseDTO: the required field `name` is missing."))
      }
      # check the required field `campaignId`
      if (!is.null(input_json$`campaignId`)) {
        if (!(is.numeric(input_json$`campaignId`) && length(input_json$`campaignId`) == 1)) {
          stop(paste("Error! Invalid data for `campaignId`. Must be an integer:", input_json$`campaignId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for WarehouseDTO: the required field `campaignId` is missing."))
      }
      # check the required field `express`
      if (!is.null(input_json$`express`)) {
        if (!(is.logical(input_json$`express`) && length(input_json$`express`) == 1)) {
          stop(paste("Error! Invalid data for `express`. Must be a boolean:", input_json$`express`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for WarehouseDTO: the required field `express` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of WarehouseDTO
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        return(FALSE)
      }

      # check if the required `campaignId` is null
      if (is.null(self$`campaignId`)) {
        return(FALSE)
      }

      # check if the required `express` is null
      if (is.null(self$`express`)) {
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
      }

      # check if the required `campaignId` is null
      if (is.null(self$`campaignId`)) {
        invalid_fields["campaignId"] <- "Non-nullable required field `campaignId` cannot be null."
      }

      # check if the required `express` is null
      if (is.null(self$`express`)) {
        invalid_fields["express"] <- "Non-nullable required field `express` cannot be null."
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
# WarehouseDTO$unlock()
#
## Below is an example to define the print function
# WarehouseDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# WarehouseDTO$lock()

