#' Create a new CategoryParameterDTO
#'
#' @description
#' Характеристика товара.
#'
#' @docType class
#' @title CategoryParameterDTO
#' @description CategoryParameterDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор характеристики. integer
#' @field name Название характеристики. character [optional]
#' @field type  \link{ParameterType}
#' @field unit  \link{CategoryParameterUnitDTO} [optional]
#' @field description Описание характеристики. character [optional]
#' @field recommendationTypes Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика. list(\link{OfferCardRecommendationType}) [optional]
#' @field required Обязательность характеристики. character
#' @field filtering Используется ли характеристика в фильтре. character
#' @field distinctive Является ли характеристика особенностью варианта. character
#' @field multivalue Можно ли передать сразу несколько значений. character
#' @field allowCustomValues Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`. character
#' @field values Список допустимых значений параметра. Только для характеристик типа `ENUM`. list(\link{ParameterValueOptionDTO}) [optional]
#' @field constraints  \link{ParameterValueConstraintsDTO} [optional]
#' @field valueRestrictions Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`. list(\link{ValueRestrictionDTO}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CategoryParameterDTO <- R6::R6Class(
  "CategoryParameterDTO",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `type` = NULL,
    `unit` = NULL,
    `description` = NULL,
    `recommendationTypes` = NULL,
    `required` = NULL,
    `filtering` = NULL,
    `distinctive` = NULL,
    `multivalue` = NULL,
    `allowCustomValues` = NULL,
    `values` = NULL,
    `constraints` = NULL,
    `valueRestrictions` = NULL,
    #' Initialize a new CategoryParameterDTO class.
    #'
    #' @description
    #' Initialize a new CategoryParameterDTO class.
    #'
    #' @param id Идентификатор характеристики.
    #' @param type type
    #' @param required Обязательность характеристики.
    #' @param filtering Используется ли характеристика в фильтре.
    #' @param distinctive Является ли характеристика особенностью варианта.
    #' @param multivalue Можно ли передать сразу несколько значений.
    #' @param allowCustomValues Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`.
    #' @param name Название характеристики.
    #' @param unit unit
    #' @param description Описание характеристики.
    #' @param recommendationTypes Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика.
    #' @param values Список допустимых значений параметра. Только для характеристик типа `ENUM`.
    #' @param constraints constraints
    #' @param valueRestrictions Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id`, `type`, `required`, `filtering`, `distinctive`, `multivalue`, `allowCustomValues`, `name` = NULL, `unit` = NULL, `description` = NULL, `recommendationTypes` = NULL, `values` = NULL, `constraints` = NULL, `valueRestrictions` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`type`)) {
        if (!(`type` %in% c())) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
      if (!missing(`required`)) {
        if (!(is.logical(`required`) && length(`required`) == 1)) {
          stop(paste("Error! Invalid data for `required`. Must be a boolean:", `required`))
        }
        self$`required` <- `required`
      }
      if (!missing(`filtering`)) {
        if (!(is.logical(`filtering`) && length(`filtering`) == 1)) {
          stop(paste("Error! Invalid data for `filtering`. Must be a boolean:", `filtering`))
        }
        self$`filtering` <- `filtering`
      }
      if (!missing(`distinctive`)) {
        if (!(is.logical(`distinctive`) && length(`distinctive`) == 1)) {
          stop(paste("Error! Invalid data for `distinctive`. Must be a boolean:", `distinctive`))
        }
        self$`distinctive` <- `distinctive`
      }
      if (!missing(`multivalue`)) {
        if (!(is.logical(`multivalue`) && length(`multivalue`) == 1)) {
          stop(paste("Error! Invalid data for `multivalue`. Must be a boolean:", `multivalue`))
        }
        self$`multivalue` <- `multivalue`
      }
      if (!missing(`allowCustomValues`)) {
        if (!(is.logical(`allowCustomValues`) && length(`allowCustomValues`) == 1)) {
          stop(paste("Error! Invalid data for `allowCustomValues`. Must be a boolean:", `allowCustomValues`))
        }
        self$`allowCustomValues` <- `allowCustomValues`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`unit`)) {
        stopifnot(R6::is.R6(`unit`))
        self$`unit` <- `unit`
      }
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!is.null(`recommendationTypes`)) {
        stopifnot(is.vector(`recommendationTypes`), length(`recommendationTypes`) != 0)
        sapply(`recommendationTypes`, function(x) stopifnot(R6::is.R6(x)))
        self$`recommendationTypes` <- `recommendationTypes`
      }
      if (!is.null(`values`)) {
        stopifnot(is.vector(`values`), length(`values`) != 0)
        sapply(`values`, function(x) stopifnot(R6::is.R6(x)))
        self$`values` <- `values`
      }
      if (!is.null(`constraints`)) {
        stopifnot(R6::is.R6(`constraints`))
        self$`constraints` <- `constraints`
      }
      if (!is.null(`valueRestrictions`)) {
        stopifnot(is.vector(`valueRestrictions`), length(`valueRestrictions`) != 0)
        sapply(`valueRestrictions`, function(x) stopifnot(R6::is.R6(x)))
        self$`valueRestrictions` <- `valueRestrictions`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CategoryParameterDTO in JSON format
    #' @export
    toJSON = function() {
      CategoryParameterDTOObject <- list()
      if (!is.null(self$`id`)) {
        CategoryParameterDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        CategoryParameterDTOObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`type`)) {
        CategoryParameterDTOObject[["type"]] <-
          self$`type`$toJSON()
      }
      if (!is.null(self$`unit`)) {
        CategoryParameterDTOObject[["unit"]] <-
          self$`unit`$toJSON()
      }
      if (!is.null(self$`description`)) {
        CategoryParameterDTOObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`recommendationTypes`)) {
        CategoryParameterDTOObject[["recommendationTypes"]] <-
          lapply(self$`recommendationTypes`, function(x) x$toJSON())
      }
      if (!is.null(self$`required`)) {
        CategoryParameterDTOObject[["required"]] <-
          self$`required`
      }
      if (!is.null(self$`filtering`)) {
        CategoryParameterDTOObject[["filtering"]] <-
          self$`filtering`
      }
      if (!is.null(self$`distinctive`)) {
        CategoryParameterDTOObject[["distinctive"]] <-
          self$`distinctive`
      }
      if (!is.null(self$`multivalue`)) {
        CategoryParameterDTOObject[["multivalue"]] <-
          self$`multivalue`
      }
      if (!is.null(self$`allowCustomValues`)) {
        CategoryParameterDTOObject[["allowCustomValues"]] <-
          self$`allowCustomValues`
      }
      if (!is.null(self$`values`)) {
        CategoryParameterDTOObject[["values"]] <-
          lapply(self$`values`, function(x) x$toJSON())
      }
      if (!is.null(self$`constraints`)) {
        CategoryParameterDTOObject[["constraints"]] <-
          self$`constraints`$toJSON()
      }
      if (!is.null(self$`valueRestrictions`)) {
        CategoryParameterDTOObject[["valueRestrictions"]] <-
          lapply(self$`valueRestrictions`, function(x) x$toJSON())
      }
      CategoryParameterDTOObject
    },
    #' Deserialize JSON string into an instance of CategoryParameterDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of CategoryParameterDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of CategoryParameterDTO
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
        `type_object` <- ParameterType$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
      if (!is.null(this_object$`unit`)) {
        `unit_object` <- CategoryParameterUnitDTO$new()
        `unit_object`$fromJSON(jsonlite::toJSON(this_object$`unit`, auto_unbox = TRUE, digits = NA))
        self$`unit` <- `unit_object`
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`recommendationTypes`)) {
        self$`recommendationTypes` <- ApiClient$new()$deserializeObj(this_object$`recommendationTypes`, "array[OfferCardRecommendationType]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`required`)) {
        self$`required` <- this_object$`required`
      }
      if (!is.null(this_object$`filtering`)) {
        self$`filtering` <- this_object$`filtering`
      }
      if (!is.null(this_object$`distinctive`)) {
        self$`distinctive` <- this_object$`distinctive`
      }
      if (!is.null(this_object$`multivalue`)) {
        self$`multivalue` <- this_object$`multivalue`
      }
      if (!is.null(this_object$`allowCustomValues`)) {
        self$`allowCustomValues` <- this_object$`allowCustomValues`
      }
      if (!is.null(this_object$`values`)) {
        self$`values` <- ApiClient$new()$deserializeObj(this_object$`values`, "array[ParameterValueOptionDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`constraints`)) {
        `constraints_object` <- ParameterValueConstraintsDTO$new()
        `constraints_object`$fromJSON(jsonlite::toJSON(this_object$`constraints`, auto_unbox = TRUE, digits = NA))
        self$`constraints` <- `constraints_object`
      }
      if (!is.null(this_object$`valueRestrictions`)) {
        self$`valueRestrictions` <- ApiClient$new()$deserializeObj(this_object$`valueRestrictions`, "array[ValueRestrictionDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CategoryParameterDTO in JSON format
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
        if (!is.null(self$`unit`)) {
          sprintf(
          '"unit":
          %s
          ',
          jsonlite::toJSON(self$`unit`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`description`)) {
          sprintf(
          '"description":
            "%s"
                    ',
          self$`description`
          )
        },
        if (!is.null(self$`recommendationTypes`)) {
          sprintf(
          '"recommendationTypes":
          [%s]
',
          paste(sapply(self$`recommendationTypes`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`required`)) {
          sprintf(
          '"required":
            %s
                    ',
          tolower(self$`required`)
          )
        },
        if (!is.null(self$`filtering`)) {
          sprintf(
          '"filtering":
            %s
                    ',
          tolower(self$`filtering`)
          )
        },
        if (!is.null(self$`distinctive`)) {
          sprintf(
          '"distinctive":
            %s
                    ',
          tolower(self$`distinctive`)
          )
        },
        if (!is.null(self$`multivalue`)) {
          sprintf(
          '"multivalue":
            %s
                    ',
          tolower(self$`multivalue`)
          )
        },
        if (!is.null(self$`allowCustomValues`)) {
          sprintf(
          '"allowCustomValues":
            %s
                    ',
          tolower(self$`allowCustomValues`)
          )
        },
        if (!is.null(self$`values`)) {
          sprintf(
          '"values":
          [%s]
',
          paste(sapply(self$`values`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`constraints`)) {
          sprintf(
          '"constraints":
          %s
          ',
          jsonlite::toJSON(self$`constraints`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`valueRestrictions`)) {
          sprintf(
          '"valueRestrictions":
          [%s]
',
          paste(sapply(self$`valueRestrictions`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CategoryParameterDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of CategoryParameterDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of CategoryParameterDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`type` <- ParameterType$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self$`unit` <- CategoryParameterUnitDTO$new()$fromJSON(jsonlite::toJSON(this_object$`unit`, auto_unbox = TRUE, digits = NA))
      self$`description` <- this_object$`description`
      self$`recommendationTypes` <- ApiClient$new()$deserializeObj(this_object$`recommendationTypes`, "array[OfferCardRecommendationType]", loadNamespace("ympa_r_client"))
      self$`required` <- this_object$`required`
      self$`filtering` <- this_object$`filtering`
      self$`distinctive` <- this_object$`distinctive`
      self$`multivalue` <- this_object$`multivalue`
      self$`allowCustomValues` <- this_object$`allowCustomValues`
      self$`values` <- ApiClient$new()$deserializeObj(this_object$`values`, "array[ParameterValueOptionDTO]", loadNamespace("ympa_r_client"))
      self$`constraints` <- ParameterValueConstraintsDTO$new()$fromJSON(jsonlite::toJSON(this_object$`constraints`, auto_unbox = TRUE, digits = NA))
      self$`valueRestrictions` <- ApiClient$new()$deserializeObj(this_object$`valueRestrictions`, "array[ValueRestrictionDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to CategoryParameterDTO
    #'
    #' @description
    #' Validate JSON input with respect to CategoryParameterDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.numeric(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CategoryParameterDTO: the required field `id` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        stopifnot(R6::is.R6(input_json$`type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CategoryParameterDTO: the required field `type` is missing."))
      }
      # check the required field `required`
      if (!is.null(input_json$`required`)) {
        if (!(is.logical(input_json$`required`) && length(input_json$`required`) == 1)) {
          stop(paste("Error! Invalid data for `required`. Must be a boolean:", input_json$`required`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CategoryParameterDTO: the required field `required` is missing."))
      }
      # check the required field `filtering`
      if (!is.null(input_json$`filtering`)) {
        if (!(is.logical(input_json$`filtering`) && length(input_json$`filtering`) == 1)) {
          stop(paste("Error! Invalid data for `filtering`. Must be a boolean:", input_json$`filtering`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CategoryParameterDTO: the required field `filtering` is missing."))
      }
      # check the required field `distinctive`
      if (!is.null(input_json$`distinctive`)) {
        if (!(is.logical(input_json$`distinctive`) && length(input_json$`distinctive`) == 1)) {
          stop(paste("Error! Invalid data for `distinctive`. Must be a boolean:", input_json$`distinctive`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CategoryParameterDTO: the required field `distinctive` is missing."))
      }
      # check the required field `multivalue`
      if (!is.null(input_json$`multivalue`)) {
        if (!(is.logical(input_json$`multivalue`) && length(input_json$`multivalue`) == 1)) {
          stop(paste("Error! Invalid data for `multivalue`. Must be a boolean:", input_json$`multivalue`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CategoryParameterDTO: the required field `multivalue` is missing."))
      }
      # check the required field `allowCustomValues`
      if (!is.null(input_json$`allowCustomValues`)) {
        if (!(is.logical(input_json$`allowCustomValues`) && length(input_json$`allowCustomValues`) == 1)) {
          stop(paste("Error! Invalid data for `allowCustomValues`. Must be a boolean:", input_json$`allowCustomValues`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CategoryParameterDTO: the required field `allowCustomValues` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CategoryParameterDTO
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        return(FALSE)
      }

      # check if the required `required` is null
      if (is.null(self$`required`)) {
        return(FALSE)
      }

      # check if the required `filtering` is null
      if (is.null(self$`filtering`)) {
        return(FALSE)
      }

      # check if the required `distinctive` is null
      if (is.null(self$`distinctive`)) {
        return(FALSE)
      }

      # check if the required `multivalue` is null
      if (is.null(self$`multivalue`)) {
        return(FALSE)
      }

      # check if the required `allowCustomValues` is null
      if (is.null(self$`allowCustomValues`)) {
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
      }

      # check if the required `required` is null
      if (is.null(self$`required`)) {
        invalid_fields["required"] <- "Non-nullable required field `required` cannot be null."
      }

      # check if the required `filtering` is null
      if (is.null(self$`filtering`)) {
        invalid_fields["filtering"] <- "Non-nullable required field `filtering` cannot be null."
      }

      # check if the required `distinctive` is null
      if (is.null(self$`distinctive`)) {
        invalid_fields["distinctive"] <- "Non-nullable required field `distinctive` cannot be null."
      }

      # check if the required `multivalue` is null
      if (is.null(self$`multivalue`)) {
        invalid_fields["multivalue"] <- "Non-nullable required field `multivalue` cannot be null."
      }

      # check if the required `allowCustomValues` is null
      if (is.null(self$`allowCustomValues`)) {
        invalid_fields["allowCustomValues"] <- "Non-nullable required field `allowCustomValues` cannot be null."
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
# CategoryParameterDTO$unlock()
#
## Below is an example to define the print function
# CategoryParameterDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CategoryParameterDTO$lock()

