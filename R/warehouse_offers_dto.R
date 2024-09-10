#' Create a new WarehouseOffersDTO
#'
#' @description
#' Информация об остатках товаров на складе.
#'
#' @docType class
#' @title WarehouseOffersDTO
#' @description WarehouseOffersDTO Class
#' @format An \code{R6Class} generator object
#' @field warehouseId Идентификатор склада. integer
#' @field offers Информация об остатках. list(\link{WarehouseOfferDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
WarehouseOffersDTO <- R6::R6Class(
  "WarehouseOffersDTO",
  public = list(
    `warehouseId` = NULL,
    `offers` = NULL,
    #' Initialize a new WarehouseOffersDTO class.
    #'
    #' @description
    #' Initialize a new WarehouseOffersDTO class.
    #'
    #' @param warehouseId Идентификатор склада.
    #' @param offers Информация об остатках.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`warehouseId`, `offers`, ...) {
      if (!missing(`warehouseId`)) {
        if (!(is.numeric(`warehouseId`) && length(`warehouseId`) == 1)) {
          stop(paste("Error! Invalid data for `warehouseId`. Must be an integer:", `warehouseId`))
        }
        self$`warehouseId` <- `warehouseId`
      }
      if (!missing(`offers`)) {
        stopifnot(is.vector(`offers`), length(`offers`) != 0)
        sapply(`offers`, function(x) stopifnot(R6::is.R6(x)))
        self$`offers` <- `offers`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return WarehouseOffersDTO in JSON format
    #' @export
    toJSON = function() {
      WarehouseOffersDTOObject <- list()
      if (!is.null(self$`warehouseId`)) {
        WarehouseOffersDTOObject[["warehouseId"]] <-
          self$`warehouseId`
      }
      if (!is.null(self$`offers`)) {
        WarehouseOffersDTOObject[["offers"]] <-
          lapply(self$`offers`, function(x) x$toJSON())
      }
      WarehouseOffersDTOObject
    },
    #' Deserialize JSON string into an instance of WarehouseOffersDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of WarehouseOffersDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of WarehouseOffersDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`warehouseId`)) {
        self$`warehouseId` <- this_object$`warehouseId`
      }
      if (!is.null(this_object$`offers`)) {
        self$`offers` <- ApiClient$new()$deserializeObj(this_object$`offers`, "array[WarehouseOfferDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return WarehouseOffersDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`warehouseId`)) {
          sprintf(
          '"warehouseId":
            %d
                    ',
          self$`warehouseId`
          )
        },
        if (!is.null(self$`offers`)) {
          sprintf(
          '"offers":
          [%s]
',
          paste(sapply(self$`offers`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of WarehouseOffersDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of WarehouseOffersDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of WarehouseOffersDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`warehouseId` <- this_object$`warehouseId`
      self$`offers` <- ApiClient$new()$deserializeObj(this_object$`offers`, "array[WarehouseOfferDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to WarehouseOffersDTO
    #'
    #' @description
    #' Validate JSON input with respect to WarehouseOffersDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `warehouseId`
      if (!is.null(input_json$`warehouseId`)) {
        if (!(is.numeric(input_json$`warehouseId`) && length(input_json$`warehouseId`) == 1)) {
          stop(paste("Error! Invalid data for `warehouseId`. Must be an integer:", input_json$`warehouseId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for WarehouseOffersDTO: the required field `warehouseId` is missing."))
      }
      # check the required field `offers`
      if (!is.null(input_json$`offers`)) {
        stopifnot(is.vector(input_json$`offers`), length(input_json$`offers`) != 0)
        tmp <- sapply(input_json$`offers`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for WarehouseOffersDTO: the required field `offers` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of WarehouseOffersDTO
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
      # check if the required `warehouseId` is null
      if (is.null(self$`warehouseId`)) {
        return(FALSE)
      }

      # check if the required `offers` is null
      if (is.null(self$`offers`)) {
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
      # check if the required `warehouseId` is null
      if (is.null(self$`warehouseId`)) {
        invalid_fields["warehouseId"] <- "Non-nullable required field `warehouseId` cannot be null."
      }

      # check if the required `offers` is null
      if (is.null(self$`offers`)) {
        invalid_fields["offers"] <- "Non-nullable required field `offers` cannot be null."
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
# WarehouseOffersDTO$unlock()
#
## Below is an example to define the print function
# WarehouseOffersDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# WarehouseOffersDTO$lock()

