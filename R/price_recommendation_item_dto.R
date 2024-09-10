#' Create a new PriceRecommendationItemDTO
#'
#' @description
#' Рекомендованная цена.
#'
#' @docType class
#' @title PriceRecommendationItemDTO
#' @description PriceRecommendationItemDTO Class
#' @format An \code{R6Class} generator object
#' @field campaignId Идентификатор кампании. integer
#' @field price Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices) numeric
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PriceRecommendationItemDTO <- R6::R6Class(
  "PriceRecommendationItemDTO",
  public = list(
    `campaignId` = NULL,
    `price` = NULL,
    #' Initialize a new PriceRecommendationItemDTO class.
    #'
    #' @description
    #' Initialize a new PriceRecommendationItemDTO class.
    #'
    #' @param campaignId Идентификатор кампании.
    #' @param price Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices)
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`campaignId`, `price`, ...) {
      if (!missing(`campaignId`)) {
        if (!(is.numeric(`campaignId`) && length(`campaignId`) == 1)) {
          stop(paste("Error! Invalid data for `campaignId`. Must be an integer:", `campaignId`))
        }
        self$`campaignId` <- `campaignId`
      }
      if (!missing(`price`)) {
        self$`price` <- `price`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PriceRecommendationItemDTO in JSON format
    #' @export
    toJSON = function() {
      PriceRecommendationItemDTOObject <- list()
      if (!is.null(self$`campaignId`)) {
        PriceRecommendationItemDTOObject[["campaignId"]] <-
          self$`campaignId`
      }
      if (!is.null(self$`price`)) {
        PriceRecommendationItemDTOObject[["price"]] <-
          self$`price`
      }
      PriceRecommendationItemDTOObject
    },
    #' Deserialize JSON string into an instance of PriceRecommendationItemDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of PriceRecommendationItemDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of PriceRecommendationItemDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`campaignId`)) {
        self$`campaignId` <- this_object$`campaignId`
      }
      if (!is.null(this_object$`price`)) {
        self$`price` <- this_object$`price`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PriceRecommendationItemDTO in JSON format
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
        if (!is.null(self$`price`)) {
          sprintf(
          '"price":
            %d
                    ',
          self$`price`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of PriceRecommendationItemDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of PriceRecommendationItemDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of PriceRecommendationItemDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`campaignId` <- this_object$`campaignId`
      self$`price` <- this_object$`price`
      self
    },
    #' Validate JSON input with respect to PriceRecommendationItemDTO
    #'
    #' @description
    #' Validate JSON input with respect to PriceRecommendationItemDTO and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for PriceRecommendationItemDTO: the required field `campaignId` is missing."))
      }
      # check the required field `price`
      if (!is.null(input_json$`price`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PriceRecommendationItemDTO: the required field `price` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PriceRecommendationItemDTO
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

      # check if the required `price` is null
      if (is.null(self$`price`)) {
        return(FALSE)
      }

      if (self$`price` < 1) {
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

      # check if the required `price` is null
      if (is.null(self$`price`)) {
        invalid_fields["price"] <- "Non-nullable required field `price` cannot be null."
      }

      if (self$`price` < 1) {
        invalid_fields["price"] <- "Invalid value for `price`, must be bigger than or equal to 1."
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
# PriceRecommendationItemDTO$unlock()
#
## Below is an example to define the print function
# PriceRecommendationItemDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PriceRecommendationItemDTO$lock()

