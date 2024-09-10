#' Create a new GetPromoPromocodeInfoDTO
#'
#' @description
#' Информация для типа `MARKET_PROMOCODE`.  Параметр заполняется только для этого типа акции. 
#'
#' @docType class
#' @title GetPromoPromocodeInfoDTO
#' @description GetPromoPromocodeInfoDTO Class
#' @format An \code{R6Class} generator object
#' @field promocode Промокод. character
#' @field discount Процент скидки по промокоду. integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetPromoPromocodeInfoDTO <- R6::R6Class(
  "GetPromoPromocodeInfoDTO",
  public = list(
    `promocode` = NULL,
    `discount` = NULL,
    #' Initialize a new GetPromoPromocodeInfoDTO class.
    #'
    #' @description
    #' Initialize a new GetPromoPromocodeInfoDTO class.
    #'
    #' @param promocode Промокод.
    #' @param discount Процент скидки по промокоду.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`promocode`, `discount`, ...) {
      if (!missing(`promocode`)) {
        if (!(is.character(`promocode`) && length(`promocode`) == 1)) {
          stop(paste("Error! Invalid data for `promocode`. Must be a string:", `promocode`))
        }
        self$`promocode` <- `promocode`
      }
      if (!missing(`discount`)) {
        if (!(is.numeric(`discount`) && length(`discount`) == 1)) {
          stop(paste("Error! Invalid data for `discount`. Must be an integer:", `discount`))
        }
        self$`discount` <- `discount`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetPromoPromocodeInfoDTO in JSON format
    #' @export
    toJSON = function() {
      GetPromoPromocodeInfoDTOObject <- list()
      if (!is.null(self$`promocode`)) {
        GetPromoPromocodeInfoDTOObject[["promocode"]] <-
          self$`promocode`
      }
      if (!is.null(self$`discount`)) {
        GetPromoPromocodeInfoDTOObject[["discount"]] <-
          self$`discount`
      }
      GetPromoPromocodeInfoDTOObject
    },
    #' Deserialize JSON string into an instance of GetPromoPromocodeInfoDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetPromoPromocodeInfoDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetPromoPromocodeInfoDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`promocode`)) {
        self$`promocode` <- this_object$`promocode`
      }
      if (!is.null(this_object$`discount`)) {
        self$`discount` <- this_object$`discount`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetPromoPromocodeInfoDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`promocode`)) {
          sprintf(
          '"promocode":
            "%s"
                    ',
          self$`promocode`
          )
        },
        if (!is.null(self$`discount`)) {
          sprintf(
          '"discount":
            %d
                    ',
          self$`discount`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetPromoPromocodeInfoDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetPromoPromocodeInfoDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetPromoPromocodeInfoDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`promocode` <- this_object$`promocode`
      self$`discount` <- this_object$`discount`
      self
    },
    #' Validate JSON input with respect to GetPromoPromocodeInfoDTO
    #'
    #' @description
    #' Validate JSON input with respect to GetPromoPromocodeInfoDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `promocode`
      if (!is.null(input_json$`promocode`)) {
        if (!(is.character(input_json$`promocode`) && length(input_json$`promocode`) == 1)) {
          stop(paste("Error! Invalid data for `promocode`. Must be a string:", input_json$`promocode`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetPromoPromocodeInfoDTO: the required field `promocode` is missing."))
      }
      # check the required field `discount`
      if (!is.null(input_json$`discount`)) {
        if (!(is.numeric(input_json$`discount`) && length(input_json$`discount`) == 1)) {
          stop(paste("Error! Invalid data for `discount`. Must be an integer:", input_json$`discount`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetPromoPromocodeInfoDTO: the required field `discount` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetPromoPromocodeInfoDTO
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
      # check if the required `promocode` is null
      if (is.null(self$`promocode`)) {
        return(FALSE)
      }

      # check if the required `discount` is null
      if (is.null(self$`discount`)) {
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
      # check if the required `promocode` is null
      if (is.null(self$`promocode`)) {
        invalid_fields["promocode"] <- "Non-nullable required field `promocode` cannot be null."
      }

      # check if the required `discount` is null
      if (is.null(self$`discount`)) {
        invalid_fields["discount"] <- "Non-nullable required field `discount` cannot be null."
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
# GetPromoPromocodeInfoDTO$unlock()
#
## Below is an example to define the print function
# GetPromoPromocodeInfoDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetPromoPromocodeInfoDTO$lock()

