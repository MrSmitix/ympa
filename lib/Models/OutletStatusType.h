
/*
 * OutletStatusType.h
 *
 * Статус точки продаж.  Возможные значения:  * &#x60;AT_MODERATION&#x60; — проверяется. * &#x60;FAILED&#x60; — не прошла проверку и отклонена модератором. * &#x60;MODERATED&#x60; — проверена и одобрена. * &#x60;NONMODERATED&#x60; — новая точка, нуждается в проверке. 
 */

#ifndef TINY_CPP_CLIENT_OutletStatusType_H_
#define TINY_CPP_CLIENT_OutletStatusType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Статус точки продаж.  Возможные значения:  * `AT_MODERATION` — проверяется. * `FAILED` — не прошла проверку и отклонена модератором. * `MODERATED` — проверена и одобрена. * `NONMODERATED` — новая точка, нуждается в проверке. 
 *
 *  \ingroup Models
 *
 */

class OutletStatusType{
public:

    /*! \brief Constructor.
	 */
    OutletStatusType();
    OutletStatusType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OutletStatusType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OutletStatusType_H_ */
