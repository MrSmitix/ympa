#' Create a new ReturnItemDTO
#'
#' @description
#' Список товаров в возврате.
#'
#' @docType class
#' @title ReturnItemDTO
#' @description ReturnItemDTO Class
#' @format An \code{R6Class} generator object
#' @field marketSku SKU на Маркете. integer [optional]
#' @field shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) character
#' @field count Количество единиц товара. integer
#' @field decisions Список решений по возврату. list(\link{ReturnDecisionDTO}) [optional]
#' @field instances Список логистических позиций возврата. list(\link{ReturnInstanceDTO}) [optional]
#' @field tracks Список трек-кодов для почтовых отправлений. list(\link{TrackDTO}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ReturnItemDTO <- R6::R6Class(
  "ReturnItemDTO",
  public = list(
    `marketSku` = NULL,
    `shopSku` = NULL,
    `count` = NULL,
    `decisions` = NULL,
    `instances` = NULL,
    `tracks` = NULL,
    #' Initialize a new ReturnItemDTO class.
    #'
    #' @description
    #' Initialize a new ReturnItemDTO class.
    #'
    #' @param shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
    #' @param count Количество единиц товара.
    #' @param marketSku SKU на Маркете.
    #' @param decisions Список решений по возврату.
    #' @param instances Список логистических позиций возврата.
    #' @param tracks Список трек-кодов для почтовых отправлений.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`shopSku`, `count`, `marketSku` = NULL, `decisions` = NULL, `instances` = NULL, `tracks` = NULL, ...) {
      if (!missing(`shopSku`)) {
        if (!(is.character(`shopSku`) && length(`shopSku`) == 1)) {
          stop(paste("Error! Invalid data for `shopSku`. Must be a string:", `shopSku`))
        }
        self$`shopSku` <- `shopSku`
      }
      if (!missing(`count`)) {
        if (!(is.numeric(`count`) && length(`count`) == 1)) {
          stop(paste("Error! Invalid data for `count`. Must be an integer:", `count`))
        }
        self$`count` <- `count`
      }
      if (!is.null(`marketSku`)) {
        if (!(is.numeric(`marketSku`) && length(`marketSku`) == 1)) {
          stop(paste("Error! Invalid data for `marketSku`. Must be an integer:", `marketSku`))
        }
        self$`marketSku` <- `marketSku`
      }
      if (!is.null(`decisions`)) {
        stopifnot(is.vector(`decisions`), length(`decisions`) != 0)
        sapply(`decisions`, function(x) stopifnot(R6::is.R6(x)))
        self$`decisions` <- `decisions`
      }
      if (!is.null(`instances`)) {
        stopifnot(is.vector(`instances`), length(`instances`) != 0)
        sapply(`instances`, function(x) stopifnot(R6::is.R6(x)))
        self$`instances` <- `instances`
      }
      if (!is.null(`tracks`)) {
        stopifnot(is.vector(`tracks`), length(`tracks`) != 0)
        sapply(`tracks`, function(x) stopifnot(R6::is.R6(x)))
        self$`tracks` <- `tracks`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ReturnItemDTO in JSON format
    #' @export
    toJSON = function() {
      ReturnItemDTOObject <- list()
      if (!is.null(self$`marketSku`)) {
        ReturnItemDTOObject[["marketSku"]] <-
          self$`marketSku`
      }
      if (!is.null(self$`shopSku`)) {
        ReturnItemDTOObject[["shopSku"]] <-
          self$`shopSku`
      }
      if (!is.null(self$`count`)) {
        ReturnItemDTOObject[["count"]] <-
          self$`count`
      }
      if (!is.null(self$`decisions`)) {
        ReturnItemDTOObject[["decisions"]] <-
          lapply(self$`decisions`, function(x) x$toJSON())
      }
      if (!is.null(self$`instances`)) {
        ReturnItemDTOObject[["instances"]] <-
          lapply(self$`instances`, function(x) x$toJSON())
      }
      if (!is.null(self$`tracks`)) {
        ReturnItemDTOObject[["tracks"]] <-
          lapply(self$`tracks`, function(x) x$toJSON())
      }
      ReturnItemDTOObject
    },
    #' Deserialize JSON string into an instance of ReturnItemDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ReturnItemDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ReturnItemDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`marketSku`)) {
        self$`marketSku` <- this_object$`marketSku`
      }
      if (!is.null(this_object$`shopSku`)) {
        self$`shopSku` <- this_object$`shopSku`
      }
      if (!is.null(this_object$`count`)) {
        self$`count` <- this_object$`count`
      }
      if (!is.null(this_object$`decisions`)) {
        self$`decisions` <- ApiClient$new()$deserializeObj(this_object$`decisions`, "array[ReturnDecisionDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`instances`)) {
        self$`instances` <- ApiClient$new()$deserializeObj(this_object$`instances`, "array[ReturnInstanceDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`tracks`)) {
        self$`tracks` <- ApiClient$new()$deserializeObj(this_object$`tracks`, "array[TrackDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ReturnItemDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`marketSku`)) {
          sprintf(
          '"marketSku":
            %d
                    ',
          self$`marketSku`
          )
        },
        if (!is.null(self$`shopSku`)) {
          sprintf(
          '"shopSku":
            "%s"
                    ',
          self$`shopSku`
          )
        },
        if (!is.null(self$`count`)) {
          sprintf(
          '"count":
            %d
                    ',
          self$`count`
          )
        },
        if (!is.null(self$`decisions`)) {
          sprintf(
          '"decisions":
          [%s]
',
          paste(sapply(self$`decisions`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`instances`)) {
          sprintf(
          '"instances":
          [%s]
',
          paste(sapply(self$`instances`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`tracks`)) {
          sprintf(
          '"tracks":
          [%s]
',
          paste(sapply(self$`tracks`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ReturnItemDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of ReturnItemDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of ReturnItemDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`marketSku` <- this_object$`marketSku`
      self$`shopSku` <- this_object$`shopSku`
      self$`count` <- this_object$`count`
      self$`decisions` <- ApiClient$new()$deserializeObj(this_object$`decisions`, "array[ReturnDecisionDTO]", loadNamespace("ympa_r_client"))
      self$`instances` <- ApiClient$new()$deserializeObj(this_object$`instances`, "array[ReturnInstanceDTO]", loadNamespace("ympa_r_client"))
      self$`tracks` <- ApiClient$new()$deserializeObj(this_object$`tracks`, "array[TrackDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to ReturnItemDTO
    #'
    #' @description
    #' Validate JSON input with respect to ReturnItemDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `shopSku`
      if (!is.null(input_json$`shopSku`)) {
        if (!(is.character(input_json$`shopSku`) && length(input_json$`shopSku`) == 1)) {
          stop(paste("Error! Invalid data for `shopSku`. Must be a string:", input_json$`shopSku`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ReturnItemDTO: the required field `shopSku` is missing."))
      }
      # check the required field `count`
      if (!is.null(input_json$`count`)) {
        if (!(is.numeric(input_json$`count`) && length(input_json$`count`) == 1)) {
          stop(paste("Error! Invalid data for `count`. Must be an integer:", input_json$`count`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ReturnItemDTO: the required field `count` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ReturnItemDTO
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
      # check if the required `shopSku` is null
      if (is.null(self$`shopSku`)) {
        return(FALSE)
      }

      if (nchar(self$`shopSku`) > 255) {
        return(FALSE)
      }
      if (nchar(self$`shopSku`) < 1) {
        return(FALSE)
      }
      if (!str_detect(self$`shopSku`, "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")) {
        return(FALSE)
      }

      # check if the required `count` is null
      if (is.null(self$`count`)) {
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
      # check if the required `shopSku` is null
      if (is.null(self$`shopSku`)) {
        invalid_fields["shopSku"] <- "Non-nullable required field `shopSku` cannot be null."
      }

      if (nchar(self$`shopSku`) > 255) {
        invalid_fields["shopSku"] <- "Invalid length for `shopSku`, must be smaller than or equal to 255."
      }
      if (nchar(self$`shopSku`) < 1) {
        invalid_fields["shopSku"] <- "Invalid length for `shopSku`, must be bigger than or equal to 1."
      }
      if (!str_detect(self$`shopSku`, "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")) {
        invalid_fields["shopSku"] <- "Invalid value for `shopSku`, must conform to the pattern ^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$."
      }

      # check if the required `count` is null
      if (is.null(self$`count`)) {
        invalid_fields["count"] <- "Non-nullable required field `count` cannot be null."
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
# ReturnItemDTO$unlock()
#
## Below is an example to define the print function
# ReturnItemDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ReturnItemDTO$lock()

