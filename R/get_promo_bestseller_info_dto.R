#' Create a new GetPromoBestsellerInfoDTO
#'
#' @description
#' Информация об акции «Бестселлеры Маркета».
#'
#' @docType class
#' @title GetPromoBestsellerInfoDTO
#' @description GetPromoBestsellerInfoDTO Class
#' @format An \code{R6Class} generator object
#' @field bestseller Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers). character
#' @field entryDeadline До какой даты можно добавить товар в акцию «Бестселлеры Маркета».  Параметр возвращается только для текущих и будущих акций «Бестселлеры Маркета». character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetPromoBestsellerInfoDTO <- R6::R6Class(
  "GetPromoBestsellerInfoDTO",
  public = list(
    `bestseller` = NULL,
    `entryDeadline` = NULL,
    #' Initialize a new GetPromoBestsellerInfoDTO class.
    #'
    #' @description
    #' Initialize a new GetPromoBestsellerInfoDTO class.
    #'
    #' @param bestseller Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers).
    #' @param entryDeadline До какой даты можно добавить товар в акцию «Бестселлеры Маркета».  Параметр возвращается только для текущих и будущих акций «Бестселлеры Маркета».
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`bestseller`, `entryDeadline` = NULL, ...) {
      if (!missing(`bestseller`)) {
        if (!(is.logical(`bestseller`) && length(`bestseller`) == 1)) {
          stop(paste("Error! Invalid data for `bestseller`. Must be a boolean:", `bestseller`))
        }
        self$`bestseller` <- `bestseller`
      }
      if (!is.null(`entryDeadline`)) {
        if (!is.character(`entryDeadline`)) {
          stop(paste("Error! Invalid data for `entryDeadline`. Must be a string:", `entryDeadline`))
        }
        self$`entryDeadline` <- `entryDeadline`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetPromoBestsellerInfoDTO in JSON format
    #' @export
    toJSON = function() {
      GetPromoBestsellerInfoDTOObject <- list()
      if (!is.null(self$`bestseller`)) {
        GetPromoBestsellerInfoDTOObject[["bestseller"]] <-
          self$`bestseller`
      }
      if (!is.null(self$`entryDeadline`)) {
        GetPromoBestsellerInfoDTOObject[["entryDeadline"]] <-
          self$`entryDeadline`
      }
      GetPromoBestsellerInfoDTOObject
    },
    #' Deserialize JSON string into an instance of GetPromoBestsellerInfoDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetPromoBestsellerInfoDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetPromoBestsellerInfoDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`bestseller`)) {
        self$`bestseller` <- this_object$`bestseller`
      }
      if (!is.null(this_object$`entryDeadline`)) {
        self$`entryDeadline` <- this_object$`entryDeadline`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetPromoBestsellerInfoDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`bestseller`)) {
          sprintf(
          '"bestseller":
            %s
                    ',
          tolower(self$`bestseller`)
          )
        },
        if (!is.null(self$`entryDeadline`)) {
          sprintf(
          '"entryDeadline":
            "%s"
                    ',
          self$`entryDeadline`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetPromoBestsellerInfoDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetPromoBestsellerInfoDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetPromoBestsellerInfoDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`bestseller` <- this_object$`bestseller`
      self$`entryDeadline` <- this_object$`entryDeadline`
      self
    },
    #' Validate JSON input with respect to GetPromoBestsellerInfoDTO
    #'
    #' @description
    #' Validate JSON input with respect to GetPromoBestsellerInfoDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `bestseller`
      if (!is.null(input_json$`bestseller`)) {
        if (!(is.logical(input_json$`bestseller`) && length(input_json$`bestseller`) == 1)) {
          stop(paste("Error! Invalid data for `bestseller`. Must be a boolean:", input_json$`bestseller`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetPromoBestsellerInfoDTO: the required field `bestseller` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetPromoBestsellerInfoDTO
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
      # check if the required `bestseller` is null
      if (is.null(self$`bestseller`)) {
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
      # check if the required `bestseller` is null
      if (is.null(self$`bestseller`)) {
        invalid_fields["bestseller"] <- "Non-nullable required field `bestseller` cannot be null."
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
# GetPromoBestsellerInfoDTO$unlock()
#
## Below is an example to define the print function
# GetPromoBestsellerInfoDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetPromoBestsellerInfoDTO$lock()

