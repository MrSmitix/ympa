
/*
 * PromoOfferParticipationStatusType.h
 *
 * Статус товара в акции:  * &#x60;AUTO&#x60; — добавлен автоматически во всех магазинах кабинета, в которых товар доступен для покупки.  * &#x60;PARTIALLY_AUTO&#x60; — добавлен автоматически у части магазинов.  * &#x60;MANUAL&#x60; — добавлен вручную.  * &#x60;NOT_PARTICIPATING&#x60; — не участвует в акции.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
 */

#ifndef TINY_CPP_CLIENT_PromoOfferParticipationStatusType_H_
#define TINY_CPP_CLIENT_PromoOfferParticipationStatusType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Статус товара в акции:  * `AUTO` — добавлен автоматически во всех магазинах кабинета, в которых товар доступен для покупки.  * `PARTIALLY_AUTO` — добавлен автоматически у части магазинов.  * `MANUAL` — добавлен вручную.  * `NOT_PARTICIPATING` — не участвует в акции.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
 *
 *  \ingroup Models
 *
 */

class PromoOfferParticipationStatusType{
public:

    /*! \brief Constructor.
	 */
    PromoOfferParticipationStatusType();
    PromoOfferParticipationStatusType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PromoOfferParticipationStatusType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_PromoOfferParticipationStatusType_H_ */
