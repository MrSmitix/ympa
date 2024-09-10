/*
 * PriceCompetitivenessThresholdsDTO.h
 *
 * Максимальные значения цены, при которых она является привлекательной или умеренной.
 */

#ifndef _PriceCompetitivenessThresholdsDTO_H_
#define _PriceCompetitivenessThresholdsDTO_H_


#include <string>
#include "BasePriceDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Максимальные значения цены, при которых она является привлекательной или умеренной.
 *
 *  \ingroup Models
 *
 */

class PriceCompetitivenessThresholdsDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	PriceCompetitivenessThresholdsDTO();
	PriceCompetitivenessThresholdsDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PriceCompetitivenessThresholdsDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	BasePriceDTO getOptimalPrice();

	/*! \brief Set 
	 */
	void setOptimalPrice(BasePriceDTO  optimalPrice);
	/*! \brief Get 
	 */
	BasePriceDTO getAveragePrice();

	/*! \brief Set 
	 */
	void setAveragePrice(BasePriceDTO  averagePrice);

private:
	BasePriceDTO optimalPrice;
	BasePriceDTO averagePrice;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PriceCompetitivenessThresholdsDTO_H_ */
