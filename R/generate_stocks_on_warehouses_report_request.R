#' Create a new GenerateStocksOnWarehousesReportRequest
#'
#' @description
#' Данные, необходимые для генерации отчета. 
#'
#' @docType class
#' @title GenerateStocksOnWarehousesReportRequest
#' @description GenerateStocksOnWarehousesReportRequest Class
#' @format An \code{R6Class} generator object
#' @field campaignId Идентификатор магазина. integer
#' @field warehouseIds Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md). list(integer) [optional]
#' @field reportDate Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день. character [optional]
#' @field categoryIds Фильтр по категориям на Маркете (кроме модели FBY). list(integer) [optional]
#' @field hasStocks Фильтр по наличию остатков (кроме модели FBY). character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GenerateStocksOnWarehousesReportRequest <- R6::R6Class(
  "GenerateStocksOnWarehousesReportRequest",
  public = list(
    `campaignId` = NULL,
    `warehouseIds` = NULL,
    `reportDate` = NULL,
    `categoryIds` = NULL,
    `hasStocks` = NULL,
    #' Initialize a new GenerateStocksOnWarehousesReportRequest class.
    #'
    #' @description
    #' Initialize a new GenerateStocksOnWarehousesReportRequest class.
    #'
    #' @param campaignId Идентификатор магазина.
    #' @param warehouseIds Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).
    #' @param reportDate Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.
    #' @param categoryIds Фильтр по категориям на Маркете (кроме модели FBY).
    #' @param hasStocks Фильтр по наличию остатков (кроме модели FBY).
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`campaignId`, `warehouseIds` = NULL, `reportDate` = NULL, `categoryIds` = NULL, `hasStocks` = NULL, ...) {
      if (!missing(`campaignId`)) {
        if (!(is.numeric(`campaignId`) && length(`campaignId`) == 1)) {
          stop(paste("Error! Invalid data for `campaignId`. Must be an integer:", `campaignId`))
        }
        self$`campaignId` <- `campaignId`
      }
      if (!is.null(`warehouseIds`)) {
        stopifnot(is.vector(`warehouseIds`), length(`warehouseIds`) != 0)
        sapply(`warehouseIds`, function(x) stopifnot(is.character(x)))
        self$`warehouseIds` <- `warehouseIds`
      }
      if (!is.null(`reportDate`)) {
        if (!is.character(`reportDate`)) {
          stop(paste("Error! Invalid data for `reportDate`. Must be a string:", `reportDate`))
        }
        self$`reportDate` <- `reportDate`
      }
      if (!is.null(`categoryIds`)) {
        stopifnot(is.vector(`categoryIds`), length(`categoryIds`) != 0)
        sapply(`categoryIds`, function(x) stopifnot(is.character(x)))
        self$`categoryIds` <- `categoryIds`
      }
      if (!is.null(`hasStocks`)) {
        if (!(is.logical(`hasStocks`) && length(`hasStocks`) == 1)) {
          stop(paste("Error! Invalid data for `hasStocks`. Must be a boolean:", `hasStocks`))
        }
        self$`hasStocks` <- `hasStocks`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GenerateStocksOnWarehousesReportRequest in JSON format
    #' @export
    toJSON = function() {
      GenerateStocksOnWarehousesReportRequestObject <- list()
      if (!is.null(self$`campaignId`)) {
        GenerateStocksOnWarehousesReportRequestObject[["campaignId"]] <-
          self$`campaignId`
      }
      if (!is.null(self$`warehouseIds`)) {
        GenerateStocksOnWarehousesReportRequestObject[["warehouseIds"]] <-
          self$`warehouseIds`
      }
      if (!is.null(self$`reportDate`)) {
        GenerateStocksOnWarehousesReportRequestObject[["reportDate"]] <-
          self$`reportDate`
      }
      if (!is.null(self$`categoryIds`)) {
        GenerateStocksOnWarehousesReportRequestObject[["categoryIds"]] <-
          self$`categoryIds`
      }
      if (!is.null(self$`hasStocks`)) {
        GenerateStocksOnWarehousesReportRequestObject[["hasStocks"]] <-
          self$`hasStocks`
      }
      GenerateStocksOnWarehousesReportRequestObject
    },
    #' Deserialize JSON string into an instance of GenerateStocksOnWarehousesReportRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GenerateStocksOnWarehousesReportRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenerateStocksOnWarehousesReportRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`campaignId`)) {
        self$`campaignId` <- this_object$`campaignId`
      }
      if (!is.null(this_object$`warehouseIds`)) {
        self$`warehouseIds` <- ApiClient$new()$deserializeObj(this_object$`warehouseIds`, "array[integer]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`reportDate`)) {
        self$`reportDate` <- this_object$`reportDate`
      }
      if (!is.null(this_object$`categoryIds`)) {
        self$`categoryIds` <- ApiClient$new()$deserializeObj(this_object$`categoryIds`, "array[integer]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`hasStocks`)) {
        self$`hasStocks` <- this_object$`hasStocks`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GenerateStocksOnWarehousesReportRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`campaignId`)) {
          sprintf(
          '"campaignId":
            %d
                    ',
          self$`campaignId`
          )
        },
        if (!is.null(self$`warehouseIds`)) {
          sprintf(
          '"warehouseIds":
             [%s]
          ',
          paste(unlist(lapply(self$`warehouseIds`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`reportDate`)) {
          sprintf(
          '"reportDate":
            "%s"
                    ',
          self$`reportDate`
          )
        },
        if (!is.null(self$`categoryIds`)) {
          sprintf(
          '"categoryIds":
             [%s]
          ',
          paste(unlist(lapply(self$`categoryIds`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`hasStocks`)) {
          sprintf(
          '"hasStocks":
            %s
                    ',
          tolower(self$`hasStocks`)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GenerateStocksOnWarehousesReportRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of GenerateStocksOnWarehousesReportRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenerateStocksOnWarehousesReportRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`campaignId` <- this_object$`campaignId`
      self$`warehouseIds` <- ApiClient$new()$deserializeObj(this_object$`warehouseIds`, "array[integer]", loadNamespace("ympa_r_client"))
      self$`reportDate` <- this_object$`reportDate`
      self$`categoryIds` <- ApiClient$new()$deserializeObj(this_object$`categoryIds`, "array[integer]", loadNamespace("ympa_r_client"))
      self$`hasStocks` <- this_object$`hasStocks`
      self
    },
    #' Validate JSON input with respect to GenerateStocksOnWarehousesReportRequest
    #'
    #' @description
    #' Validate JSON input with respect to GenerateStocksOnWarehousesReportRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `campaignId`
      if (!is.null(input_json$`campaignId`)) {
        if (!(is.numeric(input_json$`campaignId`) && length(input_json$`campaignId`) == 1)) {
          stop(paste("Error! Invalid data for `campaignId`. Must be an integer:", input_json$`campaignId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenerateStocksOnWarehousesReportRequest: the required field `campaignId` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GenerateStocksOnWarehousesReportRequest
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
      # check if the required `campaignId` is null
      if (is.null(self$`campaignId`)) {
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
      # check if the required `campaignId` is null
      if (is.null(self$`campaignId`)) {
        invalid_fields["campaignId"] <- "Non-nullable required field `campaignId` cannot be null."
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
# GenerateStocksOnWarehousesReportRequest$unlock()
#
## Below is an example to define the print function
# GenerateStocksOnWarehousesReportRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GenerateStocksOnWarehousesReportRequest$lock()

