#' Create a new RegionDTO
#'
#' @description
#' Регион доставки.
#'
#' @docType class
#' @title RegionDTO
#' @description RegionDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор региона. integer [optional]
#' @field name Название региона. character
#' @field type  \link{RegionType}
#' @field parent  \link{RegionDTO} [optional]
#' @field children Дочерние регионы. list(\link{RegionDTO}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RegionDTO <- R6::R6Class(
  "RegionDTO",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `type` = NULL,
    `parent` = NULL,
    `children` = NULL,
    #' Initialize a new RegionDTO class.
    #'
    #' @description
    #' Initialize a new RegionDTO class.
    #'
    #' @param name Название региона.
    #' @param type type
    #' @param id Идентификатор региона.
    #' @param parent parent
    #' @param children Дочерние регионы.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`name`, `type`, `id` = NULL, `parent` = NULL, `children` = NULL, ...) {
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!missing(`type`)) {
        if (!(`type` %in% c())) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
      if (!is.null(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`parent`)) {
        stopifnot(R6::is.R6(`parent`))
        self$`parent` <- `parent`
      }
      if (!is.null(`children`)) {
        stopifnot(is.vector(`children`), length(`children`) != 0)
        sapply(`children`, function(x) stopifnot(R6::is.R6(x)))
        self$`children` <- `children`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return RegionDTO in JSON format
    #' @export
    toJSON = function() {
      RegionDTOObject <- list()
      if (!is.null(self$`id`)) {
        RegionDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        RegionDTOObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`type`)) {
        RegionDTOObject[["type"]] <-
          self$`type`$toJSON()
      }
      if (!is.null(self$`parent`)) {
        RegionDTOObject[["parent"]] <-
          self$`parent`$toJSON()
      }
      if (!is.null(self$`children`)) {
        RegionDTOObject[["children"]] <-
          lapply(self$`children`, function(x) x$toJSON())
      }
      RegionDTOObject
    },
    #' Deserialize JSON string into an instance of RegionDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of RegionDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of RegionDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`type`)) {
        `type_object` <- RegionType$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
      if (!is.null(this_object$`parent`)) {
        `parent_object` <- RegionDTO$new()
        `parent_object`$fromJSON(jsonlite::toJSON(this_object$`parent`, auto_unbox = TRUE, digits = NA))
        self$`parent` <- `parent_object`
      }
      if (!is.null(this_object$`children`)) {
        self$`children` <- ApiClient$new()$deserializeObj(this_object$`children`, "array[RegionDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return RegionDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            %d
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        },
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
          %s
          ',
          jsonlite::toJSON(self$`type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`parent`)) {
          sprintf(
          '"parent":
          %s
          ',
          jsonlite::toJSON(self$`parent`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`children`)) {
          sprintf(
          '"children":
          [%s]
',
          paste(sapply(self$`children`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of RegionDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of RegionDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of RegionDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`type` <- RegionType$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self$`parent` <- RegionDTO$new()$fromJSON(jsonlite::toJSON(this_object$`parent`, auto_unbox = TRUE, digits = NA))
      self$`children` <- ApiClient$new()$deserializeObj(this_object$`children`, "array[RegionDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to RegionDTO
    #'
    #' @description
    #' Validate JSON input with respect to RegionDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RegionDTO: the required field `name` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        stopifnot(R6::is.R6(input_json$`type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RegionDTO: the required field `type` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RegionDTO
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
      # check if the required `name` is null
      if (is.null(self$`name`)) {
        return(FALSE)
      }

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
      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
      }

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
# RegionDTO$unlock()
#
## Below is an example to define the print function
# RegionDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RegionDTO$lock()

