#' Create a new WarehouseAddressDTO
#'
#' @description
#' Адрес склада.
#'
#' @docType class
#' @title WarehouseAddressDTO
#' @description WarehouseAddressDTO Class
#' @format An \code{R6Class} generator object
#' @field city Город. character
#' @field street Улица. character [optional]
#' @field number Номер дома. character [optional]
#' @field building Номер строения. character [optional]
#' @field block Номер корпуса. character [optional]
#' @field gps  \link{GpsDTO}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
WarehouseAddressDTO <- R6::R6Class(
  "WarehouseAddressDTO",
  public = list(
    `city` = NULL,
    `street` = NULL,
    `number` = NULL,
    `building` = NULL,
    `block` = NULL,
    `gps` = NULL,
    #' Initialize a new WarehouseAddressDTO class.
    #'
    #' @description
    #' Initialize a new WarehouseAddressDTO class.
    #'
    #' @param city Город.
    #' @param gps gps
    #' @param street Улица.
    #' @param number Номер дома.
    #' @param building Номер строения.
    #' @param block Номер корпуса.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`city`, `gps`, `street` = NULL, `number` = NULL, `building` = NULL, `block` = NULL, ...) {
      if (!missing(`city`)) {
        if (!(is.character(`city`) && length(`city`) == 1)) {
          stop(paste("Error! Invalid data for `city`. Must be a string:", `city`))
        }
        self$`city` <- `city`
      }
      if (!missing(`gps`)) {
        stopifnot(R6::is.R6(`gps`))
        self$`gps` <- `gps`
      }
      if (!is.null(`street`)) {
        if (!(is.character(`street`) && length(`street`) == 1)) {
          stop(paste("Error! Invalid data for `street`. Must be a string:", `street`))
        }
        self$`street` <- `street`
      }
      if (!is.null(`number`)) {
        if (!(is.character(`number`) && length(`number`) == 1)) {
          stop(paste("Error! Invalid data for `number`. Must be a string:", `number`))
        }
        self$`number` <- `number`
      }
      if (!is.null(`building`)) {
        if (!(is.character(`building`) && length(`building`) == 1)) {
          stop(paste("Error! Invalid data for `building`. Must be a string:", `building`))
        }
        self$`building` <- `building`
      }
      if (!is.null(`block`)) {
        if (!(is.character(`block`) && length(`block`) == 1)) {
          stop(paste("Error! Invalid data for `block`. Must be a string:", `block`))
        }
        self$`block` <- `block`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return WarehouseAddressDTO in JSON format
    #' @export
    toJSON = function() {
      WarehouseAddressDTOObject <- list()
      if (!is.null(self$`city`)) {
        WarehouseAddressDTOObject[["city"]] <-
          self$`city`
      }
      if (!is.null(self$`street`)) {
        WarehouseAddressDTOObject[["street"]] <-
          self$`street`
      }
      if (!is.null(self$`number`)) {
        WarehouseAddressDTOObject[["number"]] <-
          self$`number`
      }
      if (!is.null(self$`building`)) {
        WarehouseAddressDTOObject[["building"]] <-
          self$`building`
      }
      if (!is.null(self$`block`)) {
        WarehouseAddressDTOObject[["block"]] <-
          self$`block`
      }
      if (!is.null(self$`gps`)) {
        WarehouseAddressDTOObject[["gps"]] <-
          self$`gps`$toJSON()
      }
      WarehouseAddressDTOObject
    },
    #' Deserialize JSON string into an instance of WarehouseAddressDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of WarehouseAddressDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of WarehouseAddressDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`city`)) {
        self$`city` <- this_object$`city`
      }
      if (!is.null(this_object$`street`)) {
        self$`street` <- this_object$`street`
      }
      if (!is.null(this_object$`number`)) {
        self$`number` <- this_object$`number`
      }
      if (!is.null(this_object$`building`)) {
        self$`building` <- this_object$`building`
      }
      if (!is.null(this_object$`block`)) {
        self$`block` <- this_object$`block`
      }
      if (!is.null(this_object$`gps`)) {
        `gps_object` <- GpsDTO$new()
        `gps_object`$fromJSON(jsonlite::toJSON(this_object$`gps`, auto_unbox = TRUE, digits = NA))
        self$`gps` <- `gps_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return WarehouseAddressDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`city`)) {
          sprintf(
          '"city":
            "%s"
                    ',
          self$`city`
          )
        },
        if (!is.null(self$`street`)) {
          sprintf(
          '"street":
            "%s"
                    ',
          self$`street`
          )
        },
        if (!is.null(self$`number`)) {
          sprintf(
          '"number":
            "%s"
                    ',
          self$`number`
          )
        },
        if (!is.null(self$`building`)) {
          sprintf(
          '"building":
            "%s"
                    ',
          self$`building`
          )
        },
        if (!is.null(self$`block`)) {
          sprintf(
          '"block":
            "%s"
                    ',
          self$`block`
          )
        },
        if (!is.null(self$`gps`)) {
          sprintf(
          '"gps":
          %s
          ',
          jsonlite::toJSON(self$`gps`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of WarehouseAddressDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of WarehouseAddressDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of WarehouseAddressDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`city` <- this_object$`city`
      self$`street` <- this_object$`street`
      self$`number` <- this_object$`number`
      self$`building` <- this_object$`building`
      self$`block` <- this_object$`block`
      self$`gps` <- GpsDTO$new()$fromJSON(jsonlite::toJSON(this_object$`gps`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to WarehouseAddressDTO
    #'
    #' @description
    #' Validate JSON input with respect to WarehouseAddressDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `city`
      if (!is.null(input_json$`city`)) {
        if (!(is.character(input_json$`city`) && length(input_json$`city`) == 1)) {
          stop(paste("Error! Invalid data for `city`. Must be a string:", input_json$`city`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for WarehouseAddressDTO: the required field `city` is missing."))
      }
      # check the required field `gps`
      if (!is.null(input_json$`gps`)) {
        stopifnot(R6::is.R6(input_json$`gps`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for WarehouseAddressDTO: the required field `gps` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of WarehouseAddressDTO
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
      # check if the required `city` is null
      if (is.null(self$`city`)) {
        return(FALSE)
      }

      if (nchar(self$`city`) > 200) {
        return(FALSE)
      }

      if (nchar(self$`street`) > 512) {
        return(FALSE)
      }

      if (nchar(self$`number`) > 256) {
        return(FALSE)
      }

      if (nchar(self$`building`) > 16) {
        return(FALSE)
      }

      if (nchar(self$`block`) > 16) {
        return(FALSE)
      }

      # check if the required `gps` is null
      if (is.null(self$`gps`)) {
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
      # check if the required `city` is null
      if (is.null(self$`city`)) {
        invalid_fields["city"] <- "Non-nullable required field `city` cannot be null."
      }

      if (nchar(self$`city`) > 200) {
        invalid_fields["city"] <- "Invalid length for `city`, must be smaller than or equal to 200."
      }

      if (nchar(self$`street`) > 512) {
        invalid_fields["street"] <- "Invalid length for `street`, must be smaller than or equal to 512."
      }

      if (nchar(self$`number`) > 256) {
        invalid_fields["number"] <- "Invalid length for `number`, must be smaller than or equal to 256."
      }

      if (nchar(self$`building`) > 16) {
        invalid_fields["building"] <- "Invalid length for `building`, must be smaller than or equal to 16."
      }

      if (nchar(self$`block`) > 16) {
        invalid_fields["block"] <- "Invalid length for `block`, must be smaller than or equal to 16."
      }

      # check if the required `gps` is null
      if (is.null(self$`gps`)) {
        invalid_fields["gps"] <- "Non-nullable required field `gps` cannot be null."
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
# WarehouseAddressDTO$unlock()
#
## Below is an example to define the print function
# WarehouseAddressDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# WarehouseAddressDTO$lock()

