
/*
 * LogisticPickupPointDTO.h
 *
 * Описание пункта вывоза для возврата.
 */

#ifndef TINY_CPP_CLIENT_LogisticPickupPointDTO_H_
#define TINY_CPP_CLIENT_LogisticPickupPointDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "LogisticPointType.h"
#include "PickupAddressDTO.h"

namespace Tiny {


/*! \brief Описание пункта вывоза для возврата.
 *
 *  \ingroup Models
 *
 */

class LogisticPickupPointDTO{
public:

    /*! \brief Constructor.
	 */
    LogisticPickupPointDTO();
    LogisticPickupPointDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LogisticPickupPointDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор пункта вывоза.
	 */
	long getId();

	/*! \brief Set Идентификатор пункта вывоза.
	 */
	void setId(long  id);
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
	long getLogisticPartnerId();

	/*! \brief Set Идентификатор логистического партнера, к которому относится логистическая точка.
	 */
	void setLogisticPartnerId(long  logisticPartnerId);


    private:
    long id{};
    std::string name{};
    PickupAddressDTO address;
    std::string instruction{};
    LogisticPointType type;
    long logisticPartnerId{};
};
}

#endif /* TINY_CPP_CLIENT_LogisticPickupPointDTO_H_ */
