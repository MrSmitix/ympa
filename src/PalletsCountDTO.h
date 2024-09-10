/*
 * PalletsCountDTO.h
 *
 * Количество палет в отгрузке.
 */

#ifndef _PalletsCountDTO_H_
#define _PalletsCountDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Количество палет в отгрузке.
 *
 *  \ingroup Models
 *
 */

class PalletsCountDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	PalletsCountDTO();
	PalletsCountDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PalletsCountDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Количество палет, которое заявил продавец.
	 */
	int getPlanned();

	/*! \brief Set Количество палет, которое заявил продавец.
	 */
	void setPlanned(int  planned);
	/*! \brief Get Количество палет, которое приняли в сортировочном центре.
	 */
	int getFact();

	/*! \brief Set Количество палет, которое приняли в сортировочном центре.
	 */
	void setFact(int  fact);

private:
	int planned;
	int fact;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PalletsCountDTO_H_ */
