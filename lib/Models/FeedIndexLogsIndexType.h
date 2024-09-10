
/*
 * FeedIndexLogsIndexType.h
 *
 * Тип обновления.  Возможные значения:  * &#x60;DIFF&#x60; — частичное обновление данных на Яндекс Маркете (например, обновление цен ранее опубликованных предложений и публикация новых). * &#x60;FAST_PRICE&#x60; — только обновление цен ранее опубликованных предложений. * &#x60;FULL&#x60; — полное обновление данных на Яндекс Маркете. 
 */

#ifndef TINY_CPP_CLIENT_FeedIndexLogsIndexType_H_
#define TINY_CPP_CLIENT_FeedIndexLogsIndexType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Тип обновления.  Возможные значения:  * `DIFF` — частичное обновление данных на Яндекс Маркете (например, обновление цен ранее опубликованных предложений и публикация новых). * `FAST_PRICE` — только обновление цен ранее опубликованных предложений. * `FULL` — полное обновление данных на Яндекс Маркете. 
 *
 *  \ingroup Models
 *
 */

class FeedIndexLogsIndexType{
public:

    /*! \brief Constructor.
	 */
    FeedIndexLogsIndexType();
    FeedIndexLogsIndexType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FeedIndexLogsIndexType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_FeedIndexLogsIndexType_H_ */
