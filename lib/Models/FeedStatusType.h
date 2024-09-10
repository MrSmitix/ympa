
/*
 * FeedStatusType.h
 *
 * Статус прайс-листа.  Возможные значения:    * &#x60;ERROR&#x60; — найдены ошибки.   * &#x60;NA&#x60; — прайс-лист не загружался более семи дней или на этапе загрузки произошла ошибка.   * &#x60;OK&#x60; — ошибок не найдено. 
 */

#ifndef TINY_CPP_CLIENT_FeedStatusType_H_
#define TINY_CPP_CLIENT_FeedStatusType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Статус прайс-листа.  Возможные значения:    * `ERROR` — найдены ошибки.   * `NA` — прайс-лист не загружался более семи дней или на этапе загрузки произошла ошибка.   * `OK` — ошибок не найдено. 
 *
 *  \ingroup Models
 *
 */

class FeedStatusType{
public:

    /*! \brief Constructor.
	 */
    FeedStatusType();
    FeedStatusType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FeedStatusType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_FeedStatusType_H_ */
