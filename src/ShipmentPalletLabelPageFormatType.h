/*
 * ShipmentPalletLabelPageFormatType.h
 *
 * Формат страницы: * &#x60;A4&#x60; — формат страницы A4. * &#x60;A8&#x60; — формат страницы A8. 
 */

#ifndef _ShipmentPalletLabelPageFormatType_H_
#define _ShipmentPalletLabelPageFormatType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Формат страницы: * `A4` — формат страницы A4. * `A8` — формат страницы A8. 
 *
 *  \ingroup Models
 *
 */

class ShipmentPalletLabelPageFormatType : public Object {
public:
	/*! \brief Constructor.
	 */
	ShipmentPalletLabelPageFormatType();
	ShipmentPalletLabelPageFormatType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ShipmentPalletLabelPageFormatType();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _ShipmentPalletLabelPageFormatType_H_ */
