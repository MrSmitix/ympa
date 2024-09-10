
/*
 * EacVerificationStatusType.h
 *
 * Статус проверки кода подтверждения:  * &#x60;ACCEPTED&#x60; — код верный. * &#x60;REJECTED&#x60; — код неверный. * &#x60;NEED_UPDATE&#x60; — Маркет отправит новый код. Значение возвращается, если превышено количество попыток отправки кода. 
 */

#ifndef TINY_CPP_CLIENT_EacVerificationStatusType_H_
#define TINY_CPP_CLIENT_EacVerificationStatusType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Статус проверки кода подтверждения:  * `ACCEPTED` — код верный. * `REJECTED` — код неверный. * `NEED_UPDATE` — Маркет отправит новый код. Значение возвращается, если превышено количество попыток отправки кода. 
 *
 *  \ingroup Models
 *
 */

class EacVerificationStatusType{
public:

    /*! \brief Constructor.
	 */
    EacVerificationStatusType();
    EacVerificationStatusType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~EacVerificationStatusType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_EacVerificationStatusType_H_ */
