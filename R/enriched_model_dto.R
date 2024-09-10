#' Create a new EnrichedModelDTO
#'
#' @description
#' Модель товара.
#'
#' @docType class
#' @title EnrichedModelDTO
#' @description EnrichedModelDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор модели товара. integer [optional]
#' @field name Название модели товара. character [optional]
#' @field prices  \link{ModelPriceDTO} [optional]
#' @field offers Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них. list(\link{ModelOfferDTO}) [optional]
#' @field offlineOffers Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина. integer [optional]
#' @field onlineOffers Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
EnrichedModelDTO <- R6::R6Class(
  "EnrichedModelDTO",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `prices` = NULL,
    `offers` = NULL,
    `offlineOffers` = NULL,
    `onlineOffers` = NULL,
    #' Initialize a new EnrichedModelDTO class.
    #'
    #' @description
    #' Initialize a new EnrichedModelDTO class.
    #'
    #' @param id Идентификатор модели товара.
    #' @param name Название модели товара.
    #' @param prices prices
    #' @param offers Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них.
    #' @param offlineOffers Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина.
    #' @param onlineOffers Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id` = NULL, `name` = NULL, `prices` = NULL, `offers` = NULL, `offlineOffers` = NULL, `onlineOffers` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`prices`)) {
        stopifnot(R6::is.R6(`prices`))
        self$`prices` <- `prices`
      }
      if (!is.null(`offers`)) {
        stopifnot(is.vector(`offers`), length(`offers`) != 0)
        sapply(`offers`, function(x) stopifnot(R6::is.R6(x)))
        self$`offers` <- `offers`
      }
      if (!is.null(`offlineOffers`)) {
        if (!(is.numeric(`offlineOffers`) && length(`offlineOffers`) == 1)) {
          stop(paste("Error! Invalid data for `offlineOffers`. Must be an integer:", `offlineOffers`))
        }
        self$`offlineOffers` <- `offlineOffers`
      }
      if (!is.null(`onlineOffers`)) {
        if (!(is.numeric(`onlineOffers`) && length(`onlineOffers`) == 1)) {
          stop(paste("Error! Invalid data for `onlineOffers`. Must be an integer:", `onlineOffers`))
        }
        self$`onlineOffers` <- `onlineOffers`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return EnrichedModelDTO in JSON format
    #' @export
    toJSON = function() {
      EnrichedModelDTOObject <- list()
      if (!is.null(self$`id`)) {
        EnrichedModelDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        EnrichedModelDTOObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`prices`)) {
        EnrichedModelDTOObject[["prices"]] <-
          self$`prices`$toJSON()
      }
      if (!is.null(self$`offers`)) {
        EnrichedModelDTOObject[["offers"]] <-
          lapply(self$`offers`, function(x) x$toJSON())
      }
      if (!is.null(self$`offlineOffers`)) {
        EnrichedModelDTOObject[["offlineOffers"]] <-
          self$`offlineOffers`
      }
      if (!is.null(self$`onlineOffers`)) {
        EnrichedModelDTOObject[["onlineOffers"]] <-
          self$`onlineOffers`
      }
      EnrichedModelDTOObject
    },
    #' Deserialize JSON string into an instance of EnrichedModelDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of EnrichedModelDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of EnrichedModelDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`prices`)) {
        `prices_object` <- ModelPriceDTO$new()
        `prices_object`$fromJSON(jsonlite::toJSON(this_object$`prices`, auto_unbox = TRUE, digits = NA))
        self$`prices` <- `prices_object`
      }
      if (!is.null(this_object$`offers`)) {
        self$`offers` <- ApiClient$new()$deserializeObj(this_object$`offers`, "array[ModelOfferDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`offlineOffers`)) {
        self$`offlineOffers` <- this_object$`offlineOffers`
      }
      if (!is.null(this_object$`onlineOffers`)) {
        self$`onlineOffers` <- this_object$`onlineOffers`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return EnrichedModelDTO in JSON format
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
        if (!is.null(self$`prices`)) {
          sprintf(
          '"prices":
          %s
          ',
          jsonlite::toJSON(self$`prices`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`offers`)) {
          sprintf(
          '"offers":
          [%s]
',
          paste(sapply(self$`offers`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`offlineOffers`)) {
          sprintf(
          '"offlineOffers":
            %d
                    ',
          self$`offlineOffers`
          )
        },
        if (!is.null(self$`onlineOffers`)) {
          sprintf(
          '"onlineOffers":
            %d
                    ',
          self$`onlineOffers`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of EnrichedModelDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of EnrichedModelDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of EnrichedModelDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`prices` <- ModelPriceDTO$new()$fromJSON(jsonlite::toJSON(this_object$`prices`, auto_unbox = TRUE, digits = NA))
      self$`offers` <- ApiClient$new()$deserializeObj(this_object$`offers`, "array[ModelOfferDTO]", loadNamespace("ympa_r_client"))
      self$`offlineOffers` <- this_object$`offlineOffers`
      self$`onlineOffers` <- this_object$`onlineOffers`
      self
    },
    #' Validate JSON input with respect to EnrichedModelDTO
    #'
    #' @description
    #' Validate JSON input with respect to EnrichedModelDTO and throw an exception if invalid
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
    #' @return String representation of EnrichedModelDTO
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
# EnrichedModelDTO$unlock()
#
## Below is an example to define the print function
# EnrichedModelDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# EnrichedModelDTO$lock()

