#' Create a new ChannelType
#'
#' @description
#' Каналы продвижения товаров:  * `PUSH` — пуш-уведомление из приложения Яндекс Маркет.  * `STRETCH_MAIN` — верхний баннер-растяжка на главной странице Яндекс Маркета.  * `MAIN_PAGE_CAROUSEL` — карусель акций на главной странице Яндекс Маркета.  * `PRODUCT_RETAIL_PAGE` — товар на странице ритейл-повода.  * `MAIN_PAGE_CAROUSEL_WEB` — карусель акций на главной странице веб версии Яндекс Маркета.  * `PRODUCT_SEPARATE_LANDING` — товар на лендинге акции.  * `SUPER_SHELF_CATEGORY` — полка в категориях.  * `CAROUSEL_RETAIL_PAGE` — карусель на лендинге ритейл-повода.  * `POPUP_APPLICATION` — всплывающее окно в приложении Яндекс Маркет.  * `POST_TELEGRAM` — пост в Телеграм-канале Яндекс Маркета.  * `CPA` — реклама в партнерской сети Яндекс Маркета.  * `WEB_PERFORMANCE_DIRECT` — реклама в Яндекс Директе.  * `APP_PERFORMANCE` — реклама в AppStore и Google Play.  * `BANNER_PICKUP_POINT` — баннер в ПВЗ Маркета.  * `BLOGGER_PERFORMANCE` — рекламная интеграция у блогеров.  * `DIGITAL_CHANNEL_BANNER` — баннер в digital-каналах и социальных сетях VK, Одноклассники.  * `YANDEX_ECOSYSTEM_CHANNELS` — реклама в других сервисах Яндекса: GO, Delivery, Еда.  * `PARTNERS_MAIN_BANNER` — баннер на главной странице mail.ru, auto.ru, ya.ru.  * `OTHER` — прочее. 
#'
#' @docType class
#' @title ChannelType
#' @description ChannelType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ChannelType <- R6::R6Class(
  "ChannelType",
  public = list(
    #' Initialize a new ChannelType class.
    #'
    #' @description
    #' Initialize a new ChannelType class.
    #'
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(...) {
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ChannelType in JSON format
    #' @export
    toJSON = function() {
      ChannelTypeObject <- list()
      ChannelTypeObject
    },
    #' Deserialize JSON string into an instance of ChannelType
    #'
    #' @description
    #' Deserialize JSON string into an instance of ChannelType
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChannelType
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ChannelType in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ChannelType
    #'
    #' @description
    #' Deserialize JSON string into an instance of ChannelType
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChannelType
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self
    },
    #' Validate JSON input with respect to ChannelType
    #'
    #' @description
    #' Validate JSON input with respect to ChannelType and throw an exception if invalid
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
    #' @return String representation of ChannelType
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
# ChannelType$unlock()
#
## Below is an example to define the print function
# ChannelType$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ChannelType$lock()

