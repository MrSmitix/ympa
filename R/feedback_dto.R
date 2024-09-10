#' Create a new FeedbackDTO
#'
#' @description
#' Отзыв пользователя Яндекс Маркета об указанном магазине.
#'
#' @docType class
#' @title FeedbackDTO
#' @description FeedbackDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор отзыва. integer [optional]
#' @field createdAt Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. character [optional]
#' @field text Комментарий автора отзыва. character [optional]
#' @field state  \link{FeedbackStateType} [optional]
#' @field author  \link{FeedbackAuthorDTO} [optional]
#' @field pro Достоинства магазина, описанные в отзыве. character [optional]
#' @field contra Недостатки магазина, описанные в отзыве. character [optional]
#' @field comments Переписка автора отзыва с магазином. list(\link{FeedbackCommentDTO})
#' @field shop  \link{FeedbackShopDTO} [optional]
#' @field resolved Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись. character [optional]
#' @field verified {\% note warning \"\" \%}  Этот параметр устарел. Не используйте его.  {\% endnote \%}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет. character [optional]
#' @field recommend Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет. character [optional]
#' @field grades  \link{FeedbackGradesDTO} [optional]
#' @field order  \link{FeedbackOrderDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FeedbackDTO <- R6::R6Class(
  "FeedbackDTO",
  public = list(
    `id` = NULL,
    `createdAt` = NULL,
    `text` = NULL,
    `state` = NULL,
    `author` = NULL,
    `pro` = NULL,
    `contra` = NULL,
    `comments` = NULL,
    `shop` = NULL,
    `resolved` = NULL,
    `verified` = NULL,
    `recommend` = NULL,
    `grades` = NULL,
    `order` = NULL,
    #' Initialize a new FeedbackDTO class.
    #'
    #' @description
    #' Initialize a new FeedbackDTO class.
    #'
    #' @param comments Переписка автора отзыва с магазином.
    #' @param id Идентификатор отзыва.
    #' @param createdAt Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.
    #' @param text Комментарий автора отзыва.
    #' @param state state
    #' @param author author
    #' @param pro Достоинства магазина, описанные в отзыве.
    #' @param contra Недостатки магазина, описанные в отзыве.
    #' @param shop shop
    #' @param resolved Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись.
    #' @param verified {\% note warning \"\" \%}  Этот параметр устарел. Не используйте его.  {\% endnote \%}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет.
    #' @param recommend Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет.
    #' @param grades grades
    #' @param order order
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`comments`, `id` = NULL, `createdAt` = NULL, `text` = NULL, `state` = NULL, `author` = NULL, `pro` = NULL, `contra` = NULL, `shop` = NULL, `resolved` = NULL, `verified` = NULL, `recommend` = NULL, `grades` = NULL, `order` = NULL, ...) {
      if (!missing(`comments`)) {
        stopifnot(is.vector(`comments`), length(`comments`) != 0)
        sapply(`comments`, function(x) stopifnot(R6::is.R6(x)))
        self$`comments` <- `comments`
      }
      if (!is.null(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`createdAt`)) {
        if (!is.character(`createdAt`)) {
          stop(paste("Error! Invalid data for `createdAt`. Must be a string:", `createdAt`))
        }
        self$`createdAt` <- `createdAt`
      }
      if (!is.null(`text`)) {
        if (!(is.character(`text`) && length(`text`) == 1)) {
          stop(paste("Error! Invalid data for `text`. Must be a string:", `text`))
        }
        self$`text` <- `text`
      }
      if (!is.null(`state`)) {
        if (!(`state` %in% c())) {
          stop(paste("Error! \"", `state`, "\" cannot be assigned to `state`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`state`))
        self$`state` <- `state`
      }
      if (!is.null(`author`)) {
        stopifnot(R6::is.R6(`author`))
        self$`author` <- `author`
      }
      if (!is.null(`pro`)) {
        if (!(is.character(`pro`) && length(`pro`) == 1)) {
          stop(paste("Error! Invalid data for `pro`. Must be a string:", `pro`))
        }
        self$`pro` <- `pro`
      }
      if (!is.null(`contra`)) {
        if (!(is.character(`contra`) && length(`contra`) == 1)) {
          stop(paste("Error! Invalid data for `contra`. Must be a string:", `contra`))
        }
        self$`contra` <- `contra`
      }
      if (!is.null(`shop`)) {
        stopifnot(R6::is.R6(`shop`))
        self$`shop` <- `shop`
      }
      if (!is.null(`resolved`)) {
        if (!(is.logical(`resolved`) && length(`resolved`) == 1)) {
          stop(paste("Error! Invalid data for `resolved`. Must be a boolean:", `resolved`))
        }
        self$`resolved` <- `resolved`
      }
      if (!is.null(`verified`)) {
        if (!(is.logical(`verified`) && length(`verified`) == 1)) {
          stop(paste("Error! Invalid data for `verified`. Must be a boolean:", `verified`))
        }
        self$`verified` <- `verified`
      }
      if (!is.null(`recommend`)) {
        if (!(is.logical(`recommend`) && length(`recommend`) == 1)) {
          stop(paste("Error! Invalid data for `recommend`. Must be a boolean:", `recommend`))
        }
        self$`recommend` <- `recommend`
      }
      if (!is.null(`grades`)) {
        stopifnot(R6::is.R6(`grades`))
        self$`grades` <- `grades`
      }
      if (!is.null(`order`)) {
        stopifnot(R6::is.R6(`order`))
        self$`order` <- `order`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedbackDTO in JSON format
    #' @export
    toJSON = function() {
      FeedbackDTOObject <- list()
      if (!is.null(self$`id`)) {
        FeedbackDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`createdAt`)) {
        FeedbackDTOObject[["createdAt"]] <-
          self$`createdAt`
      }
      if (!is.null(self$`text`)) {
        FeedbackDTOObject[["text"]] <-
          self$`text`
      }
      if (!is.null(self$`state`)) {
        FeedbackDTOObject[["state"]] <-
          self$`state`$toJSON()
      }
      if (!is.null(self$`author`)) {
        FeedbackDTOObject[["author"]] <-
          self$`author`$toJSON()
      }
      if (!is.null(self$`pro`)) {
        FeedbackDTOObject[["pro"]] <-
          self$`pro`
      }
      if (!is.null(self$`contra`)) {
        FeedbackDTOObject[["contra"]] <-
          self$`contra`
      }
      if (!is.null(self$`comments`)) {
        FeedbackDTOObject[["comments"]] <-
          lapply(self$`comments`, function(x) x$toJSON())
      }
      if (!is.null(self$`shop`)) {
        FeedbackDTOObject[["shop"]] <-
          self$`shop`$toJSON()
      }
      if (!is.null(self$`resolved`)) {
        FeedbackDTOObject[["resolved"]] <-
          self$`resolved`
      }
      if (!is.null(self$`verified`)) {
        FeedbackDTOObject[["verified"]] <-
          self$`verified`
      }
      if (!is.null(self$`recommend`)) {
        FeedbackDTOObject[["recommend"]] <-
          self$`recommend`
      }
      if (!is.null(self$`grades`)) {
        FeedbackDTOObject[["grades"]] <-
          self$`grades`$toJSON()
      }
      if (!is.null(self$`order`)) {
        FeedbackDTOObject[["order"]] <-
          self$`order`$toJSON()
      }
      FeedbackDTOObject
    },
    #' Deserialize JSON string into an instance of FeedbackDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedbackDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedbackDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`createdAt`)) {
        self$`createdAt` <- this_object$`createdAt`
      }
      if (!is.null(this_object$`text`)) {
        self$`text` <- this_object$`text`
      }
      if (!is.null(this_object$`state`)) {
        `state_object` <- FeedbackStateType$new()
        `state_object`$fromJSON(jsonlite::toJSON(this_object$`state`, auto_unbox = TRUE, digits = NA))
        self$`state` <- `state_object`
      }
      if (!is.null(this_object$`author`)) {
        `author_object` <- FeedbackAuthorDTO$new()
        `author_object`$fromJSON(jsonlite::toJSON(this_object$`author`, auto_unbox = TRUE, digits = NA))
        self$`author` <- `author_object`
      }
      if (!is.null(this_object$`pro`)) {
        self$`pro` <- this_object$`pro`
      }
      if (!is.null(this_object$`contra`)) {
        self$`contra` <- this_object$`contra`
      }
      if (!is.null(this_object$`comments`)) {
        self$`comments` <- ApiClient$new()$deserializeObj(this_object$`comments`, "array[FeedbackCommentDTO]", loadNamespace("ympa_r_client"))
      }
      if (!is.null(this_object$`shop`)) {
        `shop_object` <- FeedbackShopDTO$new()
        `shop_object`$fromJSON(jsonlite::toJSON(this_object$`shop`, auto_unbox = TRUE, digits = NA))
        self$`shop` <- `shop_object`
      }
      if (!is.null(this_object$`resolved`)) {
        self$`resolved` <- this_object$`resolved`
      }
      if (!is.null(this_object$`verified`)) {
        self$`verified` <- this_object$`verified`
      }
      if (!is.null(this_object$`recommend`)) {
        self$`recommend` <- this_object$`recommend`
      }
      if (!is.null(this_object$`grades`)) {
        `grades_object` <- FeedbackGradesDTO$new()
        `grades_object`$fromJSON(jsonlite::toJSON(this_object$`grades`, auto_unbox = TRUE, digits = NA))
        self$`grades` <- `grades_object`
      }
      if (!is.null(this_object$`order`)) {
        `order_object` <- FeedbackOrderDTO$new()
        `order_object`$fromJSON(jsonlite::toJSON(this_object$`order`, auto_unbox = TRUE, digits = NA))
        self$`order` <- `order_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedbackDTO in JSON format
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
        if (!is.null(self$`createdAt`)) {
          sprintf(
          '"createdAt":
            "%s"
                    ',
          self$`createdAt`
          )
        },
        if (!is.null(self$`text`)) {
          sprintf(
          '"text":
            "%s"
                    ',
          self$`text`
          )
        },
        if (!is.null(self$`state`)) {
          sprintf(
          '"state":
          %s
          ',
          jsonlite::toJSON(self$`state`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`author`)) {
          sprintf(
          '"author":
          %s
          ',
          jsonlite::toJSON(self$`author`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`pro`)) {
          sprintf(
          '"pro":
            "%s"
                    ',
          self$`pro`
          )
        },
        if (!is.null(self$`contra`)) {
          sprintf(
          '"contra":
            "%s"
                    ',
          self$`contra`
          )
        },
        if (!is.null(self$`comments`)) {
          sprintf(
          '"comments":
          [%s]
',
          paste(sapply(self$`comments`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`shop`)) {
          sprintf(
          '"shop":
          %s
          ',
          jsonlite::toJSON(self$`shop`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`resolved`)) {
          sprintf(
          '"resolved":
            %s
                    ',
          tolower(self$`resolved`)
          )
        },
        if (!is.null(self$`verified`)) {
          sprintf(
          '"verified":
            %s
                    ',
          tolower(self$`verified`)
          )
        },
        if (!is.null(self$`recommend`)) {
          sprintf(
          '"recommend":
            %s
                    ',
          tolower(self$`recommend`)
          )
        },
        if (!is.null(self$`grades`)) {
          sprintf(
          '"grades":
          %s
          ',
          jsonlite::toJSON(self$`grades`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`order`)) {
          sprintf(
          '"order":
          %s
          ',
          jsonlite::toJSON(self$`order`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of FeedbackDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedbackDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedbackDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`createdAt` <- this_object$`createdAt`
      self$`text` <- this_object$`text`
      self$`state` <- FeedbackStateType$new()$fromJSON(jsonlite::toJSON(this_object$`state`, auto_unbox = TRUE, digits = NA))
      self$`author` <- FeedbackAuthorDTO$new()$fromJSON(jsonlite::toJSON(this_object$`author`, auto_unbox = TRUE, digits = NA))
      self$`pro` <- this_object$`pro`
      self$`contra` <- this_object$`contra`
      self$`comments` <- ApiClient$new()$deserializeObj(this_object$`comments`, "array[FeedbackCommentDTO]", loadNamespace("ympa_r_client"))
      self$`shop` <- FeedbackShopDTO$new()$fromJSON(jsonlite::toJSON(this_object$`shop`, auto_unbox = TRUE, digits = NA))
      self$`resolved` <- this_object$`resolved`
      self$`verified` <- this_object$`verified`
      self$`recommend` <- this_object$`recommend`
      self$`grades` <- FeedbackGradesDTO$new()$fromJSON(jsonlite::toJSON(this_object$`grades`, auto_unbox = TRUE, digits = NA))
      self$`order` <- FeedbackOrderDTO$new()$fromJSON(jsonlite::toJSON(this_object$`order`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to FeedbackDTO
    #'
    #' @description
    #' Validate JSON input with respect to FeedbackDTO and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `comments`
      if (!is.null(input_json$`comments`)) {
        stopifnot(is.vector(input_json$`comments`), length(input_json$`comments`) != 0)
        tmp <- sapply(input_json$`comments`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FeedbackDTO: the required field `comments` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of FeedbackDTO
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
      # check if the required `comments` is null
      if (is.null(self$`comments`)) {
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
      # check if the required `comments` is null
      if (is.null(self$`comments`)) {
        invalid_fields["comments"] <- "Non-nullable required field `comments` cannot be null."
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
# FeedbackDTO$unlock()
#
## Below is an example to define the print function
# FeedbackDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FeedbackDTO$lock()

