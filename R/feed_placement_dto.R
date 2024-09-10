#' Create a new FeedPlacementDTO
#'
#' @description
#' Информация о размещении предложений из прайс-листа на Маркете на момент выполнения запроса.
#'
#' @docType class
#' @title FeedPlacementDTO
#' @description FeedPlacementDTO Class
#' @format An \code{R6Class} generator object
#' @field status  \link{FeedStatusType} [optional]
#' @field totalOffersCount Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FeedPlacementDTO <- R6::R6Class(
  "FeedPlacementDTO",
  public = list(
    `status` = NULL,
    `totalOffersCount` = NULL,
    #' Initialize a new FeedPlacementDTO class.
    #'
    #' @description
    #' Initialize a new FeedPlacementDTO class.
    #'
    #' @param status status
    #' @param totalOffersCount Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`status` = NULL, `totalOffersCount` = NULL, ...) {
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`totalOffersCount`)) {
        if (!(is.numeric(`totalOffersCount`) && length(`totalOffersCount`) == 1)) {
          stop(paste("Error! Invalid data for `totalOffersCount`. Must be an integer:", `totalOffersCount`))
        }
        self$`totalOffersCount` <- `totalOffersCount`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedPlacementDTO in JSON format
    #' @export
    toJSON = function() {
      FeedPlacementDTOObject <- list()
      if (!is.null(self$`status`)) {
        FeedPlacementDTOObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`totalOffersCount`)) {
        FeedPlacementDTOObject[["totalOffersCount"]] <-
          self$`totalOffersCount`
      }
      FeedPlacementDTOObject
    },
    #' Deserialize JSON string into an instance of FeedPlacementDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedPlacementDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedPlacementDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`status`)) {
        `status_object` <- FeedStatusType$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`totalOffersCount`)) {
        self$`totalOffersCount` <- this_object$`totalOffersCount`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedPlacementDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
          %s
          ',
          jsonlite::toJSON(self$`status`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`totalOffersCount`)) {
          sprintf(
          '"totalOffersCount":
            %d
                    ',
          self$`totalOffersCount`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of FeedPlacementDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedPlacementDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedPlacementDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`status` <- FeedStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`totalOffersCount` <- this_object$`totalOffersCount`
      self
    },
    #' Validate JSON input with respect to FeedPlacementDTO
    #'
    #' @description
    #' Validate JSON input with respect to FeedPlacementDTO and throw an exception if invalid
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
    #' @return String representation of FeedPlacementDTO
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
# FeedPlacementDTO$unlock()
#
## Below is an example to define the print function
# FeedPlacementDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FeedPlacementDTO$lock()

