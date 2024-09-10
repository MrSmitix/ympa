/*
 * CalculateTariffsRequest.h
 *
 * 
 */

#ifndef _CalculateTariffsRequest_H_
#define _CalculateTariffsRequest_H_


#include <string>
#include "CalculateTariffsOfferDTO.h"
#include "CalculateTariffsParametersDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CalculateTariffsRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CalculateTariffsRequest();
	CalculateTariffsRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CalculateTariffsRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CalculateTariffsParametersDTO getParameters();

	/*! \brief Set 
	 */
	void setParameters(CalculateTariffsParametersDTO  parameters);
	/*! \brief Get Товары, для которых нужно рассчитать стоимость услуг.
	 */
	std::list<CalculateTariffsOfferDTO> getOffers();

	/*! \brief Set Товары, для которых нужно рассчитать стоимость услуг.
	 */
	void setOffers(std::list <CalculateTariffsOfferDTO> offers);

private:
	CalculateTariffsParametersDTO parameters;
	std::list <CalculateTariffsOfferDTO>offers;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CalculateTariffsRequest_H_ */
