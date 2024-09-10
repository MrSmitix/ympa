
/*
 * OfferCampaignStatusType.h
 *
 * Статус товара:  * &#x60;PUBLISHED&#x60; — Готов к продаже. * &#x60;CHECKING&#x60; — На проверке. * &#x60;DISABLED_BY_PARTNER&#x60; — Скрыт вами. * &#x60;REJECTED_BY_MARKET&#x60; — Отклонен. * &#x60;DISABLED_AUTOMATICALLY&#x60; — Исправьте ошибки. * &#x60;CREATING_CARD&#x60; — Создается карточка. * &#x60;NO_CARD&#x60; — Нужна карточка. * &#x60;NO_STOCKS&#x60; — Нет на складе. * &#x60;ARCHIVED&#x60; — В архиве.  [Что обозначает каждый из статусов](https://yandex.ru/support/marketplace/assortment/add/statuses.html) 
 */

#ifndef TINY_CPP_CLIENT_OfferCampaignStatusType_H_
#define TINY_CPP_CLIENT_OfferCampaignStatusType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Статус товара:  * `PUBLISHED` — Готов к продаже. * `CHECKING` — На проверке. * `DISABLED_BY_PARTNER` — Скрыт вами. * `REJECTED_BY_MARKET` — Отклонен. * `DISABLED_AUTOMATICALLY` — Исправьте ошибки. * `CREATING_CARD` — Создается карточка. * `NO_CARD` — Нужна карточка. * `NO_STOCKS` — Нет на складе. * `ARCHIVED` — В архиве.  [Что обозначает каждый из статусов](https://yandex.ru/support/marketplace/assortment/add/statuses.html) 
 *
 *  \ingroup Models
 *
 */

class OfferCampaignStatusType{
public:

    /*! \brief Constructor.
	 */
    OfferCampaignStatusType();
    OfferCampaignStatusType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OfferCampaignStatusType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OfferCampaignStatusType_H_ */
