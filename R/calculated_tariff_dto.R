#' Create a new CalculatedTariffDTO
#'
#' @description
#' Информация об услугах Маркета.
#'
#' @docType class
#' @title CalculatedTariffDTO
#' @description CalculatedTariffDTO Class
#' @format An \code{R6Class} generator object
#' @field type  \link{CalculatedTariffType}
#' @field amount Стоимость услуги в рублях. numeric [optional]
#' @field parameters Параметры расчета тарифа. list(\link{TariffParameterDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CalculatedTariffDTO <- R6::R6Class(
  "CalculatedTariffDTO",
  public = list(
    `type` = NULL,
    `amount` = NULL,
    `parameters` = NULL,
    #' Initialize a new CalculatedTariffDTO class.
    #'
    #' @description
    #' Initialize a new CalculatedTariffDTO class.
    #'
    #' @param type type
    #' @param parameters Параметры расчета тарифа.
    #' @param amount Стоимость услуги в рублях.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`type`, `parameters`, `amount` = NULL, ...) {
      if (!missing(`type`)) {
        if (!(`type` %in% c())) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
      if (!missing(`parameters`)) {
        stopifnot(is.vector(`parameters`), length(`parameters`) != 0)
        sapply(`parameters`, function(x) stopifnot(R6::is.R6(x)))
        self$`parameters` <- `parameters`
      }
      if (!is.null(`amount`)) {
        self$`amount` <- `amount`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CalculatedTariffDTO in JSON format
    #' @export
    toJSON = function() {
      CalculatedTariffDTOObject <- list()
      if (!is.null(self$`type`)) {
        CalculatedTariffDTOObject[["type"]] <-
          self$`type`$toJSON()
      }
      if (!is.null(self$`amount`)) {
        CalculatedTariffDTOObject[["amount"]] <-
          self$`amount`
      }
      if (!is.null(self$`parameters`)) {
        CalculatedTariffDTOObject[["parameters"]] <-
          lapply(self$`parameters`, function(x) x$toJSON())
      }
      CalculatedTariffDTOObject
    },
    #' Deserialize JSON string into an instance of CalculatedTariffDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of CalculatedTariffDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of CalculatedTariffDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        `type_object` <- CalculatedTariffType$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
      if (!is.null(this_object$`amount`)) {
        self$`amount` <- this_object$`amount`
      }
      if (!is.null(this_object$`parameters`)) {
        self$`parameters` <- ApiClient$new()$deserializeObj(this_object$`parameters`, "array[TariffParameterDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CalculatedTariffDTO in JSON format
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
        if (!is.null(self$`amount`)) {
          sprintf(
          '"amount":
            %d
                    ',
          self$`amount`
          )
        },
        if (!is.null(self$`parameters`)) {
          sprintf(
          '"parameters":
          [%s]
',
          paste(sapply(self$`parameters`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CalculatedTariffDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of CalculatedTariffDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of CalculatedTariffDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`type` <- CalculatedTariffType$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self$`amount` <- this_object$`amount`
      self$`parameters` <- ApiClient$new()$deserializeObj(this_object$`parameters`, "array[TariffParameterDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to CalculatedTariffDTO
    #'
    #' @description
    #' Validate JSON input with respect to CalculatedTariffDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        stopifnot(R6::is.R6(input_json$`type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CalculatedTariffDTO: the required field `type` is missing."))
      }
      # check the required field `parameters`
      if (!is.null(input_json$`parameters`)) {
        stopifnot(is.vector(input_json$`parameters`), length(input_json$`parameters`) != 0)
        tmp <- sapply(input_json$`parameters`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CalculatedTariffDTO: the required field `parameters` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CalculatedTariffDTO
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
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        return(FALSE)
      }

      # check if the required `parameters` is null
      if (is.null(self$`parameters`)) {
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
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
      }

      # check if the required `parameters` is null
      if (is.null(self$`parameters`)) {
        invalid_fields["parameters"] <- "Non-nullable required field `parameters` cannot be null."
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
# CalculatedTariffDTO$unlock()
#
## Below is an example to define the print function
# CalculatedTariffDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CalculatedTariffDTO$lock()

