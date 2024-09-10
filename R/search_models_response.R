#' Create a new SearchModelsResponse
#'
#' @description
#' SearchModelsResponse Class
#'
#' @docType class
#' @title SearchModelsResponse
#' @description SearchModelsResponse Class
#' @format An \code{R6Class} generator object
#' @field models Список моделей товаров. list(\link{ModelDTO})
#' @field currency  \link{CurrencyType} [optional]
#' @field regionId Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). integer [optional]
#' @field pager  \link{FlippingPagerDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SearchModelsResponse <- R6::R6Class(
  "SearchModelsResponse",
  public = list(
    `models` = NULL,
    `currency` = NULL,
    `regionId` = NULL,
    `pager` = NULL,
    #' Initialize a new SearchModelsResponse class.
    #'
    #' @description
    #' Initialize a new SearchModelsResponse class.
    #'
    #' @param models Список моделей товаров.
    #' @param currency currency
    #' @param regionId Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).
    #' @param pager pager
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`models`, `currency` = NULL, `regionId` = NULL, `pager` = NULL, ...) {
      if (!missing(`models`)) {
        stopifnot(is.vector(`models`), length(`models`) != 0)
        sapply(`models`, function(x) stopifnot(R6::is.R6(x)))
        self$`models` <- `models`
      }
      if (!is.null(`currency`)) {
        if (!(`currency` %in% c())) {
          stop(paste("Error! \"", `currency`, "\" cannot be assigned to `currency`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`currency`))
        self$`currency` <- `currency`
      }
      if (!is.null(`regionId`)) {
        if (!(is.numeric(`regionId`) && length(`regionId`) == 1)) {
          stop(paste("Error! Invalid data for `regionId`. Must be an integer:", `regionId`))
        }
        self$`regionId` <- `regionId`
      }
      if (!is.null(`pager`)) {
        stopifnot(R6::is.R6(`pager`))
        self$`pager` <- `pager`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SearchModelsResponse in JSON format
    #' @export
    toJSON = function() {
      SearchModelsResponseObject <- list()
      if (!is.null(self$`models`)) {
        SearchModelsResponseObject[["models"]] <-
          lapply(self$`models`, function(x) x$toJSON())
      }
      if (!is.null(self$`currency`)) {
        SearchModelsResponseObject[["currency"]] <-
          self$`currency`$toJSON()
      }
      if (!is.null(self$`regionId`)) {
        SearchModelsResponseObject[["regionId"]] <-
          self$`regionId`
      }
      if (!is.null(self$`pager`)) {
        SearchModelsResponseObject[["pager"]] <-
          self$`pager`$toJSON()
      }
      SearchModelsResponseObject
    },
    #' Deserialize JSON string into an instance of SearchModelsResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of SearchModelsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of SearchModelsResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`models`)) {
        self$`models` <- ApiClient$new()$deserializeObj(this_object$`models`, "array[ModelDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`currency`)) {
        `currency_object` <- CurrencyType$new()
        `currency_object`$fromJSON(jsonlite::toJSON(this_object$`currency`, auto_unbox = TRUE, digits = NA))
        self$`currency` <- `currency_object`
      }
      if (!is.null(this_object$`regionId`)) {
        self$`regionId` <- this_object$`regionId`
      }
      if (!is.null(this_object$`pager`)) {
        `pager_object` <- FlippingPagerDTO$new()
        `pager_object`$fromJSON(jsonlite::toJSON(this_object$`pager`, auto_unbox = TRUE, digits = NA))
        self$`pager` <- `pager_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SearchModelsResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`models`)) {
          sprintf(
          '"models":
          [%s]
',
          paste(sapply(self$`models`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`currency`)) {
          sprintf(
          '"currency":
          %s
          ',
          jsonlite::toJSON(self$`currency`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`regionId`)) {
          sprintf(
          '"regionId":
            %d
                    ',
          self$`regionId`
          )
        },
        if (!is.null(self$`pager`)) {
          sprintf(
          '"pager":
          %s
          ',
          jsonlite::toJSON(self$`pager`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of SearchModelsResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of SearchModelsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of SearchModelsResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`models` <- ApiClient$new()$deserializeObj(this_object$`models`, "array[ModelDTO]", loadNamespace("ympa_r_client"))
      self$`currency` <- CurrencyType$new()$fromJSON(jsonlite::toJSON(this_object$`currency`, auto_unbox = TRUE, digits = NA))
      self$`regionId` <- this_object$`regionId`
      self$`pager` <- FlippingPagerDTO$new()$fromJSON(jsonlite::toJSON(this_object$`pager`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to SearchModelsResponse
    #'
    #' @description
    #' Validate JSON input with respect to SearchModelsResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `models`
      if (!is.null(input_json$`models`)) {
        stopifnot(is.vector(input_json$`models`), length(input_json$`models`) != 0)
        tmp <- sapply(input_json$`models`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SearchModelsResponse: the required field `models` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SearchModelsResponse
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
      # check if the required `models` is null
      if (is.null(self$`models`)) {
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
      # check if the required `models` is null
      if (is.null(self$`models`)) {
        invalid_fields["models"] <- "Non-nullable required field `models` cannot be null."
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
# SearchModelsResponse$unlock()
#
## Below is an example to define the print function
# SearchModelsResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SearchModelsResponse$lock()

