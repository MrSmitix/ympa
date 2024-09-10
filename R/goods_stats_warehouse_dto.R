#' Create a new GoodsStatsWarehouseDTO
#'
#' @description
#' Информация о складе.
#'
#' @docType class
#' @title GoodsStatsWarehouseDTO
#' @description GoodsStatsWarehouseDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор склада. integer [optional]
#' @field name Название склада. character [optional]
#' @field stocks Информация об остатках товаров на складе. list(\link{WarehouseStockDTO})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GoodsStatsWarehouseDTO <- R6::R6Class(
  "GoodsStatsWarehouseDTO",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `stocks` = NULL,
    #' Initialize a new GoodsStatsWarehouseDTO class.
    #'
    #' @description
    #' Initialize a new GoodsStatsWarehouseDTO class.
    #'
    #' @param stocks Информация об остатках товаров на складе.
    #' @param id Идентификатор склада.
    #' @param name Название склада.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`stocks`, `id` = NULL, `name` = NULL, ...) {
      if (!missing(`stocks`)) {
        stopifnot(is.vector(`stocks`), length(`stocks`) != 0)
        sapply(`stocks`, function(x) stopifnot(R6::is.R6(x)))
        self$`stocks` <- `stocks`
      }
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
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GoodsStatsWarehouseDTO in JSON format
    #' @export
    toJSON = function() {
      GoodsStatsWarehouseDTOObject <- list()
      if (!is.null(self$`id`)) {
        GoodsStatsWarehouseDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        GoodsStatsWarehouseDTOObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`stocks`)) {
        GoodsStatsWarehouseDTOObject[["stocks"]] <-
          lapply(self$`stocks`, function(x) x$toJSON())
      }
      GoodsStatsWarehouseDTOObject
    },
    #' Deserialize JSON string into an instance of GoodsStatsWarehouseDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GoodsStatsWarehouseDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GoodsStatsWarehouseDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`stocks`)) {
        self$`stocks` <- ApiClient$new()$deserializeObj(this_object$`stocks`, "array[WarehouseStockDTO]", loadNamespace("ympa_r_client"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GoodsStatsWarehouseDTO in JSON format
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
        if (!is.null(self$`stocks`)) {
          sprintf(
          '"stocks":
          [%s]
',
          paste(sapply(self$`stocks`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GoodsStatsWarehouseDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GoodsStatsWarehouseDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GoodsStatsWarehouseDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`stocks` <- ApiClient$new()$deserializeObj(this_object$`stocks`, "array[WarehouseStockDTO]", loadNamespace("ympa_r_client"))
      self
    },
    #' Validate JSON input with respect to GoodsStatsWarehouseDTO
    #'
    #' @description
    #' Validate JSON input with respect to GoodsStatsWarehouseDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `stocks`
      if (!is.null(input_json$`stocks`)) {
        stopifnot(is.vector(input_json$`stocks`), length(input_json$`stocks`) != 0)
        tmp <- sapply(input_json$`stocks`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GoodsStatsWarehouseDTO: the required field `stocks` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GoodsStatsWarehouseDTO
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
      # check if the required `stocks` is null
      if (is.null(self$`stocks`)) {
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
      # check if the required `stocks` is null
      if (is.null(self$`stocks`)) {
        invalid_fields["stocks"] <- "Non-nullable required field `stocks` cannot be null."
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
# GoodsStatsWarehouseDTO$unlock()
#
## Below is an example to define the print function
# GoodsStatsWarehouseDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GoodsStatsWarehouseDTO$lock()

