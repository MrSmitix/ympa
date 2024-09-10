
/*
 * PromoParticipationType.h
 *
 * Какие акции вернутся:  * &#x60;PARTICIPATING_NOW&#x60; — текущие и будущие акции продавца.  * &#x60;PARTICIPATED&#x60; — завершенные акции продавца за последний год. Если за год их было меньше 15, в ответе придут 15 последних акций за все время. 
 */

#ifndef TINY_CPP_CLIENT_PromoParticipationType_H_
#define TINY_CPP_CLIENT_PromoParticipationType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Какие акции вернутся:  * `PARTICIPATING_NOW` — текущие и будущие акции продавца.  * `PARTICIPATED` — завершенные акции продавца за последний год. Если за год их было меньше 15, в ответе придут 15 последних акций за все время. 
 *
 *  \ingroup Models
 *
 */

class PromoParticipationType{
public:

    /*! \brief Constructor.
	 */
    PromoParticipationType();
    PromoParticipationType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PromoParticipationType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_PromoParticipationType_H_ */
