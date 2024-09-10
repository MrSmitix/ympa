/*
 * PriceQuarantineVerdictDTO.h
 *
 * Причина попадания товара в карантин.
 */

#ifndef _PriceQuarantineVerdictDTO_H_
#define _PriceQuarantineVerdictDTO_H_


#include <string>
#include "PriceQuarantineVerdictParameterDTO.h"
#include "PriceQuarantineVerdictType.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Причина попадания товара в карантин.
 *
 *  \ingroup Models
 *
 */

class PriceQuarantineVerdictDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	PriceQuarantineVerdictDTO();
	PriceQuarantineVerdictDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PriceQuarantineVerdictDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	PriceQuarantineVerdictType getType();

	/*! \brief Set 
	 */
	void setType(PriceQuarantineVerdictType  type);
	/*! \brief Get Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина.
	 */
	std::list<PriceQuarantineVerdictParameterDTO> getParams();

	/*! \brief Set Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина.
	 */
	void setParams(std::list <PriceQuarantineVerdictParameterDTO> params);

private:
	PriceQuarantineVerdictType type;
	std::list <PriceQuarantineVerdictParameterDTO>params;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PriceQuarantineVerdictDTO_H_ */
