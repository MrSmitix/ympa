#' Create a new ReturnInstanceDTO
#'
#' @description
#' Логистическая информация по возврату.
#'
#' @docType class
#' @title ReturnInstanceDTO
#' @description ReturnInstanceDTO Class
#' @format An \code{R6Class} generator object
#' @field stockType  \link{ReturnInstanceStockType} [optional]
#' @field status  \link{ReturnInstanceStatusType} [optional]
#' @field cis Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/). character [optional]
#' @field imei Международный идентификатор мобильного оборудования. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ReturnInstanceDTO <- R6::R6Class(
  "ReturnInstanceDTO",
  public = list(
    `stockType` = NULL,
    `status` = NULL,
    `cis` = NULL,
    `imei` = NULL,
    #' Initialize a new ReturnInstanceDTO class.
    #'
    #' @description
    #' Initialize a new ReturnInstanceDTO class.
    #'
    #' @param stockType stockType
    #' @param status status
    #' @param cis Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
    #' @param imei Международный идентификатор мобильного оборудования.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`stockType` = NULL, `status` = NULL, `cis` = NULL, `imei` = NULL, ...) {
      if (!is.null(`stockType`)) {
        if (!(`stockType` %in% c())) {
          stop(paste("Error! \"", `stockType`, "\" cannot be assigned to `stockType`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`stockType`))
        self$`stockType` <- `stockType`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`cis`)) {
        if (!(is.character(`cis`) && length(`cis`) == 1)) {
          stop(paste("Error! Invalid data for `cis`. Must be a string:", `cis`))
        }
        self$`cis` <- `cis`
      }
      if (!is.null(`imei`)) {
        if (!(is.character(`imei`) && length(`imei`) == 1)) {
          stop(paste("Error! Invalid data for `imei`. Must be a string:", `imei`))
        }
        self$`imei` <- `imei`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ReturnInstanceDTO in JSON format
    #' @export
    toJSON = function() {
      ReturnInstanceDTOObject <- list()
      if (!is.null(self$`stockType`)) {
        ReturnInstanceDTOObject[["stockType"]] <-
          self$`stockType`$toJSON()
      }
      if (!is.null(self$`status`)) {
        ReturnInstanceDTOObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`cis`)) {
        ReturnInstanceDTOObject[["cis"]] <-
          self$`cis`
      }
      if (!is.null(self$`imei`)) {
        ReturnInstanceDTOObject[["imei"]] <-
          self$`imei`
      }
      ReturnInstanceDTOObject
    },
    #' Deserialize JSON string into an instance of ReturnInstanceDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ReturnInstanceDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ReturnInstanceDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`stockType`)) {
        `stocktype_object` <- ReturnInstanceStockType$new()
        `stocktype_object`$fromJSON(jsonlite::toJSON(this_object$`stockType`, auto_unbox = TRUE, digits = NA))
        self$`stockType` <- `stocktype_object`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- ReturnInstanceStatusType$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`cis`)) {
        self$`cis` <- this_object$`cis`
      }
      if (!is.null(this_object$`imei`)) {
        self$`imei` <- this_object$`imei`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ReturnInstanceDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`stockType`)) {
          sprintf(
          '"stockType":
          %s
          ',
          jsonlite::toJSON(self$`stockType`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
          %s
          ',
          jsonlite::toJSON(self$`status`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`cis`)) {
          sprintf(
          '"cis":
            "%s"
                    ',
          self$`cis`
          )
        },
        if (!is.null(self$`imei`)) {
          sprintf(
          '"imei":
            "%s"
                    ',
          self$`imei`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ReturnInstanceDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ReturnInstanceDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ReturnInstanceDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`stockType` <- ReturnInstanceStockType$new()$fromJSON(jsonlite::toJSON(this_object$`stockType`, auto_unbox = TRUE, digits = NA))
      self$`status` <- ReturnInstanceStatusType$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`cis` <- this_object$`cis`
      self$`imei` <- this_object$`imei`
      self
    },
    #' Validate JSON input with respect to ReturnInstanceDTO
    #'
    #' @description
    #' Validate JSON input with respect to ReturnInstanceDTO and throw an exception if invalid
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
    #' @return String representation of ReturnInstanceDTO
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
# ReturnInstanceDTO$unlock()
#
## Below is an example to define the print function
# ReturnInstanceDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ReturnInstanceDTO$lock()

