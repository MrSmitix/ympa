
/*
 * FeedIndexLogsStatusType.h
 *
 * Статус индексации прайс-листа и проверки на соответствие техническим требованиям.  Возможные значения:  * &#x60;ERROR&#x60; — произошли ошибки. * &#x60;OK&#x60; — обработан без ошибок. * &#x60;WARNING&#x60; — наблюдались некритичные проблемы. 
 */

#ifndef TINY_CPP_CLIENT_FeedIndexLogsStatusType_H_
#define TINY_CPP_CLIENT_FeedIndexLogsStatusType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Статус индексации прайс-листа и проверки на соответствие техническим требованиям.  Возможные значения:  * `ERROR` — произошли ошибки. * `OK` — обработан без ошибок. * `WARNING` — наблюдались некритичные проблемы. 
 *
 *  \ingroup Models
 *
 */

class FeedIndexLogsStatusType{
public:

    /*! \brief Constructor.
	 */
    FeedIndexLogsStatusType();
    FeedIndexLogsStatusType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FeedIndexLogsStatusType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_FeedIndexLogsStatusType_H_ */
