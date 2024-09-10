/*
 * ShipmentStatusChangeDTO.h
 *
 * Статус отгрузки.
 */

#ifndef _ShipmentStatusChangeDTO_H_
#define _ShipmentStatusChangeDTO_H_


#include <string>
#include "ShipmentStatusType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Статус отгрузки.
 *
 *  \ingroup Models
 *
 */

class ShipmentStatusChangeDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	ShipmentStatusChangeDTO();
	ShipmentStatusChangeDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ShipmentStatusChangeDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ShipmentStatusType getStatus();

	/*! \brief Set 
	 */
	void setStatus(ShipmentStatusType  status);
	/*! \brief Get Описание статуса отгрузки.
	 */
	std::string getDescription();

	/*! \brief Set Описание статуса отгрузки.
	 */
	void setDescription(std::string  description);
	/*! \brief Get Время последнего изменения статуса отгрузки.
	 */
	std::string getUpdateTime();

	/*! \brief Set Время последнего изменения статуса отгрузки.
	 */
	void setUpdateTime(std::string  updateTime);

private:
	ShipmentStatusType status;
	std::string description;
	std::string updateTime;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ShipmentStatusChangeDTO_H_ */
