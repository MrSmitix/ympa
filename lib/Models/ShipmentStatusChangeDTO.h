
/*
 * ShipmentStatusChangeDTO.h
 *
 * Статус отгрузки.
 */

#ifndef TINY_CPP_CLIENT_ShipmentStatusChangeDTO_H_
#define TINY_CPP_CLIENT_ShipmentStatusChangeDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ShipmentStatusType.h"

namespace Tiny {


/*! \brief Статус отгрузки.
 *
 *  \ingroup Models
 *
 */

class ShipmentStatusChangeDTO{
public:

    /*! \brief Constructor.
	 */
    ShipmentStatusChangeDTO();
    ShipmentStatusChangeDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ShipmentStatusChangeDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string description{};
    std::string updateTime{};
};
}

#endif /* TINY_CPP_CLIENT_ShipmentStatusChangeDTO_H_ */
