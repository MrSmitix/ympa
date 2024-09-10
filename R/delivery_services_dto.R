#' Create a new DeliveryServicesDTO
#'
#' @description
#' Информация о службах доставки.
#'
#' @docType class
#' @title DeliveryServicesDTO
#' @description DeliveryServicesDTO Class
#' @format An \code{R6Class} generator object
#' @field deliveryService Информация о службе доставки. list(\link{DeliveryServiceInfoDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DeliveryServicesDTO <- R6::R6Class(
  "DeliveryServicesDTO",
  public = list(
    `deliveryService` = NULL,
    #' Initialize a new DeliveryServicesDTO class.
    #'
    #' @description
    #' Initialize a new DeliveryServicesDTO class.
    #'
    #' @param deliveryService Информация о службе доставки.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`deliveryService`, ...) {
      if (!missing(`deliveryService`)) {
        stopifnot(is.vector(`deliveryService`), length(`deliveryService`) != 0)
        sapply(`deliveryService`, function(x) stopifnot(R6::is.R6(x)))
        self$`deliveryService` <- `deliveryService`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return DeliveryServicesDTO in JSON format
    #' @export
    toJSON = function() {
      DeliveryServicesDTOObject <- list()
      if (!is.null(self$`deliveryService`)) {
        DeliveryServicesDTOObject[["deliveryService"]] <-
          lapply(self$`deliveryService`, function(x) x$toJSON())
      }
      DeliveryServicesDTOObject
    },
    #' Deserialize JSON string into an instance of DeliveryServicesDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of DeliveryServicesDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeliveryServicesDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`deliveryService`)) {
        self$`deliveryService` <- ApiClient$new()$deserializeObj(this_object$`deliveryService`, "array[DeliveryServiceInfoDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return DeliveryServicesDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`deliveryService`)) {
          sprintf(
          '"deliveryService":
          [%s]
',
          paste(sapply(self$`deliveryService`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of DeliveryServicesDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of DeliveryServicesDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeliveryServicesDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`deliveryService` <- ApiClient$new()$deserializeObj(this_object$`deliveryService`, "array[DeliveryServiceInfoDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to DeliveryServicesDTO
    #'
    #' @description
    #' Validate JSON input with respect to DeliveryServicesDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `deliveryService`
      if (!is.null(input_json$`deliveryService`)) {
        stopifnot(is.vector(input_json$`deliveryService`), length(input_json$`deliveryService`) != 0)
        tmp <- sapply(input_json$`deliveryService`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for DeliveryServicesDTO: the required field `deliveryService` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of DeliveryServicesDTO
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
      # check if the required `deliveryService` is null
      if (is.null(self$`deliveryService`)) {
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
      # check if the required `deliveryService` is null
      if (is.null(self$`deliveryService`)) {
        invalid_fields["deliveryService"] <- "Non-nullable required field `deliveryService` cannot be null."
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
# DeliveryServicesDTO$unlock()
#
## Below is an example to define the print function
# DeliveryServicesDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# DeliveryServicesDTO$lock()

