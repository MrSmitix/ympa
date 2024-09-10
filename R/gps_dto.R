#' Create a new GpsDTO
#'
#' @description
#' GPS-координаты широты и долготы. 
#'
#' @docType class
#' @title GpsDTO
#' @description GpsDTO Class
#' @format An \code{R6Class} generator object
#' @field latitude Широта. numeric
#' @field longitude Долгота. numeric
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GpsDTO <- R6::R6Class(
  "GpsDTO",
  public = list(
    `latitude` = NULL,
    `longitude` = NULL,
    #' Initialize a new GpsDTO class.
    #'
    #' @description
    #' Initialize a new GpsDTO class.
    #'
    #' @param latitude Широта.
    #' @param longitude Долгота.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`latitude`, `longitude`, ...) {
      if (!missing(`latitude`)) {
        self$`latitude` <- `latitude`
      }
      if (!missing(`longitude`)) {
        self$`longitude` <- `longitude`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GpsDTO in JSON format
    #' @export
    toJSON = function() {
      GpsDTOObject <- list()
      if (!is.null(self$`latitude`)) {
        GpsDTOObject[["latitude"]] <-
          self$`latitude`
      }
      if (!is.null(self$`longitude`)) {
        GpsDTOObject[["longitude"]] <-
          self$`longitude`
      }
      GpsDTOObject
    },
    #' Deserialize JSON string into an instance of GpsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GpsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GpsDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`latitude`)) {
        self$`latitude` <- this_object$`latitude`
      }
      if (!is.null(this_object$`longitude`)) {
        self$`longitude` <- this_object$`longitude`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GpsDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`latitude`)) {
          sprintf(
          '"latitude":
            %d
                    ',
          self$`latitude`
          )
        },
        if (!is.null(self$`longitude`)) {
          sprintf(
          '"longitude":
            %d
                    ',
          self$`longitude`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GpsDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GpsDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GpsDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`latitude` <- this_object$`latitude`
      self$`longitude` <- this_object$`longitude`
      self
    },
    #' Validate JSON input with respect to GpsDTO
    #'
    #' @description
    #' Validate JSON input with respect to GpsDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `latitude`
      if (!is.null(input_json$`latitude`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GpsDTO: the required field `latitude` is missing."))
      }
      # check the required field `longitude`
      if (!is.null(input_json$`longitude`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GpsDTO: the required field `longitude` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GpsDTO
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
      # check if the required `latitude` is null
      if (is.null(self$`latitude`)) {
        return(FALSE)
      }

      # check if the required `longitude` is null
      if (is.null(self$`longitude`)) {
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
      # check if the required `latitude` is null
      if (is.null(self$`latitude`)) {
        invalid_fields["latitude"] <- "Non-nullable required field `latitude` cannot be null."
      }

      # check if the required `longitude` is null
      if (is.null(self$`longitude`)) {
        invalid_fields["longitude"] <- "Non-nullable required field `longitude` cannot be null."
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
# GpsDTO$unlock()
#
## Below is an example to define the print function
# GpsDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GpsDTO$lock()

