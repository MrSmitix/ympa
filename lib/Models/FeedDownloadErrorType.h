
/*
 * FeedDownloadErrorType.h
 *
 * Тип ошибки загрузки прайс-листа.  Возможные значения:  * &#x60;DOWNLOAD_ERROR&#x60; — ошибка загрузки прайс-листа. Например, проблема с DNS-сервером или обрыв интернет-соединения.   Проблема описана в параметре &#x60;description&#x60;.  * &#x60;DOWNLOAD_HTTP_ERROR&#x60; — Яндекс Маркет передал запрос на получение прайс-листа и получил в ответ HTTP-код, отличный от 2xx.  HTTP-код выведен в параметре &#x60;httpStatusCode&#x60;. 
 */

#ifndef TINY_CPP_CLIENT_FeedDownloadErrorType_H_
#define TINY_CPP_CLIENT_FeedDownloadErrorType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Тип ошибки загрузки прайс-листа.  Возможные значения:  * `DOWNLOAD_ERROR` — ошибка загрузки прайс-листа. Например, проблема с DNS-сервером или обрыв интернет-соединения.   Проблема описана в параметре `description`.  * `DOWNLOAD_HTTP_ERROR` — Яндекс Маркет передал запрос на получение прайс-листа и получил в ответ HTTP-код, отличный от 2xx.  HTTP-код выведен в параметре `httpStatusCode`. 
 *
 *  \ingroup Models
 *
 */

class FeedDownloadErrorType{
public:

    /*! \brief Constructor.
	 */
    FeedDownloadErrorType();
    FeedDownloadErrorType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FeedDownloadErrorType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_FeedDownloadErrorType_H_ */
