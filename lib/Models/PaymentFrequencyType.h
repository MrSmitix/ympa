
/*
 * PaymentFrequencyType.h
 *
 * Частота выплат:  * &#x60;DAILY&#x60; — ежедневно. * &#x60;WEEKLY&#x60; — раз в неделю. * &#x60;BIWEEKLY&#x60; — раз в две недели. * &#x60;MONTHLY&#x60; — раз в месяц.  Подробнее о графике выплат читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/acquiring.html). 
 */

#ifndef TINY_CPP_CLIENT_PaymentFrequencyType_H_
#define TINY_CPP_CLIENT_PaymentFrequencyType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Частота выплат:  * `DAILY` — ежедневно. * `WEEKLY` — раз в неделю. * `BIWEEKLY` — раз в две недели. * `MONTHLY` — раз в месяц.  Подробнее о графике выплат читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/acquiring.html). 
 *
 *  \ingroup Models
 *
 */

class PaymentFrequencyType{
public:

    /*! \brief Constructor.
	 */
    PaymentFrequencyType();
    PaymentFrequencyType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PaymentFrequencyType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_PaymentFrequencyType_H_ */
