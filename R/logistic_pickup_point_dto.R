#' Create a new LogisticPickupPointDTO
#'
#' @description
#' Описание пункта вывоза для возврата.
#'
#' @docType class
#' @title LogisticPickupPointDTO
#' @description LogisticPickupPointDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор пункта вывоза. integer [optional]
#' @field name Название пункта вывоза. character [optional]
#' @field address  \link{PickupAddressDTO} [optional]
#' @field instruction Дополнительные инструкции к вывозу. character [optional]
#' @field type  \link{LogisticPointType} [optional]
#' @field logisticPartnerId Идентификатор логистического партнера, к которому относится логистическая точка. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LogisticPickupPointDTO <- R6::R6Class(
  "LogisticPickupPointDTO",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `address` = NULL,
    `instruction` = NULL,
    `type` = NULL,
    `logisticPartnerId` = NULL,
    #' Initialize a new LogisticPickupPointDTO class.
    #'
    #' @description
    #' Initialize a new LogisticPickupPointDTO class.
    #'
    #' @param id Идентификатор пункта вывоза.
    #' @param name Название пункта вывоза.
    #' @param address address
    #' @param instruction Дополнительные инструкции к вывозу.
    #' @param type type
    #' @param logisticPartnerId Идентификатор логистического партнера, к которому относится логистическая точка.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id` = NULL, `name` = NULL, `address` = NULL, `instruction` = NULL, `type` = NULL, `logisticPartnerId` = NULL, ...) {
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
      if (!is.null(`address`)) {
        stopifnot(R6::is.R6(`address`))
        self$`address` <- `address`
      }
      if (!is.null(`instruction`)) {
        if (!(is.character(`instruction`) && length(`instruction`) == 1)) {
          stop(paste("Error! Invalid data for `instruction`. Must be a string:", `instruction`))
        }
        self$`instruction` <- `instruction`
      }
      if (!is.null(`type`)) {
        if (!(`type` %in% c())) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
      if (!is.null(`logisticPartnerId`)) {
        if (!(is.numeric(`logisticPartnerId`) && length(`logisticPartnerId`) == 1)) {
          stop(paste("Error! Invalid data for `logisticPartnerId`. Must be an integer:", `logisticPartnerId`))
        }
        self$`logisticPartnerId` <- `logisticPartnerId`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return LogisticPickupPointDTO in JSON format
    #' @export
    toJSON = function() {
      LogisticPickupPointDTOObject <- list()
      if (!is.null(self$`id`)) {
        LogisticPickupPointDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        LogisticPickupPointDTOObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`address`)) {
        LogisticPickupPointDTOObject[["address"]] <-
          self$`address`$toJSON()
      }
      if (!is.null(self$`instruction`)) {
        LogisticPickupPointDTOObject[["instruction"]] <-
          self$`instruction`
      }
      if (!is.null(self$`type`)) {
        LogisticPickupPointDTOObject[["type"]] <-
          self$`type`$toJSON()
      }
      if (!is.null(self$`logisticPartnerId`)) {
        LogisticPickupPointDTOObject[["logisticPartnerId"]] <-
          self$`logisticPartnerId`
      }
      LogisticPickupPointDTOObject
    },
    #' Deserialize JSON string into an instance of LogisticPickupPointDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of LogisticPickupPointDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of LogisticPickupPointDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`address`)) {
        `address_object` <- PickupAddressDTO$new()
        `address_object`$fromJSON(jsonlite::toJSON(this_object$`address`, auto_unbox = TRUE, digits = NA))
        self$`address` <- `address_object`
      }
      if (!is.null(this_object$`instruction`)) {
        self$`instruction` <- this_object$`instruction`
      }
      if (!is.null(this_object$`type`)) {
        `type_object` <- LogisticPointType$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
      if (!is.null(this_object$`logisticPartnerId`)) {
        self$`logisticPartnerId` <- this_object$`logisticPartnerId`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return LogisticPickupPointDTO in JSON format
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
        if (!is.null(self$`address`)) {
          sprintf(
          '"address":
          %s
          ',
          jsonlite::toJSON(self$`address`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`instruction`)) {
          sprintf(
          '"instruction":
            "%s"
                    ',
          self$`instruction`
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
        if (!is.null(self$`logisticPartnerId`)) {
          sprintf(
          '"logisticPartnerId":
            %d
                    ',
          self$`logisticPartnerId`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of LogisticPickupPointDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of LogisticPickupPointDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of LogisticPickupPointDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`address` <- PickupAddressDTO$new()$fromJSON(jsonlite::toJSON(this_object$`address`, auto_unbox = TRUE, digits = NA))
      self$`instruction` <- this_object$`instruction`
      self$`type` <- LogisticPointType$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self$`logisticPartnerId` <- this_object$`logisticPartnerId`
      self
    },
    #' Validate JSON input with respect to LogisticPickupPointDTO
    #'
    #' @description
    #' Validate JSON input with respect to LogisticPickupPointDTO and throw an exception if invalid
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
    #' @return String representation of LogisticPickupPointDTO
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
# LogisticPickupPointDTO$unlock()
#
## Below is an example to define the print function
# LogisticPickupPointDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LogisticPickupPointDTO$lock()

