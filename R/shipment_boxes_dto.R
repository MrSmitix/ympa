#' Create a new ShipmentBoxesDTO
#'
#' @description
#' В ответе Маркет возвращает переданный вами список грузовых мест. Не обращайте на это поле внимания. 
#'
#' @docType class
#' @title ShipmentBoxesDTO
#' @description ShipmentBoxesDTO Class
#' @format An \code{R6Class} generator object
#' @field boxes Список грузовых мест. Маркет определил количество мест по длине этого списка. list(\link{ParcelBoxDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ShipmentBoxesDTO <- R6::R6Class(
  "ShipmentBoxesDTO",
  public = list(
    `boxes` = NULL,
    #' Initialize a new ShipmentBoxesDTO class.
    #'
    #' @description
    #' Initialize a new ShipmentBoxesDTO class.
    #'
    #' @param boxes Список грузовых мест. Маркет определил количество мест по длине этого списка.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`boxes`, ...) {
      if (!missing(`boxes`)) {
        stopifnot(is.vector(`boxes`), length(`boxes`) != 0)
        sapply(`boxes`, function(x) stopifnot(R6::is.R6(x)))
        self$`boxes` <- `boxes`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ShipmentBoxesDTO in JSON format
    #' @export
    toJSON = function() {
      ShipmentBoxesDTOObject <- list()
      if (!is.null(self$`boxes`)) {
        ShipmentBoxesDTOObject[["boxes"]] <-
          lapply(self$`boxes`, function(x) x$toJSON())
      }
      ShipmentBoxesDTOObject
    },
    #' Deserialize JSON string into an instance of ShipmentBoxesDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ShipmentBoxesDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ShipmentBoxesDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`boxes`)) {
        self$`boxes` <- ApiClient$new()$deserializeObj(this_object$`boxes`, "array[ParcelBoxDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ShipmentBoxesDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`boxes`)) {
          sprintf(
          '"boxes":
          [%s]
',
          paste(sapply(self$`boxes`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ShipmentBoxesDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ShipmentBoxesDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ShipmentBoxesDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`boxes` <- ApiClient$new()$deserializeObj(this_object$`boxes`, "array[ParcelBoxDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to ShipmentBoxesDTO
    #'
    #' @description
    #' Validate JSON input with respect to ShipmentBoxesDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `boxes`
      if (!is.null(input_json$`boxes`)) {
        stopifnot(is.vector(input_json$`boxes`), length(input_json$`boxes`) != 0)
        tmp <- sapply(input_json$`boxes`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ShipmentBoxesDTO: the required field `boxes` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ShipmentBoxesDTO
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
      # check if the required `boxes` is null
      if (is.null(self$`boxes`)) {
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
      # check if the required `boxes` is null
      if (is.null(self$`boxes`)) {
        invalid_fields["boxes"] <- "Non-nullable required field `boxes` cannot be null."
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
# ShipmentBoxesDTO$unlock()
#
## Below is an example to define the print function
# ShipmentBoxesDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ShipmentBoxesDTO$lock()

