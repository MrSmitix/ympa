#' Create a new BidRecommendationItemDTO
#'
#' @description
#' Рекомендованная ставка и возможная доля показов.
#'
#' @docType class
#' @title BidRecommendationItemDTO
#' @description BidRecommendationItemDTO Class
#' @format An \code{R6Class} generator object
#' @field bid Значение ставки. integer
#' @field showPercent Доля показов. integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BidRecommendationItemDTO <- R6::R6Class(
  "BidRecommendationItemDTO",
  public = list(
    `bid` = NULL,
    `showPercent` = NULL,
    #' Initialize a new BidRecommendationItemDTO class.
    #'
    #' @description
    #' Initialize a new BidRecommendationItemDTO class.
    #'
    #' @param bid Значение ставки.
    #' @param showPercent Доля показов.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`bid`, `showPercent`, ...) {
      if (!missing(`bid`)) {
        if (!(is.numeric(`bid`) && length(`bid`) == 1)) {
          stop(paste("Error! Invalid data for `bid`. Must be an integer:", `bid`))
        }
        self$`bid` <- `bid`
      }
      if (!missing(`showPercent`)) {
        if (!(is.numeric(`showPercent`) && length(`showPercent`) == 1)) {
          stop(paste("Error! Invalid data for `showPercent`. Must be an integer:", `showPercent`))
        }
        self$`showPercent` <- `showPercent`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return BidRecommendationItemDTO in JSON format
    #' @export
    toJSON = function() {
      BidRecommendationItemDTOObject <- list()
      if (!is.null(self$`bid`)) {
        BidRecommendationItemDTOObject[["bid"]] <-
          self$`bid`
      }
      if (!is.null(self$`showPercent`)) {
        BidRecommendationItemDTOObject[["showPercent"]] <-
          self$`showPercent`
      }
      BidRecommendationItemDTOObject
    },
    #' Deserialize JSON string into an instance of BidRecommendationItemDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of BidRecommendationItemDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of BidRecommendationItemDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`bid`)) {
        self$`bid` <- this_object$`bid`
      }
      if (!is.null(this_object$`showPercent`)) {
        self$`showPercent` <- this_object$`showPercent`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return BidRecommendationItemDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`bid`)) {
          sprintf(
          '"bid":
            %d
                    ',
          self$`bid`
          )
        },
        if (!is.null(self$`showPercent`)) {
          sprintf(
          '"showPercent":
            %d
                    ',
          self$`showPercent`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of BidRecommendationItemDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of BidRecommendationItemDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of BidRecommendationItemDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`bid` <- this_object$`bid`
      self$`showPercent` <- this_object$`showPercent`
      self
    },
    #' Validate JSON input with respect to BidRecommendationItemDTO
    #'
    #' @description
    #' Validate JSON input with respect to BidRecommendationItemDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `bid`
      if (!is.null(input_json$`bid`)) {
        if (!(is.numeric(input_json$`bid`) && length(input_json$`bid`) == 1)) {
          stop(paste("Error! Invalid data for `bid`. Must be an integer:", input_json$`bid`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BidRecommendationItemDTO: the required field `bid` is missing."))
      }
      # check the required field `showPercent`
      if (!is.null(input_json$`showPercent`)) {
        if (!(is.numeric(input_json$`showPercent`) && length(input_json$`showPercent`) == 1)) {
          stop(paste("Error! Invalid data for `showPercent`. Must be an integer:", input_json$`showPercent`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BidRecommendationItemDTO: the required field `showPercent` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BidRecommendationItemDTO
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
      # check if the required `bid` is null
      if (is.null(self$`bid`)) {
        return(FALSE)
      }

      if (self$`bid` > 9999) {
        return(FALSE)
      }
      if (self$`bid` < 0) {
        return(FALSE)
      }

      # check if the required `showPercent` is null
      if (is.null(self$`showPercent`)) {
        return(FALSE)
      }

      if (self$`showPercent` > 100) {
        return(FALSE)
      }
      if (self$`showPercent` < 0) {
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
      # check if the required `bid` is null
      if (is.null(self$`bid`)) {
        invalid_fields["bid"] <- "Non-nullable required field `bid` cannot be null."
      }

      if (self$`bid` > 9999) {
        invalid_fields["bid"] <- "Invalid value for `bid`, must be smaller than or equal to 9999."
      }
      if (self$`bid` < 0) {
        invalid_fields["bid"] <- "Invalid value for `bid`, must be bigger than or equal to 0."
      }

      # check if the required `showPercent` is null
      if (is.null(self$`showPercent`)) {
        invalid_fields["showPercent"] <- "Non-nullable required field `showPercent` cannot be null."
      }

      if (self$`showPercent` > 100) {
        invalid_fields["showPercent"] <- "Invalid value for `showPercent`, must be smaller than or equal to 100."
      }
      if (self$`showPercent` < 0) {
        invalid_fields["showPercent"] <- "Invalid value for `showPercent`, must be bigger than or equal to 0."
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
# BidRecommendationItemDTO$unlock()
#
## Below is an example to define the print function
# BidRecommendationItemDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BidRecommendationItemDTO$lock()

