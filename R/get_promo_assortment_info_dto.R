#' Create a new GetPromoAssortmentInfoDTO
#'
#' @description
#' Информация о товарах в акции.
#'
#' @docType class
#' @title GetPromoAssortmentInfoDTO
#' @description GetPromoAssortmentInfoDTO Class
#' @format An \code{R6Class} generator object
#' @field activeOffers Количество товаров, которые участвуют или участвовали в акции.  Учитываются только товары, которые были добавлены вручную.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). integer
#' @field potentialOffers Количество доступных товаров в акции.  Параметр возвращается только для текущих и будущих акций. integer [optional]
#' @field processing Есть ли изменения в ассортименте, которые еще не применились. Сохранение изменений занимает некоторое время.  Параметр возвращается только для текущих и будущих акций. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetPromoAssortmentInfoDTO <- R6::R6Class(
  "GetPromoAssortmentInfoDTO",
  public = list(
    `activeOffers` = NULL,
    `potentialOffers` = NULL,
    `processing` = NULL,
    #' Initialize a new GetPromoAssortmentInfoDTO class.
    #'
    #' @description
    #' Initialize a new GetPromoAssortmentInfoDTO class.
    #'
    #' @param activeOffers Количество товаров, которые участвуют или участвовали в акции.  Учитываются только товары, которые были добавлены вручную.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).
    #' @param potentialOffers Количество доступных товаров в акции.  Параметр возвращается только для текущих и будущих акций.
    #' @param processing Есть ли изменения в ассортименте, которые еще не применились. Сохранение изменений занимает некоторое время.  Параметр возвращается только для текущих и будущих акций.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`activeOffers`, `potentialOffers` = NULL, `processing` = NULL, ...) {
      if (!missing(`activeOffers`)) {
        if (!(is.numeric(`activeOffers`) && length(`activeOffers`) == 1)) {
          stop(paste("Error! Invalid data for `activeOffers`. Must be an integer:", `activeOffers`))
        }
        self$`activeOffers` <- `activeOffers`
      }
      if (!is.null(`potentialOffers`)) {
        if (!(is.numeric(`potentialOffers`) && length(`potentialOffers`) == 1)) {
          stop(paste("Error! Invalid data for `potentialOffers`. Must be an integer:", `potentialOffers`))
        }
        self$`potentialOffers` <- `potentialOffers`
      }
      if (!is.null(`processing`)) {
        if (!(is.logical(`processing`) && length(`processing`) == 1)) {
          stop(paste("Error! Invalid data for `processing`. Must be a boolean:", `processing`))
        }
        self$`processing` <- `processing`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetPromoAssortmentInfoDTO in JSON format
    #' @export
    toJSON = function() {
      GetPromoAssortmentInfoDTOObject <- list()
      if (!is.null(self$`activeOffers`)) {
        GetPromoAssortmentInfoDTOObject[["activeOffers"]] <-
          self$`activeOffers`
      }
      if (!is.null(self$`potentialOffers`)) {
        GetPromoAssortmentInfoDTOObject[["potentialOffers"]] <-
          self$`potentialOffers`
      }
      if (!is.null(self$`processing`)) {
        GetPromoAssortmentInfoDTOObject[["processing"]] <-
          self$`processing`
      }
      GetPromoAssortmentInfoDTOObject
    },
    #' Deserialize JSON string into an instance of GetPromoAssortmentInfoDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetPromoAssortmentInfoDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetPromoAssortmentInfoDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`activeOffers`)) {
        self$`activeOffers` <- this_object$`activeOffers`
      }
      if (!is.null(this_object$`potentialOffers`)) {
        self$`potentialOffers` <- this_object$`potentialOffers`
      }
      if (!is.null(this_object$`processing`)) {
        self$`processing` <- this_object$`processing`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetPromoAssortmentInfoDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`activeOffers`)) {
          sprintf(
          '"activeOffers":
            %d
                    ',
          self$`activeOffers`
          )
        },
        if (!is.null(self$`potentialOffers`)) {
          sprintf(
          '"potentialOffers":
            %d
                    ',
          self$`potentialOffers`
          )
        },
        if (!is.null(self$`processing`)) {
          sprintf(
          '"processing":
            %s
                    ',
          tolower(self$`processing`)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetPromoAssortmentInfoDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetPromoAssortmentInfoDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetPromoAssortmentInfoDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`activeOffers` <- this_object$`activeOffers`
      self$`potentialOffers` <- this_object$`potentialOffers`
      self$`processing` <- this_object$`processing`
      self
    },
    #' Validate JSON input with respect to GetPromoAssortmentInfoDTO
    #'
    #' @description
    #' Validate JSON input with respect to GetPromoAssortmentInfoDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `activeOffers`
      if (!is.null(input_json$`activeOffers`)) {
        if (!(is.numeric(input_json$`activeOffers`) && length(input_json$`activeOffers`) == 1)) {
          stop(paste("Error! Invalid data for `activeOffers`. Must be an integer:", input_json$`activeOffers`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetPromoAssortmentInfoDTO: the required field `activeOffers` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetPromoAssortmentInfoDTO
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
      # check if the required `activeOffers` is null
      if (is.null(self$`activeOffers`)) {
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
      # check if the required `activeOffers` is null
      if (is.null(self$`activeOffers`)) {
        invalid_fields["activeOffers"] <- "Non-nullable required field `activeOffers` cannot be null."
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
# GetPromoAssortmentInfoDTO$unlock()
#
## Below is an example to define the print function
# GetPromoAssortmentInfoDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetPromoAssortmentInfoDTO$lock()

