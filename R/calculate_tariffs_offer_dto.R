#' Create a new CalculateTariffsOfferDTO
#'
#' @description
#' Параметры товара, для которого нужно рассчитать стоимость услуг.
#'
#' @docType class
#' @title CalculateTariffsOfferDTO
#' @description CalculateTariffsOfferDTO Class
#' @format An \code{R6Class} generator object
#' @field categoryId Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). integer
#' @field price Цена на товар в рублях. numeric
#' @field length Длина товара в сантиметрах. numeric
#' @field width Ширина товара в сантиметрах. numeric
#' @field height Высота товара в сантиметрах. numeric
#' @field weight Вес товара в килограммах. numeric
#' @field quantity Квант продажи — количество единиц товара в одном товарном предложении. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CalculateTariffsOfferDTO <- R6::R6Class(
  "CalculateTariffsOfferDTO",
  public = list(
    `categoryId` = NULL,
    `price` = NULL,
    `length` = NULL,
    `width` = NULL,
    `height` = NULL,
    `weight` = NULL,
    `quantity` = NULL,
    #' Initialize a new CalculateTariffsOfferDTO class.
    #'
    #' @description
    #' Initialize a new CalculateTariffsOfferDTO class.
    #'
    #' @param categoryId Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).
    #' @param price Цена на товар в рублях.
    #' @param length Длина товара в сантиметрах.
    #' @param width Ширина товара в сантиметрах.
    #' @param height Высота товара в сантиметрах.
    #' @param weight Вес товара в килограммах.
    #' @param quantity Квант продажи — количество единиц товара в одном товарном предложении.. Default to 1.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`categoryId`, `price`, `length`, `width`, `height`, `weight`, `quantity` = 1, ...) {
      if (!missing(`categoryId`)) {
        if (!(is.numeric(`categoryId`) && length(`categoryId`) == 1)) {
          stop(paste("Error! Invalid data for `categoryId`. Must be an integer:", `categoryId`))
        }
        self$`categoryId` <- `categoryId`
      }
      if (!missing(`price`)) {
        self$`price` <- `price`
      }
      if (!missing(`length`)) {
        self$`length` <- `length`
      }
      if (!missing(`width`)) {
        self$`width` <- `width`
      }
      if (!missing(`height`)) {
        self$`height` <- `height`
      }
      if (!missing(`weight`)) {
        self$`weight` <- `weight`
      }
      if (!is.null(`quantity`)) {
        if (!(is.numeric(`quantity`) && length(`quantity`) == 1)) {
          stop(paste("Error! Invalid data for `quantity`. Must be an integer:", `quantity`))
        }
        self$`quantity` <- `quantity`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CalculateTariffsOfferDTO in JSON format
    #' @export
    toJSON = function() {
      CalculateTariffsOfferDTOObject <- list()
      if (!is.null(self$`categoryId`)) {
        CalculateTariffsOfferDTOObject[["categoryId"]] <-
          self$`categoryId`
      }
      if (!is.null(self$`price`)) {
        CalculateTariffsOfferDTOObject[["price"]] <-
          self$`price`
      }
      if (!is.null(self$`length`)) {
        CalculateTariffsOfferDTOObject[["length"]] <-
          self$`length`
      }
      if (!is.null(self$`width`)) {
        CalculateTariffsOfferDTOObject[["width"]] <-
          self$`width`
      }
      if (!is.null(self$`height`)) {
        CalculateTariffsOfferDTOObject[["height"]] <-
          self$`height`
      }
      if (!is.null(self$`weight`)) {
        CalculateTariffsOfferDTOObject[["weight"]] <-
          self$`weight`
      }
      if (!is.null(self$`quantity`)) {
        CalculateTariffsOfferDTOObject[["quantity"]] <-
          self$`quantity`
      }
      CalculateTariffsOfferDTOObject
    },
    #' Deserialize JSON string into an instance of CalculateTariffsOfferDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of CalculateTariffsOfferDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of CalculateTariffsOfferDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`categoryId`)) {
        self$`categoryId` <- this_object$`categoryId`
      }
      if (!is.null(this_object$`price`)) {
        self$`price` <- this_object$`price`
      }
      if (!is.null(this_object$`length`)) {
        self$`length` <- this_object$`length`
      }
      if (!is.null(this_object$`width`)) {
        self$`width` <- this_object$`width`
      }
      if (!is.null(this_object$`height`)) {
        self$`height` <- this_object$`height`
      }
      if (!is.null(this_object$`weight`)) {
        self$`weight` <- this_object$`weight`
      }
      if (!is.null(this_object$`quantity`)) {
        self$`quantity` <- this_object$`quantity`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CalculateTariffsOfferDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`categoryId`)) {
          sprintf(
          '"categoryId":
            %d
                    ',
          self$`categoryId`
          )
        },
        if (!is.null(self$`price`)) {
          sprintf(
          '"price":
            %d
                    ',
          self$`price`
          )
        },
        if (!is.null(self$`length`)) {
          sprintf(
          '"length":
            %d
                    ',
          self$`length`
          )
        },
        if (!is.null(self$`width`)) {
          sprintf(
          '"width":
            %d
                    ',
          self$`width`
          )
        },
        if (!is.null(self$`height`)) {
          sprintf(
          '"height":
            %d
                    ',
          self$`height`
          )
        },
        if (!is.null(self$`weight`)) {
          sprintf(
          '"weight":
            %d
                    ',
          self$`weight`
          )
        },
        if (!is.null(self$`quantity`)) {
          sprintf(
          '"quantity":
            %d
                    ',
          self$`quantity`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CalculateTariffsOfferDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of CalculateTariffsOfferDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of CalculateTariffsOfferDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`categoryId` <- this_object$`categoryId`
      self$`price` <- this_object$`price`
      self$`length` <- this_object$`length`
      self$`width` <- this_object$`width`
      self$`height` <- this_object$`height`
      self$`weight` <- this_object$`weight`
      self$`quantity` <- this_object$`quantity`
      self
    },
    #' Validate JSON input with respect to CalculateTariffsOfferDTO
    #'
    #' @description
    #' Validate JSON input with respect to CalculateTariffsOfferDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `categoryId`
      if (!is.null(input_json$`categoryId`)) {
        if (!(is.numeric(input_json$`categoryId`) && length(input_json$`categoryId`) == 1)) {
          stop(paste("Error! Invalid data for `categoryId`. Must be an integer:", input_json$`categoryId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CalculateTariffsOfferDTO: the required field `categoryId` is missing."))
      }
      # check the required field `price`
      if (!is.null(input_json$`price`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CalculateTariffsOfferDTO: the required field `price` is missing."))
      }
      # check the required field `length`
      if (!is.null(input_json$`length`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CalculateTariffsOfferDTO: the required field `length` is missing."))
      }
      # check the required field `width`
      if (!is.null(input_json$`width`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CalculateTariffsOfferDTO: the required field `width` is missing."))
      }
      # check the required field `height`
      if (!is.null(input_json$`height`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CalculateTariffsOfferDTO: the required field `height` is missing."))
      }
      # check the required field `weight`
      if (!is.null(input_json$`weight`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CalculateTariffsOfferDTO: the required field `weight` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CalculateTariffsOfferDTO
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
      # check if the required `categoryId` is null
      if (is.null(self$`categoryId`)) {
        return(FALSE)
      }

      if (self$`categoryId` <= 0) {
        return(FALSE)
      }

      # check if the required `price` is null
      if (is.null(self$`price`)) {
        return(FALSE)
      }

      if (self$`price` <= 0) {
        return(FALSE)
      }

      # check if the required `length` is null
      if (is.null(self$`length`)) {
        return(FALSE)
      }

      if (self$`length` <= 0) {
        return(FALSE)
      }

      # check if the required `width` is null
      if (is.null(self$`width`)) {
        return(FALSE)
      }

      if (self$`width` <= 0) {
        return(FALSE)
      }

      # check if the required `height` is null
      if (is.null(self$`height`)) {
        return(FALSE)
      }

      if (self$`height` <= 0) {
        return(FALSE)
      }

      # check if the required `weight` is null
      if (is.null(self$`weight`)) {
        return(FALSE)
      }

      if (self$`weight` <= 0) {
        return(FALSE)
      }

      if (self$`quantity` < 1) {
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
      # check if the required `categoryId` is null
      if (is.null(self$`categoryId`)) {
        invalid_fields["categoryId"] <- "Non-nullable required field `categoryId` cannot be null."
      }

      if (self$`categoryId` <= 0) {
        invalid_fields["categoryId"] <- "Invalid value for `categoryId`, must be bigger than 0."
      }

      # check if the required `price` is null
      if (is.null(self$`price`)) {
        invalid_fields["price"] <- "Non-nullable required field `price` cannot be null."
      }

      if (self$`price` <= 0) {
        invalid_fields["price"] <- "Invalid value for `price`, must be bigger than 0."
      }

      # check if the required `length` is null
      if (is.null(self$`length`)) {
        invalid_fields["length"] <- "Non-nullable required field `length` cannot be null."
      }

      if (self$`length` <= 0) {
        invalid_fields["length"] <- "Invalid value for `length`, must be bigger than 0."
      }

      # check if the required `width` is null
      if (is.null(self$`width`)) {
        invalid_fields["width"] <- "Non-nullable required field `width` cannot be null."
      }

      if (self$`width` <= 0) {
        invalid_fields["width"] <- "Invalid value for `width`, must be bigger than 0."
      }

      # check if the required `height` is null
      if (is.null(self$`height`)) {
        invalid_fields["height"] <- "Non-nullable required field `height` cannot be null."
      }

      if (self$`height` <= 0) {
        invalid_fields["height"] <- "Invalid value for `height`, must be bigger than 0."
      }

      # check if the required `weight` is null
      if (is.null(self$`weight`)) {
        invalid_fields["weight"] <- "Non-nullable required field `weight` cannot be null."
      }

      if (self$`weight` <= 0) {
        invalid_fields["weight"] <- "Invalid value for `weight`, must be bigger than 0."
      }

      if (self$`quantity` < 1) {
        invalid_fields["quantity"] <- "Invalid value for `quantity`, must be bigger than or equal to 1."
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
# CalculateTariffsOfferDTO$unlock()
#
## Below is an example to define the print function
# CalculateTariffsOfferDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CalculateTariffsOfferDTO$lock()

