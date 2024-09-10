/*
 * CalculateTariffsResponseDTO.h
 *
 * Расчет стоимости услуг.
 */

#ifndef _CalculateTariffsResponseDTO_H_
#define _CalculateTariffsResponseDTO_H_


#include <string>
#include "CalculateTariffsOfferInfoDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Расчет стоимости услуг.
 *
 *  \ingroup Models
 *
 */

class CalculateTariffsResponseDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	CalculateTariffsResponseDTO();
	CalculateTariffsResponseDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CalculateTariffsResponseDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Стоимость услуг.
	 */
	std::list<CalculateTariffsOfferInfoDTO> getOffers();

	/*! \brief Set Стоимость услуг.
	 */
	void setOffers(std::list <CalculateTariffsOfferInfoDTO> offers);

private:
	std::list <CalculateTariffsOfferInfoDTO>offers;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CalculateTariffsResponseDTO_H_ */
