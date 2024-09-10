/*
 * LogisticPickupPointDTO.h
 *
 * Описание пункта вывоза для возврата.
 */

#ifndef _LogisticPickupPointDTO_H_
#define _LogisticPickupPointDTO_H_


#include <string>
#include "LogisticPointType.h"
#include "PickupAddressDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Описание пункта вывоза для возврата.
 *
 *  \ingroup Models
 *
 */

class LogisticPickupPointDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	LogisticPickupPointDTO();
	LogisticPickupPointDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LogisticPickupPointDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор пункта вывоза.
	 */
	long long getId();

	/*! \brief Set Идентификатор пункта вывоза.
	 */
	void setId(long long  id);
	/*! \brief Get Название пункта вывоза.
	 */
	std::string getName();

	/*! \brief Set Название пункта вывоза.
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	PickupAddressDTO getAddress();

	/*! \brief Set 
	 */
	void setAddress(PickupAddressDTO  address);
	/*! \brief Get Дополнительные инструкции к вывозу.
	 */
	std::string getInstruction();

	/*! \brief Set Дополнительные инструкции к вывозу.
	 */
	void setInstruction(std::string  instruction);
	/*! \brief Get 
	 */
	LogisticPointType getType();

	/*! \brief Set 
	 */
	void setType(LogisticPointType  type);
	/*! \brief Get Идентификатор логистического партнера, к которому относится логистическая точка.
	 */
	long long getLogisticPartnerId();

	/*! \brief Set Идентификатор логистического партнера, к которому относится логистическая точка.
	 */
	void setLogisticPartnerId(long long  logisticPartnerId);

private:
	long long id;
	std::string name;
	PickupAddressDTO address;
	std::string instruction;
	LogisticPointType type;
	long long logisticPartnerId;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LogisticPickupPointDTO_H_ */
