/*
 * OfferSellingProgramDTO.h
 *
 * Информация о том, по каким моделям можно продавать товар, а по каким нельзя.
 */

#ifndef _OfferSellingProgramDTO_H_
#define _OfferSellingProgramDTO_H_


#include <string>
#include "OfferSellingProgramStatusType.h"
#include "SellingProgramType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о том, по каким моделям можно продавать товар, а по каким нельзя.
 *
 *  \ingroup Models
 *
 */

class OfferSellingProgramDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OfferSellingProgramDTO();
	OfferSellingProgramDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OfferSellingProgramDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	SellingProgramType getSellingProgram();

	/*! \brief Set 
	 */
	void setSellingProgram(SellingProgramType  sellingProgram);
	/*! \brief Get 
	 */
	OfferSellingProgramStatusType getStatus();

	/*! \brief Set 
	 */
	void setStatus(OfferSellingProgramStatusType  status);

private:
	SellingProgramType sellingProgram;
	OfferSellingProgramStatusType status;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OfferSellingProgramDTO_H_ */
