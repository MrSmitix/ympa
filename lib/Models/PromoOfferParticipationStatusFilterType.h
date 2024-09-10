
/*
 * PromoOfferParticipationStatusFilterType.h
 *
 * Фильтр для товаров, которые добавлены в акцию вручную:  * &#x60;MANUALLY_ADDED&#x60; — товары, которые добавлены вручную.  * &#x60;NOT_MANUALLY_ADDED&#x60;— товары, которые не участвуют в акции и те, которые добавлены автоматически.  Если не передать параметр &#x60;statusType&#x60;, вернутся все товары.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
 */

#ifndef TINY_CPP_CLIENT_PromoOfferParticipationStatusFilterType_H_
#define TINY_CPP_CLIENT_PromoOfferParticipationStatusFilterType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Фильтр для товаров, которые добавлены в акцию вручную:  * `MANUALLY_ADDED` — товары, которые добавлены вручную.  * `NOT_MANUALLY_ADDED`— товары, которые не участвуют в акции и те, которые добавлены автоматически.  Если не передать параметр `statusType`, вернутся все товары.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
 *
 *  \ingroup Models
 *
 */

class PromoOfferParticipationStatusFilterType{
public:

    /*! \brief Constructor.
	 */
    PromoOfferParticipationStatusFilterType();
    PromoOfferParticipationStatusFilterType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PromoOfferParticipationStatusFilterType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_PromoOfferParticipationStatusFilterType_H_ */
