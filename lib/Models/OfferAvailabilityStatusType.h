
/*
 * OfferAvailabilityStatusType.h
 *
 * Планы по поставкам:  * &#x60;ACTIVE&#x60; — поставки будут. * &#x60;INACTIVE&#x60; — поставок не будет: товар есть на складе, но вы больше не планируете его поставлять. Через 60 дней после того, как товар закончится на складе, этот статус изменится на &#x60;DELISTED&#x60;. * &#x60;DELISTED&#x60; — архив: товар закончился на складе, и его поставок больше не будет. Если товар вернется на склад (например, покупатель вернет заказ), этот статус изменится на &#x60;INACTIVE&#x60;. 
 */

#ifndef TINY_CPP_CLIENT_OfferAvailabilityStatusType_H_
#define TINY_CPP_CLIENT_OfferAvailabilityStatusType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Планы по поставкам:  * `ACTIVE` — поставки будут. * `INACTIVE` — поставок не будет: товар есть на складе, но вы больше не планируете его поставлять. Через 60 дней после того, как товар закончится на складе, этот статус изменится на `DELISTED`. * `DELISTED` — архив: товар закончился на складе, и его поставок больше не будет. Если товар вернется на склад (например, покупатель вернет заказ), этот статус изменится на `INACTIVE`. 
 *
 *  \ingroup Models
 *
 */

class OfferAvailabilityStatusType{
public:

    /*! \brief Constructor.
	 */
    OfferAvailabilityStatusType();
    OfferAvailabilityStatusType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OfferAvailabilityStatusType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OfferAvailabilityStatusType_H_ */
