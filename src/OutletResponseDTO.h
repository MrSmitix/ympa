/*
 * OutletResponseDTO.h
 *
 * Результат выполнения запроса. Выводится, если &#x60;status&#x3D;\&quot;OK\&quot;&#x60;. 
 */

#ifndef _OutletResponseDTO_H_
#define _OutletResponseDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Результат выполнения запроса. Выводится, если `status=\"OK\"`. 
 *
 *  \ingroup Models
 *
 */

class OutletResponseDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OutletResponseDTO();
	OutletResponseDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OutletResponseDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор точки продаж, присвоенный Маркетом.
	 */
	long long getId();

	/*! \brief Set Идентификатор точки продаж, присвоенный Маркетом.
	 */
	void setId(long long  id);

private:
	long long id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OutletResponseDTO_H_ */
