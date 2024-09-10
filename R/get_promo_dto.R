#' Create a new GetPromoDTO
#'
#' @description
#' Информация об акции.
#'
#' @docType class
#' @title GetPromoDTO
#' @description GetPromoDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор акции. character
#' @field name Название акции. character
#' @field period  \link{PromoPeriodDTO}
#' @field participating Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением `true`, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением `false`.  Для прошедших акций всегда возвращается со значением `true`.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). character
#' @field assortmentInfo  \link{GetPromoAssortmentInfoDTO}
#' @field mechanicsInfo  \link{GetPromoMechanicsInfoDTO}
#' @field bestsellerInfo  \link{GetPromoBestsellerInfoDTO}
#' @field channels Список каналов продвижения товаров. list(\link{ChannelType}) [optional]
#' @field constraints  \link{GetPromoConstraintsDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GetPromoDTO <- R6::R6Class(
  "GetPromoDTO",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `period` = NULL,
    `participating` = NULL,
    `assortmentInfo` = NULL,
    `mechanicsInfo` = NULL,
    `bestsellerInfo` = NULL,
    `channels` = NULL,
    `constraints` = NULL,
    #' Initialize a new GetPromoDTO class.
    #'
    #' @description
    #' Initialize a new GetPromoDTO class.
    #'
    #' @param id Идентификатор акции.
    #' @param name Название акции.
    #' @param period period
    #' @param participating Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением `true`, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением `false`.  Для прошедших акций всегда возвращается со значением `true`.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).
    #' @param assortmentInfo assortmentInfo
    #' @param mechanicsInfo mechanicsInfo
    #' @param bestsellerInfo bestsellerInfo
    #' @param channels Список каналов продвижения товаров.
    #' @param constraints constraints
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id`, `name`, `period`, `participating`, `assortmentInfo`, `mechanicsInfo`, `bestsellerInfo`, `channels` = NULL, `constraints` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!missing(`period`)) {
        stopifnot(R6::is.R6(`period`))
        self$`period` <- `period`
      }
      if (!missing(`participating`)) {
        if (!(is.logical(`participating`) && length(`participating`) == 1)) {
          stop(paste("Error! Invalid data for `participating`. Must be a boolean:", `participating`))
        }
        self$`participating` <- `participating`
      }
      if (!missing(`assortmentInfo`)) {
        stopifnot(R6::is.R6(`assortmentInfo`))
        self$`assortmentInfo` <- `assortmentInfo`
      }
      if (!missing(`mechanicsInfo`)) {
        stopifnot(R6::is.R6(`mechanicsInfo`))
        self$`mechanicsInfo` <- `mechanicsInfo`
      }
      if (!missing(`bestsellerInfo`)) {
        stopifnot(R6::is.R6(`bestsellerInfo`))
        self$`bestsellerInfo` <- `bestsellerInfo`
      }
      if (!is.null(`channels`)) {
        stopifnot(is.vector(`channels`), length(`channels`) != 0)
        sapply(`channels`, function(x) stopifnot(R6::is.R6(x)))
        self$`channels` <- `channels`
      }
      if (!is.null(`constraints`)) {
        stopifnot(R6::is.R6(`constraints`))
        self$`constraints` <- `constraints`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetPromoDTO in JSON format
    #' @export
    toJSON = function() {
      GetPromoDTOObject <- list()
      if (!is.null(self$`id`)) {
        GetPromoDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        GetPromoDTOObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`period`)) {
        GetPromoDTOObject[["period"]] <-
          self$`period`$toJSON()
      }
      if (!is.null(self$`participating`)) {
        GetPromoDTOObject[["participating"]] <-
          self$`participating`
      }
      if (!is.null(self$`assortmentInfo`)) {
        GetPromoDTOObject[["assortmentInfo"]] <-
          self$`assortmentInfo`$toJSON()
      }
      if (!is.null(self$`mechanicsInfo`)) {
        GetPromoDTOObject[["mechanicsInfo"]] <-
          self$`mechanicsInfo`$toJSON()
      }
      if (!is.null(self$`bestsellerInfo`)) {
        GetPromoDTOObject[["bestsellerInfo"]] <-
          self$`bestsellerInfo`$toJSON()
      }
      if (!is.null(self$`channels`)) {
        GetPromoDTOObject[["channels"]] <-
          lapply(self$`channels`, function(x) x$toJSON())
      }
      if (!is.null(self$`constraints`)) {
        GetPromoDTOObject[["constraints"]] <-
          self$`constraints`$toJSON()
      }
      GetPromoDTOObject
    },
    #' Deserialize JSON string into an instance of GetPromoDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetPromoDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetPromoDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`period`)) {
        `period_object` <- PromoPeriodDTO$new()
        `period_object`$fromJSON(jsonlite::toJSON(this_object$`period`, auto_unbox = TRUE, digits = NA))
        self$`period` <- `period_object`
      }
      if (!is.null(this_object$`participating`)) {
        self$`participating` <- this_object$`participating`
      }
      if (!is.null(this_object$`assortmentInfo`)) {
        `assortmentinfo_object` <- GetPromoAssortmentInfoDTO$new()
        `assortmentinfo_object`$fromJSON(jsonlite::toJSON(this_object$`assortmentInfo`, auto_unbox = TRUE, digits = NA))
        self$`assortmentInfo` <- `assortmentinfo_object`
      }
      if (!is.null(this_object$`mechanicsInfo`)) {
        `mechanicsinfo_object` <- GetPromoMechanicsInfoDTO$new()
        `mechanicsinfo_object`$fromJSON(jsonlite::toJSON(this_object$`mechanicsInfo`, auto_unbox = TRUE, digits = NA))
        self$`mechanicsInfo` <- `mechanicsinfo_object`
      }
      if (!is.null(this_object$`bestsellerInfo`)) {
        `bestsellerinfo_object` <- GetPromoBestsellerInfoDTO$new()
        `bestsellerinfo_object`$fromJSON(jsonlite::toJSON(this_object$`bestsellerInfo`, auto_unbox = TRUE, digits = NA))
        self$`bestsellerInfo` <- `bestsellerinfo_object`
      }
      if (!is.null(this_object$`channels`)) {
        self$`channels` <- ApiClient$new()$deserializeObj(this_object$`channels`, "array[ChannelType]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`constraints`)) {
        `constraints_object` <- GetPromoConstraintsDTO$new()
        `constraints_object`$fromJSON(jsonlite::toJSON(this_object$`constraints`, auto_unbox = TRUE, digits = NA))
        self$`constraints` <- `constraints_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return GetPromoDTO in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
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
        if (!is.null(self$`period`)) {
          sprintf(
          '"period":
          %s
          ',
          jsonlite::toJSON(self$`period`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`participating`)) {
          sprintf(
          '"participating":
            %s
                    ',
          tolower(self$`participating`)
          )
        },
        if (!is.null(self$`assortmentInfo`)) {
          sprintf(
          '"assortmentInfo":
          %s
          ',
          jsonlite::toJSON(self$`assortmentInfo`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`mechanicsInfo`)) {
          sprintf(
          '"mechanicsInfo":
          %s
          ',
          jsonlite::toJSON(self$`mechanicsInfo`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`bestsellerInfo`)) {
          sprintf(
          '"bestsellerInfo":
          %s
          ',
          jsonlite::toJSON(self$`bestsellerInfo`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`channels`)) {
          sprintf(
          '"channels":
          [%s]
',
          paste(sapply(self$`channels`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`constraints`)) {
          sprintf(
          '"constraints":
          %s
          ',
          jsonlite::toJSON(self$`constraints`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of GetPromoDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of GetPromoDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of GetPromoDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`period` <- PromoPeriodDTO$new()$fromJSON(jsonlite::toJSON(this_object$`period`, auto_unbox = TRUE, digits = NA))
      self$`participating` <- this_object$`participating`
      self$`assortmentInfo` <- GetPromoAssortmentInfoDTO$new()$fromJSON(jsonlite::toJSON(this_object$`assortmentInfo`, auto_unbox = TRUE, digits = NA))
      self$`mechanicsInfo` <- GetPromoMechanicsInfoDTO$new()$fromJSON(jsonlite::toJSON(this_object$`mechanicsInfo`, auto_unbox = TRUE, digits = NA))
      self$`bestsellerInfo` <- GetPromoBestsellerInfoDTO$new()$fromJSON(jsonlite::toJSON(this_object$`bestsellerInfo`, auto_unbox = TRUE, digits = NA))
      self$`channels` <- ApiClient$new()$deserializeObj(this_object$`channels`, "array[ChannelType]", loadNamespace("ympa_r_client"))
      self$`constraints` <- GetPromoConstraintsDTO$new()$fromJSON(jsonlite::toJSON(this_object$`constraints`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to GetPromoDTO
    #'
    #' @description
    #' Validate JSON input with respect to GetPromoDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetPromoDTO: the required field `id` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetPromoDTO: the required field `name` is missing."))
      }
      # check the required field `period`
      if (!is.null(input_json$`period`)) {
        stopifnot(R6::is.R6(input_json$`period`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetPromoDTO: the required field `period` is missing."))
      }
      # check the required field `participating`
      if (!is.null(input_json$`participating`)) {
        if (!(is.logical(input_json$`participating`) && length(input_json$`participating`) == 1)) {
          stop(paste("Error! Invalid data for `participating`. Must be a boolean:", input_json$`participating`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetPromoDTO: the required field `participating` is missing."))
      }
      # check the required field `assortmentInfo`
      if (!is.null(input_json$`assortmentInfo`)) {
        stopifnot(R6::is.R6(input_json$`assortmentInfo`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetPromoDTO: the required field `assortmentInfo` is missing."))
      }
      # check the required field `mechanicsInfo`
      if (!is.null(input_json$`mechanicsInfo`)) {
        stopifnot(R6::is.R6(input_json$`mechanicsInfo`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetPromoDTO: the required field `mechanicsInfo` is missing."))
      }
      # check the required field `bestsellerInfo`
      if (!is.null(input_json$`bestsellerInfo`)) {
        stopifnot(R6::is.R6(input_json$`bestsellerInfo`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GetPromoDTO: the required field `bestsellerInfo` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GetPromoDTO
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

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        return(FALSE)
      }

      # check if the required `period` is null
      if (is.null(self$`period`)) {
        return(FALSE)
      }

      # check if the required `participating` is null
      if (is.null(self$`participating`)) {
        return(FALSE)
      }

      # check if the required `assortmentInfo` is null
      if (is.null(self$`assortmentInfo`)) {
        return(FALSE)
      }

      # check if the required `mechanicsInfo` is null
      if (is.null(self$`mechanicsInfo`)) {
        return(FALSE)
      }

      # check if the required `bestsellerInfo` is null
      if (is.null(self$`bestsellerInfo`)) {
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

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
      }

      # check if the required `period` is null
      if (is.null(self$`period`)) {
        invalid_fields["period"] <- "Non-nullable required field `period` cannot be null."
      }

      # check if the required `participating` is null
      if (is.null(self$`participating`)) {
        invalid_fields["participating"] <- "Non-nullable required field `participating` cannot be null."
      }

      # check if the required `assortmentInfo` is null
      if (is.null(self$`assortmentInfo`)) {
        invalid_fields["assortmentInfo"] <- "Non-nullable required field `assortmentInfo` cannot be null."
      }

      # check if the required `mechanicsInfo` is null
      if (is.null(self$`mechanicsInfo`)) {
        invalid_fields["mechanicsInfo"] <- "Non-nullable required field `mechanicsInfo` cannot be null."
      }

      # check if the required `bestsellerInfo` is null
      if (is.null(self$`bestsellerInfo`)) {
        invalid_fields["bestsellerInfo"] <- "Non-nullable required field `bestsellerInfo` cannot be null."
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
# GetPromoDTO$unlock()
#
## Below is an example to define the print function
# GetPromoDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GetPromoDTO$lock()

