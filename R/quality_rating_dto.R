#' Create a new QualityRatingDTO
#'
#' @description
#' Информация об индексе качества.
#'
#' @docType class
#' @title QualityRatingDTO
#' @description QualityRatingDTO Class
#' @format An \code{R6Class} generator object
#' @field rating Значение индекса качества. integer
#' @field calculationDate Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`. character
#' @field components Составляющие индекса качества. list(\link{QualityRatingComponentDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
QualityRatingDTO <- R6::R6Class(
  "QualityRatingDTO",
  public = list(
    `rating` = NULL,
    `calculationDate` = NULL,
    `components` = NULL,
    #' Initialize a new QualityRatingDTO class.
    #'
    #' @description
    #' Initialize a new QualityRatingDTO class.
    #'
    #' @param rating Значение индекса качества.
    #' @param calculationDate Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`.
    #' @param components Составляющие индекса качества.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`rating`, `calculationDate`, `components`, ...) {
      if (!missing(`rating`)) {
        if (!(is.numeric(`rating`) && length(`rating`) == 1)) {
          stop(paste("Error! Invalid data for `rating`. Must be an integer:", `rating`))
        }
        self$`rating` <- `rating`
      }
      if (!missing(`calculationDate`)) {
        if (!(is.character(`calculationDate`) && length(`calculationDate`) == 1)) {
          stop(paste("Error! Invalid data for `calculationDate`. Must be a string:", `calculationDate`))
        }
        self$`calculationDate` <- `calculationDate`
      }
      if (!missing(`components`)) {
        stopifnot(is.vector(`components`), length(`components`) != 0)
        sapply(`components`, function(x) stopifnot(R6::is.R6(x)))
        self$`components` <- `components`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return QualityRatingDTO in JSON format
    #' @export
    toJSON = function() {
      QualityRatingDTOObject <- list()
      if (!is.null(self$`rating`)) {
        QualityRatingDTOObject[["rating"]] <-
          self$`rating`
      }
      if (!is.null(self$`calculationDate`)) {
        QualityRatingDTOObject[["calculationDate"]] <-
          self$`calculationDate`
      }
      if (!is.null(self$`components`)) {
        QualityRatingDTOObject[["components"]] <-
          lapply(self$`components`, function(x) x$toJSON())
      }
      QualityRatingDTOObject
    },
    #' Deserialize JSON string into an instance of QualityRatingDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of QualityRatingDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of QualityRatingDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`rating`)) {
        self$`rating` <- this_object$`rating`
      }
      if (!is.null(this_object$`calculationDate`)) {
        self$`calculationDate` <- this_object$`calculationDate`
      }
      if (!is.null(this_object$`components`)) {
        self$`components` <- ApiClient$new()$deserializeObj(this_object$`components`, "array[QualityRatingComponentDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return QualityRatingDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`rating`)) {
          sprintf(
          '"rating":
            %d
                    ',
          self$`rating`
          )
        },
        if (!is.null(self$`calculationDate`)) {
          sprintf(
          '"calculationDate":
            "%s"
                    ',
          self$`calculationDate`
          )
        },
        if (!is.null(self$`components`)) {
          sprintf(
          '"components":
          [%s]
',
          paste(sapply(self$`components`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of QualityRatingDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of QualityRatingDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of QualityRatingDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`rating` <- this_object$`rating`
      self$`calculationDate` <- this_object$`calculationDate`
      self$`components` <- ApiClient$new()$deserializeObj(this_object$`components`, "array[QualityRatingComponentDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to QualityRatingDTO
    #'
    #' @description
    #' Validate JSON input with respect to QualityRatingDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `rating`
      if (!is.null(input_json$`rating`)) {
        if (!(is.numeric(input_json$`rating`) && length(input_json$`rating`) == 1)) {
          stop(paste("Error! Invalid data for `rating`. Must be an integer:", input_json$`rating`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for QualityRatingDTO: the required field `rating` is missing."))
      }
      # check the required field `calculationDate`
      if (!is.null(input_json$`calculationDate`)) {
        if (!(is.character(input_json$`calculationDate`) && length(input_json$`calculationDate`) == 1)) {
          stop(paste("Error! Invalid data for `calculationDate`. Must be a string:", input_json$`calculationDate`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for QualityRatingDTO: the required field `calculationDate` is missing."))
      }
      # check the required field `components`
      if (!is.null(input_json$`components`)) {
        stopifnot(is.vector(input_json$`components`), length(input_json$`components`) != 0)
        tmp <- sapply(input_json$`components`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for QualityRatingDTO: the required field `components` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of QualityRatingDTO
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
      # check if the required `rating` is null
      if (is.null(self$`rating`)) {
        return(FALSE)
      }

      if (self$`rating` > 100) {
        return(FALSE)
      }
      if (self$`rating` < 0) {
        return(FALSE)
      }

      # check if the required `calculationDate` is null
      if (is.null(self$`calculationDate`)) {
        return(FALSE)
      }

      # check if the required `components` is null
      if (is.null(self$`components`)) {
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
      # check if the required `rating` is null
      if (is.null(self$`rating`)) {
        invalid_fields["rating"] <- "Non-nullable required field `rating` cannot be null."
      }

      if (self$`rating` > 100) {
        invalid_fields["rating"] <- "Invalid value for `rating`, must be smaller than or equal to 100."
      }
      if (self$`rating` < 0) {
        invalid_fields["rating"] <- "Invalid value for `rating`, must be bigger than or equal to 0."
      }

      # check if the required `calculationDate` is null
      if (is.null(self$`calculationDate`)) {
        invalid_fields["calculationDate"] <- "Non-nullable required field `calculationDate` cannot be null."
      }

      # check if the required `components` is null
      if (is.null(self$`components`)) {
        invalid_fields["components"] <- "Non-nullable required field `components` cannot be null."
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
# QualityRatingDTO$unlock()
#
## Below is an example to define the print function
# QualityRatingDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# QualityRatingDTO$lock()

