#' Create a new PriceQuarantineVerdictDTO
#'
#' @description
#' Причина попадания товара в карантин.
#'
#' @docType class
#' @title PriceQuarantineVerdictDTO
#' @description PriceQuarantineVerdictDTO Class
#' @format An \code{R6Class} generator object
#' @field type  \link{PriceQuarantineVerdictType} [optional]
#' @field params Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина. list(\link{PriceQuarantineVerdictParameterDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PriceQuarantineVerdictDTO <- R6::R6Class(
  "PriceQuarantineVerdictDTO",
  public = list(
    `type` = NULL,
    `params` = NULL,
    #' Initialize a new PriceQuarantineVerdictDTO class.
    #'
    #' @description
    #' Initialize a new PriceQuarantineVerdictDTO class.
    #'
    #' @param params Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина.
    #' @param type type
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`params`, `type` = NULL, ...) {
      if (!missing(`params`)) {
        stopifnot(is.vector(`params`), length(`params`) != 0)
        sapply(`params`, function(x) stopifnot(R6::is.R6(x)))
        self$`params` <- `params`
      }
      if (!is.null(`type`)) {
        if (!(`type` %in% c())) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PriceQuarantineVerdictDTO in JSON format
    #' @export
    toJSON = function() {
      PriceQuarantineVerdictDTOObject <- list()
      if (!is.null(self$`type`)) {
        PriceQuarantineVerdictDTOObject[["type"]] <-
          self$`type`$toJSON()
      }
      if (!is.null(self$`params`)) {
        PriceQuarantineVerdictDTOObject[["params"]] <-
          lapply(self$`params`, function(x) x$toJSON())
      }
      PriceQuarantineVerdictDTOObject
    },
    #' Deserialize JSON string into an instance of PriceQuarantineVerdictDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of PriceQuarantineVerdictDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of PriceQuarantineVerdictDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        `type_object` <- PriceQuarantineVerdictType$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
      if (!is.null(this_object$`params`)) {
        self$`params` <- ApiClient$new()$deserializeObj(this_object$`params`, "array[PriceQuarantineVerdictParameterDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PriceQuarantineVerdictDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
          %s
          ',
          jsonlite::toJSON(self$`type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`params`)) {
          sprintf(
          '"params":
          [%s]
',
          paste(sapply(self$`params`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of PriceQuarantineVerdictDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of PriceQuarantineVerdictDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of PriceQuarantineVerdictDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`type` <- PriceQuarantineVerdictType$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self$`params` <- ApiClient$new()$deserializeObj(this_object$`params`, "array[PriceQuarantineVerdictParameterDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to PriceQuarantineVerdictDTO
    #'
    #' @description
    #' Validate JSON input with respect to PriceQuarantineVerdictDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `params`
      if (!is.null(input_json$`params`)) {
        stopifnot(is.vector(input_json$`params`), length(input_json$`params`) != 0)
        tmp <- sapply(input_json$`params`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PriceQuarantineVerdictDTO: the required field `params` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PriceQuarantineVerdictDTO
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
      # check if the required `params` is null
      if (is.null(self$`params`)) {
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
      # check if the required `params` is null
      if (is.null(self$`params`)) {
        invalid_fields["params"] <- "Non-nullable required field `params` cannot be null."
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
# PriceQuarantineVerdictDTO$unlock()
#
## Below is an example to define the print function
# PriceQuarantineVerdictDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PriceQuarantineVerdictDTO$lock()

