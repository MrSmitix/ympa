
/*
 * ShipmentPalletLabelPageFormatType.h
 *
 * Формат страницы: * &#x60;A4&#x60; — формат страницы A4. * &#x60;A8&#x60; — формат страницы A8. 
 */

#ifndef TINY_CPP_CLIENT_ShipmentPalletLabelPageFormatType_H_
#define TINY_CPP_CLIENT_ShipmentPalletLabelPageFormatType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Формат страницы: * `A4` — формат страницы A4. * `A8` — формат страницы A8. 
 *
 *  \ingroup Models
 *
 */

class ShipmentPalletLabelPageFormatType{
public:

    /*! \brief Constructor.
	 */
    ShipmentPalletLabelPageFormatType();
    ShipmentPalletLabelPageFormatType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ShipmentPalletLabelPageFormatType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ShipmentPalletLabelPageFormatType_H_ */
