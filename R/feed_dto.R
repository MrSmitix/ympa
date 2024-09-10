#' Create a new FeedDTO
#'
#' @description
#' Информация о прайс-листе.
#'
#' @docType class
#' @title FeedDTO
#' @description FeedDTO Class
#' @format An \code{R6Class} generator object
#' @field id Идентификатор прайс-листа. integer [optional]
#' @field login Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. character [optional]
#' @field name Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета. character [optional]
#' @field password Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. character [optional]
#' @field uploadDate Дата загрузки прайс-листа на Маркет.  Формат даты: `ДД-ММ-ГГГГ`.  Параметр выводится при размещении прайс-листа на сервере Маркета. character [optional]
#' @field url URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина. character [optional]
#' @field content  \link{FeedContentDTO} [optional]
#' @field download  \link{FeedDownloadDTO} [optional]
#' @field placement  \link{FeedPlacementDTO} [optional]
#' @field publication  \link{FeedPublicationDTO} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FeedDTO <- R6::R6Class(
  "FeedDTO",
  public = list(
    `id` = NULL,
    `login` = NULL,
    `name` = NULL,
    `password` = NULL,
    `uploadDate` = NULL,
    `url` = NULL,
    `content` = NULL,
    `download` = NULL,
    `placement` = NULL,
    `publication` = NULL,
    #' Initialize a new FeedDTO class.
    #'
    #' @description
    #' Initialize a new FeedDTO class.
    #'
    #' @param id Идентификатор прайс-листа.
    #' @param login Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.
    #' @param name Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета.
    #' @param password Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.
    #' @param uploadDate Дата загрузки прайс-листа на Маркет.  Формат даты: `ДД-ММ-ГГГГ`.  Параметр выводится при размещении прайс-листа на сервере Маркета.
    #' @param url URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина.
    #' @param content content
    #' @param download download
    #' @param placement placement
    #' @param publication publication
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id` = NULL, `login` = NULL, `name` = NULL, `password` = NULL, `uploadDate` = NULL, `url` = NULL, `content` = NULL, `download` = NULL, `placement` = NULL, `publication` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`login`)) {
        if (!(is.character(`login`) && length(`login`) == 1)) {
          stop(paste("Error! Invalid data for `login`. Must be a string:", `login`))
        }
        self$`login` <- `login`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`password`)) {
        if (!(is.character(`password`) && length(`password`) == 1)) {
          stop(paste("Error! Invalid data for `password`. Must be a string:", `password`))
        }
        self$`password` <- `password`
      }
      if (!is.null(`uploadDate`)) {
        if (!is.character(`uploadDate`)) {
          stop(paste("Error! Invalid data for `uploadDate`. Must be a string:", `uploadDate`))
        }
        self$`uploadDate` <- `uploadDate`
      }
      if (!is.null(`url`)) {
        if (!(is.character(`url`) && length(`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", `url`))
        }
        self$`url` <- `url`
      }
      if (!is.null(`content`)) {
        stopifnot(R6::is.R6(`content`))
        self$`content` <- `content`
      }
      if (!is.null(`download`)) {
        stopifnot(R6::is.R6(`download`))
        self$`download` <- `download`
      }
      if (!is.null(`placement`)) {
        stopifnot(R6::is.R6(`placement`))
        self$`placement` <- `placement`
      }
      if (!is.null(`publication`)) {
        stopifnot(R6::is.R6(`publication`))
        self$`publication` <- `publication`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedDTO in JSON format
    #' @export
    toJSON = function() {
      FeedDTOObject <- list()
      if (!is.null(self$`id`)) {
        FeedDTOObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`login`)) {
        FeedDTOObject[["login"]] <-
          self$`login`
      }
      if (!is.null(self$`name`)) {
        FeedDTOObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`password`)) {
        FeedDTOObject[["password"]] <-
          self$`password`
      }
      if (!is.null(self$`uploadDate`)) {
        FeedDTOObject[["uploadDate"]] <-
          self$`uploadDate`
      }
      if (!is.null(self$`url`)) {
        FeedDTOObject[["url"]] <-
          self$`url`
      }
      if (!is.null(self$`content`)) {
        FeedDTOObject[["content"]] <-
          self$`content`$toJSON()
      }
      if (!is.null(self$`download`)) {
        FeedDTOObject[["download"]] <-
          self$`download`$toJSON()
      }
      if (!is.null(self$`placement`)) {
        FeedDTOObject[["placement"]] <-
          self$`placement`$toJSON()
      }
      if (!is.null(self$`publication`)) {
        FeedDTOObject[["publication"]] <-
          self$`publication`$toJSON()
      }
      FeedDTOObject
    },
    #' Deserialize JSON string into an instance of FeedDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedDTO
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`login`)) {
        self$`login` <- this_object$`login`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`password`)) {
        self$`password` <- this_object$`password`
      }
      if (!is.null(this_object$`uploadDate`)) {
        self$`uploadDate` <- this_object$`uploadDate`
      }
      if (!is.null(this_object$`url`)) {
        self$`url` <- this_object$`url`
      }
      if (!is.null(this_object$`content`)) {
        `content_object` <- FeedContentDTO$new()
        `content_object`$fromJSON(jsonlite::toJSON(this_object$`content`, auto_unbox = TRUE, digits = NA))
        self$`content` <- `content_object`
      }
      if (!is.null(this_object$`download`)) {
        `download_object` <- FeedDownloadDTO$new()
        `download_object`$fromJSON(jsonlite::toJSON(this_object$`download`, auto_unbox = TRUE, digits = NA))
        self$`download` <- `download_object`
      }
      if (!is.null(this_object$`placement`)) {
        `placement_object` <- FeedPlacementDTO$new()
        `placement_object`$fromJSON(jsonlite::toJSON(this_object$`placement`, auto_unbox = TRUE, digits = NA))
        self$`placement` <- `placement_object`
      }
      if (!is.null(this_object$`publication`)) {
        `publication_object` <- FeedPublicationDTO$new()
        `publication_object`$fromJSON(jsonlite::toJSON(this_object$`publication`, auto_unbox = TRUE, digits = NA))
        self$`publication` <- `publication_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FeedDTO in JSON format
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
        if (!is.null(self$`login`)) {
          sprintf(
          '"login":
            "%s"
                    ',
          self$`login`
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
        if (!is.null(self$`password`)) {
          sprintf(
          '"password":
            "%s"
                    ',
          self$`password`
          )
        },
        if (!is.null(self$`uploadDate`)) {
          sprintf(
          '"uploadDate":
            "%s"
                    ',
          self$`uploadDate`
          )
        },
        if (!is.null(self$`url`)) {
          sprintf(
          '"url":
            "%s"
                    ',
          self$`url`
          )
        },
        if (!is.null(self$`content`)) {
          sprintf(
          '"content":
          %s
          ',
          jsonlite::toJSON(self$`content`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`download`)) {
          sprintf(
          '"download":
          %s
          ',
          jsonlite::toJSON(self$`download`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`placement`)) {
          sprintf(
          '"placement":
          %s
          ',
          jsonlite::toJSON(self$`placement`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`publication`)) {
          sprintf(
          '"publication":
          %s
          ',
          jsonlite::toJSON(self$`publication`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of FeedDTO
    #'
    #' @description
    #' Deserialize JSON string into an instance of FeedDTO
    #'
    #' @param input_json the JSON input
    #' @return the instance of FeedDTO
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`login` <- this_object$`login`
      self$`name` <- this_object$`name`
      self$`password` <- this_object$`password`
      self$`uploadDate` <- this_object$`uploadDate`
      self$`url` <- this_object$`url`
      self$`content` <- FeedContentDTO$new()$fromJSON(jsonlite::toJSON(this_object$`content`, auto_unbox = TRUE, digits = NA))
      self$`download` <- FeedDownloadDTO$new()$fromJSON(jsonlite::toJSON(this_object$`download`, auto_unbox = TRUE, digits = NA))
      self$`placement` <- FeedPlacementDTO$new()$fromJSON(jsonlite::toJSON(this_object$`placement`, auto_unbox = TRUE, digits = NA))
      self$`publication` <- FeedPublicationDTO$new()$fromJSON(jsonlite::toJSON(this_object$`publication`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to FeedDTO
    #'
    #' @description
    #' Validate JSON input with respect to FeedDTO and throw an exception if invalid
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
    #' @return String representation of FeedDTO
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
# FeedDTO$unlock()
#
## Below is an example to define the print function
# FeedDTO$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FeedDTO$lock()

