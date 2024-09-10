
/*
 * AffectedOrderQualityRatingComponentType.h
 *
 * Составляющие индекса качества.  **Для модели DBS:** * &#x60;DBS_CANCELLATION_RATE&#x60; — доля отмененных товаров. * &#x60;DBS_LATE_DELIVERY_RATE&#x60; — доля заказов, доставленных после плановой даты.  **Для моделей FBS и Экспресс:** * &#x60;FBS_CANCELLATION_RATE&#x60; — доля отмененных товаров. * &#x60;FBS_LATE_SHIP_RATE&#x60; — доля не вовремя отгруженных заказов. 
 */

#ifndef TINY_CPP_CLIENT_AffectedOrderQualityRatingComponentType_H_
#define TINY_CPP_CLIENT_AffectedOrderQualityRatingComponentType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Составляющие индекса качества.  **Для модели DBS:** * `DBS_CANCELLATION_RATE` — доля отмененных товаров. * `DBS_LATE_DELIVERY_RATE` — доля заказов, доставленных после плановой даты.  **Для моделей FBS и Экспресс:** * `FBS_CANCELLATION_RATE` — доля отмененных товаров. * `FBS_LATE_SHIP_RATE` — доля не вовремя отгруженных заказов. 
 *
 *  \ingroup Models
 *
 */

class AffectedOrderQualityRatingComponentType{
public:

    /*! \brief Constructor.
	 */
    AffectedOrderQualityRatingComponentType();
    AffectedOrderQualityRatingComponentType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AffectedOrderQualityRatingComponentType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AffectedOrderQualityRatingComponentType_H_ */
