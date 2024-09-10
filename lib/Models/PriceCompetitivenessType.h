
/*
 * PriceCompetitivenessType.h
 *
 * Привлекательность цены:  * &#x60;OPTIMAL&#x60; — привлекательная. * &#x60;AVERAGE&#x60; — умеренная. * &#x60;LOW&#x60; — непривлекательная. 
 */

#ifndef TINY_CPP_CLIENT_PriceCompetitivenessType_H_
#define TINY_CPP_CLIENT_PriceCompetitivenessType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Привлекательность цены:  * `OPTIMAL` — привлекательная. * `AVERAGE` — умеренная. * `LOW` — непривлекательная. 
 *
 *  \ingroup Models
 *
 */

class PriceCompetitivenessType{
public:

    /*! \brief Constructor.
	 */
    PriceCompetitivenessType();
    PriceCompetitivenessType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PriceCompetitivenessType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_PriceCompetitivenessType_H_ */
