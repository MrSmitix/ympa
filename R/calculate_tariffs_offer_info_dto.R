#' Create a new CalculateTariffsOfferInfoDTO
#'
#' @description
#' Стоимость услуг.
#'
#' @docType class
#' @title CalculateTariffsOfferInfoDTO
#' @description CalculateTariffsOfferInfoDTO Class
#' @format An \code{R6Class} generator object
#' @field offer  \link{CalculateTariffsOfferDTO}
#' @field tariffs Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). list(\link{CalculatedTariffDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CalculateTariffsOfferInfoDTO <- R6::R6Class(
  "CalculateTariffsOfferInfoDTO",
  public = list(
    `offer` = NULL,
    `tariffs` = NULL,
    #' Initialize a new CalculateTariffsOfferInfoDTO class.
    #'
    #' @description
    #' Initialize a new CalculateTariffsOfferInfoDTO class.
    #'
    #' @param offer offer
    #' @param tariffs Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/).
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offer`, `tariffs`, ...) {
      if (!missing(`offer`)) {
        stopifnot(R6::is.R6(`offer`))
        self$`offer` <- `offer`
      }
      if (!missing(`tariffs`)) {
        stopifnot(is.vector(`tariffs`), length(`tariffs`) != 0)
        sapply(`tariffs`, function(x) stopifnot(R6::is.R6(x)))
        self$`tariffs` <- `tariffs`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CalculateTariffsOfferInfoDTO in JSON format
    #' @export
    toJSON = function() {
      CalculateTariffsOfferInfoDTOObject <- list()
      if (!is.null(self$`offer`)) {
        CalculateTariffsOfferInfoDTOObject[["offer"]] <-
          self$`offer`$toJSON()
      }
      if (!is.null(self$`tariffs`)) {
        CalculateTariffsOfferInfoDTOObject[["tariffs"]] <-
          lapply(self$`tariffs`, function(x) x$toJSON())
      }
      CalculateTariffsOfferInfoDTOObject
    },
    #' Deserialize JSON string into an instance of CalculateTariffsOfferInfoDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of CalculateTariffsOfferInfoDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of CalculateTariffsOfferInfoDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`offer`)) {
        `offer_object` <- CalculateTariffsOfferDTO$new()
        `offer_object`$fromJSON(jsonlite::toJSON(this_object$`offer`, auto_unbox = TRUE, digits = NA))
        self$`offer` <- `offer_object`
      }
      if (!is.null(this_object$`tariffs`)) {
        self$`tariffs` <- ApiClient$new()$deserializeObj(this_object$`tariffs`, "array[CalculatedTariffDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CalculateTariffsOfferInfoDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`offer`)) {
          sprintf(
          '"offer":
          %s
          ',
          jsonlite::toJSON(self$`offer`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`tariffs`)) {
          sprintf(
          '"tariffs":
          [%s]
',
          paste(sapply(self$`tariffs`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CalculateTariffsOfferInfoDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of CalculateTariffsOfferInfoDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of CalculateTariffsOfferInfoDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`offer` <- CalculateTariffsOfferDTO$new()$fromJSON(jsonlite::toJSON(this_object$`offer`, auto_unbox = TRUE, digits = NA))
      self$`tariffs` <- ApiClient$new()$deserializeObj(this_object$`tariffs`, "array[CalculatedTariffDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to CalculateTariffsOfferInfoDTO
    #'
    #' @description
    #' Validate JSON input with respect to CalculateTariffsOfferInfoDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `offer`
      if (!is.null(input_json$`offer`)) {
        stopifnot(R6::is.R6(input_json$`offer`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CalculateTariffsOfferInfoDTO: the required field `offer` is missing."))
      }
      # check the required field `tariffs`
      if (!is.null(input_json$`tariffs`)) {
        stopifnot(is.vector(input_json$`tariffs`), length(input_json$`tariffs`) != 0)
        tmp <- sapply(input_json$`tariffs`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CalculateTariffsOfferInfoDTO: the required field `tariffs` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CalculateTariffsOfferInfoDTO
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
      # check if the required `offer` is null
      if (is.null(self$`offer`)) {
        return(FALSE)
      }

      # check if the required `tariffs` is null
      if (is.null(self$`tariffs`)) {
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
      # check if the required `offer` is null
      if (is.null(self$`offer`)) {
        invalid_fields["offer"] <- "Non-nullable required field `offer` cannot be null."
      }

      # check if the required `tariffs` is null
      if (is.null(self$`tariffs`)) {
        invalid_fields["tariffs"] <- "Non-nullable required field `tariffs` cannot be null."
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
# CalculateTariffsOfferInfoDTO$unlock()
#
## Below is an example to define the print function
# CalculateTariffsOfferInfoDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CalculateTariffsOfferInfoDTO$lock()

