#' Create a new GetPromoMechanicsInfoDTO
#'
#' @description
#' Информация о типе акции.
#'
#' @docType class
#' @title GetPromoMechanicsInfoDTO
#' @description GetPromoMechanicsInfoDTO Class
#' @format An \code{R6Class} generator object
#' @field type  \link{MechanicsType}
#' @field promocodeInfo  \link{GetPromoPromocodeInfoDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetPromoMechanicsInfoDTO <- R6::R6Class(
  "GetPromoMechanicsInfoDTO",
  public = list(
    `type` = NULL,
    `promocodeInfo` = NULL,
    #' Initialize a new GetPromoMechanicsInfoDTO class.
    #'
    #' @description
    #' Initialize a new GetPromoMechanicsInfoDTO class.
    #'
    #' @param type type
    #' @param promocodeInfo promocodeInfo
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`type`, `promocodeInfo` = NULL, ...) {
      if (!missing(`type`)) {
        if (!(`type` %in% c())) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
      if (!is.null(`promocodeInfo`)) {
        stopifnot(R6::is.R6(`promocodeInfo`))
        self$`promocodeInfo` <- `promocodeInfo`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetPromoMechanicsInfoDTO in JSON format
    #' @export
    toJSON = function() {
      GetPromoMechanicsInfoDTOObject <- list()
      if (!is.null(self$`type`)) {
        GetPromoMechanicsInfoDTOObject[["type"]] <-
          self$`type`$toJSON()
      }
      if (!is.null(self$`promocodeInfo`)) {
        GetPromoMechanicsInfoDTOObject[["promocodeInfo"]] <-
          self$`promocodeInfo`$toJSON()
      }
      GetPromoMechanicsInfoDTOObject
    },
    #' Deserialize JSON string into an instance of GetPromoMechanicsInfoDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetPromoMechanicsInfoDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetPromoMechanicsInfoDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        `type_object` <- MechanicsType$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
      if (!is.null(this_object$`promocodeInfo`)) {
        `promocodeinfo_object` <- GetPromoPromocodeInfoDTO$new()
        `promocodeinfo_object`$fromJSON(jsonlite::toJSON(this_object$`promocodeInfo`, auto_unbox = TRUE, digits = NA))
        self$`promocodeInfo` <- `promocodeinfo_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetPromoMechanicsInfoDTO in JSON format
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
        if (!is.null(self$`promocodeInfo`)) {
          sprintf(
          '"promocodeInfo":
          %s
          ',
          jsonlite::toJSON(self$`promocodeInfo`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetPromoMechanicsInfoDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetPromoMechanicsInfoDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetPromoMechanicsInfoDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`type` <- MechanicsType$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self$`promocodeInfo` <- GetPromoPromocodeInfoDTO$new()$fromJSON(jsonlite::toJSON(this_object$`promocodeInfo`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to GetPromoMechanicsInfoDTO
    #'
    #' @description
    #' Validate JSON input with respect to GetPromoMechanicsInfoDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        stopifnot(R6::is.R6(input_json$`type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetPromoMechanicsInfoDTO: the required field `type` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetPromoMechanicsInfoDTO
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
# GetPromoMechanicsInfoDTO$unlock()
#
## Below is an example to define the print function
# GetPromoMechanicsInfoDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetPromoMechanicsInfoDTO$lock()

