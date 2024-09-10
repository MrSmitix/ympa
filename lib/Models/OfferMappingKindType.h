
/*
 * OfferMappingKindType.h
 *
 * Вид маппинга.
 */

#ifndef TINY_CPP_CLIENT_OfferMappingKindType_H_
#define TINY_CPP_CLIENT_OfferMappingKindType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Вид маппинга.
 *
 *  \ingroup Models
 *
 */

class OfferMappingKindType{
public:

    /*! \brief Constructor.
	 */
    OfferMappingKindType();
    OfferMappingKindType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OfferMappingKindType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OfferMappingKindType_H_ */
