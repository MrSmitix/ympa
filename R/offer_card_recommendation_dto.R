#' Create a new OfferCardRecommendationDTO
#'
#' @description
#' Рекомендация по заполнению карточки товара.
#'
#' @docType class
#' @title OfferCardRecommendationDTO
#' @description OfferCardRecommendationDTO Class
#' @format An \code{R6Class} generator object
#' @field type  \link{OfferCardRecommendationType}
#' @field percent Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OfferCardRecommendationDTO <- R6::R6Class(
  "OfferCardRecommendationDTO",
  public = list(
    `type` = NULL,
    `percent` = NULL,
    #' Initialize a new OfferCardRecommendationDTO class.
    #'
    #' @description
    #' Initialize a new OfferCardRecommendationDTO class.
    #'
    #' @param type type
    #' @param percent Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`type`, `percent` = NULL, ...) {
      if (!missing(`type`)) {
        if (!(`type` %in% c())) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
      if (!is.null(`percent`)) {
        if (!(is.numeric(`percent`) && length(`percent`) == 1)) {
          stop(paste("Error! Invalid data for `percent`. Must be an integer:", `percent`))
        }
        self$`percent` <- `percent`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferCardRecommendationDTO in JSON format
    #' @export
    toJSON = function() {
      OfferCardRecommendationDTOObject <- list()
      if (!is.null(self$`type`)) {
        OfferCardRecommendationDTOObject[["type"]] <-
          self$`type`$toJSON()
      }
      if (!is.null(self$`percent`)) {
        OfferCardRecommendationDTOObject[["percent"]] <-
          self$`percent`
      }
      OfferCardRecommendationDTOObject
    },
    #' Deserialize JSON string into an instance of OfferCardRecommendationDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferCardRecommendationDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferCardRecommendationDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        `type_object` <- OfferCardRecommendationType$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
      if (!is.null(this_object$`percent`)) {
        self$`percent` <- this_object$`percent`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OfferCardRecommendationDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
          %s
          ',
          jsonlite::toJSON(self$`type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`percent`)) {
          sprintf(
          '"percent":
            %d
                    ',
          self$`percent`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OfferCardRecommendationDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of OfferCardRecommendationDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of OfferCardRecommendationDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`type` <- OfferCardRecommendationType$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self$`percent` <- this_object$`percent`
      self
    },
    #' Validate JSON input with respect to OfferCardRecommendationDTO
    #'
    #' @description
    #' Validate JSON input with respect to OfferCardRecommendationDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        stopifnot(R6::is.R6(input_json$`type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OfferCardRecommendationDTO: the required field `type` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OfferCardRecommendationDTO
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
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        return(FALSE)
      }

      if (self$`percent` >= 100) {
        return(FALSE)
      }
      if (self$`percent` < 0) {
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
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
      }

      if (self$`percent` >= 100) {
        invalid_fields["percent"] <- "Invalid value for `percent`, must be smaller than 100."
      }
      if (self$`percent` < 0) {
        invalid_fields["percent"] <- "Invalid value for `percent`, must be bigger than or equal to 0."
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
# OfferCardRecommendationDTO$unlock()
#
## Below is an example to define the print function
# OfferCardRecommendationDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OfferCardRecommendationDTO$lock()

